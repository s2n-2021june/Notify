package in.sel2in.ftl.notify.conf;

public class AppInfo {
    private  static String appIpPort;

    public static String getAppIpPort() {
      if(appIpPort == null){
          System.err.println("TODO get IP and Port");
          appIpPort = "192.168.1.1:892";
      }
        return appIpPort;
    }
}
