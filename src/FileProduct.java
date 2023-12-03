import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class FileProduct {
    private String filePath;

    public FileProduct(String filePath) {
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
}
