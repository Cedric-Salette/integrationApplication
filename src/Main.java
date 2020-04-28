import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    static DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);

    public static void main(String[] args){
        SimpleDateFormat formater = null;
        formater = new SimpleDateFormat("dd-MM-yyyy hh'H'mm");
        SimpleDateFormat formaterJour = null;
        formaterJour = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat formaterHeure = null;
        formaterHeure = new SimpleDateFormat("hh'H'mm");
        Date today = new Date();
        System.out.println(formater.format(today));
        System.out.println(formaterJour.format(today));
        System.out.println(formaterHeure.format(today));

        // Test de la classe User & UserManagement
        /*
        System.out.println("\n--------------TRY OF createUser--------------------");
        UserManagement.createUser("Cedric", "SALETTE");
        UserManagement.createUser("Dimitri", "Czerni");
        UserManagement.createUser("Nicolas", "Billy");
        UserManagement.showUser();

        System.out.println("\n--------------TRY OF getUserById--------------------");

        User monUser = UserManagement.getUserById(2);
        UserManagement.detailUser(monUser);

        System.out.println("\n----------------TRY OF deleteUser-----------------");
        UserManagement.deleteUser(1);
        UserManagement.showUser();*/



        // Test de la classe Agenda & AgendaManagement

        System.out.println("\n--------------TRY OF agendaCreatedInUser--------------------");
        UserManagement.createUser("Cedric", "SALETTE");
        UserManagement.createUser("Dimitri", "Czerni");
        UserManagement.createUser("Nicolas", "Billy");
        AgendaManagement.showAgendas();

        System.out.println("\n--------------TRY OF UserDelete --> AgendaDelete--------------------");
        UserManagement.deleteUser(1);
        AgendaManagement.showAgendas();

        System.out.println("\n--------------TRY OF Events--------------------");

        Date aujourdhui = new Date();
        Date aujourdhui1 = new Date(System.currentTimeMillis() - 3600 * 1000);
        Date aujourdhui2 = new Date(System.currentTimeMillis() - 2*(3600 * 1000));
        Date aujourdhui3 = new Date(System.currentTimeMillis() - 3*(3600 * 1000));
        Date aujourdhui4 = new Date(System.currentTimeMillis() - 4*(3600 * 1000));
        Date aujourdhui5 = new Date(System.currentTimeMillis() - 5*(3600 * 1000));

        Agenda agenda = UserManagement.getUserById(0).getMonAgenda();
        agenda.showEvents();
        //<tring startDate, String finishDate, String jourDate, String heurDebut, String heurFin, String name
        Event event = new Event(formater.format(aujourdhui1), formater.format(aujourdhui), formaterJour.format(aujourdhui), formaterHeure.format(aujourdhui1), formaterHeure.format(aujourdhui), "repas");
        Event event1 = new Event(formater.format(aujourdhui5), formater.format(aujourdhui4), formaterJour.format(aujourdhui5), formaterHeure.format(aujourdhui5), formaterHeure.format(aujourdhui4), "café");
        Event event2 = new Event(formater.format(aujourdhui3), formater.format(aujourdhui2), formaterJour.format(aujourdhui3), formaterHeure.format(aujourdhui3), formaterHeure.format(aujourdhui2), "petit déjeuner");

        agenda.newEvent(event);
        agenda.newEvent(event1);
        agenda.newEvent(event2);
        agenda.showEvents();


        Event eventTest = agenda.getEventById(1);
        eventTest.showDetails();

        agenda.deleteEvent(1);
        agenda.showEvents();







        // Test de la classe Message &  MessageManagement
        /*
        UserManagement.createUser("Cedric", "SALETTE");
        UserManagement.createUser("Dimitri", "Czerni");
        UserManagement.createUser("Nicolas", "Billy");

        User user1 = UserManagement.getUserById(0);
        User user2 = UserManagement.getUserById(1);
        User user3 = UserManagement.getUserById(2);

        MessageManagement.newMessage(user1, user2, "Tu es trop Con Dimitri");
        MessageManagement.newMessage(user2, user1, "Non toi tu es con");
        MessageManagement.newMessage(user3, user2, "Salut Dimitri, c'est Nicolas");
        MessageManagement.showMessages();

        System.out.println("\n ------------ Un message suppimé et 1 est lu --------------");
        //MessageManagement.deleteMessage(1);
        MessageManagement.read(2);
        MessageManagement.showMessages();

        List<Message> maListe = MessageManagement.getMessages(0);

        List<Message> maListeUnread = MessageManagement.getUnreadMessages(0);

        System.out.println("hey");*/




    }
}
