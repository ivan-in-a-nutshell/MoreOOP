import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class CharacterFactory {
    private static final List<Supplier<Character>> CHARACTERS = List.of(
            Hobbit::new, Elf::new, King::new, Knight::new
    );

    public Character createCharacter() {
        return CHARACTERS.get(ThreadLocalRandom.current().nextInt(CHARACTERS.size())).get();
    }
}
