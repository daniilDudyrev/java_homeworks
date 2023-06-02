package homework3.homework3_3;

public class Product {
    private String name;
    private Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public void reducePrice(int amount) {
        int currentCents = price.getCents();
        int newCents = currentCents - amount;

        if (newCents < 0) {
            int borrowDollars = Math.abs(newCents) / 100 + 1;
            int updatedDollars = price.getDollars() - borrowDollars;
            int updatedCents = 100 - Math.abs(newCents) % 100;
            price.setDollars(updatedDollars);
            price.setCents(updatedCents);
        } else {
            price.setCents(newCents);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }
}