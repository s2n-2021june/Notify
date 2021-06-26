SELECT * FROM app_node_health LIMIT (SELECT COUNT(*)-2 FROM app_node_health), 2;

(SELECT COUNT(*)-2 FROM app_node_health)