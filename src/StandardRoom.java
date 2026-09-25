import java.util.UUID;

public class StandardRoom implements Room {
    private UUID id;
    private RoomStatus status;

    public StandardRoom() {
        this.id = UUID.randomUUID();
        this.status = RoomStatus.AVAILABLE;

    }

    @Override
    public double getCost() {
        return 1500.0;
    }

    @Override
    public String getDescription() {
        return "Standard Single Room";
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public RoomStatus getStatus() {
        return status;
    }

}