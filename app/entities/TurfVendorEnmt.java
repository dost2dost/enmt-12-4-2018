package entities;

import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Dost Muhammad on 3/30/2018.
 */
@Entity
@Table(name="\"_LTE_Vendor_Validation___1000_ro\"")
public class TurfVendorEnmt {


    @Column(name='"'+"PACE Number"+'"')
    private String pacenumber	;
    @Column(name='"'+"Submitters E-mail"+'"')
    private String	submitterse_mail  	;
    @Column(name='"'+"Structure Type"+'"')
    private String	structuretype  	;
    @Column(name='"'+"FA Location"+'"')
    private String	falocation 	;
    @Column(name='"'+"RBSID"+'"')
    private String	rbsid  	;
    @Column(name='"'+"USID"+'"')
    private String	usid   	;
    @Column(name='"'+"SITE_STATE"+'"')
    private String	site_state 	;
    @Column(name='"'+"USEID"+'"')
    private String	useid  	;
    @Column(name='"'+"Vendor Provided LATITUDE in Decimals"+'"')
    private String	vendorprovidedlatitudeindecimals   	;
    @Column(name='"'+"Vendor Provided LONGITUDE in Decimals"+'"')
    private String	vendorprovidedlongitudeindecimals  	;
    @Column(name='"'+"Vendor Provided GPS Calble Length (Feet)"+'"')
    private String	vendorprovidedgpscalblelength_feet 	;
    @Column(name='"'+"Vendor Provided GPS Cable Type"+'"')
    private String	vendorprovidedgpscabletype 	;
    @Column(name='"'+"Vendor Provided RBS Cable Length (Feet)"+'"')
    private String	vendorprovidedrbscablelength_feet  	;
    @Column(name='"'+"Vendor Provided RBS Cable Type"+'"')
    private String	vendorprovidedrbscabletype 	;

    public TurfVendorEnmt(String pacenumber, String submitterse_mail, String structuretype, String falocation, String rbsid, String usid, String site_state, String useid, String vendorprovidedlatitudeindecimals, String vendorprovidedlongitudeindecimals, String vendorprovidedgpscalblelength_feet, String vendorprovidedgpscabletype, String vendorprovidedrbscablelength_feet, String vendorprovidedrbscabletype) {
        this.pacenumber = pacenumber;
        this.submitterse_mail = submitterse_mail;
        this.structuretype = structuretype;
        this.falocation = falocation;
        this.rbsid = rbsid;
        this.usid = usid;
        this.site_state = site_state;
        this.useid = useid;
        this.vendorprovidedlatitudeindecimals = vendorprovidedlatitudeindecimals;
        this.vendorprovidedlongitudeindecimals = vendorprovidedlongitudeindecimals;
        this.vendorprovidedgpscalblelength_feet = vendorprovidedgpscalblelength_feet;
        this.vendorprovidedgpscabletype = vendorprovidedgpscabletype;
        this.vendorprovidedrbscablelength_feet = vendorprovidedrbscablelength_feet;
        this.vendorprovidedrbscabletype = vendorprovidedrbscabletype;
    }

    public TurfVendorEnmt() {

    }

    public String getPacenumber() {
        return pacenumber;
    }

    public void setPacenumber(String pacenumber) {
        this.pacenumber = pacenumber;
    }

    public String getSubmitterse_mail() {
        return submitterse_mail;
    }

    public void setSubmitterse_mail(String submitterse_mail) {
        this.submitterse_mail = submitterse_mail;
    }

    public String getStructuretype() {
        return structuretype;
    }

    public void setStructuretype(String structuretype) {
        this.structuretype = structuretype;
    }

    public String getFalocation() {
        return falocation;
    }

    public void setFalocation(String falocation) {
        this.falocation = falocation;
    }

    public String getRbsid() {
        return rbsid;
    }

    public void setRbsid(String rbsid) {
        this.rbsid = rbsid;
    }

    public String getUsid() {
        return usid;
    }

    public void setUsid(String usid) {
        this.usid = usid;
    }

    public String getSite_state() {
        return site_state;
    }

    public void setSite_state(String site_state) {
        this.site_state = site_state;
    }

    public String getUseid() {
        return useid;
    }

    public void setUseid(String useid) {
        this.useid = useid;
    }

    public String getVendorprovidedlatitudeindecimals() {
        return vendorprovidedlatitudeindecimals;
    }

    public void setVendorprovidedlatitudeindecimals(String vendorprovidedlatitudeindecimals) {
        this.vendorprovidedlatitudeindecimals = vendorprovidedlatitudeindecimals;
    }

    public String getVendorprovidedlongitudeindecimals() {
        return vendorprovidedlongitudeindecimals;
    }

    public void setVendorprovidedlongitudeindecimals(String vendorprovidedlongitudeindecimals) {
        this.vendorprovidedlongitudeindecimals = vendorprovidedlongitudeindecimals;
    }

    public String getVendorprovidedgpscalblelength_feet() {
        return vendorprovidedgpscalblelength_feet;
    }

    public void setVendorprovidedgpscalblelength_feet(String vendorprovidedgpscalblelength_feet) {
        this.vendorprovidedgpscalblelength_feet = vendorprovidedgpscalblelength_feet;
    }

    public String getVendorprovidedgpscabletype() {
        return vendorprovidedgpscabletype;
    }

    public void setVendorprovidedgpscabletype(String vendorprovidedgpscabletype) {
        this.vendorprovidedgpscabletype = vendorprovidedgpscabletype;
    }

    public String getVendorprovidedrbscablelength_feet() {
        return vendorprovidedrbscablelength_feet;
    }

    public void setVendorprovidedrbscablelength_feet(String vendorprovidedrbscablelength_feet) {
        this.vendorprovidedrbscablelength_feet = vendorprovidedrbscablelength_feet;
    }

    public String getVendorprovidedrbscabletype() {
        return vendorprovidedrbscabletype;
    }

    public void setVendorprovidedrbscabletype(String vendorprovidedrbscabletype) {
        this.vendorprovidedrbscabletype = vendorprovidedrbscabletype;
    }

    public static final Model.Finder<Integer, TurfVendorEnmt> find = new Model.Finder<>(TurfVendorEnmt.class);
}
