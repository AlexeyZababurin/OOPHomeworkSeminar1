package GeekBrains.OOP.Homework.OOPHomeworkSeminar1;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static void main(String[] args) 
    {
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrink("Напиток1", 100, 30));
        productList.add(new HotDrink("Напиток2", 250, 50));
        productList.add(new HotDrink("Напиток3", 300, 75));
        productList.add(new HotDrink("Напиток4", 500, 100));
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("Напиток1"));
        System.out.println(vendingMachine.getProduct("Напиток2"));
        System.out.println(vendingMachine.getProduct("Напиток3"));
        System.out.println(vendingMachine.getProduct("Напиток4"));
    }
}
