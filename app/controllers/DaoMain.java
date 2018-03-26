package controllers;

import java.sql.SQLDataException;

/**
 * Created by Dost Muhammad on 3/21/2018.
 */

public class DaoMain {

    public static void main(String[] args) throws SQLDataException{
        System.out.println("Hello World!");








// access "default" database






/*

        if(conn!=null){
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT id, pacenumber, submitters_email, structure_type, fa_location, rbsid, usid, site_state, useid, vendor_provided_latitude_in_decimals, vendor_provided_longitude_in_decimals, vendor_provided_gps_cable_length_feets, vendor_provided_gps_cable_type, vendor_provided_rbs_cable_length_feets, vendor_provided_rbs_cable_type, username, insert_date\n" +
                        "\tFROM public.enmt3_truf_vendor_tim_kurtz");
                rs.next();
                System.out.print(rs.getString(1));
                System.out.print(rs.getString(2));
                System.out.print(rs.getString(3));
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.print("\n success");
        }*/


    }

}
