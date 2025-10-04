public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("Create characters p1: " + c1 + " p2: " + c2);

        while (true) {
            c1.kick(c2);
            System.out.println("p1 attacks p2: " + c2);
            if (!c2.isAlive()) break;
            c2.kick(c1);
            System.out.println("p2 attacks p1: " + c1);
            if (!c1.isAlive()) break;
        }
    }
}
