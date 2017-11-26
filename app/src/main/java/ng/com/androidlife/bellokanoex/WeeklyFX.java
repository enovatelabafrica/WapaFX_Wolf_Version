package ng.com.androidlife.bellokanoex;

/**
 * Created by aminu on 8/16/17.
 */

public class WeeklyFX {
    String weeklydate, weeklytime, usbweekly, ussweekly;

    public WeeklyFX(String weeklydate, String weeklytime, String usbweekly, String ussweekly){
        this.weeklydate = weeklydate;
        this.weeklytime = weeklytime;
        this.usbweekly = usbweekly;
        this.ussweekly = ussweekly;
    }

    public WeeklyFX(){

    }

    public String getWeeklydate(){
        return weeklydate;
    }
    public void setWeeklydate(String weeklydate){
        this.weeklydate = weeklydate;
    }
    public String getWeeklytime(){
        return weeklytime;
    }
    public void setWeeklytime(String weeklytime){
        this.weeklytime = weeklytime;
    }
    public String getUsbweekly(){
        return usbweekly;
    }
    public void setUsbweekly(String usbweekly){
        this.usbweekly = usbweekly;
    }
    public String getUssweekly(){
        return ussweekly;
    }
    public void setUssweekly(String ussweekly){
        this.ussweekly = ussweekly;
    }
}
