import io.vertx.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        System.out.println("My config looks like:\n" + config().getJsonObject("main").encodePrettily());
    }
}
