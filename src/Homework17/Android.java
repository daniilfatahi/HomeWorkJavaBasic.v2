package Homework17;

public class Android implements Smartphones, LinuxOS {


    public String model;
    public int year;
    public String color;

    public Android(String model, int year, String color) {
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
        System.out.println("Sending sms from: " + model);
    }

    @Override
    public void internet() {
        System.out.println("Surfing internet from " + model);
    }

    @Override
    public void linuxHello() {
        LinuxOS.super.linuxHello();
    }
}
