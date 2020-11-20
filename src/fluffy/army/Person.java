package fluffy.army;

import java.util.LinkedList;

public abstract class Person implements ReadyToWar {
    protected String name;
    protected int age;
    protected String rank;
    protected Person leader;

    protected LinkedList<Person> subordinates;

    protected Person(String name, int age, String rank) {
        this.name = name;
        this.age = age;
        this.rank = rank;
        subordinates = new LinkedList<Person>();
    }

    public void addSubordinate(Person obj) {
        subordinates.add(obj);
    }

    public void removeSubordinate(Person obj) {
        subordinates.remove(obj);
    }

    protected void setLeader(Person leader) {
        this.leader = leader;
    }

    public void introduceYourself() {
        System.out.println("Вітаю! Мене звати " + name + ". Мені " + age + " років. Маю звання " + rank + ".");
    }

    @Override
    public void report() {
        String result = "Я " + name + " (" + rank + "). Мої підлеглі: ";
        for (Person temp : subordinates) {
            result += (temp.rank + " " + temp.name);
        }
        result += ".";
    }
}
