import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume) {
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                BottleOfWater bottleOfWater = (BottleOfWater) product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume) {
                    return bottleOfWater;
                }
            }
        }
        return null; // Возвращает null, если бутылка воды с заданным именем и объемом не найдена
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Chocolate getChocolate(String name, int calories) {
        for (Product product : products) {
            if (product instanceof Chocolate) {
                Chocolate chocolate = (Chocolate) product;
                if (chocolate.getName().equals(name) && chocolate.getCalories() == calories) {
                    return chocolate;
                }
            }
        }
        return null; // Возвращает null, если шоколад с заданными параметрами не найден
    }
}
