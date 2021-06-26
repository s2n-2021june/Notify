package in.sel2in.ftl.notify.conf;

import in.sel2in.ftl.notify.dao.doc.conf.AppStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class ConfAfterStartTasks {

    @Autowired
    private MongoTemplate mongoTemplate;


    @PostConstruct
    private void runAfterSpringInit() {
        try {
            System.out.println("Starting ConfAfterStartTasks " + new Date() + ", mongoTemplate " + mongoTemplate);
            //mongoTemplate.find()
            //String sql = "select count(*) FROM app_node_health";
            AppStatus appStatus = new AppStatus("2", "ap1", "start", "okay"
                    // APP_ID, EVT_START,OKAY //TODO constants in common class.
                    , AppInfo.getAppIpPort(), new Date());
            //(String id, String appId, String eventName, String comment,
            // String appIpPort, Date when)

            mongoTemplate.save(appStatus);
            System.out.println("app status " + appStatus + ",\n\n\n ****\n Mongo Task Good \n\n ****\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
