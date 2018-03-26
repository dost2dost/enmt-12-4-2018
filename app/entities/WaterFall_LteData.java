package entities;

import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Dost Muhammad on 3/8/2018.
 */
@Entity
@Table(name="_lte_data")
public class WaterFall_LteData extends Model {


   // private String PACE_NUMBER, SITE_ID, Primary_Job_Number, PACE_NAME, JOB_DESCRIPTION, SEARCH_RING_ID, SEARCH_RING_NAME, COUNTY, FIPS_CODE, LATITUDE, LONGITUDE, PRODUCT_GROUP, PRODUCT_SUBGROUP, CFAS_PROJECT_NUMBER, SOURCE_JOB_NUMBER, IPLAN_JOB_STATUS, USID, CONSTRUCTION_TYPE, STATUS, NATIONAL_PROGRAM, JOB_TYPE_SUBTYPE, CAPITAL_PROGRAM, TECHNOLOGY, FREQUENCY, RBS_ID, REGIONFRANCHISE_INDICATOR, STRATEGIC_DRIVER, BUDGET_YEAR, CIVIL_VENDOR, SITE_ACQUISITION_VENDOR, EQUIPMENT_VENDOR, JOB_VENDOR, Integration_Vendor, Optimization_Vendor, custom_program, TEMPLATE_NAME, JOB_SCOPE, ORACLE_PTN, LAUNCH_POLYGON, PHASE, PROJECT_MANAGER, SAQ_Area_Manager, WORK_GROUP, PM2_Person, PM3_Person, CX_Area_Manager, FA_LOCATION_CODE, FA_LOCATION_TYPE, C_E_ON_AIR_DATE, ORIGINAL_NEED_BY_DATE, CURRENT_NEED_BY_DATE, COMMITTED_POR_ONAIRDATE, ADDRESS, POLYGON_JID, TRANSPORT_TYPE, ONAIR_TASK, ONAIR_PLAN, ONAIR_FORECAST, ONAIR_ACTUAL, POE_Name, POR_Name, POE_Status, POR_Status, POR_ONAIR_PLAN, CASPR_PROJECT_SEQ, CASPR_PROJECT_NUMBER, JI003_FORECAST, JI003_ACTUAL, SS076_FORECAST, SS076_ACTUAL, SS020_FORECAST, SS020_ACTUAL, SS014_FORECAST, SS014_ACTUAL, SS007_FORECAST, SS007_ACTUAL, SS071_FORECAST, SS071_ACTUAL, RE007_FORECAST, RE007_ACTUAL, RE057_FORECAST, RE057_ACTUAL, RE015_FORECAST, RE015_ACTUAL, RE005_FORECAST, RE005_ACTUAL, RE066_FORECAST, RE066_ACTUAL, RE030_FORECAST, RE030_ACTUAL, RE056_FORECAST, RE056_ACTUAL, RE001_FORECAST, RE001_ACTUAL, RE031_FORECAST, RE031_ACTUAL, RE032_FORECAST, RE032_ACTUAL, RE020_FORECAST, RE020_ACTUAL, RE097_FORECAST, RE097_ACTUAL, RE060_FORECAST, RE060_ACTUAL, CI025_FORECAST, CI025_ACTUAL, CI060_FORECAST, CI060_ACTUAL, CI046_FORECAST, CI046_ACTUAL, CI048_FORECAST, CI048_ACTUAL, CI034_FORECAST, CI034_ACTUAL, CI020_FORECAST, CI020_ACTUAL, CI118_FORECAST, CI118_ACTUAL, TRANSPORT_FORECAST, TRANSPORT_ACTUAL, CI050_FORECAST, CI050_ACTUAL, CI110_FORECAST, CI110_ACTUAL, CI035_FORECAST, CI035_ACTUAL, CI166_FORECAST, CI166_ACTUAL, CI032_PLAN, CI032_FORECAST, CI032_ACTUAL, CI139_FORECAST, CI139_ACTUAL, CI140_FORECAST, CI140_ACTUAL, CL001_FORECAST, CL001_ACTUAL, CL100_FORECAST, CL100_ACTUAL, CL101_FORECAST, CL101_ACTUAL, PLAN_FC_On_Air, Funding_Level, RAN_FA_Rank, Trigger_Date, MCEP, High_Trust, LCL_Category, SPECTRUM, BDM_Status, RFDS_State_Status, RFDS_ID, RFDS_Workflow_Owner, Structure_Type, AFTRCC_Status, AFTRCC_Submit, Filter_Info, Parity, MOD_Code, MODCD;
   // private String parity_Flag, EPL_ProjectBucket01, Max_CED_for_Project, Max_CED_Bucket, Submission_Status_Validation_Ranking, Site_Submission_Status, GATING_BUCKET, EDP_Publish_Date , EDP_STATUS, PSAP_Bucket, PSAP_Comments, Dist_Zone, iComply_Bucket, Carrier_Count, Spectrum_Bucket, Funding_Level_Handle, Temp;

