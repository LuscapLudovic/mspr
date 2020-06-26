package dal;

import java.util.Properties;

public class Settings {
    private static Properties properties;

    static {
        try {
            properties = new Properties();
            properties.load(Settings.class.getResourceAsStream("settings.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param key
     * @return
     */
    public static String getProperty(String key){
        String parametre = properties.getProperty(key,null);
        return parametre;
    }
}
