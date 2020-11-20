package fluffy.army;

public class Commander extends Person {
    private Soldier[] soldiers;

    public Commander(String name, int age) {
        super(name,age,"командир");
    }

    protected Commander(String name, int age, String rank) {
        super(name, age, rank);
    }

    @Override
    public void fight() {

    }

    @Override
    public void report() {

    }
}
