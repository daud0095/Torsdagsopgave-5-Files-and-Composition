// 2.b Opretter en Main-klasse med main metode
public class Main {
    public static void main(String[] args) {
        // 2.g Opretter en ny kaffe projekt
        Cafe myCafe = new Cafe();
        myCafe.loadMenuData(); // Kalder metoden til at indløse menuen

        // 2.h Udskriver kaffenavne fra menuen
        System.out.println("Coffee Menu:");
        for (String coffee : myCafe.getCoffeeMenu()) { // Laver en for-loop der går gennem listen
            System.out.println(coffee); // Udskriver hver kaffe
        }
    }
}
