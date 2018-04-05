package controllers;

import Util_Rpt.ReadExcel;
import com.aspose.cells.*;
import com.avaje.ebean.Ebean;
import entities.TV;
import entities.WaterFallLteData;
import play.mvc.Controller;

import javax.sql.RowSet;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dost Muhammad on 3/13/2018.
 */


public class JTest extends Controller {





    public static void main(String args[]) throws SQLException {

        String st="";


       RowSet rows = (RowSet) Ebean.createSqlQuery("SELECT id, pacenumber, submitters_email\n" +
               "\tFROM public.enmt3_truf_vendor_tim_kurtz;")
                .findUnique();
        System.out.println("rows :"+rows.getNString(1));
    }



    public static void main2(String args[]){
            String path="";
        Map<String,Integer> m = new HashMap<String,Integer>();
        List<WaterFallLteData> lstWfall=new ArrayList<>();
        List<TV> lstTV=new ArrayList<>();
        try {
            File file=new File(path);
            Workbook wb;
            Workbook wb_tv;
            wb = new Workbook("D:\\Conure Automation Process\\WaterfALL-2018-01-26.xlsb");
            wb_tv = new Workbook("D:\\Conure Automation Process\\ENMT 3 _Turf_Vendor_Tim Kurtz_1_16_18.xls");
            //wb.Open("f:\test\MyExcelFile.xls");
            Worksheet ws;
            //Worksheet ws_tv;
            ws = wb.getWorksheets().get("LTE_Data");




// Option A. Connect to the "default" database without a transaction:



            //Exporting the contents of 7 rows and 2 columns starting from 1st cell to Array.
            Object dataTable [][] = ws.getCells().exportArray(2,0,7,8);

            for (int i = 0 ; i < dataTable.length ; i++)
            {
                System.out.println("["+ i +"]: "+ dataTable[i][0]+""+dataTable[i][1]);
            }
/*

            //Closing the file stream to free all resources


               /* m=ReadExcel.getColumnHeadIndexby(ws,1);
                System.out.print(""+m.get("PACE_NUMBER")+""+m.get("EDP_STATUS"));

            //System.out.print("yy"+data.size());

            //dtable(ws,1);

            //ws_tv = wb_tv.getWorksheets().get(0);
            //lstWfall= XlParser.getwaterfall(ws,1);
            //System.out.print("the list size is : "+lstWfall.size());

            //LocaleDisplayNamesImpl.DataTable dt = ws.getCells()(0, 0,trows, tcols, true);

            /*for(WaterFallLteData dt:lstWfall){
                System.out.print("pace no : "+dt.getPacenumber()+" site id :"+dt.getSite_id()+""+" us id :"+dt.getUsid()+" Address :"+dt.getAddress()+"\n");
            }




           // Get Cells collection
            Cells cells;
            cells =ws.getCells();
            int endRow=cells.getMaxRow();
            int endCol=cells.getMaxColumn();

// Instantiate FindOptions Object
            FindOptions findOptions = new FindOptions();

// Create a Cells Area


            findOptions.setLookAtType(LookAtType.CONTAINS);

            Cell cell = cells.find("PACE_NUMBER",null,findOptions);

            CellArea ca = new CellArea();
            ca.StartRow = cell.getRow();
            ca.StartColumn = cell.getColumn();
            ca.EndRow = endRow;
            ca.EndColumn = endCol;

            findOptions.setRange(ca);

            Map <String,Integer> map=new HashMap<String,Integer>();
            map= ReadExcel.getColumnHeadIndex(ws,1);
            Cell cell2 = cells.find("PACE_NUMBER",null,findOptions);
            Cell cell2b = cells.find("SITE_ID",null,findOptions);


               /* for (int r = ca.StartRow, x = 0; x < ca.EndRow; x++, r++) {
                    for (int c = ca.StartColumn, y = 0; y < ca.EndColumn; y++, c++) {

                        //Column cc=cells.checkColumn(map.get("PACE_NUMBER"));


                        Cell cell3 = cells.get(r,cell2.getColumn());
                        if(cell3.getValue() !=null)
                        System.out.println(" c value : " +cell3.getValue());
                    }
                }*/

           /* int column =cell2.getColumn();
            int columnb =cell2b.getColumn();


//Get last cell in column C

            Cell lastCell = ws.getCells().endCellInColumn((short)column);


            for(int row =cell2.getRow()+1; row<=lastCell.getRow(); row++)

            {

                Cell cellv = ws.getCells().get(row, column);
                if(cellv.getValue() !=null){
                    Cell cellvb = ws.getCells().get(row, columnb);
                    System.out.println(cellv.getStringValue()+" : "+cellvb.getValue());

                }




            }



//Printing the name of the cell found after searching worksheet
            System.out.println("Name of the cell containing String: " + cell.getValue());
            //System.out.println("The rang is : " + ca.toString());*/

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    public static void  dtable(Worksheet worksheet,int rowNum){
        int trows = worksheet.getCells().getMaxDataRow();
        int tcols = worksheet.getCells().getMaxDataColumn();

        //LocaleDisplayNamesImpl.DataTable dt = worksheet.getCells().ex.ExportDataTable(0, 0,trows, tcols, true);

    }
    public static void  dispp(Worksheet worksheet,int rowNum){

        //Access the Maximum Display Range
        Range range = worksheet.getCells().getMaxDisplayRange();
        int tcols = range.getColumnCount();
        int trows = range.getRowCount();

        System.out.println("Total Rows:" + trows);
        System.out.println("Total Cols:" + tcols);

        RowCollection rows = worksheet.getCells().getRows();


        for (int i = 2 ; i < 5 ; i++)
        {
            for (int j = 0 ; j < 5 ; j++)
            {
                Cell cell=worksheet.getCells().get(i,j);
                if(cell.getValue() !=null) {
                    String val = worksheet.getCells().get(i, 0).getValue().toString();
                    String val2 = worksheet.getCells().get(i, 1).getValue().toString();
                    if (val != null) {
                        System.out.println(""+val+ " d"+val2);

                    }
                }

            }
            System.out.println("");
        }



    }

    private static void ColumnNameToIndex(String s) {


    }

    public static Map disp(Worksheet worksheet,int rowNum){
        Map<String,Integer> m = new HashMap<String,Integer>();
        List<WaterFallLteData> lst=new ArrayList<>();

        int trows = worksheet.getCells().getMaxDataRow()+1;
        int tcols = worksheet.getCells().getMaxDataColumn()+1;
        int rowNumm=rowNum+1;
        Map <String,Integer> map=new HashMap<String,Integer>();
        map= ReadExcel.getColumnHeadIndex(worksheet,1);

        //lst=ReadExcel.getwaterfall(worksheet,2);
        System.out.println("lst "+lst.size());

        //RowCollection rows = cells.getRows();

        RowCollection rows = worksheet.getCells().getRows();
        Cell lastCell = worksheet.getCells().endCellInColumn((short)0);


            int count =0;

            for(int row =2; row<=lastCell.getRow()+1; row++)

            {



                Row row1 = worksheet.getCells().getRow(row);
                if (row1 != null) {
                    count++;
                   // Column column=worksheet.getCells().getColumns().getColumnByIndex(map.get("PACE_NUMBER"));
                    /*for(int k=0;k<2;k++){
                        Cell cellk = worksheet.getCells().get(row, k);
                        System.out.println(cellk.getStringValue());
                    }*/

                    Cell cell = worksheet.getCells().get(row, 0);
                    Cell cell2 = worksheet.getCells().get(row, 1);


                    //System.out.println(cell.getStringValue() + "  " + cell2.getStringValue());
                    //System.out.println(cell.getStringValue() + "  " + cell2.getStringValue());
                    //System.out.println(" column name"+cell.getColumn());

                }
            }

        System.out.print("tcount"+count);

        return m;
    }
}
