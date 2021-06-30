package in.sel2in.ftl.notify.service;

import in.sel2in.ftl.notify.model.doc.Response;
import in.sel2in.ftl.notify.model.doc.User;

public interface UserService {

    Response signUpUser(String firstname, String lastName, String email1, String email2, String phone1, String phone1CountryCode, String phone2, String phone1CountryCode2, String pwd, String pwdRepeat);
    Response signUpUser(User user, String pwdRepeat );
    Response editUser(User user);
    Response listAll();

    //TODO by team - Sibasish T.
    Response list(int fromPage, int recordsPerPage);
}
