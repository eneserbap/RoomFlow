import java.util.UUID;

public abstract class RoomDecorator implements Room {
    protected Room decoratedRoom;

    public RoomDecorator(Room decoratedRoom) {
        this.decoratedRoom = decoratedRoom;
    }

    @Override
    public double getCost() {
        return decoratedRoom.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedRoom.getDescription();
    }

    @Override
    public UUID getId() {
        return decoratedRoom.getId();
    }

    @Override
    public RoomStatus getStatus() {
        return decoratedRoom.getStatus();
    }
}
