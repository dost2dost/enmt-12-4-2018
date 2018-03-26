package entities;


import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Created by Dost Muhammad on 3/6/2018.
 */
@Entity
@Table(name="enmt3_truf_vendor_tim_kurtz")
public class TV extends Model {
    @Id
    private int  id;
    private double

            rbsid;

            //vendor_provided_latitude_in_decimals,
            //vendor_provided_longitude_in_decimals,
           // vendor_provided_gps_cable_length_feets,
            //vendor_provided_rbs_cable_length_feets;
    private String pacenumber,fa_location,
            submitters_email,
            structure_type,
            site_state,
            useid,
            vendor_provided_gps_cable_type,

            username;
    private String vendor_provided_longitude_in_decimals;
    private String vendor_provided_latitude_in_decimals;
    private double  usid=0.0d;
    private int  vendor_provided_gps_cable_length_feets=0;
    private int  vendor_provided_rbs_cable_length_feets=0;
    private String  vendor_provided_rbs_cable_type;



    public TV() {
    }

    public TV(double rbsid, double usid, int vendor_provided_gps_cable_length_feets, int vendor_provided_rbs_cable_length_feets, String pacenumber, String submitters_email, String structure_type, String site_state, String useid, String vendor_provided_gps_cable_type, String vendor_provided_rbs_cable_type, String username, String vendor_provided_longitude_in_decimals, String vendor_provided_latitude_in_decimals, String fa_location) {
        this.rbsid = rbsid;
        this.usid = usid;
        this.vendor_provided_gps_cable_length_feets = vendor_provided_gps_cable_length_feets;
        this.vendor_provided_rbs_cable_length_feets = vendor_provided_rbs_cable_length_feets;
        this.pacenumber = pacenumber;
        this.submitters_email = submitters_email;
        this.structure_type = structure_type;
        this.site_state = site_state;
        this.useid = useid;
        this.vendor_provided_gps_cable_type = vendor_provided_gps_cable_type;
        this.vendor_provided_rbs_cable_type = vendor_provided_rbs_cable_type;
        this.username = username;
        this.vendor_provided_longitude_in_decimals = vendor_provided_longitude_in_decimals;
        this.vendor_provided_latitude_in_decimals = vendor_provided_latitude_in_decimals;
        this.fa_location = fa_location;
    }

    public void setVendor_provided_latitude_in_decimals(String vendor_provided_latitude_in_decimals) {
        this.vendor_provided_latitude_in_decimals = vendor_provided_latitude_in_decimals;
    }

    public String getVendor_provided_longitude_in_decimals() {
        return vendor_provided_longitude_in_decimals;
    }

    public void setVendor_provided_longitude_in_decimals(String vendor_provided_longitude_in_decimals) {
        this.vendor_provided_longitude_in_decimals = vendor_provided_longitude_in_decimals;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFa_location() {
        return fa_location;
    }

    public void setFa_location(String fa_location) {
        this.fa_location = fa_location;
    }



    public double getRbsid() {
        return rbsid;
    }

    public void setRbsid(double rbsid) {
        this.rbsid = rbsid;
    }

    public double getUsid() {
        return usid;
    }

    public void setUsid(double usid) {
        this.usid = usid;
    }

    public String getVendor_provided_latitude_in_decimals() {
        return vendor_provided_latitude_in_decimals;
    }





    public int getVendor_provided_gps_cable_length_feets() {
        return vendor_provided_gps_cable_length_feets;
    }

    public void setVendor_provided_gps_cable_length_feets(int vendor_provided_gps_cable_length_feets) {
        this.vendor_provided_gps_cable_length_feets = vendor_provided_gps_cable_length_feets;
    }

    public int getVendor_provided_rbs_cable_length_feets() {
        return vendor_provided_rbs_cable_length_feets;
    }

    public void setVendor_provided_rbs_cable_length_feets(int vendor_provided_rbs_cable_length_feets) {
        this.vendor_provided_rbs_cable_length_feets = vendor_provided_rbs_cable_length_feets;
    }

    public String getPacenumber() {
        return pacenumber;
    }

    public void setPacenumber(String pacenumber) {
        this.pacenumber = pacenumber;
    }

    public String getSubmitters_email() {
        return submitters_email;
    }

    public void setSubmitters_email(String submitters_email) {
        this.submitters_email = submitters_email;
    }

    public String getStructure_type() {
        return structure_type;
    }

    public void setStructure_type(String structure_type) {
        this.structure_type = structure_type;
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

    public String getVendor_provided_gps_cable_type() {
        return vendor_provided_gps_cable_type;
    }

    public void setVendor_provided_gps_cable_type(String vendor_provided_gps_cable_type) {
        this.vendor_provided_gps_cable_type = vendor_provided_gps_cable_type;
    }

    public String getVendor_provided_rbs_cable_type() {
        return vendor_provided_rbs_cable_type;
    }

    public void setVendor_provided_rbs_cable_type(String vendor_provided_rbs_cable_type) {
        this.vendor_provided_rbs_cable_type = vendor_provided_rbs_cable_type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public static final Finder<Integer, TV> find = new Finder<>(TV.class);



    //List<TV> lstTV = TV.find.all();
}
