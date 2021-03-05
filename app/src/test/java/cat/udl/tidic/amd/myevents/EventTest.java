package cat.udl.tidic.amd.myevents;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import cat.udl.tidic.amd.myevents.models.Event;
import cat.udl.tidic.amd.myevents.models.EventStatus;

import static org.junit.Assert.*;


public class EventTest {

    private Event e;

    @Before
    public void setUp() throws Exception {
        this.e = new Event();
    }

    @Test
    public void getStatusNewEvent(){
        Calendar c = Calendar.getInstance();
        c.set(2021,3,4);
        this.e.setStart(c.getTime());
        Assert.assertEquals(EventStatus.NEW, e.getStatus());
    }

    @Test
    public void getStatusFinishEvent(){
        Calendar c = Calendar.getInstance();
        c.set(2020,3,4);
        this.e.setEnd(c.getTime());
        Assert.assertEquals(EventStatus.FINISHED, e.getStatus());
    }
}