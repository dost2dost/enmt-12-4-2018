package entities;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Dost Muhammad on 3/8/2018.
 */
@Entity
@Table(name="_lte_data")
public class WaterFallLteData extends Model {
    @Id
    private int id;

    private int fips_code	,

            usid	,

            fa_location_code	,
            polygon_jid	,
            transport_type

            	;

    private String pacenumber	,site_id	,primary_job_number	,pace_name	,
            job_description	,search_ring_id	,search_ring_name	,county	,product_group	,
            product_subgroup	,cfas_project_number	,source_job_number	,iplan_job_status	,
            construction_type	,status	,national_program	,job_type_subtype	,capital_program	,
            technology	,frequency	,rbs_id	,regionfranchise_indicator	,civil_vendor	,site_acquisition_vendor	,
            equipment_vendor	,job_vendor	,integration_vendor	,optimization_vendor	,custom_program	,template_name	,
            job_scope	,oracle_ptn	,launch_polygon	,phase	,project_manager	,saq_area_manager	,work_group,
            pm2_person	,pm3_person	,cx_area_manager	,fa_location_type,	address	,onair_task	,poe_name	,
            por_name	,poe_status	,por_status,	mcep	,high_trust	,lcl_category	,spectrum	,bdm_status	,
            rfds_state_status	,rfds_workflow_owner	,structure_type	,aftrcc_status	,filter_info	,parity	,mod_code	,
            modcd_parity_flag	,epl_projectbucket01	,max_ced_bucket	,submission_status_validation_ranking	,site_submission_status	,
            gating_bucket	,edp_status	,psap_bucket	,psap_comments	,dist_zone	,icomply_bucket	,carrier_count	,spectrum_bucket	,
            temp	,username,latitude	, strategic_driver	,rfds_id,
    longitude	,funding_level_handle	;

    public WaterFallLteData(int fips_code, String latitude, String longitude, int usid, String strategic_driver, int fa_location_code, int polygon_jid, int transport_type, String rfds_id, String funding_level_handle, String pacenumber, String site_id, String primary_job_number, String pace_name, String job_description, String search_ring_id, String search_ring_name, String county, String product_group, String product_subgroup, String cfas_project_number, String source_job_number, String iplan_job_status, String construction_type, String status, String national_program, String job_type_subtype, String capital_program, String technology, String frequency, String rbs_id, String regionfranchise_indicator, String civil_vendor, String site_acquisition_vendor, String equipment_vendor, String job_vendor, String integration_vendor, String optimization_vendor, String custom_program, String template_name, String job_scope, String oracle_ptn, String launch_polygon, String phase, String project_manager, String saq_area_manager, String work_group, String pm2_person, String pm3_person, String cx_area_manager, String fa_location_type, String address, String onair_task, String poe_name, String por_name, String poe_status, String por_status, String mcep, String high_trust, String lcl_category, String spectrum, String bdm_status, String rfds_state_status, String rfds_workflow_owner, String structure_type, String aftrcc_status, String filter_info, String parity, String mod_code, String modcd_parity_flag, String epl_projectbucket01, String max_ced_bucket, String submission_status_validation_ranking, String site_submission_status, String gating_bucket, String edp_status, String psap_bucket, String psap_comments, String dist_zone, String icomply_bucket, String carrier_count, String spectrum_bucket, String temp, String username) {
        this.fips_code = fips_code;
        this.latitude = latitude;
        this.longitude = longitude;
        this.usid = usid;
        this.strategic_driver = strategic_driver;
        this.fa_location_code = fa_location_code;
        this.polygon_jid = polygon_jid;
        this.transport_type = transport_type;
        this.rfds_id = rfds_id;
        this.funding_level_handle = funding_level_handle;
        this.pacenumber = pacenumber;
        this.site_id = site_id;
        this.primary_job_number = primary_job_number;
        this.pace_name = pace_name;
        this.job_description = job_description;
        this.search_ring_id = search_ring_id;
        this.search_ring_name = search_ring_name;
        this.county = county;
        this.product_group = product_group;
        this.product_subgroup = product_subgroup;
        this.cfas_project_number = cfas_project_number;
        this.source_job_number = source_job_number;
        this.iplan_job_status = iplan_job_status;
        this.construction_type = construction_type;
        this.status = status;
        this.national_program = national_program;
        this.job_type_subtype = job_type_subtype;
        this.capital_program = capital_program;
        this.technology = technology;
        this.frequency = frequency;
        this.rbs_id = rbs_id;
        this.regionfranchise_indicator = regionfranchise_indicator;
        this.civil_vendor = civil_vendor;
        this.site_acquisition_vendor = site_acquisition_vendor;
        this.equipment_vendor = equipment_vendor;
        this.job_vendor = job_vendor;
        this.integration_vendor = integration_vendor;
        this.optimization_vendor = optimization_vendor;
        this.custom_program = custom_program;
        this.template_name = template_name;
        this.job_scope = job_scope;
        this.oracle_ptn = oracle_ptn;
        this.launch_polygon = launch_polygon;
        this.phase = phase;
        this.project_manager = project_manager;
        this.saq_area_manager = saq_area_manager;
        this.work_group = work_group;
        this.pm2_person = pm2_person;
        this.pm3_person = pm3_person;
        this.cx_area_manager = cx_area_manager;
        this.fa_location_type = fa_location_type;
        this.address = address;
        this.onair_task = onair_task;
        this.poe_name = poe_name;
        this.por_name = por_name;
        this.poe_status = poe_status;
        this.por_status = por_status;
        this.mcep = mcep;
        this.high_trust = high_trust;
        this.lcl_category = lcl_category;
        this.spectrum = spectrum;
        this.bdm_status = bdm_status;
        this.rfds_state_status = rfds_state_status;
        this.rfds_workflow_owner = rfds_workflow_owner;
        this.structure_type = structure_type;
        this.aftrcc_status = aftrcc_status;
        this.filter_info = filter_info;
        this.parity = parity;
        this.mod_code = mod_code;
        this.modcd_parity_flag = modcd_parity_flag;
        this.epl_projectbucket01 = epl_projectbucket01;
        this.max_ced_bucket = max_ced_bucket;
        this.submission_status_validation_ranking = submission_status_validation_ranking;
        this.site_submission_status = site_submission_status;
        this.gating_bucket = gating_bucket;
        this.edp_status = edp_status;
        this.psap_bucket = psap_bucket;
        this.psap_comments = psap_comments;
        this.dist_zone = dist_zone;
        this.icomply_bucket = icomply_bucket;
        this.carrier_count = carrier_count;
        this.spectrum_bucket = spectrum_bucket;
        this.temp = temp;
        this.username = username;
    }

