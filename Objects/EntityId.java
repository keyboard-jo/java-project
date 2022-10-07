package Objects;
import java.util.UUID;

public class EntityId {
    private String id;
    public EntityId() {
    }

    // Generate id number
    public static String generateId() {
        UUID formatId = UUID.randomUUID();
        return formatId.toString();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
