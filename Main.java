package Lab05;

public class Main {
    public static void main(String[] args) {
        Session session = Session.getInstance();

        try{
            session.setDuration(7, 11);
            System.out.println("Session set from " + session.getStartTime() + " to " + session.getEndTime());
            session.display();
        } catch (IllegalArgumentException error){
            System.out.println("Error: " + error.getMessage());
        }
    }
}
