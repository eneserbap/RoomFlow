public class Main {
    public static void main(String[] args) {
        RoomFactory factory = new RoomFactory();

        Room myRoom = factory.createRoom("STANDARD");

        if (myRoom != null) {
            System.out.println("Oda başarıyla üretildi!");
            System.out.println("Oda Tipi: " + myRoom.getDescription());
            System.out.println("Oda Fiyatı: " + myRoom.getCost() + " TL");
            System.out.println("Oda ID: " + myRoom.getId());
            System.out.println("Oda Durumu: " + myRoom.getStatus());
        }

        Room suiteRoom = factory.createRoom("SUITE");

        if (suiteRoom != null) {
            System.out.println("Oda başarıyla üretildi!");
            System.out.println("Oda Tipi: " + suiteRoom.getDescription());
            System.out.println("Oda Fiyatı: " + suiteRoom.getCost() + " TL");
            System.out.println("Oda ID: " + suiteRoom.getId());
            System.out.println("Oda Durumu: " + suiteRoom.getStatus());
        }

        Room errorRoom = factory.createRoom("HATADENEME");
    }
}
