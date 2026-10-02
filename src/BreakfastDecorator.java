public class BreakfastDecorator extends RoomDecorator {
    public BreakfastDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public double getCost() {
        return super.getCost() + 250.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Open Buffet Breakfast";
    }
}
