package cat.udl.tidic.amd.myevents.models;

public class Counter {

    private int counter = 0;

    private static Counter INSTANCE = null;

    public static Counter getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Counter();
        }
        return (INSTANCE);
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
