//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Consumer;
//import java.util.function.Supplier;
//
//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println("Hello, World!");
//        //ClassName::methodName
//
//
//        List<String> names = Arrays.asList("alice","bob","charlie");
//        names.forEach(name->System.out.println(name.toUpperCase()));
//        names.forEach(System.out::println);
//
//        //Reference to a Static Method
//        //ClassName::staticMethodName
//
//        Consumer<String> consumer = Main::greet;
//        consumer.accept("Alice");
//
//        //Refernce to an Instance Method of a Perticular Object
//
//        Main example = new Main();
//        Consumer<String> printer = example::printMessage;
//        printer.accept("This is a test.");
//
//        //Reference to an Instance Method of Arbitrary Object of a Particular Type
//
//        List<String> people = Arrays.asList("John","Jane","Alice");
//        people.sort(String::compareToIgnoreCase);
//        //(a,b)->a.compareToIgnoreCase(b)
//
//        people.forEach(System.out::println);
//
//        //Reference to a Constructor
//        //ClassName::new
//        Supplier<Main> factory = Main::new;
//        Main obj = factory.get();
//
//
//    }
//
//    public static void greet(String name){
//        System.out.println("Hello "+name);
//    }
//
//    public void printMessage(String msg){
//        System.out.println("Message "+msg);
//    }
//
//    public Main(){
//        System.out.println("Consturctor called");
//    }
//}
