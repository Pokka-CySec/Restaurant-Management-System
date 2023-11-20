import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VoucherItem {
    private int voucherID;
    private double discount;
    private String expiryDate;

    public VoucherItem(int voucherID, double discount) {
        this.voucherID = voucherID;
        this.discount = discount;
        this.expiryDate = null;
        dateProcess();
    }

    public int getVoucherID() {
        return voucherID;
    }

    public double getDiscount() {
        return discount;
    }

    public void dateProcess() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date = date.plusDays(5);
        this.expiryDate = date.format(formatter);
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}
