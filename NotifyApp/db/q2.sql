CREATE USER 'tushar'@'%' IDENTIFIED BY 'Dk_24MkSuretrain';
GRANT ALL PRIVILEGES ON *.* TO 'tushar'@'%' ;


DROP TABLE IF EXISTS `App_node_health`;

CREATE TABLE IF NOT EXISTS `App_node_health` (
`Id` int(11) NOT NULL AUTO_INCREMENT,
  `app_id` varchar(50) DEFAULT NULL,
  `node_ip_port` varchar(100) DEFAULT NULL,
  `service_name` varchar(40) DEFAULT NULL,
  `comment` varchar(200) DEFAULT NULL,
  `when` DateTime DEFAULT NULL,
  event_name varchar(30) DEFAULT NULL,
  PRIMARY KEY (id)
) ;--   DEFAULT CHARSET=utf8  ;

INSERT INTO App_node_health (`app_id`, `node_ip_port`, `service_name`, `COMMENT`,  `when`, `event_name`)
 VALUES
('a1', '192.168.0.3:8090', 'sms', '2 of 4 ok', NOW(), 'alive');


INSERT INTO App_node_health (`app_id`, `node_ip_port`, `service_name`, `COMMENT`,  `when`, `event_name`)
 VALUES
('a1', '192.168.0.3:8090', 'sms', 'ok', NOW() - 1, 'start');

update App_node_health set `COMMENT` = 'ok' where `app_id`= 'a1' and `event_name` = 'alive';

update App_node_health set `when` = now() where `app_id`= 'a1' and `event_name` = 'alive';

SELECT * FROM App_node_health;

