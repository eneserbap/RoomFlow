import java.util.UUID;

public interface Room {
    public double getCost();

    public String getDescription();

    public UUID getId();

    public RoomStatus getStatus();
}
