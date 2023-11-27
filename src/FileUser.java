import java.io.*;
import java.util.*;

public class FileUser {
    private String filePath;

    public FileUser(String filePath) {
        this.filePath = filePath;
    }

    public LinkedList<User> loadUser() {
        LinkedList<User> users = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                StringTokenizer token = new StringTokenizer(line, ":");
                if (token.countTokens() == 2) {
                    String username = token.nextToken();
                    int id = Integer.parseInt(token.nextToken());
                    User user = new User(username, id);
                    users.add(user);
                }
            }
            return users;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    public void updateUser(LinkedList<User> users) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (User user : users) {
                String entry = user.getUserName() + ":" + user.getUserID();
                writer.println(entry);
            }
        } catch (IOException e) {
            System.out.println("Error writing to user file: " + e.getMessage());
        }
    }
}
