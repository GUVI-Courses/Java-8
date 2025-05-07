import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static class User{
        private String username;
        private String role;
        private int activityPoints;

        public User(String username, String role, int activityPoints) {
            this.role = role;
            this.username = username;
            this.activityPoints = activityPoints;
        }

        public String getUsername(){
            return username;
        }
        public String getRole(){
            return role;
        }
        public int getActivityPoints(){
            return activityPoints;
        }

        @Override
        public String toString(){
            return "User{ username: "+username+", role: "+role+", ActivityPoints: "+activityPoints+"}";
        }
    }
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Alice","Admin",150),
                new User("Bob","User",50),
                new User("Charlie","Admin",200),
                new User("David","User",120),
                new User("Eve","Admin",80),
                new User("Frank","User",200),
                new User("Grace","Admin",110)
        );

//        System.out.println("Users with more than 100 activity points");
//        users.stream()
//                .filter(user->user.getActivityPoints()>100)
//                .forEach(user->System.out.println(user.getUsername()+" - "+user.getActivityPoints()));
//
//        System.out.println("\nUsers grouped by role: ");
//        Map<String,List<User>> groupedByRole = users.stream()
//                .collect(Collectors.groupingBy(User::getRole));
//
//        groupedByRole.forEach((role,userList)->{
//            System.out.println(role+": ");
//            userList.forEach(user->System.out.println(" - "+user.getUsername()));
//        });

//        User user = getUserData("Sam");
//        Optional<User> optionalUser = Optional.ofNullable(user);
//        if(optionalUser.isPresent()){
//            System.out.println("\nFound Usre: "+user.getUsername());
//        }else{
//            System.out.println("\nUser not found");
//        }
//
//        Optional<User> userOptional = Optional.ofNullable(getUserData("Alice"));
//        String userRole = userOptional.map(User::getRole).orElse("Guest");
//        System.out.println("User role is "+userRole);


//        System.out.println("\n Sequential Stream Processing: ");
//        long startTimeSeqential = System.nanoTime();
//        users.stream()
//                .filter(user1->user1.getActivityPoints()>100)
//                .forEach(user1->System.out.println(user1.getUsername()+" - "+user1.getActivityPoints()));
//        long endTimeSequential = System.nanoTime();
//        System.out.println("Processing time with Sequential Time: "+(endTimeSequential-startTimeSeqential)+" nanoseconds");
//
//        System.out.println("\n Parallel Stream Processing: ");
//        long startTimeSeqential1 = System.nanoTime();
//        users.parallelStream()
//                .filter(user1->user1.getActivityPoints()>100)
//                .forEach(user1->System.out.println(user1.getUsername()+" - "+user1.getActivityPoints()));
//        long endTimeSequential1 = System.nanoTime();
//        System.out.println("Processing time with Parallel Time: "+(endTimeSequential1-startTimeSeqential1)+" nanoseconds");

//        System.out.println("\nUsers sorted by activity points");
//        users.stream()
//                .sorted(Comparator.comparingInt(User::getActivityPoints).reversed())
//                .forEach(user->System.out.println(user.getUsername()+" - "+user.getActivityPoints()));

//        long count = users.stream()
//                .filter(user->user.getActivityPoints()>100)
//                .count();
//        System.out.println("Number of users with more than 100 activity points "+count);

        String username = users.stream()
                .map(User::getUsername)
                .collect(Collectors.joining(","));
        System.out.println("All user names: "+username);



    }

    public static User getUserData(String username){
        if("Alice".equals(username)){
            return new User("Alice","Admin",150);
        }else{
            return null;
        }
    }

}