    @Column(name='"'+"PACE_NUMBER"+'"')

    private String  pace_number	;
    @Column(name='"'+"SITE_ID"+'"')
    private String  SITE_ID;
    @Column(name='"'+"Primary_Job_Number"+'"')
    private String            Primary_Job_Number	;
    @Column(name='"'+"USID"+'"')
    private  String USID;
    /*
            PACE_NAME	,
            JOB_DESCRIPTION	,
            SEARCH_RING_ID	,
            SEARCH_RING_NAME	,
            COUNTY	,
            FIPS_CODE	,
            LATITUDE	,
            LONGITUDE	,
            PRODUCT_GROUP	,
            PRODUCT_SUBGROUP	,
            CFAS_PROJECT_NUMBER	,
            SOURCE_JOB_NUMBER	,
            IPLAN_JOB_STATUS	,
            	,
            CONSTRUCTION_TYPE	,
            STATUS	,
            NATIONAL_PROGRAM	,
            JOB_TYPE_SUBTYPE	,
            CAPITAL_PROGRAM	,
            TECHNOLOGY	,
            FREQUENCY	,
            RBS_ID	,
            REGIONFRANCHISE_INDICATOR	,
            STRATEGIC_DRIVER	,
            BUDGET_YEAR	,
            CIVIL_VENDOR	,
            SITE_ACQUISITION_VENDOR	,
            EQUIPMENT_VENDOR	,
            JOB_VENDOR	,
            Integration_Vendor	,
            Optimization_Vendor	,
            custom_program	,
            TEMPLATE_NAME	,
            JOB_SCOPE	,
            ORACLE_PTN	,
            LAUNCH_POLYGON	,
            PHASE	,
            PROJECT_MANAGER	,
            SAQ_Area_Manager	,
            WORK_GROUP	,
            PM2_Person	,
            PM3_Person	,
            CX_Area_Manager	,
            FA_LOCATION_CODE	,
            FA_LOCATION_TYPE	,
            C_E_ON_AIR_DATE	,
            ORIGINAL_NEED_BY_DATE	,
            CURRENT_NEED_BY_DATE	,
            COMMITTED_POR_ONAIRDATE	,
            ADDRESS	,
            POLYGON_JID	,
            TRANSPORT_TYPE	,
            ONAIR_TASK	,
            ONAIR_PLAN	,
            ONAIR_FORECAST	,
            ONAIR_ACTUAL	,
            POE_Name	,
            POR_Name	,
            POE_Status	,
            POR_Status	,
            POR_ONAIR_PLAN	,
            CASPR_PROJECT_SEQ	,
            CASPR_PROJECT_NUMBER	;*/

