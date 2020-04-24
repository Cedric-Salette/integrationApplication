import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Agenda {
    public static int compteurId;
    List<Event> mesEvents;
    User owner;
    int id;

    public Agenda(List<Event> mesEvents, User owner) {
        this.mesEvents = mesEvents;
        this.owner = owner;
        this.id = compteurId;
        compteurId++;
    }

    public List<Event> getMesEvents() {
        return mesEvents;
    }

    public void setMesEvents(List<Event> mesEvents) {
        this.mesEvents = mesEvents;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private void newEvent(Event event) {
    }

    private List<Event> getEvents() {
        return mesEvents;
    }

    private Event getEventById(int id) {
        Event monEvent = new Event();
        for (int i = 0; i < mesEvents.size(); i++) {
            if (mesEvents.get(i).getId() == id) {
                monEvent = mesEvents.get(i);
            }
        }
        return monEvent;
    }

    private List<Event> getEventsByDay(Date day) {
        List<Event> eventsOfDay = new ArrayList<>();
        for (int i = 0; i < mesEvents.size(); i++) {
            // Comparer le jour et non pas la date exacte
            if (mesEvents.get(i).getStartDate() == day) {
                eventsOfDay.add(mesEvents.get(i));
            }
        }
        return eventsOfDay;

    }

    private void deleteEvent(int id) {

    }
}
