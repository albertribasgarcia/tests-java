package HospitalExample;

import java.util.Random;

public class Friend extends Thread {
    private Room room;
    public Friend(Room room){
        this.room = room;
    }

    public void run(){
        while(new Random().nextInt(3)!=2) {
            try {
                sleep(3000);
                room.friendVisit();
                //System.out.println("Te ha venido a visitar" +this.getName());
                sleep(3000);
                room.exitFriend();
                //System.out.println("Tu amigo "+ this.getName() + " ha salido de la habitación");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Tu amigo " + this.getName() + " se ha ido para casa");
    }
}
