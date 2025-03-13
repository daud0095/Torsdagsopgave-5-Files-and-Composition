import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// 2.c Opretter en klasse som håndterer kaffemenu
class Cafe {
    private ArrayList<String> coffeeMenu; // Privat liste til at gemme kaffenavne

    // 2.c Constructor til at initialisere ArrayList
    public Cafe() {
        coffeeMenu = new ArrayList<>(); // Opretter tom ArrayList
    }

    // 2.d Laver en metode til at indlæse kaffe menu fra filen
    public void loadMenuData() {
        try {
            File file = new File("coffees.txt"); // 2.d  Opretter en en fillinstans så jeg kan repræsentere teksten
            Scanner scan = new Scanner(file); // 2.d Laver en scanner objekt til at læse filenn indehold

            // 2.e Læser hver linje fra filen og tilføjer det til ArrayList
            while (scan.hasNextLine()) {
                coffeeMenu.add(scan.nextLine());
            }
            scan.close(); // lukker scanen
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check path and filename");
        }

    }

    // 2.c Getter-metode til at få listen med kaffenavne
    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu; // Returnere listen med kaffe
    }
}


