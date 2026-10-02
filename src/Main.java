public class Main {
    public static void main(String[] args) {
        RoomFactory factory = new RoomFactory();

        System.out.println("--- Phase 1: Core Foundation ---");
        Room myRoom = factory.createRoom("STANDARD");
        printRoomInfo(myRoom);

        Room suiteRoom = factory.createRoom("SUITE");
        printRoomInfo(suiteRoom);

        System.out.println("--- Phase 2: Dynamic Add-ons (Decorator Pattern) ---");
        
        System.out.println("Adding Breakfast to Standard Room...");
        Room myRoomWithBreakfast = new BreakfastDecorator(myRoom);
        printRoomInfo(myRoomWithBreakfast);

        System.out.println("Adding Breakfast and Spa to Suite Room...");
        Room ultimateSuite = new SpaDecorator(new BreakfastDecorator(suiteRoom));
        printRoomInfo(ultimateSuite);
        
        System.out.println("--- Testing Error Handling ---");
        Room errorRoom = factory.createRoom("INVALID_TEST");
    }

    private static void printRoomInfo(Room room) {
        if (room != null) {
            System.out.println("Room Type: " + room.getDescription());
            System.out.println("Room Price: $" + room.getCost());
            System.out.println("Room ID: " + room.getId());
            System.out.println("Room Status: " + room.getStatus());
            System.out.println("----------------------------------");
        }
    }
}
