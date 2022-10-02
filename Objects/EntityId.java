package Objects;
import java.util.Random;;

public class EntityId {
    private String id;
    public EntityId() {
    }

    // Generate id number
    public static String generateId() {
        Random random = new Random();
        Integer range = 100000000;
        Integer id = random.nextInt(range);
        String formatId = String.format("%09d", id);
        return formatId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
