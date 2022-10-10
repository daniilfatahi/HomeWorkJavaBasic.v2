package Homework14;

public class Person {
    public String fname;
    public String lname;
    public String city;
    public long number;

    public Person(String fname, String lname, String city, long number) {
        this.fname = fname;
        this.lname = lname;
        this.city = city;
        this.number = number;
    }

    public String personInfo() {
        System.out.println("Зателефонувати громадянину " + fname + " " + lname + " із міста " + city + " можна за номером " + number);
        return fname + lname + city + number;
    }
}
