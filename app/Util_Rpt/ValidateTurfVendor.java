package Util_Rpt;

import java.sql.*;
/**
 * Created by Abbas Qamar on 3/27/2018.
 */
public class ValidateTurfVendor {
    public boolean Step3()
    {
        ReadExcelFiles obj=new ReadExcelFiles();
        Connection Conn=obj.Connections();


        String sql="";
        double distance=0;

        sql="select lte.\"USEID\",lte.\"Vendor Provided LATITUDE in Decimals\",lte.\"Vendor Provided LONGITUDE in Decimals\",\n" +
                "\t\t\"RBSS_LATITUDE\",\"RBSS_LONGITUDE\"\n" +
                "\n" +
                "from _lte_vendor_validation___1000_ro lte ,_3_4g_total_sectors dash\n" +
                "\t\tWhere\tlte.\"USEID\"=dash.\"USEID\"";

        try {
            Statement statementTblCol= Conn.createStatement();
            ResultSet rstbl= statementTblCol.executeQuery(sql);

            while (rstbl.next()) {
                String TurfLatitute = rstbl.getString("Vendor Provided LATITUDE in Decimals");
                String TurfLongtitue = rstbl.getString("Vendor Provided LONGITUDE in Decimals");

                String  RbssLatitute =  rstbl.getString("RBSS_LATITUDE");
                String  RbssLongtitude =  rstbl.getString("RBSS_LATITUDE");


                System.out.println("   TurfLatitute  :" + TurfLatitute.length());
                System.out.println("   TurfLongtitue  :" + TurfLongtitue.length());
                System.out.println("   RbssLatitute  :" + RbssLatitute.length());
                System.out.println("   RbssLongtitude  :" + RbssLongtitude.length());
//!TurfLatitute.isEmpty() && !TurfLongtitue.isEmpty() && !RbssLatitute.isEmpty()  &&
                if(RbssLongtitude.trim().length()>0)
                {
                    distance=  obj.distance(Double.parseDouble(TurfLatitute),Double.parseDouble(TurfLatitute),
                            Double.parseDouble(TurfLongtitue),Double.parseDouble(RbssLongtitude));

                }

                System.out.println("   distance  :" + distance);

                //lstCol.add(Cols);

            }


            //    distance=  obj.distance(24.8652252,67.0824212,24.8554212,67.0303838);

            // System.out.println(" Karachi   distance  :" + distance);


        } catch (SQLException e) {
            e.printStackTrace();
        }


        return true;
    }
}

