package Services;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;
import com.avaje.ebeaninternal.server.query.DefaultSqlRow;

import java.util.List;

/**
 * Created by Dost Muhammad on 4/5/2018.
 */
public class Finder {

    public static List<SqlRow>  findLst_EnmtTurfVendor(String sql){

        List<SqlRow> lst=null;
        lst= Ebean.createSqlQuery(sql).findList();


        return lst;

    }
}
