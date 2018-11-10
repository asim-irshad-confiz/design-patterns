import facade.PipelineFacade;

/**
 * Created by Asim on 11/8/2018.
 */
public class Client {
    public static void main(String[] args) {
        PipelineFacade pipelineFacade = new PipelineFacade();
        pipelineFacade.start();
    }
}
