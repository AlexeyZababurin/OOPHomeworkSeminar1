package GeekBrains.OOP.Homework.OOPHomeworkSeminar1;

import java.util.List;

public interface VendingMachine 
{
    public void initProduct(List<Product> productList);
    public Product getProduct(String name);
}
