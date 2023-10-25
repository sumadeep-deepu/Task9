import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// CartItem class
class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}

// ShoppingCart class
class ShoppingCart {
    private List<CartItem> items = new ArrayList<>();

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void removeItem(CartItem item) {
        items.remove(item);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (CartItem item : items) {
            totalCost += item.getProduct().getPrice() * item.getQuantity();
        }
        return totalCost;
    }

    public void displayCart() {
        for (CartItem item : items) {
            System.out.println(item.getProduct().getName() + " - " + item.getQuantity());
        }
    }
}

// Customer class
class Customer {
    private int customerId;
    private String name;
    private String email;

    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

public class ShoppingCartt {
    public static void main(String[] args) {
        // Create product instances
        Product product1 = new Product(1, "Product 1", 10.0);
        Product product2 = new Product(2, "Product 2", 15.0);
         Product product3 = new Product(12, "Product 3", 20.0);


        // Create customer instance
        Customer customer = new Customer(1, "John Doe", "john@example.com");
        Customer customer2=new Customer(123, "sumadeep", "sumadeep@gmail.com");

        // Create shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add products to the shopping cart
        CartItem item1 = new CartItem(product1, 2);
        CartItem item2 = new CartItem(product2, 3);

        cart.addItem(item1);
        cart.addItem(item2);

        // Calculate and display the total cost
        System.out.println("Customer: " + customer.getName());
        System.out.println("Items in the cart:");
        cart.displayCart();
        System.out.println("Total Cost: $" + cart.calculateTotalCost());
    
    
    ShoppingCart cart2=new ShoppingCart();
    CartItem item4 = new CartItem(product3, 4);



    cart2.addItem(item1);
    cart2.addItem(item2);
    cart2.addItem(item4);
    
    System.out.println("customer : "+ customer2.getName());
    System.out.println("Items in cart");
    cart2.displayCart();
    System.out.println("Total cost : "+cart2.calculateTotalCost());
    
    
    
    
    
    }
}
