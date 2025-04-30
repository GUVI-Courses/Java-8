import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProductLambdaDemo {
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Laptop",55000));
        products.add(new Product(2,"Mouse",400));
        products.add(new Product(3,"Keyboard",800));
        products.add(new Product(4,"Monitor",12000));
        products .add(new Product(5, "Phone",25000));

        System.out.println("Orignal List");
        //printList(products);

        // Sort by price
        products.sort((p1,p2)-> Double.compare(p1.getPrice(),p2.getPrice()));
        System.out.println("\nSorted by price (ascending):");
        //printList(products);

        //Sort by name
        products.sort((p1,p2)->p1.getName().compareTo(p2.getName()));
        System.out.println("\nSorted by name:");
        //printList(products);

        //Filter: print only products below 10000
        System.out.println("\nFiltered Products (price < 10,000):");
        //filterProducts(products,p->p.getPrice()<10000);

        System.out.println("\nFiltered Products (name start with 'M'):");
        filterProducts(products,p->p.getName().startsWith("M"));

    }

    private static void printList(List<Product> products){
        for(Product p : products){
            System.out.println(p);
        }
    }

    private static void filterProducts(List<Product> products, Predicate<Product> condition){
        for(Product p: products){
            if(condition.test(p)){
                System.out.println(p);
            }
        }
    }
}
