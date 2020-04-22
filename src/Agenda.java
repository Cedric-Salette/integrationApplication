import java.util.Date;
import java.util.List;

public class Agenda {
    // Absent dans le diagramme UML.
    List<Event> mesEvents;
    int id;

    private void newEvent(Event event) {}

    private List<Event> getEvents(){
        return mesEvents;
    }

    /*private Event getEventById(int id) {
        // return MONEVENT
    }*/

    /*private List<Event> getEventsByDay(Date day) {
        // return LISTEVENT
    }*/

    private void deleteEvent(int id){

    }
}
