package farrel.putra.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println("host: " + host);
            System.out.println("port: " + port);
            System.out.println("username: " + username);
            System.out.println("password: " + password);

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException message: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException message: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            Properties properties = new Properties();
            properties.put("name.first", "Farrel");
            properties.put("name.middle", "Athaillah");
            properties.put("name.last", "Putra");

            properties.store(new FileOutputStream("name.properties"), "name configuration");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException message: " + e.getMessage());
            System.out.println("Error membuat file properties");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException message: " + e.getMessage());
            System.out.println("Error menyimpan properties");
            e.printStackTrace();
        }
    }
}
