package GeekBrains.OOP.Homework.OOPHomeworkSeminar1;

public class HotDrink extends Product
{
    private int temperature;
    public HotDrink(String name, int volume, int temperature) 
    {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() 
    {
        return temperature;
    }

    public void setTemperaturee(int temperature) 
    {
        this.temperature = temperature;
    }

    @Override
    public String toString() 
    {
        return "HotDrink{" +
                "name=" + super.getName() +
                "; volume=" + super.getVolume() +
                "; temperature=" + temperature + "}";
    }
}
