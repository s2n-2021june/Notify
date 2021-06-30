package in.sel2in.ftl.notify.web;

import in.sel2in.ftl.notify.model.doc.Response;
import in.sel2in.ftl.notify.model.doc.User;
import in.sel2in.ftl.notify.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/users/signup", produces = "application/json")

public class SignUp {

    @Autowired
    private UserService userService;

    @GetMapping ("/signup1/{firstname}/{lastName}/{email}/{phone1}/{phone1CountryCode}/{phone2}/{phone2CountryCode}/{pwd}/{pwdRepeat}")
    public ResponseEntity<Response> signUp1(@PathVariable String firstname, @PathVariable String lastName, @PathVariable String email,
                                                   @PathVariable String phone1, @PathVariable String phone1CountryCode,
                                                   @PathVariable String phone2, @PathVariable String phone2CountryCode,
                                                   @PathVariable String pwd,
                                                   @PathVariable String pwdRepeat){


        Response rsp = userService.signUpUser(firstname, lastName, email, null, phone1, phone1CountryCode, phone2, phone2CountryCode, pwd, pwdRepeat);
        System.out.println("signUp1 user " + rsp.getObj() + ", msg " + rsp.getMsg());
        ResponseEntity <Response> rspe = ResponseEntity.ok(rsp);
        return rspe;
    }

    @RequestMapping(value = "/signup2", method = RequestMethod.POST, produces="application/json", consumes="application/json")
    public ResponseEntity<Response> signup(@RequestBody User user){
        String pwdRepeat = user.getPwd();
        System.out.println("postTest user :" + user + ". ");
        return ResponseEntity.ok(userService.signUpUser(user, pwdRepeat));

        /* String name,@RequestAttribute  String email,@RequestAttribute  String pwd){
        System.out.println("Math Quiz web user add name :" + name + " , eml " + email);
        Response rsp = userService.addOrUpdate(name, email, pwd);
        return ResponseEntity.ok(rsp);
        */
    }



}

