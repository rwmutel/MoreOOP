import lotr.Character;
import lotr.*;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        GameManager game = new GameManager();
        Character first = factory.createCharacter();
        Character second = factory.createCharacter();
        game.fight(first, second);
    }
}
