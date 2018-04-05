package models;

import org.joda.time.DateTime;

import java.sql.Date;

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
    private String Status;
    private String Step;
    private java.sql.Date Date;

    public FinalTemplate() {
    }

    public String getPaceNumber() {
        return PaceNumber;
    }

    public void setPaceNumber(String paceNumber) {
        PaceNumber = paceNumber;
    }

    public String getSubmittersEmail() {
        return SubmittersEmail;
    }

    public void setSubmittersEmail(String submittersEmail) {
        SubmittersEmail = submittersEmail;
    }

    public String getStructureType() {
        return StructureType;
    }

    public void setStructureType(String structureType) {
        StructureType = structureType;
    }

    public String getFaLocation() {
        return FaLocation;
    }

    public void setFaLocation(String faLocation) {
        FaLocation = faLocation;
    }

    public String getRbsId() {
        return RbsId;
    }

    public void setRbsId(String rbsId) {
        RbsId = rbsId;
    }

    public String getUsId() {
        return UsId;
    }

    public void setUsId(String usId) {
        UsId = usId;
    }

    public String getSiteState() {
        return SiteState;
    }

    public void setSiteState(String siteState) {
        SiteState = siteState;
    }

    public String getUseId() {
        return UseId;
    }

    public void setUseId(String useId) {
        UseId = useId;
    }

    public String getVplatd() {
        return Vplatd;
    }

    public void setVplatd(String vplatd) {
        Vplatd = vplatd;
    }

    public String getVplongd() {
        return Vplongd;
    }

    public void setVplongd(String vplongd) {
        Vplongd = vplongd;
    }

    public String getVpgcl() {
        return Vpgcl;
    }

    public void setVpgcl(String vpgcl) {
        Vpgcl = vpgcl;
    }

    public String getVpgct() {
        return Vpgct;
    }

    public void setVpgct(String vpgct) {
        Vpgct = vpgct;
    }

    public String getVprcl() {
        return Vprcl;
    }

    public void setVprcl(String vprcl) {
        Vprcl = vprcl;
    }

    public String getVprct() {
        return Vprct;
    }

    public void setVprct(String vprct) {
        Vprct = vprct;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getStep() {
        return Step;
    }

    public void setStep(String step) {
        Step = step;
    }

    public java.sql.Date getDate() {
        return Date;
    }

    public void setDate(java.sql.Date date) {
        Date = date;
    }
}
