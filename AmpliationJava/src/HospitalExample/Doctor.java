package HospitalExample;

import java.util.Random;

public class Doctor extends Thread {
    private Room room;
    public Doctor (Room room){
        this.room = room;
    }

    public void run(){
        while(new Random().nextInt(3)!=1) {
            try {
                sleep(3000);
                room.doctorVisit();
                //System.out.println("El doctor " + this.getName() + " ha entrado en la habitación");
                sleep(3000);
                room.exitDoctor();
                //System.out.println("El doctor " + this.getName() + " ha salido de la habitación");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("El doctor "+ this.getName()+ " ha terminado su jornada laboral");
    }
}
