package in.sel2in.ftl.notify.web;

import in.sel2in.ftl.notify.dao.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@RestController
public class SignUp {

    //temp code TODO replace with DAO
    static private final Map<String, User> tempUserDb = new HashMap<>();

    @GetMapping ("/signup/s1/{firstname}/{lastName}/{email}/{phone1}/{phone1CountryCode}/{phone2}/{phone2CountryCode}/{pwd}/{pwdRepeat}")
    @ResponseBody
    public ResponseEntity<GenericResponse> signUp1(@PathVariable String firstname, @PathVariable String lastName, @PathVariable String email,
                                                   @PathVariable String phone1, @PathVariable String phone1CountryCode,
                                                   @PathVariable String phone2, @PathVariable String phone2CountryCode,
                                                   @PathVariable String pwd,
                                                   @PathVariable String pwdRepeat){

        User user = new User(firstname, lastName, email, null, phone1, phone1CountryCode,phone2, phone2CountryCode,pwd);
        String key = user.getEmail1() + ";" + user.getPhone1CountryCode() + "-" + user.getPhone1();
        tempUserDb.put(key, user);
        System.out.println("signUp1 key " + key + ",\n User : " + user + "\n ****\n");

        GenericResponse rsp = new GenericResponse("ok added " + key + " User : " + user, null, null);
        ResponseEntity <GenericResponse> rspe = ResponseEntity.ok(rsp);
        return rspe;
    }


    @GetMapping ("/signup/s1/list")
    @ResponseBody
    public ResponseEntity<Set> users(){
        return ResponseEntity.ok( tempUserDb.entrySet());
    }
}

