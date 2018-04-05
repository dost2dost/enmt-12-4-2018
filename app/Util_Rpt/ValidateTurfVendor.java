package Util_Rpt;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.RawSql;
import com.avaje.ebean.RawSqlBuilder;
import entities.TV;
import entities.TurfVendorEnmt;

import java.awt.print.Book;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abbas Qamar on 3/27/2018.
 */
public class ValidateTurfVendor {

    public static List<TurfVendorEnmt> findTVDistinct() {
        String sql = "SELECT \"PACE Number\" as paceno,  \"Structure Type\" as structuretype, \"FA Location\" as falocation, \"RBSID\" as rbsid, \"USID\" as usid, \"SITE_STATE\" as sitestate, \"USEID\" as useid, \"Vendor Provided LATITUDE in Decimals\" as vendorplatitudeindecimal, \"Vendor Provided LONGITUDE in Decimals\"  as vendorplongiitudeindecimal, \"Vendor Provided GPS Calble Length (Feet)\"  as gpscablelenthinfeet, \"Vendor Provided GPS Cable Type\"  as gpscabletype, \"Vendor Provided RBS Cable Length (Feet)\"  as rbscablelenthinfeet, \"Vendor Provided RBS Cable Type\" as  rbscabletype\n" +
                "\tFROM public.\"_LTE_Vendor_Validation___1000_ro\"\n" +
                "\twhere  \"rowno\" in (select min(\"rowno\") from \"_LTE_Vendor_Validation___1000_ro\" group by \"USID\")";

        System.out.print("the sql is "+sql);
        RawSql rawSql = RawSqlBuilder.parse(sql)
                .columnMapping('"'+"PACE Number"+'"', "pacenumber")
                .columnMapping('"'+"Structure Type"+'"', "structuretype")
                .columnMapping('"'+"USEID"+'"', "useid")
                .columnMapping('"'+"FA Location"+'"', "falocation")
                .columnMapping('"'+"SITE_STATE"+'"', "site_state")
                .columnMapping('"'+"USID"+'"', "usid")
                .columnMapping('"'+"RBSID"+'"', "rbsid")
                .columnMapping('"'+"Vendor Provided LONGITUDE in Decimals"+'"', "vendorprovidedlongitudeindecimals")
                .columnMapping('"'+"Vendor Provided LATITUDE in Decimals"+'"', "vendorprovidedlatitudeindecimals")
                .columnMapping('"'+"Vendor Provided GPS Calble Length (Feet)"+'"', "vendorprovidedgpscalblelength_feet")
                .columnMapping('"'+"Vendor Provided GPS Cable Type"+'"', "vendorprovidedgpscabletype")
                .columnMapping('"'+"Vendor Provided RBS Cable Length (Feet)"+'"', "vendorprovidedrbscablelength_feet")
                .columnMapping('"'+"Vendor Provided RBS Cable Type"+'"', "vendorprovidedrbscabletype")


                .create();

        return Ebean.createQuery(TurfVendorEnmt.class)
                .setRawSql(rawSql)

                .findList();
    }
    public boolean Step3()
    {
        ReadExcelFiles obj=new ReadExcelFiles();
        Connection Conn=obj.Connections();

        String updatesql="";
        String sql="";
        double distance=0;

        sql="select lte.\"USEID\",dash.\"STRUCTURE_TYPE\",lte.\"Vendor Provided LATITUDE in Decimals\",lte.\"Vendor Provided LONGITUDE in Decimals\",\n" +
                "\t\t\"RBSS_LATITUDE\",\"RBSS_LONGITUDE\"\n" +
                "\n" +
                "from \"_LTE_Vendor_Validation___1000_ro\" lte ,\"_3_4G_Total_Sectors\" dash\n" +
                "\t\tWhere\tlte.\"USEID\"=dash.\"USEID\"";

        try {
            Statement statementTblCol= Conn.createStatement();
            Statement statementUpdate = Conn.createStatement();

            ResultSet rstbl= statementTblCol.executeQuery(sql);

            while (rstbl.next()) {
                String StructureType = rstbl.getString("STRUCTURE_TYPE");
                String UseId =  rstbl.getString("USEID");
                String TurfLatitute = rstbl.getString("Vendor Provided LATITUDE in Decimals");
                String TurfLongtitue = rstbl.getString("Vendor Provided LONGITUDE in Decimals");

                String  RbssLatitute =  rstbl.getString("RBSS_LATITUDE");
                String  RbssLongtitude =  rstbl.getString("RBSS_LATITUDE");

                System.out.println("   UseId  :" + UseId);

                System.out.println("   STRUCTURE_TYPE  :" + StructureType);
             /*   System.out.println("   TurfLongtitue  :" + TurfLongtitue);
                System.out.println("   RbssLatitute  :" + RbssLatitute);
                System.out.println("   RbssLongtitude  :" + RbssLongtitude);
                System.out.println("   TurfLatitute  :" + TurfLatitute);*/

//!TurfLatitute.isEmpty() && !TurfLongtitue.isEmpty() && !RbssLatitute.isEmpty()  &&
                if(RbssLongtitude.trim().length()>0)
                {
                    distance=  obj.distance(Double.parseDouble(TurfLatitute),Double.parseDouble(TurfLatitute),
                            Double.parseDouble(TurfLongtitue),Double.parseDouble(RbssLongtitude));

                }

                System.out.println("   distance  :" + distance);

                if(StructureType.toUpperCase() =="ROOFTOP")
                {
                      updatesql="update _lte_data_temp  SET Status = 'Pass' \n" +
                            "\t\tWhere\tlte.\"USEID\"=dash.\"'"+UseId+"'\"";



                    System.out.println("   updatesql  :" + updatesql);
                    int update=statementUpdate.executeUpdate(updatesql);
                }
                if(distance <=6)
                {
                      updatesql="update _lte_data_temp  SET Status = 'Pass' \n" +
                              "\t\tWhere\tlte.\"USEID\"=dash.\"'"+UseId+"'\"";


                    System.out.println("   updatesql  :" + updatesql);
                    int update=statementUpdate.executeUpdate(updatesql);

                }
                System.out.println("   updatesql  :" + updatesql);

                //lstCol.add(Cols);

            }


            //    distance=  obj.distance(24.8652252,67.0824212,24.8554212,67.0303838);

            // System.out.println(" Karachi   distance  :" + distance);


        } catch (SQLException e) {
                  e.printStackTrace();
        }


        return true;
    }


