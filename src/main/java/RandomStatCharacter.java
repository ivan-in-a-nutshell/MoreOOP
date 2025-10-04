import java.util.concurrent.ThreadLocalRandom;

public class RandomStatCharacter extends Character {
    protected final int minPower;
    protected final int maxPower;
    protected final int minHp;
    protected final int maxHp;

    protected RandomStatCharacter(int minPower, int maxPower, int minHp, int maxHp) {
        super(ThreadLocalRandom.current().nextInt(minPower, maxPower + 1),
                ThreadLocalRandom.current().nextInt(minHp, maxHp + 1));
        this.minPower = minPower;
        this.maxPower = maxPower;
        this.minHp = minHp;
        this.maxHp = maxHp;
    }

    @Override
    protected void kick(Character c) {
        c.setHp(c.getHp() - ThreadLocalRandom.current().nextInt(this.getPower() + 1));
    }
}
