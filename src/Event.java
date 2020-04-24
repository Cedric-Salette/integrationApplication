import java.util.Date;

public class Event {
    public static int compteurId;
    Date startDate;
    Date finishDate;
    String name;
    int id;

    public Event(Date startDate, Date finishDate, String name, User owner) {
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.name = name;
        this.id = compteurId;
        compteurId++;
    }

    public Event(){}

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
