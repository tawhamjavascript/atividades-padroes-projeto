import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Processing implements State {
    private Kiosk context;

    private final int CVVLENGTH = 3;
    private final int CREDITCARDNUMBERLENGTH = 5;

    public Processing(Kiosk context) {
        this.context = context;
    }

    public void changeState() {
        context.setState(new Subscribed(context));
    }

	public boolean validateCreditCard(CreditCard card) throws Exception {
        if (
        card.getCredit() < context.getCourse().getPrice() || 
        card.getCvv().length() != CVVLENGTH || 
        card.getNumber().length() != CREDITCARDNUMBERLENGTH) {
            context.getCourse().getStudents().remove(context.getStudent());
            context.setState(new OnHold(context));
            return false;
        }
        changeState();
		return true;
	}

    public boolean validateRegistration(String matricula) {
        throw new UnsupportedOperationException("Não pode validar curso no estado Processando");
    }

    public boolean validateCourse(String course) throws Exception {
        throw new UnsupportedOperationException("Não pode validar curso no estado Processando");
    }

    public String createTicket() throws Exception {
        throw new UnsupportedOperationException("Não pode criar ticket no estado Processando");
    }
}
