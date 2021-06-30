package in.sel2in.ftl.notify.web;


import in.sel2in.ftl.notify.model.doc.Response;
import in.sel2in.ftl.notify.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/users/")
public class UserWeb {
    @Autowired
    private UserService userService;

    @GetMapping("list")
    ////@RequestMapping(value = "/list", produces = "application/json", consumes = "text/plain")
    public ResponseEntity<Response> users(){
        System.out.println("list users ");
        Response rsp = userService.listAll();
        return ResponseEntity.ok(rsp);
    }

    @GetMapping("/ping")
    public ResponseEntity<String> ping(){
        return ResponseEntity.ok("ping (v3) response at " + new java.util.Date());
    }
}
