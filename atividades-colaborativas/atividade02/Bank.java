public class Bank {

    private String name;

    public Bank(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;

    }
    
    public boolean toBuy(CreditCard creditCard, Double price) {
        if(creditCard.getCredit() >= price) {
            creditCard.setCredit(price);
            return true;
        }
        return false;
    }
    public String toString() {
        return "Bank [name=" + name + "]";
    }
}