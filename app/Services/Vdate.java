package Services;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;

import java.util.List;

/**
 * Created by Dost Muhammad on 3/27/2018.
 */
public class Vdate {

    private static String paceno;
    private static List<SqlRow> rows;
    private  List<SqlRow> lstvdatestep2;

    public List<SqlRow>  vdateStep2(){
        //lstvdatestep2.clear();
        String sqlvalidate="SELECT usid as usid,rfds_id as rfds_id \t\n" +
                "FROM public.validation_steps_statuses\n" +
                "WHERE TRIM(rfds_id) IS NOT NULL \n" +
                "AND  TRIM(rfds_id)!=TRIM ('')\n" +
                "GROUP BY usid,rfds_id;";
        lstvdatestep2=Ebean.createSqlQuery(sqlvalidate)
                .findList();

        return lstvdatestep2;

    }
    public static Boolean chekPaceNumber(String paceno, List<SqlRow> rows){
        Vdate.paceno = paceno;
        Vdate.rows = rows;
        boolean b=false;
        for (SqlRow row:rows) {
            if(row.get("pacenumber").equals(paceno)){
                b=true;
                break;
            }
        }
        return b;
    }public static Boolean chekusid(String usid,List<SqlRow> rows){
        boolean b=false;
        for (SqlRow row:rows) {
            if(row.get("usid").equals(usid)){
                b=true;
                break;
            }
        }
        return b;
    }
}
