public abstract class Character {
    private int power;
    private int hp;

    protected Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    protected Character() {
        this.power = 0;
        this.hp = 0;
    }

    protected int getHp() {
        return hp;
    }

    protected void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    protected int getPower() {
        return power;
    }

    protected void setPower(int power) {
        this.power = Math.max(power, 0);
    }

    protected abstract void kick(Character c);

    protected boolean isAlive() {
        return hp > 0;
    }

    public String toString() {
        return getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
