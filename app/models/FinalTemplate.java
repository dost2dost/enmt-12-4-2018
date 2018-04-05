package models;

/**
 * Created by Abbas Qamar on 4/5/2018.
 */
public class FinalTemplate {

    private String PaceNumber;
    private String SubmittersEmail;
    private String StructureType;
    private String FaLocation;
    private String RbsId;
    private String UsId;
    private String SiteState;
    private String UseId;
    private String Vplatd;
    private String Vplongd;
    private String Vpgcl;
    private String Vpgct;
    private String Vprcl;
    private String Vprct;


    public FinalTemplate(){};


    public String getPaceNumber() {
        return PaceNumber;
    }

    public void setPaceNumber(String paceNumber) {
        this.PaceNumber = PaceNumber;
    }

    public String getSubmittersEmail() {
        return SubmittersEmail;
    }
    public void setSheetNo(String subittersEmail) {
        this.SubmittersEmail = subittersEmail;
    }

    public String getStructureType() { return StructureType;}
    public void setStructureType(String structureType)
    {
        this.StructureType= structureType;
    }

    public String getFaLocation() { return FaLocation;}
    public void setFaLocation(String faLocation)
    {
        this.FaLocation= faLocation;
    }

    public String getRbsId() { return RbsId;}
    public void setRbsId(String rbsId)
    {
        this.FaLocation= rbsId;
    }

    public String getUsId() { return UsId;}
    public void setUsId(String usId)
    {
        this.FaLocation= usId;
    }

    public String getSiteState() { return SiteState;}
    public void setSiteState(String siteState)
    {
        this.SiteState= siteState;
    }
}
