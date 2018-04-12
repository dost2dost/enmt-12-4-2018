# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table enmt3_truf_vendor_tim_kurtz (
  id                            serial not null,
  rbsid                         float,
  pacenumber                    varchar(255),
  fa_location                   varchar(255),
  submitters_email              varchar(255),
  structure_type                varchar(255),
  site_state                    varchar(255),
  useid                         varchar(255),
  vendor_provided_gps_cable_type varchar(255),
  username                      varchar(255),
  vendor_provided_longitude_in_decimals varchar(255),
  vendor_provided_latitude_in_decimals varchar(255),
  usid                          float,
  vendor_provided_gps_cable_length_feets integer,
  vendor_provided_rbs_cable_length_feets integer,
  vendor_provided_rbs_cable_type varchar(255),
  constraint pk_enmt3_truf_vendor_tim_kurtz primary key (id)
);

create table "_LTE_Vendor_Validation___1000_ro" (
  "PACE Number"                 varchar(255),
  "Submitters E-mail"           varchar(255),
  "Structure Type"              varchar(255),
  "FA Location"                 varchar(255),
  "RBSID"                       varchar(255),
  "USID"                        varchar(255),
  "SITE_STATE"                  varchar(255),
  "USEID"                       varchar(255),
  "Vendor Provided LATITUDE in Decimals" varchar(255),
  "Vendor Provided LONGITUDE in Decimals" varchar(255),
  "Vendor Provided GPS Calble Length (Feet)" varchar(255),
  "Vendor Provided GPS Cable Type" varchar(255),
  "Vendor Provided RBS Cable Length (Feet)" varchar(255),
  "Vendor Provided RBS Cable Type" varchar(255)
);

create table "CSSNG_TURF_Vendor_Upload_Template" (
  "PACE Number"                 varchar(255),
  "Submitters E-mail"           varchar(255),
  "Structure Type"              varchar(255),
  "FA Location"                 varchar(255),
  "RBSID"                       varchar(255),
  "USID"                        varchar(255),
  "SITE_STATE"                  varchar(255),
  "USEID"                       varchar(255),
  "Vendor Provided LATITUDE in Decimals" varchar(255),
  "Vendor Provided LONGITUDE in Decimals" varchar(255),
  "Vendor Provided GPS Calble Length (Feet)" varchar(255),
  "Vendor Provided GPS Cable Type" varchar(255),
  "Vendor Provided RBS Cable Length (Feet)" varchar(255),
  "Vendor Provided RBS Cable Type" varchar(255)
);

create table _lte_data (
  "PACE_NUMBER"                 varchar(255),
  "SITE_ID"                     varchar(255),
  "Primary_Job_Number"          varchar(255),
  "USID"                        varchar(255)
);


# --- !Downs

drop table if exists enmt3_truf_vendor_tim_kurtz cascade;

drop table if exists "_LTE_Vendor_Validation___1000_ro" cascade;

drop table if exists "CSSNG_TURF_Vendor_Upload_Template" cascade;

drop table if exists _lte_data cascade;

