// 3.a Laver Room klasse de
class Room {
    private int numberOfLamps; // Dvs. antal lamper i rummet
    private int numberOfWindows; // Antal vinduer i rummet
    // 3.b laver en konstruktør til at initialisere antal lamper og vinduer
    public Room(int numberOfLamps, int numberOfWindows) {
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }
    // 3.c laver getter- and setter-methods til dem
    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    // 3.c - Setters (ændrer værdier)
    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}
