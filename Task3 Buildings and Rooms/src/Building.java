import java.util.ArrayList; // Importér ArrayList til at gemme flere rum

// 3.d Building-klassen
class Building {
    private ArrayList<Room> rooms; // Liste over rum i bygning
    private int numberOfFloors; // Antal etager i bygningen
    //3.e Laver en konstruktør i Building
    public Building(ArrayList<Room> rooms, int numberOfFloors) {
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    // 3.f Laver getters og setters igen
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    // Setters
    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
