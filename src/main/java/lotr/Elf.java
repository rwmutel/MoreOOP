package lotr;

public class Elf extends Character{
    public Elf(){
        super(10, 10);
    }
    @Override
    public void kick(Character c){
        if (c.getPower() < this.getPower()){
            c.setHp(0);
            System.out.println("lotr.Elf wins with this shot!");
        }
        else {
            c.setPower(c.getPower() - 1);
            System.out.println("lotr.Elf kicks!");
        }
    }
}
