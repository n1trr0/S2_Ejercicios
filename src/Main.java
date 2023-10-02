import java.util.ArrayList;

@SuppressWarnings("SpellCheckingInspection")
public class Main {
    public static void main(String[] args) {

        ArrayList<Actor> Entities = new ArrayList<Actor>();
        Entities.add(new Elf("Feanor", "Elf", "Explorer"));
        Entities.add(new Dwarf("Durin", "Dwarf", "Warrior"));


        for (Actor item:Entities) item.talk();

    }
}