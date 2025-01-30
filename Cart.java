import java.util.*;

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
}

class Cart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) { items.add(item); }

    public double getTotal() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }
}
