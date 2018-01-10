package lesson_themes.classes;

public class Tank {
    //6. Создать класс танк, описать его возможные методы, создать и вывести в классе Main
   private String model;
   private int weight;
   private double height;
   private int power;
   private String color;
   private double calibr;
   private int ecipageCount;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCalibr() {
        return calibr;
    }

    public void setCalibr(double calibr) {
        this.calibr = calibr;
    }

    public int getEcipageCount() {
        return ecipageCount;
    }

    public void setEcipageCount(int ecipageCount) {
        this.ecipageCount = ecipageCount;
    }
}
