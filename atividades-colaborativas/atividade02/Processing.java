import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Processing implements State {
    private Kiosk context;

    public Processing(Kiosk context) {
        this.context = context;
    }

    public void changeState() {
        context.setState(new Subscribed(context));
    }

    public String validate(List<String> input) {
        CreditCard creditCard = new CreditCard(input.get(0), input.get(1), input.get(2), input.get(3));


        Bank bank = new Bank("Nubank");

        if (bank.toBuy(creditCard, context.getCourse().getPrice())) {
            changeState();
            return "Compra realizada com sucesso! \n";
        } else {
            this.context.setState(new OnHold(context));
            return "Saldo insuficiente! \n";
        }
        
    }

    public List<String> input() {
        return new ArrayList<String>(Arrays.asList(
       "Digite o número do cartão: ",
            "Digite o nome do titular: ", 
            "Digite a data de vencimento: ",
            "Digite o código de segurança: "));
    }
}
