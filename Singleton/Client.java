package singleton;

public class Client {
    public static void main(String[] args) {
        try {
            ConfigurationManager config = ConfigurationManager.getInstance();
            String url = config.getProperty("url");
            System.out.println("URL: " + url);

            // Setting a new property value
            config.setProperty("newKey", "newValue");
            System.out.println("New Key: " + config.getProperty("newKey"));

        } catch (ConfigurationManagerException e) {
            e.printStackTrace();
        }
    }
}
