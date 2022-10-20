package Homework17;

public class MainHW17 {
    public static void main(String[] args) {

        Android android = new Android("Samsung S22", 2020, "Silver");
        iPhone iPhone = new iPhone("iPhone 13", 2021, "black");

        android.linuxHello();
        android.call();

        iPhone.iosHello();
        iPhone.internet();

    }
}
