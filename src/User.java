import java.util.List;

public class User {
    public static int compteurId = 0;
    String firstName;
    String lastName;
    int id;
    Agenda monAgenda;


    // Crée un nouvel agenda et le lui associé. Ajouté également cet agenda dans la liste Carpool.
    public User(String firstName, String lastName, Agenda monAgenda) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monAgenda = monAgenda;
        this.id = compteurId;
        compteurId++;
    }

    public User() {

    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
