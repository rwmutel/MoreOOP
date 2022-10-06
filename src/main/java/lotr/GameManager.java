package lotr;

public class GameManager {
    public void fight(Character a, Character b) {
        int round = 0;
        while (a.getHp() > 0 && b.getHp() > 0){
            System.out.println("Round " + ++round + " of battle between " +
                    a.toString() + " and " + b.toString() + "!!!");
            a.kick(b);
            if (b.getHp() == 0) {
                break;
            }
            b.kick(a);
            if (a.getHp() == 0) {
                break;
            }
            if (round == 2 &&
                    (a.getClass().getName().equals("lotr.Elf") && b.getClass().getName().equals("lotr.Elf") ||
                            a.getClass().getName().equals("lotr.Hobbit") && b.getClass().getName().equals("lotr.Hobbit"))){
                break;
            }
            System.out.println("\n");
        }
    }
}
