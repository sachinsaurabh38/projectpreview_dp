-- MIGRATION SCRIPT
-- Database Type: DBType{type='mysql', urlScheme='jdbc:', dialect='org.hibernate.dialect.MySQLDialect', driverClass='com.mysql.jdbc.Driver'}
-- App Name: projectpreview_dp
-- Database: dmpprofiles
-- Created At: 13-Apr-2020 13:14:41.UTC
-- Script Version: 6.0
-- -----------------------------------------------------------------
ALTER TABLE `TABLE2` MODIFY COLUMN `COLUMN2` VARCHAR(255) NOT NULL;
