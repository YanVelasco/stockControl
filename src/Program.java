import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter product data: ");
        System.out.println("Name");
        String name = entry.nextLine();
        System.out.println("Price: ");
        double price = entry.nextDouble();
        System.out.println("Quantity in stock: ");
        int quantity = entry.nextInt();

        Product product = new Product(name, price, quantity);


        System.out.println("Product data: " + product);
        System.out.println();

        System.out.println("Enter the number of products to be added in stock:  ");
        quantity = entry.nextInt();
        product.AddProducts(quantity);        

        System.out.println("Updated data: "+ product);
        System.out.println();

        System.out.println();
        System.out.println("Enter the number oF products to be remove from stock: ");
        quantity = entry.nextInt();
        product.RemoveProducts(quantity);

        System.out.println("Updated data: "+ product);
        System.out.println();

        entry.close();
    }
}