    public boolean Step1()
    {
        ReadExcelFiles obj=new ReadExcelFiles();
        Connection Conn=obj.Connections();


        String sql="";


        sql= "SELECT  lte.\"USEID\",lte.\"PACE Number\",lte.\"Submitters E-mail\",lte.\"Structure Type\",lte.\"FA Location\",\n" +
                "lte.\"RBSID\",lte.\"USID\",lte.\"SITE_STATE\",lte.\"Vendor Provided LATITUDE in Decimals\",lte.\"Vendor Provided LONGITUDE in Decimals\",\n" +
                "lte.\"Vendor Provided GPS Calble Length (Feet)\", lte.\"Vendor Provided GPS Cable Type\",lte.\"Vendor Provided RBS Cable Length (Feet)\",\n" +
                "lte.\"Vendor Provided RBS Cable Type\",\n" +
                "data.\"Spectrum Bucket\",data.\"RFDS ID\" \n" +
                "\n" +
                "\n" +
                "FROM  \"_LTE_Vendor_Validation___1000_ro\" lte,\"_LTE_Data\" data\n" +
                "where data.\"PACE_NUMBER\" = lte.\"PACE Number\" and data.\"USID\"=lte.\"USID\"";





        try {
            Statement statementTblCol= Conn.createStatement();
            Statement statementUpdate = Conn.createStatement();

            ResultSet rstbl= statementTblCol.executeQuery(sql);

            Statement statementAlterTbl = Conn.createStatement();
            String sqlAlterTbl = " Alter table _lte_data_temp\n" +

                                 " Add Column  Status  varchar(10)";
            statementAlterTbl.execute(sqlAlterTbl);


            while (rstbl.next()) {
                String SpectrumBucket = rstbl.getString("Spectrum Bucket");
                String RfdsId = rstbl.getString("RFDS ID");
                String PaceNumber=rstbl.getString("PACE Number");
                String UsId =rstbl.getString("USID");

                System.out.println("   PACE Number :" + PaceNumber);


                String updatesql="update _lte_data_temp  SET Status = 'Pass' , \"RFDS ID\"='"+RfdsId+"' \n" +
                        "where  \"USID\"='"+UsId+"'  AND \"PACE Number\" = '"+PaceNumber+"'";



                System.out.println("   updatesql  :" + updatesql);
                int update=statementUpdate.executeUpdate(updatesql);



            }
            statementUpdate.close();
            Conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return  true;

    }


    public boolean Step2()
    {
        ReadExcelFiles obj=new ReadExcelFiles();
        Connection Conn=obj.Connections();

        String sql="";
        String isColExist="";


        sql="select soft.\"USEID\", lte.\"RFDS ID\",lte.\"PACE Number\" from  _lte_data_temp lte , \"_SOFT SECTOR ID (final)\" soft\n" +
                "where lte.\"RFDS ID\" = soft.\"RFDS ID\"";

        try {
            Statement statementTblCol= Conn.createStatement();
            Statement statementCheckCol= Conn.createStatement();
            Statement statementUpdate = Conn.createStatement();


            ResultSet rstbl= statementTblCol.executeQuery(sql);


            String sqlcheckcol="SELECT column_name \n" +
                    "FROM information_schema.columns \n" +
                    "WHERE table_name='_lte_data_temp' and column_name='useid';";




            ResultSet rscol= statementCheckCol.executeQuery(sqlcheckcol);
            while (rscol.next()) {

                isColExist = rscol.getString("column_name");
            }

            if(isColExist=="") {
                Statement statementAlterTbl = Conn.createStatement();
                String sqlAlterTbl = " Alter table _lte_data_temp\n" +
                        " Add Column USEID varchar(2000)";

                System.out.println("sqlAlterTbl  :" + sqlAlterTbl);
                statementAlterTbl.execute(sqlAlterTbl);
            }


            while (rstbl.next()) {




                String RfdsId = rstbl.getString("RFDS ID");
                String PaceNumber=rstbl.getString("PACE Number");
                String UseId =rstbl.getString("USEID");

                System.out.println("  UseId :" + UseId);

                if(UseId.trim().length()>5) {
                    String updatesql = "update _lte_data_temp  SET Status = 'Pass',useid = '" + UseId + "' \n" +
                            "where  \"RFDS ID\"='" + RfdsId + "'  AND \"PACE_NUMBER\" = '" + PaceNumber + "'";


                    System.out.println("   updatesql  :" + updatesql);
                    int update = statementUpdate.executeUpdate(updatesql);
                }

            }

            statementUpdate.close();
            Conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }



        return true;
    }


    public boolean Step4()
    {

        ReadExcelFiles obj=new ReadExcelFiles();
        Connection Conn=obj.Connections();

        String updatesql="";
        String sql="";
        double distance=0;

        sql="Select  \"PACE Number\",\"Submitters E-mail\",\"Structure Type\",\"FA Location\",\n" +
                " \"RBSID\",\"USID\",\"SITE_STATE\",\"USEID\",\"Vendor Provided LATITUDE in Decimals\",\"Vendor Provided LONGITUDE in Decimals\",\n" +
                " \"Vendor Provided GPS Calble Length (Feet)\",\"Vendor Provided GPS Cable Type\",\"Vendor Provided RBS Cable Length (Feet)\",\n" +
                "  \"Vendor Provided RBS Cable Type\" from \"_lte_data_temp\" ";
// where  "USID"='51161'
        try {
            Statement statement= Conn.createStatement();
            Statement statementLte = Conn.createStatement();
            Statement statementSiteMaster = Conn.createStatement();
            Statement statementInsert = Conn.createStatement();


            ResultSet rstbl= statement.executeQuery(sql);
            sql="";

            while (rstbl.next()) {
                String Usid = rstbl.getString("USID");
                String UseId = rstbl.getString("USEID");

                String pacenumber = rstbl.getString("PACE Number");
                String submitemail = rstbl.getString("Submitters E-mail");
                String structtype = rstbl.getString("Structure Type");
                String falocation = rstbl.getString("FA Location");
                String rbsid = rstbl.getString("RBSID");
                String sitestate = rstbl.getString("SITE_STATE");
                String vplatd = rstbl.getString("Vendor Provided LATITUDE in Decimals");
                String vplongd = rstbl.getString("Vendor Provided LONGITUDE in Decimals");
                String vpgcl = rstbl.getString("Vendor Provided GPS Calble Length (Feet)");
                String vpgct = rstbl.getString("Vendor Provided GPS Cable Type");
                String vprcl = rstbl.getString("Vendor Provided RBS Cable Length (Feet)");
                String vprct = rstbl.getString("Vendor Provided RBS Cable Type");

                sql=" \n" +
                        "select \"USID\",\"Useid\" from \"SiteMaster_UseID_W_LOSANGELES\"\n" +
                        "where  \"USID\"='"+Usid+"' and \"Useid\" !='"+UseId+"'";

                         ResultSet rsmastertbl= statementSiteMaster.executeQuery(sql);

                    while (rsmastertbl.next()) {
                             String Usidm = rsmastertbl.getString("USID");
                             String UseIdm = rsmastertbl.getString("USEID");

                        sql="select  \"USID\",\"USEID\" from \"_lte_data_temp\"\n" +
                                "where \"USID\"='"+Usidm+"' and \"USEID\"='"+UseIdm+"'";

                        System.out.println("sql step 4 :" + sql);

                        ResultSet rslte =statementLte.executeQuery(sql);
                    sql="";
                        if (!rslte.next()) {
                            // if No result Found insert data in _lte_Vendor_Validation_1000_ro table
                        String insertsql="\n" +
                                "insert into \"_lte_data_temp\" (\"PACE Number\",\"Submitters E-mail\",\"Structure Type\",\"FA Location\",\n" +
                                " \"RBSID\",\"USID\",\"SITE_STATE\",\"USEID\",\"Vendor Provided LATITUDE in Decimals\",\"Vendor Provided LONGITUDE in Decimals\",\n" +
                                " \"Vendor Provided GPS Calble Length (Feet)\",\"Vendor Provided GPS Cable Type\",\"Vendor Provided RBS Cable Length (Feet)\",\n" +
                                "  \"Vendor Provided RBS Cable Type\")\n" +
                                "  \n" +
                                "  values ('"+pacenumber+"','"+submitemail+"','"+structtype+"','"+falocation+"'" +
                                " ,'"+rbsid+"','"+Usid+"','"+sitestate+"','"+UseIdm+"','"+vplatd+"','"+vplongd+"'" +
                                "  ,'"+vpgcl+"','"+vpgct+"','"+vprcl+"','"+vprct+"')";

                            int insertcount =statementInsert.executeUpdate(insertsql);
                            System.out.println("insertcount step 4 :" + insertsql);
                        }


                    }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;

    }
}

