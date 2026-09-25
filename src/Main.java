public class Main {
    public static void main(String[] args) {
        RoomFactory factory = new RoomFactory();

        Room myRoom = factory.createRoom("STANDARD");

        if (myRoom != null) {
            System.out.println("Room successfully created!");
            System.out.println("Room Type: " + myRoom.getDescription());
            System.out.println("Room Price: $" + myRoom.getCost());
            System.out.println("Room ID: " + myRoom.getId());
            System.out.println("Room Status: " + myRoom.getStatus());
        }

        Room suiteRoom = factory.createRoom("SUITE");

        if (suiteRoom != null) {
            System.out.println("Room successfully created!");
            System.out.println("Room Type: " + suiteRoom.getDescription());
            System.out.println("Room Price: $" + suiteRoom.getCost());
            System.out.println("Room ID: " + suiteRoom.getId());
            System.out.println("Room Status: " + suiteRoom.getStatus());
        }

        Room errorRoom = factory.createRoom("INVALID_TEST");
    }
}