    public WaterFall_LteData( String PACE_NUMBER, String SITE_ID, String primary_Job_Number, String PACE_NAME, String JOB_DESCRIPTION, String SEARCH_RING_ID, String SEARCH_RING_NAME, String COUNTY, String FIPS_CODE, String LATITUDE, String LONGITUDE, String PRODUCT_GROUP, String PRODUCT_SUBGROUP, String CFAS_PROJECT_NUMBER, String SOURCE_JOB_NUMBER, String IPLAN_JOB_STATUS, String USID, String CONSTRUCTION_TYPE, String STATUS, String NATIONAL_PROGRAM, String JOB_TYPE_SUBTYPE, String CAPITAL_PROGRAM, String TECHNOLOGY, String FREQUENCY, String RBS_ID, String REGIONFRANCHISE_INDICATOR, String STRATEGIC_DRIVER, String BUDGET_YEAR, String CIVIL_VENDOR, String SITE_ACQUISITION_VENDOR, String EQUIPMENT_VENDOR, String JOB_VENDOR, String integration_Vendor, String optimization_Vendor, String custom_program, String TEMPLATE_NAME, String JOB_SCOPE, String ORACLE_PTN, String LAUNCH_POLYGON, String PHASE, String PROJECT_MANAGER, String SAQ_Area_Manager, String WORK_GROUP, String PM2_Person, String PM3_Person, String CX_Area_Manager, String FA_LOCATION_CODE, String FA_LOCATION_TYPE, String c_E_ON_AIR_DATE, String ORIGINAL_NEED_BY_DATE, String CURRENT_NEED_BY_DATE, String COMMITTED_POR_ONAIRDATE, String ADDRESS, String POLYGON_JID, String TRANSPORT_TYPE, String ONAIR_TASK, String ONAIR_PLAN, String ONAIR_FORECAST, String ONAIR_ACTUAL, String POE_Name, String POR_Name, String POE_Status, String POR_Status, String POR_ONAIR_PLAN, String CASPR_PROJECT_SEQ, String CASPR_PROJECT_NUMBER) {

        this.pace_number = PACE_NUMBER;
        this.SITE_ID = SITE_ID;
        this.Primary_Job_Number = primary_Job_Number;
        /*this.PACE_NAME = PACE_NAME;
        this.JOB_DESCRIPTION = JOB_DESCRIPTION;
        this.SEARCH_RING_ID = SEARCH_RING_ID;
        this.SEARCH_RING_NAME = SEARCH_RING_NAME;
        this.COUNTY = COUNTY;
        this.FIPS_CODE = FIPS_CODE;
        this.LATITUDE = LATITUDE;
        this.LONGITUDE = LONGITUDE;
        this.PRODUCT_GROUP = PRODUCT_GROUP;
        this.PRODUCT_SUBGROUP = PRODUCT_SUBGROUP;
        this.CFAS_PROJECT_NUMBER = CFAS_PROJECT_NUMBER;
        this.SOURCE_JOB_NUMBER = SOURCE_JOB_NUMBER;
        this.IPLAN_JOB_STATUS = IPLAN_JOB_STATUS;
        this.USID = USID;
        this.CONSTRUCTION_TYPE = CONSTRUCTION_TYPE;
        this.STATUS = STATUS;
        this.NATIONAL_PROGRAM = NATIONAL_PROGRAM;
        this.JOB_TYPE_SUBTYPE = JOB_TYPE_SUBTYPE;
        this.CAPITAL_PROGRAM = CAPITAL_PROGRAM;
        this.TECHNOLOGY = TECHNOLOGY;
        this.FREQUENCY = FREQUENCY;
        this.RBS_ID = RBS_ID;
        this.REGIONFRANCHISE_INDICATOR = REGIONFRANCHISE_INDICATOR;
        this.STRATEGIC_DRIVER = STRATEGIC_DRIVER;
        this.BUDGET_YEAR = BUDGET_YEAR;
        this.CIVIL_VENDOR = CIVIL_VENDOR;
        this.SITE_ACQUISITION_VENDOR = SITE_ACQUISITION_VENDOR;
        this.EQUIPMENT_VENDOR = EQUIPMENT_VENDOR;
        this.JOB_VENDOR = JOB_VENDOR;
        Integration_Vendor = integration_Vendor;
        Optimization_Vendor = optimization_Vendor;
        this.custom_program = custom_program;
        this.TEMPLATE_NAME = TEMPLATE_NAME;
        this.JOB_SCOPE = JOB_SCOPE;
        this.ORACLE_PTN = ORACLE_PTN;
        this.LAUNCH_POLYGON = LAUNCH_POLYGON;
        this.PHASE = PHASE;
        this.PROJECT_MANAGER = PROJECT_MANAGER;
        this.SAQ_Area_Manager = SAQ_Area_Manager;
        this.WORK_GROUP = WORK_GROUP;
        this.PM2_Person = PM2_Person;
        this.PM3_Person = PM3_Person;
        this.CX_Area_Manager = CX_Area_Manager;
        this.FA_LOCATION_CODE = FA_LOCATION_CODE;
        this.FA_LOCATION_TYPE = FA_LOCATION_TYPE;
        C_E_ON_AIR_DATE = c_E_ON_AIR_DATE;
        this.ORIGINAL_NEED_BY_DATE = ORIGINAL_NEED_BY_DATE;
        this.CURRENT_NEED_BY_DATE = CURRENT_NEED_BY_DATE;
        this.COMMITTED_POR_ONAIRDATE = COMMITTED_POR_ONAIRDATE;
        this.ADDRESS = ADDRESS;
        this.POLYGON_JID = POLYGON_JID;
        this.TRANSPORT_TYPE = TRANSPORT_TYPE;
        this.ONAIR_TASK = ONAIR_TASK;
        this.ONAIR_PLAN = ONAIR_PLAN;
        this.ONAIR_FORECAST = ONAIR_FORECAST;
        this.ONAIR_ACTUAL = ONAIR_ACTUAL;
        this.POE_Name = POE_Name;
        this.POR_Name = POR_Name;
        this.POE_Status = POE_Status;
        this.POR_Status = POR_Status;
        this.POR_ONAIR_PLAN = POR_ONAIR_PLAN;
        this.CASPR_PROJECT_SEQ = CASPR_PROJECT_SEQ;
        this.CASPR_PROJECT_NUMBER = CASPR_PROJECT_NUMBER;*/
    }




