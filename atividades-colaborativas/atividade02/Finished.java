import java.util.ArrayList;
import java.util.List;

public class Finished implements State {
    
    private Kiosk context;
    
    public Finished(Kiosk context) {
        this.context = context;
    }
    
    public void changeState() {
        context.setState(new OnHold(context));
    }
    
    public boolean validateRegistration(String input) throws Exception {
        throw new UnsupportedOperationException("Você já inseriu a matrícula");
    }

    public boolean validateCreditCard(CreditCard card) throws Exception {
        throw new UnsupportedOperationException("Não é possível validar o cartão de crédito no estado de finalizado");
    }

    public boolean validateCourse(String course) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validateCourse'");
    }


    public String createTicket() throws Exception {
        throw new UnsupportedOperationException("Ticket já foi criado");
    }
}
