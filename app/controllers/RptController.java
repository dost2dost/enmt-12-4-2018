package controllers;

import Services.Vdate;
import Util_Rpt.ReadExcel;
import Util_Rpt.ValidateTurfVendor;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;
import com.avaje.ebean.SqlUpdate;
import com.avaje.ebean.annotation.Formula;
import entities.TV;
import entities.TurfVendorEnmt;
import entities.WaterFall_LteData;
import models.FindMissingUseids;
import models.FindUseid;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Dost Muhammad on 3/13/2018.
 */
public class RptController extends Controller {

    private static int insCountTV=0;

    @Inject
    @Formula(select="select count() from TV where pacenumber=MRLOS033927")
    public String  entritiesCount;

    private List<SqlRow> row;

    private List<SqlRow> rowuseid=null;
    private List<FindUseid> rowuseidAll=new ArrayList<FindUseid>();



    public Result vdateStep4() {
        List<TurfVendorEnmt> lt=TurfVendorEnmt.find.all();
    List<TurfVendorEnmt> lst=new ArrayList<>();
    List<SqlRow> rows=new ArrayList<SqlRow>();
    List<FindMissingUseids> lstmisinguseid=new ArrayList<>();
        List<TurfVendorEnmt> lstTV=new ArrayList<>();

    lst= ValidateTurfVendor.findTVDistinct();

    for(TurfVendorEnmt tv:lst){
        String x= tv.getUsid();
        String sql="select \"Useid\",\"Rbs Identity\"\n" +
                "\tFROM public.\"SiteMaster_UseID_W_LOSANGELES.csv\"\n" +
                "\twhere \"USID\"='"+x+"'\n" +
                "\tGroup by (\"Useid\",\"Rbs Identity\")\n" +
                "\texcept \n" +
                "\tSELECT  \"USEID\",\"RBSID\"\n" +
                "\tFROM public.\"_LTE_Vendor_Validation___1000_ro\"\n" +
                "\twhere \"USID\"='"+x+"'\n" +
                "\tgroup by (\"USEID\",\"RBSID\")";

        rows=Ebean.createSqlQuery(sql)
                .findList();
        lstmisinguseid.add(new FindMissingUseids(tv,rows));

        TurfVendorEnmt tt=new TurfVendorEnmt();
        for(FindMissingUseids useids:lstmisinguseid){
            for(SqlRow sq:useids.getSqlrow()){
                tt= useids.getTv();
                tt.setUseid((String) sq.get("useid"));
                tt.setRbsid((String) sq.get("Rbs Identity"));
                lstTV.add(tt);
            }
        }

    }

        int xx=0;
    if(!lstTV.isEmpty()){
         xx=Ebean.saveAll(lstTV);
    }
          if(xx>0) {
              for (TurfVendorEnmt turf : lstTV) {
                  String sqlpass = "UPDATE public.validation_steps_statuses\n" +
                          "\tSET Step4vdate='Pass'\n" +
                          "\tWHERE usid='" + turf.getUsid() + "'";
                  int x = Vdate.updateStep(sqlpass);
              }
          }


        return ok("succes  vdate  : "+lstTV.size());


    }
    public Result vdateStep2() {

        //row.clear();
        List<SqlRow> rows;
        Vdate obj=new Vdate();
        rows=obj.vdateStep2();
        rowuseidAll.clear();
        for(SqlRow row:rows){
            String sql="SELECT \"USEID\" as useid\n" +
                    " FROM public.\"_SOFT SECTOR ID (final)\"\n" +
                    " where  \"USID\" ='"+row.get("usid").toString()+"' \n" +
                    " and  \"RFDS ID\"='"+row.get("rfds_id").toString()+"'\n" +
                    " and trim(\"USEID\")!='';";

//            String sql="SELECT \"USEID\" as useid\n" +
//                    " FROM public.\"_SOFT SECTOR ID (final)\"\n" +
//                    " where  \"USID\" ='"+"27682"+"' \n" +
//                    " and  \"RFDS ID\"='"+"2105214"+"'\n" +
//                    " and trim(\"USEID\")!=''";

            System.out.print("quanta"+row.get(" "));

            rowuseid=Ebean.createSqlQuery(sql)
                    .findList();
            if(!rowuseid.isEmpty()) {
                rowuseidAll.add(new FindUseid(row.get("usid").toString(), row.get("rfds_id").toString(), rowuseid));
                //rowuseid.clear();
            }else{

            }
            if(rowuseidAll.isEmpty()){
                for(SqlRow row2:rows) {

                    String sqlfail = "UPDATE public.validation_steps_statuses\n" +
                            "\tSET Step2vdate='Fail'\n" +
                            "\tWHERE usid='"+row2.get("usid")+"'";
                    SqlUpdate insert = Ebean.createSqlUpdate(sqlfail);
                    insert.execute();
                }
            }else{
               // FindUseid objj=rowuseidAll.get(i);
                for(FindUseid useid:rowuseidAll){

                    String sqlfail = "UPDATE public.validation_steps_statuses\n" +
                            "\tSET Step2vdate='Pass'\n" +
                            "\tWHERE usid='"+useid.getUsid()+"'";
                    SqlUpdate insert = Ebean.createSqlUpdate(sqlfail);
                    insert.execute();



                }
                List<SqlRow> lst=new ArrayList<>();
                for(FindUseid useid2:rowuseidAll){
                    lst.clear();
                        lst=useid2.getLst();
                    for(SqlRow rr:lst){
                        String  sqlfail2 = "INSERT INTO public.softsector_useids(\n" +
                                "\t usid, rfds_id, use_id)\n" +
                                "\tVALUES ( '"+useid2.getUsid()+"','"+useid2.getRfds_id()+"' ,'"+rr.get("useid").toString()+"');";
                        SqlUpdate insert2 = Ebean.createSqlUpdate(sqlfail2);
                        insert2.execute();
                    }
                }

            }

            System.out.print("quanta"+rowuseidAll.size());
            //if(rowuseid!=null)


        }
        //System.out.print("quanta"+rowuseid.s);


        return ok(""+rowuseid.size());
    }
    public Result EXQ() {

        boolean b=false;
        //List<TV> lstTVAll = TV.find.all();
        List<TV> lstTVAll = Ebean.find(TV.class).where().findList();

        List<WaterFall_LteData> lstWFAll_All = WaterFall_LteData.find.all();
        TV anyTask = TV.find.byId(6600);
        List<TV> cocoTasks = TV.find.query().where()
                .ilike("pacenumber", "%MRLOS033927%")
                .orderBy("pacenumber asc")
                .setFirstRow(0)
                .setMaxRows(25)
                .findPagedList()
                .getList();


        List<TV> list = Ebean.find(TV.class)
                .where()
                .contains("pacenumber","MRLOS033927")
                .findList()
                ;

        Logger.info("Hello");

        String sqllteData = "select \"PACE_NUMBER\" as pacenumber,\"USID\" as usid,\"RFDS ID\" as rfds_id,\"Spectrum Bucket\" as spectrum_bucket\tFROM public._lte_data;";

        List<SqlRow> rows = Ebean.createSqlQuery(sqllteData)
                .findList();
        String paceno = "",usid ="";
//
//            paceno=row.getString("pacenumber");
//            usid=row.getString("usid");
        boolean bpnumber=false;
        boolean buid=false;

        String pacenn="";
        int inuid=0;
        int v=0;
        for(TV tv:lstTVAll){
             v= (int) tv.getUsid();
           for(SqlRow row:rows){
               pacenn= String.valueOf(row.get("pacenumber"));
               if(pacenn.equalsIgnoreCase(tv.getPacenumber())){
                   bpnumber=true;
                   break;
               }

           }for(SqlRow row:rows){

               if(row.getString("usid").equalsIgnoreCase(""+v)){
                   buid=true;
                   break;
               }

           }


            if(bpnumber==true && buid==true){
                   String rfds_id="";
                   String Spectrum_Bucket="";
                   for(SqlRow roww:rows){
                       if(roww.get("usid").toString().equalsIgnoreCase(""+v)){
                           rfds_id=roww.get("rfds_id").toString();
                           Spectrum_Bucket=roww.get("spectrum_bucket").toString();
                       }

                   }

                   String sql="INSERT INTO public.validation_steps_statuses(\n" +
                           "\t pace_number, usid, spectrum_bucket, rfds_id,step_no, step_status)\n" +
                           "\tVALUES ( '"+tv.getPacenumber()+"', '"+v+"', '"+Spectrum_Bucket+"', '"+rfds_id+"', '"+"1"+"', '"+"Pass"+"');";

                   System.out.print("sql is "+sql);

                SqlUpdate insert = Ebean.createSqlUpdate(sql);
                insert.execute();

            }

        }

        System.out.print(""+bpnumber+"usid"+buid);










        boolean bb=false;

       /* int pacno=0;



        for(TV tv:lstTVAll){
        }*/



       // String count = String.valueOf(row.get(2),row.get());



        return ok("Size of the list +"+lstTVAll.size()+"");
    }
    public Result saveTurfVendor() {
        List<TV> lstTV=new ArrayList<>();
        lstTV.clear();
        Workbook wb_tv = null;

        try {
            wb_tv = new Workbook("D:\\Conure Automation Process\\ENMT 3 _Turf_Vendor_Tim Kurtz_1_16_18.xls");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Worksheet ws_tv;

        ws_tv = wb_tv.getWorksheets().get(0);
        if(insCountTV==0) {
            lstTV = ReadExcel.getLst_Tv(ws_tv, 22);

            Ebean.saveAll(lstTV);
            insCountTV++;
        }
        String sqlvalidate="SELECT usid as usid, rfds_id as frds_id\n" +
                "\tFROM public.validation_steps_statuses\n" +
                "\twhere rfds_id IS NOT NULL\n" +
                "\tgroup by usid,rfds_id;";

        return ok(views.html.RecordSAved.render());
    }

    public Result index1() {


        return ok(views.html.index.render());
    }

}
