package Homework16;

public class Person {

    private String fname;
    private int dob;
    private String mail;
    private String phone;

    private String sname;
    private int weight;
    private int pressure;
    private int steps;
    private int currentAge = 2022;

    public Person() {

    }

    public Person(String fname, int dob, String mail, String phone, String sname, int weight, int pressure, int steps) {
        this.fname = fname;
        this.dob = dob;
        this.mail = mail;
        this.phone = phone;
        this.sname = sname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;

    }



    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(int currentAge) {
        this.currentAge = currentAge;
    }

    public int countAge() {
        return currentAge - dob;
    }

    public void outPersonInfo() {

        System.out.println(fname + " " + countAge() + " " + mail + " " + phone + " " + sname + " " + weight + " "
                + pressure + " " + steps + " ");
    }


}
