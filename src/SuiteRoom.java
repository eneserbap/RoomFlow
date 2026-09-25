import java.util.UUID;

public class SuiteRoom implements Room {
    private UUID id;
    private RoomStatus status;

    public SuiteRoom() {
        this.id = UUID.randomUUID();
        this.status = RoomStatus.AVAILABLE;

    }

    @Override
    public double getCost() {
        return 3000.0;
    }

    @Override
    public String getDescription() {
        return "Süit Oda";
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