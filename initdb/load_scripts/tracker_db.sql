/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `vehicle_tracking_details`
--
DROP TABLE IF EXISTS `vehicle_tracking_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;

CREATE TABLE `vehicle_tracking_details` (
  `device_imei_code` varchar(30) NOT NULL,
  `device_code` varchar(20) DEFAULT 'NA',
  `namespace_code` varchar(20) DEFAULT 'NA',
  `device_time` bigint(20) NOT NULL,
  `datetime` bigint(20) NOT NULL,
  `live_data_flag` tinyint(4) NOT NULL,
  `gps_status_flag` tinyint(4) NOT NULL DEFAULT '0',
  `latitude` float NOT NULL,
  `longitude` float NOT NULL,
  `altitude` float NOT NULL,
  `speed` float NOT NULL,
  `direction` int(11) NOT NULL,
  `odometer` float NOT NULL,
  `gps_move_status` tinyint(4) NOT NULL DEFAULT '0',
  `gsm_signal` tinyint(4) NOT NULL,
  `ignition` tinyint(4) NOT NULL,
  `sequence_number` int(11) NOT NULL,
  `climatize` tinyint(4) NOT NULL,
  `battery_volt` varchar(15) NOT NULL DEFAULT 'NA',
  `location_address_code` varchar(20) NOT NULL DEFAULT 'NA',
  `active_flag` tinyint(4) NOT NULL DEFAULT '1',
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  KEY `inx_vehicle_tracking_details_1` (`namespace_code`,`device_code`,`device_time`,`active_flag`)
) ENGINE=INNODB DEFAULT CHARSET=latin1
/*!50100 PARTITION BY RANGE ( MONTH(created_date))
(PARTITION m1 VALUES LESS THAN (2),
 PARTITION m2 VALUES LESS THAN (3),
 PARTITION m3 VALUES LESS THAN (4),
 PARTITION m4 VALUES LESS THAN (5),
 PARTITION m5 VALUES LESS THAN (6),
 PARTITION m6 VALUES LESS THAN (7),
 PARTITION m7 VALUES LESS THAN (8),
 PARTITION m8 VALUES LESS THAN (9),
 PARTITION m9 VALUES LESS THAN (10),
 PARTITION m10 VALUES LESS THAN (11),
 PARTITION m11 VALUES LESS THAN (12),
 PARTITION m12 VALUES LESS THAN (13)) */;
/*!40101 SET character_set_client = @saved_cs_client */;