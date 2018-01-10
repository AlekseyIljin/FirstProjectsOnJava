package lesson_themes.classes;

public class Cat {
    //7. создать класс Cat. Кот имеет свойства имя, вес, цвет, рост, длина и
    // зависящее от веса, роста и длины
    // свойство - сила. Класс Cat должен иметь параметры по умолчанию.
    String name = "Барсик";
    int weight = 5;
    String color = "Черный";
    int height = 15;
    int length = 35;
    double power = weight*((height*0.01)*(length*0.01));

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
