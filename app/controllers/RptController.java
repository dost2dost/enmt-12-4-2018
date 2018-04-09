package controllers;

import Services.Finder;
import Services.Vdate;
import Util_Rpt.ReadExcel;
import Util_Rpt.ReadExcelFiles;
import Util_Rpt.ValidateTurfVendor;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;
import com.avaje.ebean.SqlUpdate;
import com.avaje.ebean.annotation.Formula;
import entities.TV;
import entities.WaterFall_LteData;
import models.ExcelSheets;
import models.FinalTemplate;
import models.FindUseid;

import play.Logger;
import play.api.mvc.Request;
import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.Content;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import play.data.DynamicForm;
import play.data.Form;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

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

        TV obj=new TV();
        List<TV> lstAllTurfVendor= TV.find.select(String.valueOf(TV.class)).setDistinct(true).findList();
        //Set<TV> lstAllTurfVendor =TV.find.select("usid").setDistinct(true).findSet();
        Iterator iter = lstAllTurfVendor.iterator();
        while (iter.hasNext()) {
            obj= (TV) iter.next();
            int v= (int) obj.getUsid();
            System.out.println(obj.getPacenumber()+"usid "+v);
        }
        return ok("succes  vdate 4"+lstAllTurfVendor.size());
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

        return ok("ok");
    }



    public  Result save() throws SQLException {
        // TODO
        ReadExcelFiles objexcel= new ReadExcelFiles();

      //  System.out.println("kattoo "   +startdate );
        DynamicForm dynamicForm = Form.form().bindFromRequest();

        Logger.info("Username is: " + dynamicForm.get("username"));
        Logger.info("Password is: " + dynamicForm.get("password"));
        String startDate=dynamicForm.get("username");
        String endDate=dynamicForm.get("password");
        ArrayList<FinalTemplate> lstfinal=new ArrayList<FinalTemplate>();
        if(startDate.equalsIgnoreCase("") && endDate.equalsIgnoreCase("")){
            lstfinal= objexcel.GetDataFromFinalTemplate();
        }else{
            lstfinal= objexcel.GetDateFromFinalTemplateByDate(startDate,endDate);
        }



        return  ok(views.html.RecordSAved.render(lstfinal));


    }

    private static String[] columns = {"PACE Number\n", "Submitters E-mail\n", "Structure Type\n", "FA Location\n","RBSID\n","USID\n","SITE_STATE\n","USEID\n","Vendor Provided LATITUDE in Decimals\n","Vendor Provided LONGITUDE in Decimals\n",
                                    "Vendor Provided GPS Calble Length (Feet)\n","Vendor Provided GPS Cable Type\n","Vendor Provided RBS Cable Length (Feet)\n","Vendor Provided RBS Cable Type\n","Status","Step","Date"};
    public  Result export() throws SQLException, IOException {

        ArrayList<FinalTemplate> lstFinalTemp = new ArrayList<FinalTemplate>();
        ReadExcelFiles obj=new ReadExcelFiles();
        Connection Conn=obj.Connections();

        Statement statement = Conn.createStatement();
        String sql="";
        sql = "select * from _lte_data_temp";

        ResultSet rstbl = statement.executeQuery(sql);

        while (rstbl.next()) {

            FinalTemplate objtemp = new FinalTemplate();
            objtemp.setUsId(rstbl.getString("USID"));
            objtemp.setUseId(rstbl.getString("Useid"));
            objtemp.setPaceNumber(rstbl.getString("PACE Number"));
            objtemp.setSubmittersEmail(rstbl.getString("Submitters E-mail"));
            objtemp.setStructureType(rstbl.getString("Structure Type"));
            objtemp.setFaLocation(rstbl.getString("FA Location"));
            objtemp.setRbsId(rstbl.getString("RBSID"));
            objtemp.setSiteState(rstbl.getString("SITE_STATE"));
            objtemp.setVplatd(rstbl.getString("Vendor Provided LATITUDE in Decimals"));
            objtemp.setVplongd(rstbl.getString("Vendor Provided LONGITUDE in Decimals"));
            objtemp.setVpgcl(rstbl.getString("Vendor Provided GPS Calble Length (Feet)"));
            objtemp.setVpgct(rstbl.getString("Vendor Provided GPS Cable Type"));
            objtemp.setVprcl(rstbl.getString("Vendor Provided RBS Cable Length (Feet)"));
            objtemp.setVprct(rstbl.getString("Vendor Provided RBS Cable Type"));

            lstFinalTemp.add(objtemp);

        }

        XSSFWorkbook workbook = new XSSFWorkbook();
        CreationHelper createHelper = workbook.getCreationHelper();

        // Create a Sheet
        Sheet sheet = workbook.createSheet("Employee");


        Row headerRow = sheet.createRow(0);

        // Creating cells
        for(int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);

        }

        int rowNum = 1;
        for(FinalTemplate finaltemp: lstFinalTemp) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0)
                    .setCellValue(finaltemp.getPaceNumber());

            row.createCell(1)
                    .setCellValue(finaltemp.getSubmittersEmail());

            row.createCell(2)
                    .setCellValue(finaltemp.getStructureType());

            row.createCell(3)
                    .setCellValue(finaltemp.getFaLocation());

            row.createCell(4)
                    .setCellValue(finaltemp.getRbsId());
            row.createCell(5)
                    .setCellValue(finaltemp.getUsId());

            row.createCell(6)
                    .setCellValue(finaltemp.getSiteState());

            row.createCell(7)
                    .setCellValue(finaltemp.getUseId());

            row.createCell(8)
                    .setCellValue(finaltemp.getVplatd());

            row.createCell(9)
                    .setCellValue(finaltemp.getVplongd());

            row.createCell(10)
                    .setCellValue(finaltemp.getVpgcl());

            row.createCell(11)
                    .setCellValue(finaltemp.getVpgct());

            row.createCell(12)
                    .setCellValue(finaltemp.getVprcl());

            row.createCell(13)
                    .setCellValue(finaltemp.getVprct());

            row.createCell(14)
                    .setCellValue(finaltemp.getStatus());

            row.createCell(15)
                    .setCellValue(finaltemp.getStep());

            row.createCell(16)
                    .setCellValue(finaltemp.getDate());


        }


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMddyyyy HH_mm_ss");
        LocalDateTime now = LocalDateTime.now();
        String filename="Export_"+dtf.format(now)+".xlsx";

        FileOutputStream fileOut = new FileOutputStream(filename);
        workbook.write(fileOut);
        fileOut.close();

        workbook.close();
        System.out.println("workbook" );



      //  return  ok(views.html.RecordSAved.render());
       return ok(filename +"Exported");
    }



    // initial Start Page Load
    public Result index1() throws SQLException {

        ReadExcelFiles objexcel= new ReadExcelFiles();
        ValidateTurfVendor vobj = new ValidateTurfVendor();
        ExcelSheets obj  = new ExcelSheets();
        ArrayList lstFiles = new ArrayList();
        ArrayList lstSheets =new ArrayList();
        ArrayList lstRowNo  = new ArrayList();



        lstFiles.add("Dashboard_Lat_Long_Total_Sectors01232018115639238.xlsx");
        lstFiles.add("LOS-ANGELES_L.A._20171128210550550_2017-LTE-Next-Carrier_LTE-5C_sm0587_BulkUpdate_Spreadsheet_Multi_11282017_SYSTEM_V0.1.xlsx");
        lstFiles.add("WaterfALL-2018-01-26.xlsb");
        lstFiles.add("ENMT 3 _Turf_Vendor_Tim Kurtz_1_16_18.xls");
        lstFiles.add("SiteMaster_UseID_W-LOSANGELES.csv");

        lstSheets.add(2);
        lstSheets.add(8);
        lstSheets.add(4);
        lstSheets.add(0);
        lstSheets.add(0);

        lstRowNo.add(0);
        lstRowNo.add(2);
        lstRowNo.add(1);
        lstRowNo.add(21);
        lstRowNo.add(0);

        ArrayList<ExcelSheets> lst= new ArrayList<ExcelSheets>();

        for (int i=0;i<  lstFiles.size();i++) {

            obj = new ExcelSheets();
            obj.setFilePath(lstFiles.get(i).toString());
            obj.setRowNo((int)lstRowNo.get(i));
            obj.setSheetNo((int)lstSheets.get(i));
            lst.add(obj);

        }


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMddyyyy");
        LocalDateTime now = LocalDateTime.now();





        try {

        for (int i=0;i<  lstFiles.size();i++) {

            String  FILE_PATH = "C:\\Users\\Abbas Qamar\\Desktop\\Conure Automation Tool\\"+dtf.format(now)+"\\"+lstFiles.get(i)+"";
            System.out.println("FILE_PATH "+FILE_PATH);

            String result = objexcel.ParseExcelSheets(FILE_PATH,lst.get(i).getSheetNo(), lst.get(i).getRowNo());

        //result
           }

            Boolean isCreated= objexcel.CreateTemplateTable();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // vobj.Step1();
        // vobj.Step2();
       //  vobj.Step3();
           vobj.Step4();

 



         ArrayList<FinalTemplate> lstfinal= objexcel.GetDataFromFinalTemplate();


         return  ok(views.html.RecordSAved.render(lstfinal));

     // return ok("Process Completed");



    }


}
