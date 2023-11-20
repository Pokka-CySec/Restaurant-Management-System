import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Admin {
    private String name;
    private String adminID;

    public Admin() {
        this.name = null;
        this.adminID = null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getName() {
        return name;
    }

    public String getAdminID() {
        return adminID;
    }

    public ArrayList<Admin> ReadAdminFile() {
        ArrayList<Admin> adminList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src\\admin.txt"))) {
            String line;
            Admin admin = null;

            while ((line = br.readLine()) != null) {
                line = line.trim();
                
                if (!line.isEmpty()) {
                    String[] parts = line.split(":", 2);

                    if (parts.length == 2) {
                        String key = parts[0].trim();
                        String value = parts[1].trim();

                        if (key.equals("name")) {
                            admin = new Admin();
                            admin.setName(value);
                        } else if (key.equals("adminID") && admin != null) {
                            admin.setAdminID(value);
                            adminList.add(admin);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return adminList;
    }

    public void addMenu(FoodItem item, ArrayList<FoodItem> menuList) {
        menuList.add(item);
    }

    public void removeMenu(int id, ArrayList<FoodItem> menuList) {

        for (FoodItem obj : menuList) {
            if (obj.getFoodID() == id) {
                menuList.remove(obj);
            }
        }
    }

    public void addVoucher(VoucherItem item, LinkedList<VoucherItem> voucherList) {
        int i = 0;
        
        if (!voucherList.isEmpty()) {
            while (voucherList.get(i) != null) {
                VoucherItem obj = voucherList.get(i);
                if (obj.getVoucherID() == item.getVoucherID()) {
                    System.out.println("This voucher already exist!");
                    return;
                }
                i++;
                if (i > voucherList.size()) {
                    break;
                }
            }
        }
        
        voucherList.addLast(item);
    }

    public void removeVoucher(int id, LinkedList<VoucherItem> voucherList) {
        for (VoucherItem obj : voucherList) {
            if (obj.getVoucherID() == id) {
                voucherList.remove(obj);
            }
        }
    }

}
