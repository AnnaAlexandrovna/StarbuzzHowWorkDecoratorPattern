package BeverageFolder;

public abstract class Beverage {
    String description = "Unknown BeverageFolder.Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
