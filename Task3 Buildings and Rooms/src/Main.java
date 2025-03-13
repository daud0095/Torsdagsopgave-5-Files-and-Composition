import java.util.ArrayList;

// 3.g
public class Main {
    public static void main(String[] args) {
        // Opretter tre rum med antal lamper og vinduer
        Room room1 = new Room(3, 2);
        Room room2 = new Room(5, 3);
        Room room3 = new Room(2, 1);

        // 3.h Tilføjer tre rooms til en ArrayList
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        // 3.i Opretter en bygning med rummene og 2 etager
        Building building = new Building(rooms, 2);

        // Tester metoderne
        System.out.println("Total lamps in building: " + countLampsInBuilding(building));
        System.out.println("Total windows in building: " + countWindowsInBuilding(building)); // Manglede metode
        System.out.println("Total rooms in building: " + countRoomsInBuilding(building));
        System.out.println("Is the building normal? " + isNormal(building));
    }

    // 3.j Laver en metode til at tælle antal lamper i bygningen
    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    // 3.j Laver metode til at tælle antal vinduer i bygningen (manglede)
    public static int countWindowsInBuilding(Building building) {
        int totalWindows = 0;
        for (Room room : building.getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }

    // 3.j Laver metode til at tælle antal rum i bygningen
    public static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }

    // 3.k Laver metode til at tjekke om bygningen er normal
    public static boolean isNormal(Building building) {
        return building.getNumberOfFloors() <= building.getRooms().size();
    }
}
