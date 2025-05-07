interface Logger{
    default void log(String message) {
        System.out.println("[LOG]" + message);
    }
}

class UserService implements Logger{
    public void createUser(String name){
        log("Creating User: "+name);
    }
}

class PaymentService implements Logger{
    public void log(String message){
        System.out.println("[PAYMENT LOG] "+message);
    }

    public void processPayment(String user,double amount){
        log("Processing payment of Rs. "+amount +" for user "+user);
    }
}

public class LoggerHandson {
    public static void main(String[] args){
        UserService userService = new UserService();
        PaymentService paymentService = new PaymentService();

        userService.createUser("Alice");
        paymentService.processPayment("Alice",999.99);
    }
}
