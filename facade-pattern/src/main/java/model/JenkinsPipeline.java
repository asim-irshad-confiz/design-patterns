package model;

/**
 * Created by Asim on 11/8/2018.
 */
public class JenkinsPipeline implements Pipeline {

    private Build build;
    private Test test;
    private Deployment deployment;

    public JenkinsPipeline() {
        this.build = new Build();
        this.test = new Test();
        this.deployment = new Deployment();
    }
    public void build() {
        build.buildProject();
    }

    public void test() {
        test.testProject();
    }

    public void deploy() {
        deployment.deployProject();
    }
}
