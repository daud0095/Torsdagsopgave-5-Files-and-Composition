// 1.a Laver en Customer klasse, med attributterne
public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter = 0; // Counter der starter på 0 og tælles op for hver ny instans

    // 1.b Laver en klasse en konstruktør der tager kundens navn og brugernavn som parameter
    public Customer(String firstname, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        // 1.c Sætter id til counter så det kan tælles op ved hver instans
        this.id = ++counter;
    }

    // 1.d Laver getter og setters for at få adgang til private felter
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getId() {
        return id;
    }

    // 1.d Laver en toString metode til at vise selve kundeoplysninger alstå pænt
    @Override
    public String toString() {
        return "Customer ID: " + id + ", Name: " + firstName + " " + lastName + ", Username: " + username;
    }





}