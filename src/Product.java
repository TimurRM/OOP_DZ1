public class Product {
    protected String brand;
    protected String name;
    protected double price;

    public Product(String brand, String name, double price) {
        processBrand(brand);
        processName(name);
        processPrice(price);
    }

    public Product(String name, double price) {
        this("<BRAND>", name, price);
    }

    public Product(String name) {
        this(name, 250.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        processName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        processBrand(brand);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        processPrice(price);
    }

    private void processPrice(double price) {
        if (price < 100.0) {
            this.price = 250.0;
        } else {
            this.price = price;
        }
    }

    private void processName(String name) {
        if (name == null || name.length() < 3) {
            this.name = "<NAME>";
        } else {
            this.name = name;
        }
    }

    private void processBrand(String brand) {
        if (brand == null || brand.length() < 3) {
            this.brand = "<BRAND>";
        } else {
            this.brand = brand;
        }
    }

    public String displayInfo() {
        return String.format("Product: %s, Brand: %s, Price: %.2f", name, brand, price);
    }
}
