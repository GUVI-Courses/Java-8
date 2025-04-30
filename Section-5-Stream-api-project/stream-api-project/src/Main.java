import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    //public static void main(String[] args) {

        List<String> names = Arrays.asList("Amit","Rahul","Priya","Sneha");
        Stream<String> nameStream = names.stream();

        String[] fruits = {"Apple","Banana","Mango"};
        Stream<String> fruitStream = Arrays.stream(fruits);

        Stream<Integer> numberStream = Stream.of(1,2,3,4,5);

        //Filter
        //Stream<String> filterdNames = nameStream.filter(name->name.startsWith("S"));
        //filterdNames.forEach(System.out::println);

        //Sorted
//        Stream<String> sortedNames = nameStream.sorted();
//        sortedNames.forEach(System.out::println);

        //Map
//        Stream<String> upperCaseName = nameStream.map(name->name.toUpperCase());
//        upperCaseName.forEach(System.out::println);

        //Collect
//        List<String> filteredNames = nameStream.filter(name->name.startsWith("P")).collect(Collectors.toList());
//        System.out.println(filteredNames);

        //forEach
        //nameStream.forEach(name->System.out.println(name));

        //Limit
//        Stream<Integer> limitedStream = numberStream.limit(3);
//        limitedStream.forEach(System.out::println);

        //Skip

//        Stream<Integer> skippedStream = numberStream.skip(2);
//        skippedStream.forEach(System.out::println);

        //Distinct
//         Stream<String> duplicateNames = Stream.of("Amit","Rahul","Amit","Sneha","Rahul");
//         Stream<String> distinctNames = duplicateNames.distinct();
//         distinctNames.forEach(System.out::println);

        //Count
//        long count = nameStream.filter(name->name.length()>4).count();
//        System.out.println(count);

        //anyMatch
//        boolean anyMatch = nameStream.anyMatch(name->name.startsWith("R"));
//        System.out.println(anyMatch);

        //allMatch
//        boolean allMatch = nameStream.allMatch(name->name.length()>3);
//        System.out.println(allMatch);

        //noneMatch
//        boolean noneMatch = nameStream.noneMatch(name->name.startsWith("A"));
//        System.out.println(noneMatch);

        //findFirst
//        Optional<String> firstElement = nameStream.findFirst();
//        firstElement.ifPresent(System.out::println);

        //findAny
//        Optional<String> anyElement = nameStream.findAny();
//        anyElement.ifPresent(System.out::println);

        //Reduce
//        int sum = numberStream.reduce(0,(a,b)->a+b);
//        System.out.println(sum);

        //flatMap

//        Stream<List<String>> listStream = Stream.of(Arrays.asList("Amit","Rahul"), Arrays.asList("Priya","Sneha"));
//        Stream<String> flatStream = listStream.flatMap(List::stream);
//        flatStream.forEach(System.out::println);

   // }
}