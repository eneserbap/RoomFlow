public class RoomFactory {

    public Room createRoom(String roomType) {
        if (roomType.equalsIgnoreCase("STANDARD")) {
            return new StandardRoom();
        } else if (roomType.equalsIgnoreCase("SUITE")) {
            return new SuiteRoom();
        } else {
            System.out.println("There's no room type " + roomType + ".");
            return null;
        }

    }
}