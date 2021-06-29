package in.sel2in.ftl.notify;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication

public class NotifyApplication {


    public static void main(String[] args) {

        final ConfigurableApplicationContext conf = SpringApplication.run(NotifyApplication.class, args);

        System.out.println("Starting app " + new Date());

        Thread closeTH = new Thread() {
            public void run() {
                System.out.println("Starting thread to close app after 8 seconds  at " + new Date());
                try {
                    Thread.sleep(1000 * 8);
                    System.out.println(" conf stop  at " + new Date());
                    try {
                        conf.stop();
                        conf.close();
                    } catch (Exception e) {
                        System.err.println("Conf close failed Ctrl-C to stop app at " + new Date() + ", " + e);
                    }
                    System.out.println("Sys exitt " + new Date());
                    System.exit(0);
                } catch (Exception e) {
                    System.err.println("Thread sleep failed Ctrl-C to stop app at" + new Date() + " , " + e);
                }
            }
        };
        ///closeTH.start();

    }

}
