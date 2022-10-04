package Homework15;

public class DoubleBurger extends ClassicBurger {
    public final String extraMeat;


    public DoubleBurger(final String bun, final String meat, final String cheese, final String green, final String mayo,
                        final String extraMeat) {
        super(bun, meat, cheese, green, mayo);
        this.extraMeat = extraMeat;
    }

    @Override
    public String getDietBurger() {
        return super.getDietBurger() + " " + extraMeat;
    }
}
