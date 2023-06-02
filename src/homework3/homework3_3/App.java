package homework3.homework3_3;

public class App {
    public static void main(String[] args) {

        Money money = new Money(220, 50);
        money.displayAmount();

        Product product = new Product("Phone", money);
        System.out.println("Product name: " + product.getName());
        System.out.println("Product price: ");
        product.getPrice().displayAmount();

        product.reducePrice(890);
        System.out.println("New product price: ");
        product.getPrice().displayAmount();
    }
}
