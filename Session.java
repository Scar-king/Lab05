package Lab05;

public class Session {
    private static final int duration;
    private static final Session Instance;
    static {
        duration = 2;
        Instance = new Session("000-111-000", 7, 11);
    }

    private String id;
    private int startTime;
    private int endTime;
    public Session(String id, int startTime, int endTime){
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime(){
        return startTime;
    }

    public int getEndTime(){
        return endTime;
    }

    public static Session getInstance(){
        return Instance;
    }

    //Task 8

    public void setDuration(int startTime, int endTime) throws IllegalArgumentException{
        if(startTime >= endTime){
            throw new IllegalArgumentException("Start time cannot be bigger than End Time");
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void display(){
        System.out.println("-----------------------------");
        System.out.println("         SESSION");
        System.out.println("-----------------------------");
        System.out.println("Session ID: "+id);
        System.out.println("Start at: "+startTime+"AM");
        System.out.println("Duration: "+duration+" Hours");
        System.out.println("End at: "+endTime+"AM");
        System.out.println("-----------------------------");
    }
}
