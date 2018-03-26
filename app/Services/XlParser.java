package Services;

import Util_Rpt.ReadExcel;
import com.aspose.cells.*;
import entities.WaterFallLteData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dost Muhammad on 3/19/2018.
 */
public class XlParser {


    public  Cell searchColumn(Worksheet worksheet, String  whatSearch){
        FindOptions findOptions = new FindOptions();
        findOptions.setLookAtType(LookAtType.CONTAINS);
        findOptions.setLookInType(LookInType.VALUES);
        Cells cells;
        cells =worksheet.getCells();
        Cell cell = cells.find(whatSearch,null,findOptions);

        //
        return cell;

    }
    public static List<WaterFallLteData> getwaterfall(Worksheet worksheet, int rowNum){

        List<WaterFallLteData> lstwfall=new ArrayList<>();
        WaterFallLteData wfdata=new WaterFallLteData();
        Map<String,Integer> map=new HashMap<String,Integer>();

        Cells cells;
        cells =worksheet.getCells();
        int endRow=cells.getMaxRow();
        int endCol=cells.getMaxColumn();

// Instantiate FindOptions Object
        FindOptions findOptions = new FindOptions();

// Create a Cells Area


        findOptions.setLookAtType(LookAtType.CONTAINS);
        findOptions.setLookInType(LookInType.VALUES);


        Cell cell = cells.find("PACE_NUMBER",null,findOptions);
        //Cell SITE_ID = cells.find("SITE_ID",null,findOptions);

        CellArea ca = new CellArea();
        ca.StartRow = cell.getRow();
        ca.StartColumn = cell.getColumn();
        ca.EndRow = endRow;
        ca.EndColumn = endCol;

        findOptions.setRange(ca);

        map= ReadExcel.getColumnHeadIndex(worksheet,1);
        Cell PACE_NUMBER = cells.find("PACE_NUMBER",null,findOptions);

        Cell Primary_Job_Number = cells.find("Primary_Job_Number",null,findOptions);
        Cell PACE_NAME = cells.find("PACE_NAME",null,findOptions);
        Cell SITE_ID = cells.find("SITE_ID",null,findOptions);
        Cell JOB_DESCRIPTION = cells.find("JOB_DESCRIPTION",null,findOptions);
        Cell SEARCH_RING_ID = cells.find("SEARCH_RING_ID",null,findOptions);
        Cell SEARCH_RING_NAME = cells.find("SEARCH_RING_NAME",null,findOptions);
        Cell COUNTY = cells.find("COUNTY",null,findOptions);
        Cell FIPS_CODE = cells.find("FIPS_CODE",null,findOptions);
        Cell LATITUDE = cells.find("LATITUDE",null,findOptions);
        Cell LONGITUDE = cells.find("LONGITUDE",null,findOptions);
        Cell PRODUCT_GROUP = cells.find("PRODUCT_GROUP",null,findOptions);
        Cell PRODUCT_SUBGROUP = cells.find("PRODUCT_SUBGROUP",null,findOptions);
        Cell CFAS_PROJECT_NUMBER = cells.find("CFAS_PROJECT_NUMBER",null,findOptions);
        Cell SOURCE_JOB_NUMBER = cells.find("SOURCE_JOB_NUMBER",null,findOptions);
        Cell IPLAN_JOB_STATUS = cells.find("IPLAN_JOB_STATUS",null,findOptions);
        Cell USID = cells.find("USID",null,findOptions);
        Cell CONSTRUCTION_TYPE = cells.find("CONSTRUCTION_TYPE",null,findOptions);
        Cell STATUS = cells.find("STATUS",null,findOptions);
        Cell NATIONAL_PROGRAM = cells.find("NATIONAL_PROGRAM",null,findOptions);
        Cell JOB_TYPE_SUBTYPE = cells.find("JOB_TYPE_SUBTYPE",null,findOptions);

        Cell CAPITAL_PROGRAM = cells.find("CAPITAL_PROGRAM",null,findOptions);
        Cell TECHNOLOGY = cells.find("TECHNOLOGY",null,findOptions);
        Cell FREQUENCY = cells.find("FREQUENCY",null,findOptions);
        Cell RBS_ID = cells.find("RBS_ID",null,findOptions);
        Cell REGIONFRANCHISE_INDICATOR = cells.find("REGIONFRANCHISE_INDICATOR",null,findOptions);
        Cell STRATEGIC_DRIVER = cells.find("STRATEGIC_DRIVER",null,findOptions);
        Cell BUDGET_YEAR = cells.find("BUDGET_YEAR",null,findOptions);
        Cell CIVIL_VENDOR = cells.find("CIVIL_VENDOR",null,findOptions);
        Cell SITE_ACQUISITION_VENDOR = cells.find("SITE_ACQUISITION_VENDOR",null,findOptions);
        Cell EQUIPMENT_VENDOR = cells.find("EQUIPMENT_VENDOR",null,findOptions);
        Cell JOB_VENDOR = cells.find("JOB_VENDOR",null,findOptions);
        //
        Cell Integration_Vendor = cells.find("Integration_Vendor",null,findOptions);
        Cell Optimization_Vendor = cells.find("Optimization_Vendor",null,findOptions);
        Cell custom_program = cells.find("custom_program",null,findOptions);
        Cell TEMPLATE_NAME = cells.find("TEMPLATE_NAME",null,findOptions);
        Cell JOB_SCOPE = cells.find("JOB_SCOPE",null,findOptions);
        Cell ORACLE_PTN = cells.find("ORACLE_PTN",null,findOptions);
        Cell LAUNCH_POLYGON = cells.find("LAUNCH_POLYGON",null,findOptions);
        Cell PHASE = cells.find("PHASE",null,findOptions);
        Cell PROJECT_MANAGER = cells.find("PROJECT_MANAGER",null,findOptions);
        Cell SAQ_Area_Manager = cells.find("SAQ_Area_Manager",null,findOptions);
        //
        Cell WORK_GROUP = cells.find("WORK_GROUP",null,findOptions);
        Cell PM2_Person = cells.find("PM2_Person",null,findOptions);
        Cell PM3_Person = cells.find("PM3_Person",null,findOptions);
        Cell CX_Area_Manager = cells.find("CX_Area_Manager",null,findOptions);
        Cell FA_LOCATION_CODE = cells.find("FA_LOCATION_CODE",null,findOptions);
        Cell FA_LOCATION_TYPE = cells.find("FA_LOCATION_TYPE",null,findOptions);
        Cell C_E_ON_AIR_DATE = cells.find("C_E_ON_AIR_DATE",null,findOptions);
        Cell ORIGINAL_NEED_BY_DATE = cells.find("ORIGINAL_NEED_BY_DATE",null,findOptions);
        Cell CURRENT_NEED_BY_DATE = cells.find("CURRENT_NEED_BY_DATE",null,findOptions);
        Cell COMMITTED_POR_ONAIRDATE = cells.find("COMMITTED_POR_ONAIRDATE",null,findOptions);
        //
        Cell ADDRESS = cells.find("ADDRESS",null,findOptions);
        Cell POLYGON_JID = cells.find("POLYGON_JID",null,findOptions);
        //Cell TRANSPORT_TYPE = cells.find("TRANSPORT_TYPE",null,findOptions);
        Cell ONAIR_TASK = cells.find("ONAIR_TASK",null,findOptions);
        Cell ONAIR_PLAN = cells.find("ONAIR_PLAN",null,findOptions);
        Cell ONAIR_FORECAST = cells.find("ONAIR_FORECAST",null,findOptions);
        Cell ONAIR_ACTUAL = cells.find("ONAIR_ACTUAL",null,findOptions);
        Cell POE_Name = cells.find("POE_Name",null,findOptions);
        Cell POR_Name = cells.find("POR_Name",null,findOptions);
        Cell POE_Status = cells.find("POE_Status",null,findOptions);
        //
        Cell POR_Status = cells.find("POR_Status",null,findOptions);

        Cell POR_ONAIR_PLAN = cells.find("POR_ONAIR_PLAN",null,findOptions);
        Cell CASPR_PROJECT_SEQ = cells.find("CASPR_PROJECT_SEQ",null,findOptions);
        Cell CASPR_PROJECT_NUMBER = cells.find("CASPR_PROJECT_NUMBER",null,findOptions);
        Cell JI003_FORECAST = cells.find("JI003_FORECAST",null,findOptions);
        Cell JI003_ACTUAL = cells.find("JI003_ACTUAL",null,findOptions);
        Cell SS076_FORECAST = cells.find("SS076_FORECAST",null,findOptions);
        Cell SS020_FORECAST = cells.find("SS020_FORECAST",null,findOptions);
        Cell SS076_ACTUAL = cells.find("SS076_ACTUAL",null,findOptions);
        Cell SS020_ACTUAL = cells.find("SS020_ACTUAL",null,findOptions);
        ////
        Cell SS014_FORECAST = cells.find("SS014_FORECAST",null,findOptions);

        Cell SS014_ACTUAL = cells.find("SS014_ACTUAL",null,findOptions);
        Cell SS007_FORECAST = cells.find("SS007_FORECAST",null,findOptions);
        Cell SS007_ACTUAL = cells.find("SS007_ACTUAL",null,findOptions);
        Cell SS071_FORECAST = cells.find("SS071_FORECAST",null,findOptions);
        Cell SS071_ACTUAL = cells.find("SS071_ACTUAL",null,findOptions);
        Cell RE007_FORECAST = cells.find("RE007_FORECAST",null,findOptions);
        Cell RE007_ACTUAL = cells.find("RE007_ACTUAL",null,findOptions);
        Cell RE057_FORECAST = cells.find("RE057_FORECAST",null,findOptions);
        Cell RE057_ACTUAL = cells.find("RE057_ACTUAL",null,findOptions);
        // ////
        Cell RE015_FORECAST = cells.find("RE015_FORECAST",null,findOptions);

        Cell RE015_ACTUAL = cells.find("RE015_ACTUAL",null,findOptions);
        Cell RE005_FORECAST = cells.find("RE005_FORECAST",null,findOptions);
        Cell RE005_ACTUAL = cells.find("RE005_ACTUAL",null,findOptions);
        Cell RE066_FORECAST = cells.find("RE066_FORECAST",null,findOptions);
        Cell RE066_ACTUAL = cells.find("RE066_ACTUAL",null,findOptions);
        Cell RE030_FORECAST = cells.find("RE030_FORECAST",null,findOptions);
        Cell RE030_ACTUAL = cells.find("RE030_ACTUAL",null,findOptions);
        Cell RE056_FORECAST = cells.find("RE056_FORECAST",null,findOptions);
        Cell RE056_ACTUAL = cells.find("RE056_ACTUAL",null,findOptions);
        //// ////
        Cell RE001_FORECAST = cells.find("RE001_FORECAST",null,findOptions);

        Cell RE001_ACTUAL = cells.find("RE001_ACTUAL",null,findOptions);
        Cell RE031_FORECAST = cells.find("RE031_FORECAST",null,findOptions);
        Cell RE031_ACTUAL = cells.find("RE031_ACTUAL",null,findOptions);
        Cell RE032_FORECAST = cells.find("RE032_FORECAST",null,findOptions);
        Cell RE032_ACTUAL = cells.find("RE032_ACTUAL",null,findOptions);
        Cell RE020_FORECAST = cells.find("RE020_FORECAST",null,findOptions);
        Cell RE020_ACTUAL = cells.find("RE020_ACTUAL",null,findOptions);
        Cell RE097_FORECAST = cells.find("RE097_FORECAST",null,findOptions);
        Cell RE097_ACTUAL = cells.find("RE097_ACTUAL",null,findOptions);
        // //// ////
        Cell RE060_FORECAST = cells.find("RE060_FORECAST",null,findOptions);
        Cell RE060_ACTUAL = cells.find("RE060_ACTUAL",null,findOptions);
        Cell CI025_FORECAST = cells.find("CI025_FORECAST",null,findOptions);
        Cell CI025_ACTUAL = cells.find("CI025_ACTUAL",null,findOptions);
        Cell CI060_FORECAST = cells.find("CI060_FORECAST",null,findOptions);
        Cell CI060_ACTUAL = cells.find("CI060_ACTUAL",null,findOptions);
        Cell CI046_FORECAST = cells.find("CI046_FORECAST",null,findOptions);
        Cell CI046_ACTUAL = cells.find("CI046_ACTUAL",null,findOptions);
        Cell CI048_FORECAST = cells.find("CI048_FORECAST",null,findOptions);
        Cell CI048_ACTUAL = cells.find("CI048_ACTUAL",null,findOptions);
        // // //// ////
        Cell CI034_FORECAST = cells.find("CI034_FORECAST",null,findOptions);
        Cell CI034_ACTUAL = cells.find("CI034_ACTUAL",null,findOptions);
        Cell CI020_FORECAST = cells.find("CI020_FORECAST",null,findOptions);
        Cell CI020_ACTUAL = cells.find("CI020_ACTUAL",null,findOptions);
        Cell CI118_FORECAST = cells.find("CI118_FORECAST",null,findOptions);
        Cell CI118_ACTUAL = cells.find("CI118_ACTUAL",null,findOptions);
        Cell TRANSPORT_FORECAST = cells.find("TRANSPORT_FORECAST",null,findOptions);
        Cell TRANSPORT_ACTUAL = cells.find("TRANSPORT_ACTUAL",null,findOptions);
        Cell CI050_FORECAST = cells.find("CI050_FORECAST",null,findOptions);
        Cell CI050_ACTUAL = cells.find("CI050_ACTUAL",null,findOptions);
        //// // //// ////
        Cell CI110_FORECAST = cells.find("CI110_FORECAST",null,findOptions);
        Cell CI110_ACTUAL = cells.find("CI110_ACTUAL",null,findOptions);
        Cell CI035_FORECAST = cells.find("CI035_FORECAST",null,findOptions);
        Cell CI035_ACTUAL = cells.find("CI035_ACTUAL",null,findOptions);
        Cell CI166_FORECAST = cells.find("CI166_FORECAST",null,findOptions);
        Cell CI166_ACTUAL = cells.find("CI166_ACTUAL",null,findOptions);
        Cell CI032_PLAN = cells.find("CI032_PLAN",null,findOptions);
        Cell CI032_FORECAST = cells.find("CI032_FORECAST",null,findOptions);
        Cell CI032_ACTUAL = cells.find("CI032_ACTUAL",null,findOptions);
        Cell CI139_FORECAST = cells.find("CI139_FORECAST",null,findOptions);
        ////// // //// ////
        Cell CI139_ACTUAL = cells.find("CI139_ACTUAL",null,findOptions);
        Cell CI140_FORECAST = cells.find("CI140_FORECAST",null,findOptions);
        Cell CI140_ACTUAL = cells.find("CI140_ACTUAL",null,findOptions);
        Cell CL001_FORECAST = cells.find("CL001_FORECAST",null,findOptions);
        Cell CL001_ACTUAL = cells.find("CL001_ACTUAL",null,findOptions);
        Cell CL100_FORECAST = cells.find("CL100_FORECAST",null,findOptions);
        Cell CL100_ACTUAL = cells.find("CL100_ACTUAL",null,findOptions);
        Cell CL101_FORECAST = cells.find("CL101_FORECAST",null,findOptions);
        Cell CL101_ACTUAL = cells.find("CL101_ACTUAL",null,findOptions);
        Cell PLAN_FC_On_Air = cells.find("PLAN-FC_On_Air",null,findOptions);
        //////// // //// ////
        Cell Funding_Level = cells.find("Funding_Level",null,findOptions);
        Cell RANFARank = cells.find("RAN FA Rank",null,findOptions);
        Cell TriggerDate = cells.find("Trigger Date",null,findOptions);
        Cell MCEP = cells.find("MCEP",null,findOptions);
        Cell High_Trust = cells.find("High_Trust",null,findOptions);
        Cell LCL_Category = cells.find("LCL_Category",null,findOptions);
        Cell SPECTRUM = cells.find("SPECTRUM",null,findOptions);
        Cell BDMStatus = cells.find("BDM Status",null,findOptions);
        Cell RFDS_State_Status = cells.find("RFDS_State_Status",null,findOptions);
        Cell RFDSID = cells.find("RFDS ID",null,findOptions);
        ////////// // //// ////
        Cell RFDS_Workflow_Owner = cells.find("RFDS Workflow Owner",null,findOptions);
        Cell Structure_Type = cells.find("Structure_Type",null,findOptions);
        Cell AFTRCC_Status = cells.find("AFTRCC_Status",null,findOptions);
        Cell AFTRCC_Submit = cells.find("AFTRCC_Submit",null,findOptions);
        Cell Filter_Info = cells.find("Filter_Info",null,findOptions);
        Cell Parity = cells.find("Parity",null,findOptions);
        Cell MOD_Code = cells.find("MOD_Code",null,findOptions);
        findOptions.setLookAtType(LookAtType.CONTAINS);
        Cell MODCDParity_Flag = cells.find("Parity_Flag",null,findOptions);
        findOptions.setLookAtType(LookAtType.ENTIRE_CONTENT);
        Cell EPL_ProjectBucket01 = cells.find("EPL_ProjectBucket01",null,findOptions);
        Cell Max_CED_for_Project = cells.find("Max CED for Project",null,findOptions);
        //////////// // //// ////
        Cell Max_CED_Bucket = cells.find("Max_CED_Bucket",null,findOptions);
        Cell Submission_Status_Validation_Ranking = cells.find("Submission Status_Validation Ranking",null,findOptions);
        Cell Site_Submission_Status = cells.find("Site Submission Status",null,findOptions);
        Cell GATING_BUCKET = cells.find("GATING_BUCKET",null,findOptions);


        Cell EDP_Publish_Date = cells.find("Publish Date",null,findOptions);

        Cell EDP_STATUS = cells.find("EDP_STATUS",null,findOptions);
        Cell PSAP_Bucket = cells.find("PSAP_Bucket",null,findOptions);
        Cell PSAP_Comments = cells.find("PSAP Comments",null,findOptions);
        Cell Dist_Zone = cells.find("Dist_Zone",null,findOptions);
        Cell iComply_Bucket = cells.find("iComply_Bucket",null,findOptions);
        // //////////// // //// ////
        Cell Carrier_Count = cells.find("Carrier Count",null,findOptions);
        Cell Spectrum_Bucket = cells.find("Spectrum Bucket",null,findOptions);
        Cell Funding_Level_Handle = cells.find("Funding_Level_Handle",null,findOptions);
        Cell Temp = cells.find("Temp",null,findOptions);

        //
























        //Cell cellvb = worksheet.getCells().get(row, SITE_ID.getColumn());
        //System.out.println(worksheet.getCells().get(row, PACE_NUMBER.getColumn()).getValue()+" : "+cellvb.getValue());
        //System.out.println(cellv.getStringValue()+" : "+wfdata.getPacenumber().getClass().getName());
        //Cell cellv = worksheet.getCells().get(row, PACE_NUMBER.getColumn());

        Cell lastCell = worksheet.getCells().endCellInColumn((short)PACE_NUMBER.getColumn());
        for(int row =PACE_NUMBER.getRow()+1; row<=lastCell.getRow(); row++)
        {


            if(worksheet.getCells().get(row, PACE_NUMBER.getColumn()).getValue() !=null){
                wfdata.setPacenumber(worksheet.getCells().get(row, PACE_NUMBER.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, SITE_ID.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, SITE_ID.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, Primary_Job_Number.getColumn()).getValue() !=null){
                wfdata.setPrimary_job_number(worksheet.getCells().get(row, Primary_Job_Number.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, PACE_NAME.getColumn()).getValue() !=null){
                wfdata.setPace_name(worksheet.getCells().get(row, PACE_NAME.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, JOB_DESCRIPTION.getColumn()).getValue() !=null){
                wfdata.setJob_description(worksheet.getCells().get(row, JOB_DESCRIPTION.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, SEARCH_RING_ID.getColumn()).getValue() !=null){
                wfdata.setSearch_ring_id(worksheet.getCells().get(row, SEARCH_RING_ID.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, SEARCH_RING_NAME.getColumn()).getValue() !=null){
                wfdata.setSearch_ring_name(worksheet.getCells().get(row, SEARCH_RING_NAME.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, COUNTY.getColumn()).getValue() !=null){
                wfdata.setCounty(worksheet.getCells().get(row, COUNTY.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, FIPS_CODE.getColumn()).getValue() !=null){
                wfdata.setFips_code(Integer.parseInt(worksheet.getCells().get(row, FIPS_CODE.getColumn()).getValue().toString()));
            }
            if(worksheet.getCells().get(row, LATITUDE.getColumn()).getValue() !=null){
                wfdata.setLatitude(worksheet.getCells().get(row, LATITUDE.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, LONGITUDE.getColumn()).getValue() !=null){
                wfdata.setLongitude((worksheet.getCells().get(row, LONGITUDE.getColumn()).getValue().toString()));
            }
            if(worksheet.getCells().get(row, PRODUCT_GROUP.getColumn()).getValue() !=null){
                wfdata.setProduct_group(worksheet.getCells().get(row, PRODUCT_GROUP.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, PRODUCT_SUBGROUP.getColumn()).getValue() !=null){
                wfdata.setProduct_subgroup(worksheet.getCells().get(row, PRODUCT_SUBGROUP.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CFAS_PROJECT_NUMBER.getColumn()).getValue() !=null){
                wfdata.setCfas_project_number(worksheet.getCells().get(row, CFAS_PROJECT_NUMBER.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, SOURCE_JOB_NUMBER.getColumn()).getValue() !=null){
                wfdata.setSource_job_number(worksheet.getCells().get(row, SOURCE_JOB_NUMBER.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, IPLAN_JOB_STATUS.getColumn()).getValue() !=null){
                wfdata.setIplan_job_status(worksheet.getCells().get(row, IPLAN_JOB_STATUS.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, USID.getColumn()).getValue() !=null){
                wfdata.setUsid(Integer.parseInt(worksheet.getCells().get(row, USID.getColumn()).getValue().toString()));
            }
            if(worksheet.getCells().get(row, CONSTRUCTION_TYPE.getColumn()).getValue() !=null){
                wfdata.setConstruction_type(worksheet.getCells().get(row, CONSTRUCTION_TYPE.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, STATUS.getColumn()).getValue() !=null){
                wfdata.setStatus(worksheet.getCells().get(row, STATUS.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, NATIONAL_PROGRAM.getColumn()).getValue() !=null){
                wfdata.setNational_program(worksheet.getCells().get(row, NATIONAL_PROGRAM.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CAPITAL_PROGRAM.getColumn()).getValue() !=null){
                wfdata.setCapital_program(worksheet.getCells().get(row, CAPITAL_PROGRAM.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, TECHNOLOGY.getColumn()).getValue() !=null){
                wfdata.setTechnology(worksheet.getCells().get(row, TECHNOLOGY.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, FREQUENCY.getColumn()).getValue() !=null){
                wfdata.setFrequency(worksheet.getCells().get(row, FREQUENCY.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, RBS_ID.getColumn()).getValue() !=null){
                wfdata.setRbs_id(worksheet.getCells().get(row, RBS_ID.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, REGIONFRANCHISE_INDICATOR.getColumn()).getValue() !=null){
                wfdata.setRegionfranchise_indicator(worksheet.getCells().get(row, REGIONFRANCHISE_INDICATOR.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, STRATEGIC_DRIVER.getColumn()).getValue() !=null ||!worksheet.getCells().get(row, STRATEGIC_DRIVER.getColumn()).getValue().toString().equals("")){
                wfdata.setStrategic_driver((worksheet.getCells().get(row, STRATEGIC_DRIVER.getColumn()).getValue().toString()));
            }
            /*if(worksheet.getCells().get(row, BUDGET_YEAR.getColumn()).getValue() !=null){
                wfdata.setB(worksheet.getCells().get(row, BUDGET_YEAR.getColumn()).getValue().toString());
            }*/
            if(worksheet.getCells().get(row, CIVIL_VENDOR.getColumn()).getValue() !=null){
                wfdata.setCivil_vendor(worksheet.getCells().get(row, CIVIL_VENDOR.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, SITE_ACQUISITION_VENDOR.getColumn()).getValue() !=null){
                wfdata.setSite_acquisition_vendor(worksheet.getCells().get(row, SITE_ACQUISITION_VENDOR.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, EQUIPMENT_VENDOR.getColumn()).getValue() !=null){
                wfdata.setEquipment_vendor(worksheet.getCells().get(row, EQUIPMENT_VENDOR.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, JOB_VENDOR.getColumn()).getValue() !=null){
                wfdata.setJob_vendor(worksheet.getCells().get(row, JOB_VENDOR.getColumn()).getValue().toString());
            }
            //

            if(worksheet.getCells().get(row, Integration_Vendor.getColumn()).getValue() !=null){
                wfdata.setIntegration_vendor(worksheet.getCells().get(row, Integration_Vendor.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, Optimization_Vendor.getColumn()).getValue() !=null){
                wfdata.setOptimization_vendor(worksheet.getCells().get(row, Optimization_Vendor.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, custom_program.getColumn()).getValue() !=null){
                wfdata.setCustom_program(worksheet.getCells().get(row, custom_program.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, TEMPLATE_NAME.getColumn()).getValue() !=null){
                wfdata.setTemplate_name(worksheet.getCells().get(row, TEMPLATE_NAME.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, JOB_SCOPE.getColumn()).getValue() !=null){
                wfdata.setJob_scope(worksheet.getCells().get(row, JOB_SCOPE.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, ORACLE_PTN.getColumn()).getValue() !=null){
                wfdata.setOracle_ptn(worksheet.getCells().get(row, ORACLE_PTN.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, LAUNCH_POLYGON.getColumn()).getValue() !=null){
                wfdata.setLaunch_polygon(worksheet.getCells().get(row, LAUNCH_POLYGON.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, PHASE.getColumn()).getValue() !=null){
                wfdata.setPhase(worksheet.getCells().get(row, PHASE.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, PROJECT_MANAGER.getColumn()).getValue() !=null){
                wfdata.setProject_manager(worksheet.getCells().get(row, PROJECT_MANAGER.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, SAQ_Area_Manager.getColumn()).getValue() !=null){
                wfdata.setSaq_area_manager(worksheet.getCells().get(row, SAQ_Area_Manager.getColumn()).getValue().toString());
            }
            //
            if(worksheet.getCells().get(row, WORK_GROUP.getColumn()).getValue() !=null){
                wfdata.setWork_group(worksheet.getCells().get(row, WORK_GROUP.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, PM2_Person.getColumn()).getValue() !=null){
                wfdata.setPm2_person(worksheet.getCells().get(row, PM2_Person.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, PM3_Person.getColumn()).getValue() !=null){
                wfdata.setPm3_person(worksheet.getCells().get(row, PM3_Person.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CX_Area_Manager.getColumn()).getValue() !=null){
                wfdata.setCx_area_manager(worksheet.getCells().get(row, CX_Area_Manager.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, FA_LOCATION_CODE.getColumn()).getValue() !=null){
                wfdata.setFa_location_code(Integer.parseInt(worksheet.getCells().get(row, FA_LOCATION_CODE.getColumn()).getValue().toString()));
            }if(worksheet.getCells().get(row, FA_LOCATION_TYPE.getColumn()).getValue() !=null){
                wfdata.setFa_location_type(worksheet.getCells().get(row, FA_LOCATION_TYPE.getColumn()).getValue().toString());
            }
            /*if(worksheet.getCells().get(row, C_E_ON_AIR_DATE.getColumn()).getValue() !=null){
                wfdata.setC_E(worksheet.getCells().get(row, C_E_ON_AIR_DATE.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, ORIGINAL_NEED_BY_DATE.getColumn()).getValue() !=null){
                wfdata.(worksheet.getCells().get(row, ORIGINAL_NEED_BY_DATE.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CURRENT_NEED_BY_DATE.getColumn()).getValue() !=null){
                wfdata.s(worksheet.getCells().get(row, CURRENT_NEED_BY_DATE.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, COMMITTED_POR_ONAIRDATE.getColumn()).getValue() !=null){
                wfdata.setco(worksheet.getCells().get(row, COMMITTED_POR_ONAIRDATE.getColumn()).getValue().toString());
            }*/
            if(worksheet.getCells().get(row, ADDRESS.getColumn()).getValue() !=null){
                wfdata.setAddress(worksheet.getCells().get(row, ADDRESS.getColumn()).getValue().toString());
            }
            /*if(worksheet.getCells().get(row, TRANSPORT_TYPE.getColumn()).getValue() !=null|| !worksheet.getCells().get(row, TRANSPORT_TYPE.getColumn()).getValue().toString().isEmpty()||!worksheet.getCells().get(row, TRANSPORT_TYPE.getColumn()).getValue().toString().equals("")){
                wfdata.setTransport_type(Integer.parseInt(worksheet.getCells().get(row, TRANSPORT_TYPE.getColumn()).getValue().toString()));
            }*/
            if(worksheet.getCells().get(row, ONAIR_TASK.getColumn()).getValue() !=null){
                wfdata.setOnair_task(worksheet.getCells().get(row, ONAIR_TASK.getColumn()).getValue().toString());
            }
            /*if(worksheet.getCells().get(row, ONAIR_PLAN.getColumn()).getValue() !=null){
                wfdata.set(worksheet.getCells().get(row, ONAIR_PLAN.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, ONAIR_FORECAST.getColumn()).getValue() !=null){
                wfdata.seton(worksheet.getCells().get(row, ONAIR_FORECAST.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, ONAIR_ACTUAL.getColumn()).getValue() !=null){
                wfdata.seton(worksheet.getCells().get(row, ONAIR_ACTUAL.getColumn()).getValue().toString());
            }*/
            if(worksheet.getCells().get(row, POE_Name.getColumn()).getValue() !=null){
                wfdata.setPoe_name(worksheet.getCells().get(row, POE_Name.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, POR_Name.getColumn()).getValue() !=null){
                wfdata.setPor_name(worksheet.getCells().get(row, POR_Name.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, POE_Status.getColumn()).getValue() !=null){
                wfdata.setPoe_status(worksheet.getCells().get(row, POE_Status.getColumn()).getValue().toString());
            }
            //
            if(worksheet.getCells().get(row, POR_Status.getColumn()).getValue() !=null){
                wfdata.setPor_status(worksheet.getCells().get(row, POR_Status.getColumn()).getValue().toString());
            }/*if(worksheet.getCells().get(row, POR_ONAIR_PLAN.getColumn()).getValue() !=null){
                wfdata.setpor(worksheet.getCells().get(row, POR_ONAIR_PLAN.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CASPR_PROJECT_SEQ.getColumn()).getValue() !=null){
                wfdata.setcas(worksheet.getCells().get(row, CASPR_PROJECT_SEQ.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CASPR_PROJECT_NUMBER.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CASPR_PROJECT_NUMBER.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, JI003_FORECAST.getColumn()).getValue() !=null){
                wfdata.setj(worksheet.getCells().get(row, JI003_FORECAST.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, JI003_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, JI003_ACTUAL.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, SS076_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, SS076_FORECAST.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, SS076_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, SS076_ACTUAL.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, SS020_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, SS020_FORECAST.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, SS020_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, SS020_ACTUAL.getColumn()).getValue().toString());
            }
            ////
            if(worksheet.getCells().get(row, SS014_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, SS014_FORECAST.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, SS014_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, SS014_ACTUAL.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, SS007_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, SS007_FORECAST.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, SS007_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, SS007_ACTUAL.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, SS071_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, SS071_FORECAST.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, RE007_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, RE007_FORECAST.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, SS076_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, SS076_FORECAST.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, RE007_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, RE007_ACTUAL.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, RE057_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, RE057_FORECAST.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, RE057_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, RE057_ACTUAL.getColumn()).getValue().toString());
            }
            //////
            if(worksheet.getCells().get(row, RE001_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, RE001_FORECAST.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, SS014_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, SS014_ACTUAL.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, RE001_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, RE001_ACTUAL.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, RE031_FORECAST.getColumn()).getValue() !=null){
                wfdata.setre(worksheet.getCells().get(row, RE031_FORECAST.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, RE031_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, RE031_ACTUAL.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, RE032_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, RE032_FORECAST.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, RE032_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, RE032_FORECAST.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, RE020_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, RE020_FORECAST.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, RE097_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, RE097_FORECAST.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, RE097_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, RE097_ACTUAL.getColumn()).getValue().toString());
            }
            ////////
            if(worksheet.getCells().get(row, RE060_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, RE060_FORECAST.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, RE060_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, RE060_ACTUAL.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CI025_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI025_FORECAST.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, CI025_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI025_ACTUAL.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CI060_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI060_FORECAST.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, CI060_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI060_ACTUAL.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CI046_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI046_FORECAST.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, CI046_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI046_ACTUAL.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CI048_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI048_FORECAST.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, CI048_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI048_ACTUAL.getColumn()).getValue().toString());
            }
            // ////////
            if(worksheet.getCells().get(row, CI034_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI034_FORECAST.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, CI034_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI034_ACTUAL.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CI020_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI020_FORECAST.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, CI020_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI020_ACTUAL.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CI118_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI118_FORECAST.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, CI118_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI118_ACTUAL.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, TRANSPORT_FORECAST.getColumn()).getValue() !=null){
                wfdata.settr(worksheet.getCells().get(row, TRANSPORT_FORECAST.getColumn()).getValue().toString());
            }


            if(worksheet.getCells().get(row, TRANSPORT_ACTUAL.getColumn()).getValue() !=null){
                wfdata.settr(worksheet.getCells().get(row, TRANSPORT_ACTUAL.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CI050_FORECAST.getColumn()).getValue() !=null){
                wfdata.(worksheet.getCells().get(row, CI050_FORECAST.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, CI050_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI050_ACTUAL.getColumn()).getValue().toString());
            }
            //// ////////
            if(worksheet.getCells().get(row, CI110_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI110_FORECAST.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, CI110_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI110_ACTUAL.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CI035_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI035_FORECAST.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, CI035_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI035_ACTUAL.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CI166_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI166_FORECAST.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, CI166_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI166_ACTUAL.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CI032_PLAN.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI032_PLAN.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, CI032_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI032_FORECAST.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CI032_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI032_ACTUAL.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, CI139_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI139_FORECAST.getColumn()).getValue().toString());
            }
            ////// ////////
            if(worksheet.getCells().get(row, CI139_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI139_ACTUAL.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, CI140_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI140_FORECAST.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CI140_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CI140_ACTUAL.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, CL001_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CL001_FORECAST.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CL001_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CL001_ACTUAL.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, CL100_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CL100_FORECAST.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CL100_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CL100_ACTUAL.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, CL101_FORECAST.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CL101_FORECAST.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, CL101_ACTUAL.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, CL101_ACTUAL.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, PLAN_FC_On_Air.getColumn()).getValue() !=null){
                wfdata.setSite_id(worksheet.getCells().get(row, PLAN_FC_On_Air.getColumn()).getValue().toString());
            }*/
            //////// ////////
            if(worksheet.getCells().get(row, Funding_Level.getColumn()).getValue() !=null){
                wfdata.setFunding_level_handle((worksheet.getCells().get(row, Funding_Level.getColumn()).getValue().toString()));
            }/*if(worksheet.getCells().get(row,  RANFARank.getColumn()).getValue() !=null){
                wfdata.(worksheet.getCells().get(row,  RANFARank.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row,  TriggerDate.getColumn()).getValue() !=null){
                wfdata.settr(worksheet.getCells().get(row,  TriggerDate.getColumn()).getValue().toString());
            }*/

            if(worksheet.getCells().get(row, MCEP.getColumn()).getValue() !=null){
                wfdata.setMcep(worksheet.getCells().get(row, MCEP.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, High_Trust.getColumn()).getValue() !=null){
                wfdata.setHigh_trust(worksheet.getCells().get(row, High_Trust.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, LCL_Category.getColumn()).getValue() !=null){
                wfdata.setLcl_category(worksheet.getCells().get(row, LCL_Category.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, SPECTRUM.getColumn()).getValue() !=null || !worksheet.getCells().get(row, SPECTRUM.getColumn()).getValue().toString().isEmpty()){
                wfdata.setSpectrum(worksheet.getCells().get(row, SPECTRUM.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, BDMStatus.getColumn()).getValue() !=null || !worksheet.getCells().get(row, BDMStatus.getColumn()).getValue().toString().isEmpty() || worksheet.getCells().get(row, BDMStatus.getColumn()).getValue().toString()!=""){
                wfdata.setBdm_status(worksheet.getCells().get(row, BDMStatus.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, RFDS_State_Status.getColumn()).getValue() !=null){
                wfdata.setRfds_state_status(worksheet.getCells().get(row, RFDS_State_Status.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, RFDSID.getColumn()).getValue() !=null){
                wfdata.setRfds_id(worksheet.getCells().get(row, RFDSID.getColumn()).getValue().toString());
            }
            ////////// ////////
            if(worksheet.getCells().get(row, RFDS_Workflow_Owner.getColumn()).getValue() !=null){
                wfdata.setRfds_workflow_owner(worksheet.getCells().get(row, RFDS_Workflow_Owner.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row,  Structure_Type.getColumn()).getValue() !=null){
                wfdata.setStructure_type(worksheet.getCells().get(row,  Structure_Type.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row,  AFTRCC_Status.getColumn()).getValue() !=null){
                wfdata.setAftrcc_status(worksheet.getCells().get(row,  AFTRCC_Status.getColumn()).getValue().toString());
            }

            /*if(worksheet.getCells().get(row, AFTRCC_Submit.getColumn()).getValue() !=null){
                wfdata.setaf(worksheet.getCells().get(row, AFTRCC_Submit.getColumn()).getValue().toString());
            }*/
            if(worksheet.getCells().get(row, Filter_Info.getColumn()).getValue() !=null){
                wfdata.setFilter_info(worksheet.getCells().get(row, Filter_Info.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, Parity.getColumn()).getValue() !=null){
                wfdata.setParity(worksheet.getCells().get(row, Parity.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, MOD_Code.getColumn()).getValue() !=null){
                wfdata.setMod_code(worksheet.getCells().get(row, MOD_Code.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, MODCDParity_Flag.getColumn()).getValue().toString() !=null || !worksheet.getCells().get(row, MODCDParity_Flag.getColumn()).getValue().toString().isEmpty()|| worksheet.getCells().get(row, MODCDParity_Flag.getColumn()).getValue().toString()!="null"){
                wfdata.setModcd_parity_flag(worksheet.getCells().get(row, MODCDParity_Flag.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, EPL_ProjectBucket01.getColumn()).getValue() !=null){
                wfdata.setEpl_projectbucket01(worksheet.getCells().get(row, EPL_ProjectBucket01.getColumn()).getValue().toString());
            }/*if(worksheet.getCells().get(row, Max_CED_for_Project.getColumn()).getValue() !=null){
                wfdata.setMax_ced_bucket(worksheet.getCells().get(row, Max_CED_for_Project.getColumn()).getValue().toString());
            }*/
            //////////// ////////
            if(worksheet.getCells().get(row,  Max_CED_Bucket.getColumn()).getValue() !=null){
                wfdata.setMax_ced_bucket(worksheet.getCells().get(row,  Max_CED_Bucket.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row,  Submission_Status_Validation_Ranking.getColumn()).getValue() !=null){
                wfdata.setSubmission_status_validation_ranking(worksheet.getCells().get(row,    Submission_Status_Validation_Ranking.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row,  Site_Submission_Status.getColumn()).getValue() !=null){
                wfdata.setSite_submission_status(worksheet.getCells().get(row,  Site_Submission_Status.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, GATING_BUCKET.getColumn()).getValue() !=null){
                wfdata.setGating_bucket(worksheet.getCells().get(row, GATING_BUCKET.getColumn()).getValue().toString());
            }
            /*if(worksheet.getCells().get(row, EDP_Publish_Date.getColumn()).getValue().toString() !=null|| !worksheet.getCells().get(row, EDP_Publish_Date.getColumn()).getValue().toString().equals("")||!worksheet.getCells().get(row, EDP_Publish_Date.getColumn()).getValue().toString().isEmpty() ){
                wfdata.setSite_id(worksheet.getCells().get(row, EDP_Publish_Date.getColumn()).getValue().toString());
            }*/

            if(worksheet.getCells().get(row, EDP_STATUS.getColumn()).getValue() !=null){
                wfdata.setEdp_status(worksheet.getCells().get(row, EDP_STATUS.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, PSAP_Bucket.getColumn()).getValue() !=null){
                wfdata.setPsap_bucket(worksheet.getCells().get(row, PSAP_Bucket.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, PSAP_Comments.getColumn()).getValue() !=null){
                wfdata.setPsap_comments(worksheet.getCells().get(row, PSAP_Comments.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row, Dist_Zone.getColumn()).getValue() !=null){
                wfdata.setDist_zone(worksheet.getCells().get(row, Dist_Zone.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row, iComply_Bucket.getColumn()).getValue() !=null){
                wfdata.setIcomply_bucket(worksheet.getCells().get(row, iComply_Bucket.getColumn()).getValue().toString());
            }
            // //////////// ////////
            if(worksheet.getCells().get(row,  Carrier_Count.getColumn()).getValue() !=null){
                wfdata.setCarrier_count(worksheet.getCells().get(row,  Carrier_Count.getColumn()).getValue().toString());
            }if(worksheet.getCells().get(row,  Spectrum_Bucket.getColumn()).getValue() !=null){
                wfdata.setSpectrum_bucket(worksheet.getCells().get(row,    Spectrum_Bucket.getColumn()).getValue().toString());
            }
            if(worksheet.getCells().get(row,  Funding_Level_Handle.getColumn()).getValue() !=null){
                wfdata.setFunding_level_handle(worksheet.getCells().get(row,  Funding_Level_Handle.getColumn()).getValue().toString());
            }

            if(worksheet.getCells().get(row, Temp.getColumn()).getValue() !=null){
                wfdata.setTemp(worksheet.getCells().get(row, Temp.getColumn()).getValue().toString());
            }

            //




















































































































            lstwfall.add(wfdata);
        }

        return lstwfall;


    }
}
