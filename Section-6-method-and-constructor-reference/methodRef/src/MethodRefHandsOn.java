import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Product{
    private String name;

    public Product(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void print(){
        System.out.println("Product : "+name);
    }
}

public class MethodRefHandsOn {
    public static void main(String[] args){
        List<String> productNames = Arrays.asList("Laptop","Tablet","Smartphone","Camear");
        productNames.sort(String::compareToIgnoreCase);
        productNames.forEach(System.out::println);
        //name->new Product(name)

        List<Product> products=productNames.stream()
                .map(Product::new)
                .collect(Collectors.toList());

        products.forEach(Product::print);

        Supplier<Product> factory =()->new Product("Default Product");
        Product defaultProduct = factory.get();
        defaultProduct.print();



    }
}
