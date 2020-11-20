package fluffy.army;

public class Main {
    public static void main(String[] args) {
        Person[] soldiers = new Person[]{
            // для 1-го командира (0-2)
            new Soldier("Василій",20),
            new Soldier("Іван",23),
            new Soldier("Дмитро",19),

            // для 2-го командира (3-5)
            new Soldier("Микола",18),
            new Soldier("Степан",25),
            new Soldier("Владислав",24),

            // для генерала
            new Commander("Ярослав",35),// 6
            new Commander("Богдан",39), // 7

            new General("Олексій",45), // 8
        };
        // додавання підлеглих для 1-го командира + встановлення керівника
        for (int i = 0; i < 3; ++i) {
            soldiers[6].addSubordinate(soldiers[i]);
            soldiers[i].setLeader(soldiers[6]);
        }

        // додавання підлеглих для 2-го командира
        for (int i = 3; i < 6; ++i) {
            soldiers[7].addSubordinate(soldiers[i]);
            soldiers[i].setLeader(soldiers[7]);
        }

        // додавання підлеглих для генерала
        for (int i = 6; i < 8; ++i) {
            soldiers[8].addSubordinate(soldiers[i]);
            soldiers[i].setLeader(soldiers[8]);
        }

        System.out.println("Work work");
    }
}
