package in.sel2in.ftl.notify.model.doc.conf;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Document(collection = "nodes")
public class AppStatus {
    @Id
    private String id;

    private String appId;
    private String eventName;
    private String comment;
    private String appIpPort;
    private Date when;

    public AppStatus() {
    }

    public AppStatus(String id, String appId, String eventName, String comment, String appIpPort, Date when) {
        this.id = id;
        this.appId = appId;
        this.eventName = eventName;
        this.comment = comment;
        this.appIpPort = appIpPort;
        this.when = when;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAppIpPort() {
        return appIpPort;
    }

    public void setAppIpPort(String appIpPort) {
        this.appIpPort = appIpPort;
    }

    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppStatus appStatus = (AppStatus) o;
        return Objects.equals(appId, appStatus.appId) && Objects.equals(eventName, appStatus.eventName) && Objects.equals(appIpPort, appStatus.appIpPort) && Objects.equals(when, appStatus.when);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, eventName, appIpPort, when);
    }

    @Override
    public String toString() {
        return "AppStatus{" +
                "id='" + id + '\'' +
                ", appId='" + appId + '\'' +
                ", eventName='" + eventName + '\'' +
                ", comment='" + comment + '\'' +
                ", appIpPort='" + appIpPort + '\'' +
                ", when=" + when +
                '}';
    }
}

