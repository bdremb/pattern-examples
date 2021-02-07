package pattern.factory_method;

public class Store {

  public Drink getDrink(String type) {
    Drink drink = null;
    if (type.equals("Latte")) {
      drink = new Latte();
    } else if (type.equals("Cappuccino")) {
      drink = new Cappuccino();
    }
    return drink;
  }

  public static void main(String[] args) {
    Store store = new Store();
    store.getDrink("Latte").makeCoffee();
    store.getDrink("Cappuccino").makeCoffee();
  }
}
