import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Activity{
    private String username;
    private String action;
    private int duration;

    public Activity(String username, String action, int duration) {
        this.username = username;
        this.action = action;
        this.duration = duration;
    }

    public String getUsername(){
        return username;
    }
    public String getAction(){
        return action;
    }
    public int getDuration(){
        return duration;
    }

    public String toString(){
        return "Activity{username'"+username+"', action='"+action+"', duration='"+duration+"}";
    }
}
public class CollectorProject {
    public static void main(String[] args){
        List<Activity> activities = Arrays.asList(
                new Activity("alice","login",5),
                new Activity("alice","watch_video",30),
                new Activity("bob","login",10),
                new Activity("bob","upload_photo",20),
                new Activity("adam","login",15),
                new Activity("alice","logout",2)
        );

        Map<String,List<Activity>> groupByUser = activities.stream()
                .collect(Collectors.groupingBy(Activity::getUsername));

        groupByUser.forEach((user,activitiesList)->{
            System.out.println(user+": "+activitiesList);
        });








    }
}
