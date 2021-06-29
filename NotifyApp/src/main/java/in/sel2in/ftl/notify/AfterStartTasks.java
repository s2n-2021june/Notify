package in.sel2in.ftl.notify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class AfterStartTasks {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @PostConstruct
    private void runAfterSpringInit() {

        try {
            System.out.println("Starting run after " + new Date() + ", mappigs " + jdbcTemplate);

            String sql = "select count(*) FROM App_node_health";

            int cnt = jdbcTemplate.queryForObject(sql, Integer.class) - 2;
            cnt = cnt < 0 ? 0 : cnt;
            sql = "SELECT * FROM App_node_health LIMIT " + cnt + ", 2;";
            List<Map<String, Object>> r = query(sql);
            printList(r);
            System.out.println("app status " + new Date() + ",\n\n\n ****\n MariaDb Task Good \n\n ****\n");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private List<Map<String, Object>> query(String sql) {
        List<Map<String, Object>> results = jdbcTemplate.queryForList(sql);
        return results;
    }

    private void printList(List<Map<String, Object>> list) {
        Object s1 = null;
        int cnt = 0;
        for (Map<String, Object> m : list) {
            cnt++;
            s1 = "Def " + cnt + ".";
            if(m.containsKey("Id")){
                s1 = m.get("Id");
            }else if(m.containsKey("id")){
                s1 = m.get("id");
            }
            System.out.println("\nRow start " + s1 + ":");
            for (String key : m.keySet())
                System.out.println("Key " + key + ", value :" + m.get(key) + ".");

        }

    }

}
