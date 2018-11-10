package model;

/**
 * Created by Asim on 11/8/2018.
 */
public class Deployment {

    public void deployProject() {
        System.out.println("Deployment has been started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Deployment has been completed");
    }
}
