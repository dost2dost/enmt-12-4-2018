package controllers;

import Util_Rpt.ReadExcel;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;
import com.avaje.ebean.annotation.Formula;
import entities.TV;
import entities.WaterFall_LteData;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dost Muhammad on 3/13/2018.
 */
public class RptController extends Controller {

    @Inject
    @Formula(select="select count() from TV where pacenumber=MRLOS033927")
    public String  entritiesCount;


    public Result EXQ() {

        boolean b=false;
        List<TV> lstTVAll = TV.find.all();
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

        String sql = "select pacenumber as cnt from enmt3_truf_vendor_tim_kurtz";
        List<SqlRow> row = Ebean.createSqlQuery(sql)
                .findList();

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
        lstTV= ReadExcel.getLst_Tv(ws_tv,22);
        Ebean.saveAll(lstTV);
        return ok(views.html.RecordSAved.render());
    }

    public Result index1() {


        return ok(views.html.index.render());
    }

}
