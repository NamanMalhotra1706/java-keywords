class Product{
    private static double discount = 10.0;
    private final int productID;
    private String  productName;
    private double productPrice;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = price;
        this.quantity = quantity;
    }

    public void displayProductDetails() {
        if (this instanceof Product) { // Using instanceof
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: Rs." + productPrice);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void updateDiscount(double discount){
        Product.discount = discount;
    }
}
public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product prod1 = new Product(101, "Laptop", 1200, 2);
        Product prod2 = new Product(102, "Smartphone", 800, 5);

        prod1.displayProductDetails();
        prod2.displayProductDetails();
        Product.updateDiscount(15);
        System.out.println("New Discount Updated!");
    }
}
