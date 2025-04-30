import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionAnalyzer {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, "Alice", LocalDate.of(2025, 4, 1), 3000),
                new Transaction(2, "Bob", LocalDate.of(2025, 4, 2), 12000),
                new Transaction(3, "Charlie", LocalDate.of(2025, 4, 3), 7000),
                new Transaction(4, "David", LocalDate.of(2025, 4, 4), 11000),
                new Transaction(5, "Eve", LocalDate.of(2025, 4, 5), 2000),
                new Transaction(6, "Frank", LocalDate.of(2025, 4, 6), 6000),
                new Transaction(7, "Bob", LocalDate.of(2025, 4, 7), 4000),
                new Transaction(8, "Alice", LocalDate.of(2025, 4, 8), 10000)
        );

        //Filter
        List<Transaction> highValueTxns = transactions.stream()
                .filter(t -> t.getAmount() > 5000)
                .collect(Collectors.toList());
        //Sort
        List<Transaction> sortedTxns = highValueTxns.stream()
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
                .collect(Collectors.toList());
        //Map
        List<String> summary = sortedTxns.stream()
                .map(t -> t.getUser() + " spent Rs. " + t.getAmount())
                .collect(Collectors.toList());

        //ForEach
        System.out.println("Topt Transacitons");
        summary.forEach(System.out::println);

        //Limit
        System.out.println("\nTop 3 Transactions");
        sortedTxns.stream()
                .limit(3)
                .forEach(System.out::println);

        //Skip
        System.out.println("\nTransaction after skipping top 2");
        sortedTxns.stream()
                .skip(2)
                .forEach(System.out::println);

        //Distinct
        System.out.println("\nUnique users");
        transactions.stream()
                .map(Transaction::getUser)
                .distinct()
                .forEach(System.out::println);

        //Count
        long bigSpenders = transactions.stream()
                .filter(t -> t.getAmount() > 10000)
                .map(Transaction::getUser)
                .distinct()
                .count();
        System.out.println("\nUsers who spent>10000 " + bigSpenders);

        //anyMatch
        boolean anyHugeTxn = transactions.stream()
                .anyMatch(t -> t.getAmount() > 15000);
        System.out.println("\nAny transaction over Rs. 15000" + anyHugeTxn);

        //allMath
        boolean allAbove1000 = transactions.stream()
                .allMatch(t -> t.getAmount() > 1000);
        System.out.println("\nAll spent more than Rs. 1000 " + allAbove1000);

        //noneMatch
        boolean noneZero = transactions.stream()
                .noneMatch(t -> t.getAmount() == 0);
        System.out.println("\nNo Zero amount transactions " + noneZero);

        //FindFirst
        Transaction firstTxn = transactions.stream()
                .findFirst()
                .orElse(null);
        System.out.println("\nFirst Transaction " + firstTxn);

        //FindAny
        Transaction anyTxn = transactions.stream()
                .findAny()
                .orElse(null);
        System.out.println("\nAny Transaction" + anyTxn);

        //Reduce
        int totalSpent = transactions.stream()
                .map(Transaction::getAmount)
                .reduce(0, Integer::sum);
        System.out.println("\nTotal amount spent " + totalSpent);

        //faltMap
        Map<String, List<Transaction>> userMap = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getUser));

        List<Transaction> allTxns = userMap.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("\nAll transactions from user groups");
        allTxns.forEach(System.out::println);

    }
}
