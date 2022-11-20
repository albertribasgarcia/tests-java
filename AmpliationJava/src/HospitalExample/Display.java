package HospitalExample;

public class Display extends Thread {
    private Room room;
    public Display(Room room){
        this.room = room;
    }

    public void run(){
        while (true)
        {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("En la habitación hay " +room.getDoctors() + " doctores" +
                    " y "+ room.getVisitors()+" visitantes");

        }
    }
}
