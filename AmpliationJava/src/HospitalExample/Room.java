package HospitalExample;

public class Room {
    private int visitors = 0;
    private int doctors = 0;

    public Room(){

    }

    public synchronized void friendVisit() throws InterruptedException {
        while (getVisitors() >4 || getDoctors() >0){
            wait();
            System.out.println("lleno");
        }
        visitors = getVisitors() + 1;
    }

    public synchronized void exitFriend(){
        visitors = getVisitors() - 1;
        notify();
        //System.out.println("Puede entrar una persona más");
    }

    public synchronized void doctorVisit() throws InterruptedException {
        while (getDoctors() >0 || getVisitors() >0){
            wait();
            System.out.println("lleno");
        }
        doctors = getDoctors() + 1;
    }
    public synchronized void exitDoctor(){
        doctors = getDoctors() - 1;
        notify();
        System.out.println("Sale un doctor");
    }

    public int getVisitors() {
        return visitors;
    }

    public int getDoctors() {
        return doctors;
    }
}
