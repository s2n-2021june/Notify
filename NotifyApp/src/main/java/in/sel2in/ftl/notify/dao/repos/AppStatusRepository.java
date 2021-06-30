package in.sel2in.ftl.notify.dao.repos;
import java.util.Date;
import java.util.List;

import in.sel2in.ftl.notify.model.doc.conf.AppStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
//import org.springframework.data.mongodb.repository.Query;

public interface AppStatusRepository extends MongoRepository<AppStatus, String>//, QuerydslPredicateExecutor<AppStatus>
 {

    //@Query("{'date' : { $gte: ?0, $lte: ?1 } }")
    //List<AppStatus> findAppStatusBetweenDates(Date from, Date to);

    //@Query("{'date' : { $gte: ?0, $lte: ?1 }, 'eventName' : {$in: [?2, ?3, ?4 ]} }")
    //List<AppStatus> findAppStatusBetweenDatesAndOfEventTypes(Date from, Date to, String eventType1, String eventType2, String eventType3 );
}
