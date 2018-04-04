package models;

/**
 * Created by Abbas Qamar on 4/3/2018.
 */
public class ExcelSheets {

    private String FilePath;
    private int SheetNo;
    private int RowNo;

    public ExcelSheets(){};


    public String getFilePath() {
        return FilePath;
    }

    public void setFilePath(String filePath) {
        this.FilePath = filePath;
    }

    public int getSheetNo() {
        return SheetNo;
    }
    public void setSheetNo(int sheetNo) {
        this.SheetNo = sheetNo;
    }

    public int getRowNo() { return RowNo;}
    public void setRowNo(int rowNo)
    {
        this.RowNo= rowNo;
    }

}
