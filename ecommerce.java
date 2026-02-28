// =======================
// 2. Package: Ecommerce
// =======================

package Ecommerce;

public class Product {
    public String productName;
    public double price;

    public Product(String n, double p) {
        productName = n;
        price = p;
    }

    public void displayProduct() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
    }
}

package Ecommerce;

public class Customer {
    public String name;

    public Customer(String n) {
        name = n;
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + name);
    }
}

package Ecommerce;

public class Order {
    public Product product;
    public int quantity;

    public Order(Product p, int q) {
        product = p;
        quantity = q;
    }

    public double calculateTotal() {
        return product.price * quantity;
    }

    public void displayOrder() {
        product.displayProduct();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotal());
    }
}