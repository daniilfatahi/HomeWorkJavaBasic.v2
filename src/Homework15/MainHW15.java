package Homework15;

public class MainHW15 {
    public static void main(String[] args) {
        DietBurger dietBurger = new DietBurger("bun", "meat", "cheese", "green");
        ClassicBurger classicBurger = new ClassicBurger("bun", "meat", "cheese", "green",
                "mayo");
        DoubleBurger doubleBurger = new DoubleBurger("bun", "meat", "cheese", "green",
                "mayo", "extra meat");
        System.out.println("Diet burger recipy is: " + dietBurger.getDietBurger());
        System.out.println("Classic burger recipy is: " + classicBurger.getDietBurger());
        System.out.println("Extra meat burger recipy is: " + doubleBurger.getDietBurger());

    }
}
