package Homework15;

public class ClassicBurger extends DietBurger {

    public final String mayo;


    public ClassicBurger(final String bun,final String meat,final String cheese,final String green,final String mayo) {
        super(bun, meat, cheese, green);
        this.mayo = mayo;
    }

    @Override
    public String getDietBurger() {
        return super.getDietBurger() + " " + mayo;
    }
}



