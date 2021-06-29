package in.sel2in.ftl.notify.web;


import in.sel2in.ftl.notify.dao.doc.conf.AppStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Set;

@RestController ()
@RequestMapping(value = "/v1/users", produces = "application/json", consumes = "application/json")
public class AppStatusWeb {

    @PostMapping("/add")
    //@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    ////@RequestBody
    public ResponseEntity<Object> signUp( @RequestBody AppStatus appStatus) {/// FYI Dont add @RequestAttribute to the User param.
        System.out.println("appStatus (v7) :" + appStatus + ". ");
        return ResponseEntity.ok(appStatus);

    }
}