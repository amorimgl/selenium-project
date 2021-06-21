package project.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EnvUrl {

    String FirstEnv;
    String ActualEnv;

    public EnvUrl() {
        setEnvUrl();
    }

    private void setEnvUrl() {

        try (InputStream input = EnvUrl.class.getClassLoader().getResourceAsStream("environment.properties")) {

            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Unable to find environment.properties");
                return;
            }
            prop.load(input);

            FirstEnv = prop.getProperty("server.host.Env");
            ActualEnv = prop.getProperty("server.host.EnvActual");

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public String getEnvUrl() {
        return FirstEnv;
    }

    public String getActualEnvUrl() {
        return ActualEnv;
    }
}

