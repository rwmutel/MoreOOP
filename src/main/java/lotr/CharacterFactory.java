package lotr;

import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Random;
import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {
    public Character createCharacter() {
        Reflections ref = new Reflections("lotr");
        Set<Class<?>> characters = ref.get(SubTypes.of(Character.class).asClass());
        characters.remove(Nobel.class);
        int index = new Random().nextInt(characters.size());
        try {
            return (Character) characters.toArray(new Class[0])[index].getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
