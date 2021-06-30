package in.sel2in.ftl.notify.web;


import in.sel2in.ftl.notify.dao.repos.AppStatusRepository;
import in.sel2in.ftl.notify.model.doc.conf.AppStatus;
import in.sel2in.ftl.notify.service.AppStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController ()
@RequestMapping(value = "/v1/appStaus", produces = "application/json")
public class AppStatusWeb {

    @Autowired
    private AppStatusRepository appStatusRepository;

    @Autowired
    private AppStatusService appStatusService;

    @PostMapping("/add")
    public ResponseEntity<AppStatus> add(@RequestBody AppStatus appStatus) {
        System.out.println("appStatus (v7) :" + appStatus + ". ");
        appStatus = appStatusRepository.save(appStatus);

        return ResponseEntity.ok(appStatus);
    }

    @GetMapping("/all")
    public ResponseEntity<List<AppStatus>> findAll() {
        return ResponseEntity.ok(appStatusRepository.findAll());
    }

    @GetMapping("/allOfAppId")
    public ResponseEntity<List<AppStatus>> findAllOfAppId(@RequestParam String appid) {
        return ResponseEntity.ok(appStatusService.findAppStatusWithAppId(appid));
    }

    @GetMapping("/dateBetween")
    public ResponseEntity<List<AppStatus>> dateB(Date from, Date to) {
        return ResponseEntity.ok(appStatusService.findAppStatusBetweenDates(from, to));
    }

    @GetMapping("/dateBetweenAndEventTypes")
    public ResponseEntity<List<AppStatus>> dateBtwnAndEvtTypes(Date from, Date to, String evtTyp1, String evtTyp2, String evtTyp3) {
        return ResponseEntity.ok(appStatusService.findAppStatusBetweenDatesAndOfEventTypes(from, to, evtTyp1, evtTyp2, evtTyp3));
    }

}