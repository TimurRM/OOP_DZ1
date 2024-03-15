import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10));
        list.add(new BottleOfWater("Brand #2", "Name #2", 210, 0.5));
        list.add(new Chocolate("Brand #5", "Milka", 100, 250));

        VendingMachine vendingMachine = new VendingMachine(list);

        // Попытка купить шоколад
        Chocolate chocolate = vendingMachine.getChocolate("Milka", 250);
        if (chocolate != null) {
            System.out.println("Вы купили: ");
            System.out.println(chocolate.displayInfo());
        } else {
            System.out.println("Такого шоколада нет в автомате.");
        }
    }
}