    public WaterFallLteData() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFips_code() {
        return fips_code;
    }

    public void setFips_code(int fips_code) {
        this.fips_code = fips_code;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public int getUsid() {
        return usid;
    }

    public void setUsid(int usid) {
        this.usid = usid;
    }

    public String getStrategic_driver() {
        return strategic_driver;
    }

    public void setStrategic_driver(String strategic_driver) {
        this.strategic_driver = strategic_driver;
    }

    public int getFa_location_code() {
        return fa_location_code;
    }

    public void setFa_location_code(int fa_location_code) {
        this.fa_location_code = fa_location_code;
    }

    public int getPolygon_jid() {
        return polygon_jid;
    }

    public void setPolygon_jid(int polygon_jid) {
        this.polygon_jid = polygon_jid;
    }

    public int getTransport_type() {
        return transport_type;
    }

    public void setTransport_type(int transport_type) {
        this.transport_type = transport_type;
    }

    public String getRfds_id() {
        return rfds_id;
    }

    public void setRfds_id(String rfds_id) {
        this.rfds_id = rfds_id;
    }

    public String getFunding_level_handle() {
        return funding_level_handle;
    }

    public void setFunding_level_handle(String funding_level_handle) {
        this.funding_level_handle = funding_level_handle;
    }

    public String getPacenumber() {
        return pacenumber;
    }

    public void setPacenumber(String pacenumber) {
        this.pacenumber = pacenumber;
    }

    public String getSite_id() {
        return site_id;
    }

    public void setSite_id(String site_id) {
        this.site_id = site_id;
    }

    public String getPrimary_job_number() {
        return primary_job_number;
    }

    public void setPrimary_job_number(String primary_job_number) {
        this.primary_job_number = primary_job_number;
    }

    public String getPace_name() {
        return pace_name;
    }

    public void setPace_name(String pace_name) {
        this.pace_name = pace_name;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }

    public String getSearch_ring_id() {
        return search_ring_id;
    }

    public void setSearch_ring_id(String search_ring_id) {
        this.search_ring_id = search_ring_id;
    }

    public String getSearch_ring_name() {
        return search_ring_name;
    }

    public void setSearch_ring_name(String search_ring_name) {
        this.search_ring_name = search_ring_name;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getProduct_group() {
        return product_group;
    }

    public void setProduct_group(String product_group) {
        this.product_group = product_group;
    }

    public String getProduct_subgroup() {
        return product_subgroup;
    }

    public void setProduct_subgroup(String product_subgroup) {
        this.product_subgroup = product_subgroup;
    }

    public String getCfas_project_number() {
        return cfas_project_number;
    }

    public void setCfas_project_number(String cfas_project_number) {
        this.cfas_project_number = cfas_project_number;
    }

    public String getSource_job_number() {
        return source_job_number;
    }

    public void setSource_job_number(String source_job_number) {
        this.source_job_number = source_job_number;
    }

    public String getIplan_job_status() {
        return iplan_job_status;
    }

    public void setIplan_job_status(String iplan_job_status) {
        this.iplan_job_status = iplan_job_status;
    }

    public String getConstruction_type() {
        return construction_type;
    }

    public void setConstruction_type(String construction_type) {
        this.construction_type = construction_type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNational_program() {
        return national_program;
    }

    public void setNational_program(String national_program) {
        this.national_program = national_program;
    }

    public String getJob_type_subtype() {
        return job_type_subtype;
    }

    public void setJob_type_subtype(String job_type_subtype) {
        this.job_type_subtype = job_type_subtype;
    }

    public String getCapital_program() {
        return capital_program;
    }

    public void setCapital_program(String capital_program) {
        this.capital_program = capital_program;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getRbs_id() {
        return rbs_id;
    }

    public void setRbs_id(String rbs_id) {
        this.rbs_id = rbs_id;
    }

    public String getRegionfranchise_indicator() {
        return regionfranchise_indicator;
    }

    public void setRegionfranchise_indicator(String regionfranchise_indicator) {
        this.regionfranchise_indicator = regionfranchise_indicator;
    }

    public String getCivil_vendor() {
        return civil_vendor;
    }

    public void setCivil_vendor(String civil_vendor) {
        this.civil_vendor = civil_vendor;
    }

    public String getSite_acquisition_vendor() {
        return site_acquisition_vendor;
    }

    public void setSite_acquisition_vendor(String site_acquisition_vendor) {
        this.site_acquisition_vendor = site_acquisition_vendor;
    }

    public String getEquipment_vendor() {
        return equipment_vendor;
    }

    public void setEquipment_vendor(String equipment_vendor) {
        this.equipment_vendor = equipment_vendor;
    }

    public String getJob_vendor() {
        return job_vendor;
    }

    public void setJob_vendor(String job_vendor) {
        this.job_vendor = job_vendor;
    }

    public String getIntegration_vendor() {
        return integration_vendor;
    }

    public void setIntegration_vendor(String integration_vendor) {
        this.integration_vendor = integration_vendor;
    }

    public String getOptimization_vendor() {
        return optimization_vendor;
    }

    public void setOptimization_vendor(String optimization_vendor) {
        this.optimization_vendor = optimization_vendor;
    }

    public String getCustom_program() {
        return custom_program;
    }

    public void setCustom_program(String custom_program) {
        this.custom_program = custom_program;
    }

    public String getTemplate_name() {
        return template_name;
    }

    public void setTemplate_name(String template_name) {
        this.template_name = template_name;
    }

    public String getJob_scope() {
        return job_scope;
    }

    public void setJob_scope(String job_scope) {
        this.job_scope = job_scope;
    }

    public String getOracle_ptn() {
        return oracle_ptn;
    }

    public void setOracle_ptn(String oracle_ptn) {
        this.oracle_ptn = oracle_ptn;
    }

    public String getLaunch_polygon() {
        return launch_polygon;
    }

    public void setLaunch_polygon(String launch_polygon) {
        this.launch_polygon = launch_polygon;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getProject_manager() {
        return project_manager;
    }

    public void setProject_manager(String project_manager) {
        this.project_manager = project_manager;
    }

    public String getSaq_area_manager() {
        return saq_area_manager;
    }

    public void setSaq_area_manager(String saq_area_manager) {
        this.saq_area_manager = saq_area_manager;
    }

    public String getWork_group() {
        return work_group;
    }

    public void setWork_group(String work_group) {
        this.work_group = work_group;
    }

    public String getPm2_person() {
        return pm2_person;
    }

    public void setPm2_person(String pm2_person) {
        this.pm2_person = pm2_person;
    }

    public String getPm3_person() {
        return pm3_person;
    }

    public void setPm3_person(String pm3_person) {
        this.pm3_person = pm3_person;
    }

    public String getCx_area_manager() {
        return cx_area_manager;
    }

    public void setCx_area_manager(String cx_area_manager) {
        this.cx_area_manager = cx_area_manager;
    }

    public String getFa_location_type() {
        return fa_location_type;
    }

    public void setFa_location_type(String fa_location_type) {
        this.fa_location_type = fa_location_type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOnair_task() {
        return onair_task;
    }

    public void setOnair_task(String onair_task) {
        this.onair_task = onair_task;
    }

    public String getPoe_name() {
        return poe_name;
    }

    public void setPoe_name(String poe_name) {
        this.poe_name = poe_name;
    }

    public String getPor_name() {
        return por_name;
    }

    public void setPor_name(String por_name) {
        this.por_name = por_name;
    }

    public String getPoe_status() {
        return poe_status;
    }

    public void setPoe_status(String poe_status) {
        this.poe_status = poe_status;
    }

    public String getPor_status() {
        return por_status;
    }

    public void setPor_status(String por_status) {
        this.por_status = por_status;
    }

    public String getMcep() {
        return mcep;
    }

    public void setMcep(String mcep) {
        this.mcep = mcep;
    }

    public String getHigh_trust() {
        return high_trust;
    }

    public void setHigh_trust(String high_trust) {
        this.high_trust = high_trust;
    }

    public String getLcl_category() {
        return lcl_category;
    }

    public void setLcl_category(String lcl_category) {
        this.lcl_category = lcl_category;
    }

    public String getSpectrum() {
        return spectrum;
    }

    public void setSpectrum(String spectrum) {
        this.spectrum = spectrum;
    }

    public String getBdm_status() {
        return bdm_status;
    }

    public void setBdm_status(String bdm_status) {
        this.bdm_status = bdm_status;
    }

    public String getRfds_state_status() {
        return rfds_state_status;
    }

    public void setRfds_state_status(String rfds_state_status) {
        this.rfds_state_status = rfds_state_status;
    }

    public String getRfds_workflow_owner() {
        return rfds_workflow_owner;
    }

    public void setRfds_workflow_owner(String rfds_workflow_owner) {
        this.rfds_workflow_owner = rfds_workflow_owner;
    }

    public String getStructure_type() {
        return structure_type;
    }

    public void setStructure_type(String structure_type) {
        this.structure_type = structure_type;
    }

    public String getAftrcc_status() {
        return aftrcc_status;
    }

    public void setAftrcc_status(String aftrcc_status) {
        this.aftrcc_status = aftrcc_status;
    }

    public String getFilter_info() {
        return filter_info;
    }

    public void setFilter_info(String filter_info) {
        this.filter_info = filter_info;
    }

    public String getParity() {
        return parity;
    }

    public void setParity(String parity) {
        this.parity = parity;
    }

    public String getMod_code() {
        return mod_code;
    }

    public void setMod_code(String mod_code) {
        this.mod_code = mod_code;
    }

    public String getModcd_parity_flag() {
        return modcd_parity_flag;
    }

    public void setModcd_parity_flag(String modcd_parity_flag) {
        this.modcd_parity_flag = modcd_parity_flag;
    }

    public String getEpl_projectbucket01() {
        return epl_projectbucket01;
    }

    public void setEpl_projectbucket01(String epl_projectbucket01) {
        this.epl_projectbucket01 = epl_projectbucket01;
    }

    public String getMax_ced_bucket() {
        return max_ced_bucket;
    }

    public void setMax_ced_bucket(String max_ced_bucket) {
        this.max_ced_bucket = max_ced_bucket;
    }

    public String getSubmission_status_validation_ranking() {
        return submission_status_validation_ranking;
    }

    public void setSubmission_status_validation_ranking(String submission_status_validation_ranking) {
        this.submission_status_validation_ranking = submission_status_validation_ranking;
    }

    public String getSite_submission_status() {
        return site_submission_status;
    }

    public void setSite_submission_status(String site_submission_status) {
        this.site_submission_status = site_submission_status;
    }

    public String getGating_bucket() {
        return gating_bucket;
    }

    public void setGating_bucket(String gating_bucket) {
        this.gating_bucket = gating_bucket;
    }

    public String getEdp_status() {
        return edp_status;
    }

    public void setEdp_status(String edp_status) {
        this.edp_status = edp_status;
    }

    public String getPsap_bucket() {
        return psap_bucket;
    }

    public void setPsap_bucket(String psap_bucket) {
        this.psap_bucket = psap_bucket;
    }

    public String getPsap_comments() {
        return psap_comments;
    }

    public void setPsap_comments(String psap_comments) {
        this.psap_comments = psap_comments;
    }

    public String getDist_zone() {
        return dist_zone;
    }

    public void setDist_zone(String dist_zone) {
        this.dist_zone = dist_zone;
    }

    public String getIcomply_bucket() {
        return icomply_bucket;
    }

    public void setIcomply_bucket(String icomply_bucket) {
        this.icomply_bucket = icomply_bucket;
    }

    public String getCarrier_count() {
        return carrier_count;
    }

    public void setCarrier_count(String carrier_count) {
        this.carrier_count = carrier_count;
    }

    public String getSpectrum_bucket() {
        return spectrum_bucket;
    }

    public void setSpectrum_bucket(String spectrum_bucket) {
        this.spectrum_bucket = spectrum_bucket;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static final Finder<Integer, WaterFallLteData> find = new Finder<>(WaterFallLteData.class);
}
