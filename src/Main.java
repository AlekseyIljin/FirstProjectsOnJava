import lesson_themes.classes.Tank;

public class Main {
    public static void main(String[] args) {
        Tank bigGun= new Tank();

             bigGun.setModel("Т-34");
             bigGun.setCalibr(150D);
             bigGun.setEcipageCount(6);
             bigGun.setPower(8);
             bigGun.setColor("Темно-зеленый");
             bigGun.setHeight(2.2D);
             bigGun.setWeight(20);

        System.out.println("Модель: " + bigGun.getModel());
        System.out.println("Цвет: " + bigGun.getColor());
        System.out.println("Вес: "+bigGun.getWeight() + " тонн");
        System.out.println("Высота: "+bigGun.getHeight() + " метра");
        System.out.println("Элитность: "+bigGun.getPower() + "/10");
        System.out.println("Экипаж: "+bigGun.getEcipageCount() + " человек");
        System.out.println("Калибр: "+bigGun.getCalibr()+ " миллиметров");
    }
}
