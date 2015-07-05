package sample;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

public class SampleVerticle extends AbstractVerticle {

    Logger logger = LoggerFactory.getLogger(SampleVerticle.class);
    @Override
    public void start() throws Exception {
        logger.info("My config looks like: " + config().encode());
    }
}
