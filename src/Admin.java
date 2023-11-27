import java.util.LinkedList;

public class Admin {
    private int adminID;
    private String password;

    public Admin(int adminID, String password) {
        this.adminID = adminID;
        this.password = password;
    }

    public int getAdminID() {
        return adminID;
    }

    public String getPassword() {
        return password;
    }

    public void addUser(User user, LinkedList<User> users) {

        boolean found = false;

        for (User temp : users) {
            if (temp.getUserName().equals(user.getUserName())) {
                if (temp.getUserID() == user.getUserID()) {
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("User already exist!");
        }
        else {
            users.add(user);
        }
    }

    public void removeUser(User user, LinkedList<User> users) {

        boolean found = false;
        User temp = null;

        for (int i = 0; i < users.size(); i++) {
            temp = users.get(i);
            if (temp.getUserName().equals(user.getUserName())) {
                if (temp.getUserID() == user.getUserID()) {
                    found = true;
                    break;
                }
            }
        }

        if (found) {
            users.remove(temp);
        }
        else {
            System.out.println("User does not exist!");
        }
    }

    
}
