package facade;

import model.JenkinsPipeline;
import model.Pipeline;

/**
 * Created by Asim on 11/8/2018.
 */
public class PipelineFacade {

    private Pipeline pipeline;

    public PipelineFacade() {
        pipeline = new JenkinsPipeline();
    }

    public void start() {
        pipeline.build();
        pipeline.test();
        pipeline.deploy();
    }
}
