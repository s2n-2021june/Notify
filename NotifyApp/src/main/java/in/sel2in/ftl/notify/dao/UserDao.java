package in.sel2in.ftl.notify.dao;

import in.sel2in.ftl.notify.model.doc.User;

import java.util.List;

public interface UserDao {
    User saveOrUpdate(User user) throws Exception;

    //or -1 fromPage to get all
    List<User> list(int fromPage, int recordsPerPage);

}
