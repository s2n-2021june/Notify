package in.sel2in.ftl.notify.conf;

import in.sel2in.ftl.notify.dao.UserDao;
import in.sel2in.ftl.notify.dao.UserDaoMariaDbImpl;
import in.sel2in.ftl.notify.dao.UserDaoMongoImpl;
import in.sel2in.ftl.notify.service.UserService;
import in.sel2in.ftl.notify.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Configuration
public class AppConf {
    @Value("db.type")
    private String dbType;

    @Bean
     public UserDao userDao(){
         if(dbType == null || "mariadb".equalsIgnoreCase(dbType)){
             return new UserDaoMariaDbImpl();
         }
         return new UserDaoMongoImpl();
     }

    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }


}
