-- MIGRATION SCRIPT
-- Database Type: DBType{type='mysql', urlScheme='jdbc:', dialect='org.hibernate.dialect.MySQLDialect', driverClass='com.mysql.jdbc.Driver'}
-- App Name: projectpreview_dp
-- Database: dmpprofiles
-- Created At: 13-Apr-2020 13:15:24.UTC
-- Script Version: 7.0
-- -----------------------------------------------------------------
ALTER TABLE `FAWB_PROPERTY_SOURCE` MODIFY COLUMN `PROPERTY_KEY` VARCHAR(255) NOT NULL;
