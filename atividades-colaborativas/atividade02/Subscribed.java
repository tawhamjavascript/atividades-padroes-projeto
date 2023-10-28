import java.util.ArrayList;
import java.util.List;

public class Subscribed implements State {
    private Kiosk context;

    public Subscribed(Kiosk context) {
        this.context = context;
    }

    public void changeState() {
        context.setState(new Finished(context));
    }

    public boolean validateRegistration(String input) throws Exception{
        throw new UnsupportedOperationException("Você já inseriu a matrícula");
    }

    public boolean validateCourse(String course) throws Exception {
        throw new UnsupportedOperationException("Não é possível validar o curso no estado de inscrito");
    }

    public boolean validateCreditCard(CreditCard card) throws Exception{
        throw new UnsupportedOperationException("Não é possível validar o cartão de crédito no estado de inscrito");
    }

    public String createTicket() {
        changeState();
        return "" + context.getCourse().getName();
        
    }

}
