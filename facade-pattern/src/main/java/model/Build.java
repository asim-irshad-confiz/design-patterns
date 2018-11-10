package model;

/**
 * Created by Asim on 11/8/2018.
 */
public class Build {

    public void buildProject() {
        System.out.println("Build has been started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Build has been completed");
    }
}
