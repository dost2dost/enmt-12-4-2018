package models;

import com.avaje.ebean.SqlRow;
import entities.TV;
import entities.TurfVendorEnmt;

import java.util.List;

/**
 * Created by Dost Muhammad on 3/29/2018.
 */
public class FindMissingUseids {

    private TurfVendorEnmt tv;
    private List<SqlRow> sqlrow;

    public FindMissingUseids(TurfVendorEnmt tv, List<SqlRow> sqlrow) {
        this.tv = tv;
        this.sqlrow = sqlrow;
    }

    public TurfVendorEnmt getTv() {
        return tv;
    }

    public void setTv(TurfVendorEnmt tv) {
        this.tv = tv;
    }

    public List<SqlRow> getSqlrow() {
        return sqlrow;
    }

    public void setSqlrow(List<SqlRow> sqlrow) {
        this.sqlrow = sqlrow;
    }
}
