package in.sel2in.ftl.notify.service;

import in.sel2in.ftl.notify.dao.repos.AppStatusRepository;
import in.sel2in.ftl.notify.model.doc.conf.AppStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AppStatusService {
    @Autowired
    private AppStatusRepository appStatusRepository;

    public List<AppStatus> findAppStatusBetweenDates(Date from, Date to){
        return null;
    }

    //@Query("{'date' : { $gte: ?0, $lte: ?1 }, 'eventName' : {$in: [?2, ?3, ?4 ]} }")
    public List<AppStatus> findAppStatusBetweenDatesAndOfEventTypes(Date from, Date to, String eventType1, String eventType2, String eventType3 ){
        return null;
    }
}
