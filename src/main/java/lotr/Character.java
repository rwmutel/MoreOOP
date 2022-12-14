package lotr;

public abstract class Character {
    private int power;
    public Character(int power, int hp){
        this.setPower(power);
        this.setHp(hp);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0){
            this.hp = 0;
            System.out.println(this.toString() + " died :(");
        }
        else{
            this.hp = hp;
        }
    }

    private int hp;

    public abstract void kick(Character c);

    @Override
    public String toString() {
        return this.getClass().getTypeName() +
                "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}
