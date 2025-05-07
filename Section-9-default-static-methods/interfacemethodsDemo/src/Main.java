//import sun.rmi.runtime.Log;
//
//interface Logger{
//    default void log(String message){
//        System.out.println("[DEFAULT LOG]"+message);
//    }
//
//    static void printInfo(){
//        System.out.println("Logger Interface: used for logging message in default and custom ways");
//    }
//}
//
//class FileLogger implements Logger{
//
//}
//class DBLogger implements Logger{
//    @Override
//    public void log(String message){
//        System.out.println("[DB LOG]"+message);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        Logger.printInfo();
//        Logger fileLogger = new FileLogger();
//        fileLogger.log("File saved successfully");
//
//        Logger dbLogger = new DBLogger();
//        dbLogger.log("Database updated.");
//    }
//}