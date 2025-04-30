import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SimpleFormValidation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Supplier<String> defaultName = ()->"Guest";
        Predicate<String> isNotEmpty = input->input!=null && !input.trim().isEmpty();
        Predicate<String> isValidEmail = email->email.contains("@") && email.endsWith(".com");
        Function<String,String> capitalizeName = name->name.substring(0,1).toUpperCase()+name.substring(1);
        Consumer<String> greetUser = name->System.out.println("Welcome, "+name+"!");

        // take in put for name
        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();
        if(!isNotEmpty.test(name)){
            name = defaultName.get();
        }else{
            name = capitalizeName.apply(name);
        }

        // take input for email
        System.out.println("Enter your Email: ");
        String email = scanner.nextLine();
        if(!isValidEmail.test(email)){
            System.out.println("Invalid Email Format");
        }else{
            greetUser.accept(name);
        }

        scanner.close();
    }
}
