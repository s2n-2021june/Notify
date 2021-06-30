package in.sel2in.ftl.notify.dao;

import com.mongodb.client.FindIterable;
import in.sel2in.ftl.notify.model.doc.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.ArrayList;
import java.util.List;

public class UserDaoMongoImpl implements UserDao{
    @Autowired
    private MongoTemplate mongoTemplate;
    public User saveOrUpdate(User user) throws Exception{
        user = mongoTemplate.save(user);
        return user;

    }

    //or -1 fromPage to get all
    public List<User> list(int fromPage, int recordsPerPage){
        //Query query = new Query();
        //mongoTemplate.find(query, User.class,"user");
        //FindIterable<Document> lst = mongoTemplate.getCollection("user").find();

        FindIterable<User> lst = mongoTemplate.getCollection("User").find(User.class);
        List<User> users = new ArrayList<>();
        lst.allowDiskUse(true);
        for(User usr: lst){
            users.add(usr);
        }
        return users;
    }

}
