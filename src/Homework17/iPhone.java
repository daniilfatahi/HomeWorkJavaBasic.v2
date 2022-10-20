package Homework17;

public class iPhone implements Smartphones, IOS {

    public String model;
    public int year;
    public String color;

    public iPhone(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public void call() {
        System.out.println("Calling from: " + model);

    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from: " + model);
    }

    @Override
    public void internet() {
        System.out.println("Surfing internet from: "+ model);

    }

    @Override
    public void iosHello() {
        IOS.super.iosHello();
    }
}
