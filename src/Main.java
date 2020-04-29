import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

        /*
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
        Date hier = new Date(System.currentTimeMillis() - 26*(3600 * 1000));
        Date hier2 = new Date(System.currentTimeMillis() - 27*(3600 * 1000));
        Date hier3 = new Date(System.currentTimeMillis() - 28*(3600 * 1000));

        Agenda agenda = UserManagement.getUserById(0).getMonAgenda();
        agenda.showEvents();
        Event event = new Event(formater.format(aujourdhui1), formater.format(aujourdhui), formaterJour.format(aujourdhui), formaterHeure.format(aujourdhui1), formaterHeure.format(aujourdhui), "repas");
        Event event1 = new Event(formater.format(aujourdhui5), formater.format(aujourdhui4), formaterJour.format(aujourdhui5), formaterHeure.format(aujourdhui5), formaterHeure.format(aujourdhui4), "café");
        Event event2 = new Event(formater.format(aujourdhui3), formater.format(aujourdhui2), formaterJour.format(aujourdhui3), formaterHeure.format(aujourdhui3), formaterHeure.format(aujourdhui2), "petit déjeuner");

        Event event3 = new Event(formater.format(hier2), formater.format(hier), formaterJour.format(hier), formaterHeure.format(hier2), formaterHeure.format(hier), "Repas d'hier");
        Event event4 = new Event(formater.format(hier3), formater.format(hier2), formaterJour.format(hier2), formaterHeure.format(hier3), formaterHeure.format(hier2), "café d'hier");

        agenda.newEvent(event);
        agenda.newEvent(event1);
        agenda.newEvent(event4);
        agenda.newEvent(event2);
        agenda.newEvent(event3);
        agenda.showEvents();


        Event eventTest = agenda.getEventById(1);
        eventTest.showDetails();


        System.out.println("---------------------------------TEST getEventsByDay---------------------------");
        List<Event> mesEventDuJour;


        int k = 0;
        mesEventDuJour = agenda.getEventsByDay("28-04-2020");
        System.out.println("IL Y A " + mesEventDuJour.size() + " EVENEMENTS AU 29-04");
        for (int i = 0; i<mesEventDuJour.size(); i++){
            Event eventDuJour = mesEventDuJour.get(i);
            eventDuJour.showDetails();
        }


        agenda.deleteEvent(1);
        agenda.showEvents();
        */






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



        //****************** TEST DE LA CLASSE CARPOOL *******************************//

        System.out.println(" TEST DE LA CLASSE CARPOOL -------------------");
        UserManagement.createUser("Cedric", "SALETTE");
        UserManagement.createUser("Dimitri", "Czerni");
        UserManagement.createUser("Nicolas", "Billy");
        AgendaManagement.showAgendas();


        Date aujourdhui = new Date();
        Date aujourdhui1 = new Date(System.currentTimeMillis() - 3600 * 1000);
        Date aujourdhui2 = new Date(System.currentTimeMillis() - 2*(3600 * 1000));
        Date aujourdhui3 = new Date(System.currentTimeMillis() - 3*(3600 * 1000));
        Date aujourdhui4 = new Date(System.currentTimeMillis() - 4*(3600 * 1000));
        Date aujourdhui5 = new Date(System.currentTimeMillis() - 5*(3600 * 1000));
        Date hier = new Date(System.currentTimeMillis() - 26*(3600 * 1000));
        Date hier2 = new Date(System.currentTimeMillis() - 27*(3600 * 1000));
        Date hier3 = new Date(System.currentTimeMillis() - 28*(3600 * 1000));

        Agenda agenda0 = UserManagement.getUserById(0).getMonAgenda();
        Agenda agenda1 = UserManagement.getUserById(1).getMonAgenda();
        Agenda agenda2 = UserManagement.getUserById(2).getMonAgenda();
        // agenda.showEvents();
        Event event = new Event(formater.format(aujourdhui1), formater.format(aujourdhui), formaterJour.format(aujourdhui), formaterHeure.format(aujourdhui1), formaterHeure.format(aujourdhui), "repas");
        Event event1 = new Event(formater.format(aujourdhui5), formater.format(aujourdhui4), formaterJour.format(aujourdhui5), formaterHeure.format(aujourdhui5), formaterHeure.format(aujourdhui4), "café");
        Event event2 = new Event(formater.format(aujourdhui3), formater.format(aujourdhui2), formaterJour.format(aujourdhui3), formaterHeure.format(aujourdhui3), formaterHeure.format(aujourdhui2), "petit déjeuner");

        Event event3 = new Event(formater.format(hier2), formater.format(hier), formaterJour.format(hier), formaterHeure.format(hier2), formaterHeure.format(hier), "Repas d'hier");
        Event event4 = new Event(formater.format(hier3), formater.format(hier2), formaterJour.format(hier2), formaterHeure.format(hier3), formaterHeure.format(hier2), "café d'hier");

        Event event5 = new Event(formater.format(aujourdhui1), formater.format(aujourdhui5), formaterJour.format(aujourdhui1), formaterHeure.format(aujourdhui1), formaterHeure.format(aujourdhui5), "repas");


        agenda0.newEvent(event);
        agenda0.newEvent(event1);
        agenda0.newEvent(event2);
        agenda0.newEvent(event3);
        agenda0.newEvent(event4);

        agenda1.newEvent(event);
        agenda2.newEvent(event);
        agenda2.newEvent(event5);
        agenda2.newEvent(event1);
        agenda1.newEvent(event4);
        agenda2.newEvent(event2);
        agenda1.newEvent(event3);

        AgendaManagement.showAgendas();
        System.out.println();
        agenda0.showEvents();
        System.out.println();
        agenda1.showEvents();
        System.out.println();
        agenda2.showEvents();
        System.out.println();

        List<Carpool> carpools = Carpool.findMatches("29-04-2020");
        agenda1.newEvent(event3);
        System.out.println("i");
        for(int i = 0; i < carpools.size(); i++){
            carpools.get(i).showCarpool();
        }
    }
}
