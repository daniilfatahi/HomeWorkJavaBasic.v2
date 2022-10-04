package Homework15;

public class DietBurger {
    public final String bun;
    public final String meat;
    public final String cheese;
    public final String green;

    public DietBurger( final String bun, final String meat, final String cheese,final String green) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
    }

    public String getDietBurger() {
        return bun + " " + meat + " " + cheese + " " + green;
    }


}
