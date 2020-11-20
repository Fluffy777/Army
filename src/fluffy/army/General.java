package fluffy.army;

public class General extends Person {
    private Commander[] commanders;

    public General(String name, int age) {
        super(name,age,"генерал");
    }

    protected General(String name, int age, String rank) {
        super(name, age, rank);
    }

    @Override
    public void report() {

    }
}
