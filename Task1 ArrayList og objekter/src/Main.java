import java.util.ArrayList;

public class Main { // 1.e Klassen hedder "Main" med stort "M"

    public static void main(String[] args) { // 1.e Main-metode starter programmet
        // 1.e Opretter en ArrayList til at gemme kunder
        ArrayList<Customer> customers = new ArrayList<>();

        // 1.e Tilføjer kunder til listen
        customers.add(new Customer("Daniel", "Halawi", "danielHalawi"));
        customers.add(new Customer("Loqman", "Ahmed", "loqmanahmed"));
        customers.add(new Customer("Albert", "Boring", "albertboring"));

        // 1.f Kalder printCustomers for at udskrive alle kunder
        printCustomers(customers);
    }

    // 1.f Laver en metode til at udskrive fra ArrayList
    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer); // Udnytter toString metoden i Customer klassen
        }
    }
}
