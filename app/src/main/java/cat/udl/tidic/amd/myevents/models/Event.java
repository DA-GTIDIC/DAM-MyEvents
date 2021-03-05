package cat.udl.tidic.amd.myevents.models;

import android.util.Log;

import androidx.annotation.NonNull;

import java.util.Date;

public class Event {

    private String name;
    private String description;
    private Date start;
    private Date end;

    public Event(String name, String description, Date start, Date end) {
        this.name = name;
        this.description = description;
        this.start = start;
        this.end = end;
    }

    public Event() {
        this.name = "";
        this.description = "";
        this.start = new Date();
        this.end = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public EventStatus getStatus(){
        if(this.daysToStart() > 0){
            return EventStatus.NEW;
        }

        if(this.daysToEnd() < 0){
            return EventStatus.FINISHED;
        }

        return EventStatus.ONGOING;
    }

    public int daysToStart(){
        Date now = new Date();
        return DateUtils.getDaysBetweenDates(this.start, now);
    }

    public int daysToEnd(){
        Date now = new Date();
        return DateUtils.getDaysBetweenDates(this.end, now);
    }

    public int duration(){
        return DateUtils.getDaysBetweenDates(this.end, this.start);
    }

    @NonNull
    @Override
    public String toString(){
        if (this.name.contentEquals("")){
            return "";
        }else{
            return "Event:  \n" +
                    "  Name: " + this.name + "\n" +
                    "  Description: " + this.description + "\n" +
                    "  Start: " + this.start + "\n" +
                    "  End: " + this.end + "\n" +
                    "  Days to start: " + this.daysToStart() + "\n" +
                    "  Duration (days): " + this.duration();
        }

    }


}
