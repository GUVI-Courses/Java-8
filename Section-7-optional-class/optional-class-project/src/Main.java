//import java.util.Optional;
//
//public class Main {
//    public static void main(String[] args) {
//
//        //Optional.of()
////        String name = "Alice";
////
////        try {
////            Optional<String> safeName = Optional.of(name);
////            System.out.println(name);
////        }catch (NullPointerException e){
////            System.out.println("Optional.of(null) throws NullPointerException");
////        }
//
//        //Optional.ofNullable()
//
//        String name = "bob";
//        Optional<String> safeName = Optional.ofNullable(name);
//
//
//        //isPresent()
//
//        if(safeName.isPresent()){
//            //System.out.println("Name is : "+safeName.get());
//        }else{
//            //System.out.println("Name is not present");
//        }
//
//
//        //orElse()
//
//        String defaultName = safeName.orElse("Guest");
//        //System.out.println("User name is: "+defaultName);
//
//
//        //map()
//
//        Optional<String> upperCaseName = safeName.map(String::toUpperCase);
//        System.out.println("Mapped Name: "+upperCaseName.orElse("no name"));
//
//
//    }
//}