import java.util.List;

public interface State {
    
    public void changeState();

    public boolean validateRegistration(String matricula) throws Exception;

    public boolean validateCourse(String course) throws Exception;

    public boolean validateCreditCard(CreditCard card) throws Exception;

    public String createTicket() throws Exception;




    


}
