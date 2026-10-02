public class SpaDecorator extends RoomDecorator {
    public SpaDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public double getCost() {
        return super.getCost() + 500.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Spa Access";
    }
}
