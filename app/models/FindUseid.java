package models;

import com.avaje.ebean.SqlRow;

import java.util.List;

/**
 * Created by Dost Muhammad on 3/28/2018.
 */
public class FindUseid {
    private String usid,rfds_id;
    List<SqlRow> lst=null;

    public FindUseid(String usid, String rfds_id, List<SqlRow> lst) {
        this.usid = usid;
        this.rfds_id = rfds_id;
        this.lst = lst;
    }

    public String getUsid() {
        return usid;
    }

    public void setUsid(String usid) {
        this.usid = usid;
    }

    public String getRfds_id() {
        return rfds_id;
    }

    public void setRfds_id(String rfds_id) {
        this.rfds_id = rfds_id;
    }

    public List<SqlRow> getLst() {
        return lst;
    }

    public void setLst(List<SqlRow> lst) {
        this.lst = lst;
    }
}
