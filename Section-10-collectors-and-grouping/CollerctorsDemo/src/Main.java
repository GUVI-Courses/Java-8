//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//
//        List<String> names = Arrays.asList("Alice", "Bob", "Adam", "Bob", "Sam");
//
//        //toList
//
//        List<String> nameList = names.stream()
//                .collect(Collectors.toList());
//        System.out.println("toList: "+nameList);
//
//        //toSet
//
//        Set<String> nameSet = names.stream()
//                .collect(Collectors.toSet());
//        System.out.println("toSet: "+nameSet);
//
//        //joining
//
//        String joiningNames = names.stream()
//                .collect(Collectors.joining(","));
//        System.out.println("joining: "+joiningNames);
//
//        //groupingBy
//
//        List<User> users = Arrays.asList(
//          new User("Alice","IT"),
//          new User("Bob","HR"),
//          new User("Adam","Sales"),
//          new User("Sam","IT")
//        );
//
//        Map<String,List<User>> usersByDept = users.stream()
//                .collect(Collectors.groupingBy(User::getDepartment));
//
//        usersByDept.forEach((dept,userList)->{
//            System.out.println(dept + ": ");
//            userList.forEach(user->System.out.println(" - "+user.getName()));
//        });
//
//        //partitioningBy
//
//        Map<Boolean,List<User>> partitioned = users.stream()
//                .collect(Collectors.partitioningBy(u->u.getDepartment().equals("IT")));
//
//        partitioned.forEach((isIt,userList)->{
//            System.out.println(isIt?"IT Department":"Non-IT Department");
//            userList.forEach(u->System.out.println(" - "+u.getName()));
//        });
//
//
//    }
//
//    public static class User{
//        private String name;
//        private String department;
//
//        public User(String name, String department) {
//            this.name = name;
//            this.department = department;
//        }
//
//        public String getName(){
//            return name;
//        }
//        public String getDepartment(){
//            return department;
//        }
//    }
//}