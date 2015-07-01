import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Starter;
import io.vertx.core.json.JsonObject;

public class ConfigStarter extends Starter {

    @Override
    protected void beforeDeployingVerticle(DeploymentOptions deploymentOptions) {
        if (deploymentOptions.getConfig() == null) {
            Config commonConfig = ConfigFactory.load("conf/application");
            Config envConfig = ConfigFactory.load(String.format("conf/%s/application", System.getProperty("mode", "dev")));
            envConfig.withFallback(commonConfig).root().unwrapped();
            deploymentOptions.setConfig(new JsonObject(envConfig.withFallback(commonConfig).root().unwrapped()));
        }
    }

    public static void main(String[] args) {
        new ConfigStarter().run(args);
    }
}
