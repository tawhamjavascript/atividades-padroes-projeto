import java.sql.Date;

public class CreditCard {
    private String number;
    private String name;
    private String expirationDate;
    private String cvv;
    private Double credit = 100.00;

    public CreditCard(String number, String name, String expirationDate, String cvv) {
        this.number = number;
        this.name = name;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit -= credit;
    }
}