    public String getPACE_NUMBER() {
        return pace_number;
    }

    public void setPACE_NUMBER(String PACE_NUMBER) {
        this.pace_number = PACE_NUMBER;
    }

    public String getSITE_ID() {
        return SITE_ID;
    }

    public void setSITE_ID(String SITE_ID) {
        this.SITE_ID = SITE_ID;
    }

    public String getPrimary_Job_Number() {
        return Primary_Job_Number;
    }

    public void setPrimary_Job_Number(String primary_Job_Number) {
        Primary_Job_Number = primary_Job_Number;
    }
/*
    public String getPACE_NAME() {
        return PACE_NAME;
    }

    public void setPACE_NAME(String PACE_NAME) {
        this.PACE_NAME = PACE_NAME;
    }

    public String getJOB_DESCRIPTION() {
        return JOB_DESCRIPTION;
    }

    public void setJOB_DESCRIPTION(String JOB_DESCRIPTION) {
        this.JOB_DESCRIPTION = JOB_DESCRIPTION;
    }

    public String getSEARCH_RING_ID() {
        return SEARCH_RING_ID;
    }

    public void setSEARCH_RING_ID(String SEARCH_RING_ID) {
        this.SEARCH_RING_ID = SEARCH_RING_ID;
    }

    public String getSEARCH_RING_NAME() {
        return SEARCH_RING_NAME;
    }

    public void setSEARCH_RING_NAME(String SEARCH_RING_NAME) {
        this.SEARCH_RING_NAME = SEARCH_RING_NAME;
    }

    public String getCOUNTY() {
        return COUNTY;
    }

    public void setCOUNTY(String COUNTY) {
        this.COUNTY = COUNTY;
    }

    public String getFIPS_CODE() {
        return FIPS_CODE;
    }

    public void setFIPS_CODE(String FIPS_CODE) {
        this.FIPS_CODE = FIPS_CODE;
    }

    public String getLATITUDE() {
        return LATITUDE;
    }

    public void setLATITUDE(String LATITUDE) {
        this.LATITUDE = LATITUDE;
    }

    public String getLONGITUDE() {
        return LONGITUDE;
    }

    public void setLONGITUDE(String LONGITUDE) {
        this.LONGITUDE = LONGITUDE;
    }

    public String getPRODUCT_GROUP() {
        return PRODUCT_GROUP;
    }

    public void setPRODUCT_GROUP(String PRODUCT_GROUP) {
        this.PRODUCT_GROUP = PRODUCT_GROUP;
    }

    public String getPRODUCT_SUBGROUP() {
        return PRODUCT_SUBGROUP;
    }

    public void setPRODUCT_SUBGROUP(String PRODUCT_SUBGROUP) {
        this.PRODUCT_SUBGROUP = PRODUCT_SUBGROUP;
    }

    public String getCFAS_PROJECT_NUMBER() {
        return CFAS_PROJECT_NUMBER;
    }

    public void setCFAS_PROJECT_NUMBER(String CFAS_PROJECT_NUMBER) {
        this.CFAS_PROJECT_NUMBER = CFAS_PROJECT_NUMBER;
    }

    public String getSOURCE_JOB_NUMBER() {
        return SOURCE_JOB_NUMBER;
    }

    public void setSOURCE_JOB_NUMBER(String SOURCE_JOB_NUMBER) {
        this.SOURCE_JOB_NUMBER = SOURCE_JOB_NUMBER;
    }

    public String getIPLAN_JOB_STATUS() {
        return IPLAN_JOB_STATUS;
    }

    public void setIPLAN_JOB_STATUS(String IPLAN_JOB_STATUS) {
        this.IPLAN_JOB_STATUS = IPLAN_JOB_STATUS;
    }

    public String getUSID() {
        return USID;
    }

    public void setUSID(String USID) {
        this.USID = USID;
    }

    public String getCONSTRUCTION_TYPE() {
        return CONSTRUCTION_TYPE;
    }

    public void setCONSTRUCTION_TYPE(String CONSTRUCTION_TYPE) {
        this.CONSTRUCTION_TYPE = CONSTRUCTION_TYPE;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getNATIONAL_PROGRAM() {
        return NATIONAL_PROGRAM;
    }

    public void setNATIONAL_PROGRAM(String NATIONAL_PROGRAM) {
        this.NATIONAL_PROGRAM = NATIONAL_PROGRAM;
    }

    public String getJOB_TYPE_SUBTYPE() {
        return JOB_TYPE_SUBTYPE;
    }

    public void setJOB_TYPE_SUBTYPE(String JOB_TYPE_SUBTYPE) {
        this.JOB_TYPE_SUBTYPE = JOB_TYPE_SUBTYPE;
    }

    public String getCAPITAL_PROGRAM() {
        return CAPITAL_PROGRAM;
    }

    public void setCAPITAL_PROGRAM(String CAPITAL_PROGRAM) {
        this.CAPITAL_PROGRAM = CAPITAL_PROGRAM;
    }

    public String getTECHNOLOGY() {
        return TECHNOLOGY;
    }

    public void setTECHNOLOGY(String TECHNOLOGY) {
        this.TECHNOLOGY = TECHNOLOGY;
    }

    public String getFREQUENCY() {
        return FREQUENCY;
    }

    public void setFREQUENCY(String FREQUENCY) {
        this.FREQUENCY = FREQUENCY;
    }

    public String getRBS_ID() {
        return RBS_ID;
    }

    public void setRBS_ID(String RBS_ID) {
        this.RBS_ID = RBS_ID;
    }

    public String getREGIONFRANCHISE_INDICATOR() {
        return REGIONFRANCHISE_INDICATOR;
    }

    public void setREGIONFRANCHISE_INDICATOR(String REGIONFRANCHISE_INDICATOR) {
        this.REGIONFRANCHISE_INDICATOR = REGIONFRANCHISE_INDICATOR;
    }

    public String getSTRATEGIC_DRIVER() {
        return STRATEGIC_DRIVER;
    }

    public void setSTRATEGIC_DRIVER(String STRATEGIC_DRIVER) {
        this.STRATEGIC_DRIVER = STRATEGIC_DRIVER;
    }

    public String getBUDGET_YEAR() {
        return BUDGET_YEAR;
    }

    public void setBUDGET_YEAR(String BUDGET_YEAR) {
        this.BUDGET_YEAR = BUDGET_YEAR;
    }

    public String getCIVIL_VENDOR() {
        return CIVIL_VENDOR;
    }

    public void setCIVIL_VENDOR(String CIVIL_VENDOR) {
        this.CIVIL_VENDOR = CIVIL_VENDOR;
    }

    public String getSITE_ACQUISITION_VENDOR() {
        return SITE_ACQUISITION_VENDOR;
    }

    public void setSITE_ACQUISITION_VENDOR(String SITE_ACQUISITION_VENDOR) {
        this.SITE_ACQUISITION_VENDOR = SITE_ACQUISITION_VENDOR;
    }

    public String getEQUIPMENT_VENDOR() {
        return EQUIPMENT_VENDOR;
    }

    public void setEQUIPMENT_VENDOR(String EQUIPMENT_VENDOR) {
        this.EQUIPMENT_VENDOR = EQUIPMENT_VENDOR;
    }

    public String getJOB_VENDOR() {
        return JOB_VENDOR;
    }

    public void setJOB_VENDOR(String JOB_VENDOR) {
        this.JOB_VENDOR = JOB_VENDOR;
    }

    public String getIntegration_Vendor() {
        return Integration_Vendor;
    }

    public void setIntegration_Vendor(String integration_Vendor) {
        Integration_Vendor = integration_Vendor;
    }

    public String getOptimization_Vendor() {
        return Optimization_Vendor;
    }

    public void setOptimization_Vendor(String optimization_Vendor) {
        Optimization_Vendor = optimization_Vendor;
    }

    public String getCustom_program() {
        return custom_program;
    }

    public void setCustom_program(String custom_program) {
        this.custom_program = custom_program;
    }

    public String getTEMPLATE_NAME() {
        return TEMPLATE_NAME;
    }

    public void setTEMPLATE_NAME(String TEMPLATE_NAME) {
        this.TEMPLATE_NAME = TEMPLATE_NAME;
    }

    public String getJOB_SCOPE() {
        return JOB_SCOPE;
    }

    public void setJOB_SCOPE(String JOB_SCOPE) {
        this.JOB_SCOPE = JOB_SCOPE;
    }

    public String getORACLE_PTN() {
        return ORACLE_PTN;
    }

    public void setORACLE_PTN(String ORACLE_PTN) {
        this.ORACLE_PTN = ORACLE_PTN;
    }

    public String getLAUNCH_POLYGON() {
        return LAUNCH_POLYGON;
    }

    public void setLAUNCH_POLYGON(String LAUNCH_POLYGON) {
        this.LAUNCH_POLYGON = LAUNCH_POLYGON;
    }

    public String getPHASE() {
        return PHASE;
    }

    public void setPHASE(String PHASE) {
        this.PHASE = PHASE;
    }

    public String getPROJECT_MANAGER() {
        return PROJECT_MANAGER;
    }

    public void setPROJECT_MANAGER(String PROJECT_MANAGER) {
        this.PROJECT_MANAGER = PROJECT_MANAGER;
    }

    public String getSAQ_Area_Manager() {
        return SAQ_Area_Manager;
    }

    public void setSAQ_Area_Manager(String SAQ_Area_Manager) {
        this.SAQ_Area_Manager = SAQ_Area_Manager;
    }

    public String getWORK_GROUP() {
        return WORK_GROUP;
    }

    public void setWORK_GROUP(String WORK_GROUP) {
        this.WORK_GROUP = WORK_GROUP;
    }

    public String getPM2_Person() {
        return PM2_Person;
    }

    public void setPM2_Person(String PM2_Person) {
        this.PM2_Person = PM2_Person;
    }

    public String getPM3_Person() {
        return PM3_Person;
    }

    public void setPM3_Person(String PM3_Person) {
        this.PM3_Person = PM3_Person;
    }

    public String getCX_Area_Manager() {
        return CX_Area_Manager;
    }

    public void setCX_Area_Manager(String CX_Area_Manager) {
        this.CX_Area_Manager = CX_Area_Manager;
    }

    public String getFA_LOCATION_CODE() {
        return FA_LOCATION_CODE;
    }

    public void setFA_LOCATION_CODE(String FA_LOCATION_CODE) {
        this.FA_LOCATION_CODE = FA_LOCATION_CODE;
    }

    public String getFA_LOCATION_TYPE() {
        return FA_LOCATION_TYPE;
    }

    public void setFA_LOCATION_TYPE(String FA_LOCATION_TYPE) {
        this.FA_LOCATION_TYPE = FA_LOCATION_TYPE;
    }

    public String getC_E_ON_AIR_DATE() {
        return C_E_ON_AIR_DATE;
    }

    public void setC_E_ON_AIR_DATE(String c_E_ON_AIR_DATE) {
        C_E_ON_AIR_DATE = c_E_ON_AIR_DATE;
    }

    public String getORIGINAL_NEED_BY_DATE() {
        return ORIGINAL_NEED_BY_DATE;
    }

    public void setORIGINAL_NEED_BY_DATE(String ORIGINAL_NEED_BY_DATE) {
        this.ORIGINAL_NEED_BY_DATE = ORIGINAL_NEED_BY_DATE;
    }

    public String getCURRENT_NEED_BY_DATE() {
        return CURRENT_NEED_BY_DATE;
    }

    public void setCURRENT_NEED_BY_DATE(String CURRENT_NEED_BY_DATE) {
        this.CURRENT_NEED_BY_DATE = CURRENT_NEED_BY_DATE;
    }

    public String getCOMMITTED_POR_ONAIRDATE() {
        return COMMITTED_POR_ONAIRDATE;
    }

    public void setCOMMITTED_POR_ONAIRDATE(String COMMITTED_POR_ONAIRDATE) {
        this.COMMITTED_POR_ONAIRDATE = COMMITTED_POR_ONAIRDATE;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getPOLYGON_JID() {
        return POLYGON_JID;
    }

    public void setPOLYGON_JID(String POLYGON_JID) {
        this.POLYGON_JID = POLYGON_JID;
    }

    public String getTRANSPORT_TYPE() {
        return TRANSPORT_TYPE;
    }

    public void setTRANSPORT_TYPE(String TRANSPORT_TYPE) {
        this.TRANSPORT_TYPE = TRANSPORT_TYPE;
    }

    public String getONAIR_TASK() {
        return ONAIR_TASK;
    }

    public void setONAIR_TASK(String ONAIR_TASK) {
        this.ONAIR_TASK = ONAIR_TASK;
    }

    public String getONAIR_PLAN() {
        return ONAIR_PLAN;
    }

    public void setONAIR_PLAN(String ONAIR_PLAN) {
        this.ONAIR_PLAN = ONAIR_PLAN;
    }

    public String getONAIR_FORECAST() {
        return ONAIR_FORECAST;
    }

    public void setONAIR_FORECAST(String ONAIR_FORECAST) {
        this.ONAIR_FORECAST = ONAIR_FORECAST;
    }

    public String getONAIR_ACTUAL() {
        return ONAIR_ACTUAL;
    }

    public void setONAIR_ACTUAL(String ONAIR_ACTUAL) {
        this.ONAIR_ACTUAL = ONAIR_ACTUAL;
    }

    public String getPOE_Name() {
        return POE_Name;
    }

    public void setPOE_Name(String POE_Name) {
        this.POE_Name = POE_Name;
    }

    public String getPOR_Name() {
        return POR_Name;
    }

    public void setPOR_Name(String POR_Name) {
        this.POR_Name = POR_Name;
    }

    public String getPOE_Status() {
        return POE_Status;
    }

    public void setPOE_Status(String POE_Status) {
        this.POE_Status = POE_Status;
    }

    public String getPOR_Status() {
        return POR_Status;
    }

    public void setPOR_Status(String POR_Status) {
        this.POR_Status = POR_Status;
    }

    public String getPOR_ONAIR_PLAN() {
        return POR_ONAIR_PLAN;
    }

    public void setPOR_ONAIR_PLAN(String POR_ONAIR_PLAN) {
        this.POR_ONAIR_PLAN = POR_ONAIR_PLAN;
    }

    public String getCASPR_PROJECT_SEQ() {
        return CASPR_PROJECT_SEQ;
    }

    public void setCASPR_PROJECT_SEQ(String CASPR_PROJECT_SEQ) {
        this.CASPR_PROJECT_SEQ = CASPR_PROJECT_SEQ;
    }

    public String getCASPR_PROJECT_NUMBER() {
        return CASPR_PROJECT_NUMBER;
    }

    public void setCASPR_PROJECT_NUMBER(String CASPR_PROJECT_NUMBER) {
        this.CASPR_PROJECT_NUMBER = CASPR_PROJECT_NUMBER;
    }*/
    public static final Finder<Integer, WaterFall_LteData> find = new Finder<>(WaterFall_LteData.class);
}
