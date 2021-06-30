package in.sel2in.ftl.notify.service;


import in.sel2in.ftl.notify.dao.UserDao;
import in.sel2in.ftl.notify.model.doc.Response;
import in.sel2in.ftl.notify.model.doc.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class UserServiceImpl implements UserService {
    //private static Logger logger = Logger.getLogger(UserServiceImpl.class.getName());

    @Autowired
    private UserDao userDao;

    @Override
    public Response signUpUser(String firstname, String lastName, String email1, String email2, String phone1, String phone1CountryCode, String phone2, String phone1CountryCode2, String pwd, String pwdRepeat) {
        System.err.println("not yet impl");
        return null;
    }

    @Override
    public Response signUpUser(User user, String pwdRepeat ){
        Response rsp = new Response();

        //TODO validations
        try {
            final String pwd = user.getPwd();
            if (pwd == null || pwd.length() < 3 || pwd.equals(pwdRepeat) == false) {
                rsp.setErrCode("pwd");
                rsp.setMsg("Password less than 3 chars or password repeat mismatch, please fix & retry");
                return rsp;
            }
            //User user = new User(firstname, lastName, email1, email2, phone1, phone1CountryCode, phone2, phone1CountryCode2, pwd);
            return editUser(user);

        } catch (Exception e) {
            e.printStackTrace();
            rsp.setErrCode("excp");
            //TODO logger signUpUser
            rsp.setMsg("Backend issue signUpUser : " + e);
        }
        return rsp;

    }

    @Override
    public Response editUser(User user) {
        Response rsp = new Response();
        //TODO more validations
        try {
            user = userDao.saveOrUpdate(user);
            rsp.setObj(user);
        } catch (Exception e) {
            e.printStackTrace();
            rsp.setErrCode("excp");
            rsp.setMsg("Backend issue editUser : " + e);
        }
        return rsp;

    }

    @Override
    public Response listAll() {
        Response rsp = new Response();
        //TODO more validations
        try {
            System.out.println("list users 1");
            List<User> lst = userDao.list(-1, -1);
            System.out.println("list users 2");
            if(lst.size() == 0){
                System.out.println("list users 3");
                //for debugging
                User us1 = new User();
                us1.setEmail1("eml@a.ff");
                lst.add(us1);
            }
            rsp.setObj(lst);
        } catch (Exception e) {
            e.printStackTrace();
            rsp.setErrCode("excp");
            rsp.setMsg("Backend issue listAll: " + e);
        }
        return rsp;

    }

    @Override
    public Response list(int fromPage, int recordsPerPage) {
        return null;
    }
}
