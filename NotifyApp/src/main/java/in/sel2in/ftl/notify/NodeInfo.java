package in.sel2in.ftl.notify;
/**
 *
 * table needs to be normalised only for quick sample not prod ready
 *
 * CREATE TABLE IF NOT EXISTS `App_node_health` (
 * `Id` int(11) NOT NULL AUTO_INCREMENT,
 *   `app_id` varchar(50) DEFAULT NULL,
 *   `node_ip_port` varchar(100) DEFAULT NULL,
 *   `service_name` varchar(40) DEFAULT NULL,
 *   `comment` varchar(200) DEFAULT NULL,
 *   `when` DateTime DEFAULT NULL,
 *   event_name varchar(30) DEFAULT NULL,
 *   PRIMARY KEY (id)*/
public class NodeInfo {
    private long id;//
}
