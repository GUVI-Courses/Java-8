import javax.management.openmbean.SimpleType;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        for(int i=1;i<=10_000_000;i++){
            numberList.add(i);
        }

        long startTimeSequential = System.currentTimeMillis();
        double sequentialResult = numberList.stream()
                .mapToDouble(Math::sqrt)
                .sum();

        long endTimeSequential = System.currentTimeMillis();
        System.out.println("Sequential Stream Result: "+sequentialResult);
        System.out.println("Time taken by sequential stream: "+(endTimeSequential-startTimeSequential)+"ms");


        long startTimeParallel = System.currentTimeMillis();
        double parallelResult = numberList.parallelStream()
                .mapToDouble(Math::sqrt)
                .sum();
        long endTimeParallel = System.currentTimeMillis();
        System.out.println("parallel Stream Result: "+parallelResult);
        System.out.println("Time taken by parallel stream: "+(endTimeParallel-startTimeParallel)+"ms");


    }
}