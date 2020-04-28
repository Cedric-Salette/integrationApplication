import java.util.Date;

public class Event {
    public static int compteurId;
    String startDate;
    String finishDate;
    String name;
    int id;

    public Event(String startDate, String finishDate, String name) {
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.name = name;
        this.id = compteurId;
        compteurId++;
    }

    public void showDetails(){
        System.out.println(name + "(id:" + id + "): Commence le " + startDate + " et fini le " + finishDate);
    }

    public Event(){}

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
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
