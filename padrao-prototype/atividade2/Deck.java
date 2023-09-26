import java.util.List;
import java.util.Random;

public abstract class Deck {
    protected List<Card> deck; // ArrayList usado como uma pilha de objetos
    protected int NUMBER_OF_CARDS = 52; // n�mero constante de Cards
    protected Random randomNumbers; // gerador de n�mero aleat�rio

    public Deck(int numberOfCards) {
        randomNumbers = new Random(); // cria gerador de n�mero aleat�rio
        NUMBER_OF_CARDS = numberOfCards;
    }

    public boolean hasCard() {
        return !deck.isEmpty();
    }
    public void shuffle() {
        // depois de embaralhar, a distribui��o deve iniciar em deck[ 0 ] novamente

        // para cada Card, seleciona outro Card aleat�rio e os compara
        for ( int first = 0; first < deck.size(); first++ )
        {
            // seleciona um n�mero aleat�rio entre 0 e 51
            int second =  randomNumbers.nextInt( NUMBER_OF_CARDS );

            // compara Card atual com Card aleatoriamente selecionado
            Card temp = deck.remove( second );
            deck.add(0, temp);
        } // for final
    } // fim do m�todo shuffle

    public Card dealCard()
    {
        return deck.remove(deck.size()-1); // retorna Card atual no array
    }

    public int size() {
        return deck.size();
    }



    public String toString() {
        String s = "";
        for (Card card : deck) {
            s += card.toString() + "\n";
        }
        return s;
    }
    public abstract Deck clone();
}
