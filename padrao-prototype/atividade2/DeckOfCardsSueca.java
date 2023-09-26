import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCardsSueca extends Deck {

    public DeckOfCardsSueca() {
        super(48);
        String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Jack", "Queen", "King", "Valet", "Lady"};
        String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };

        deck = new ArrayList<Card>(); // cria List de objetos Card
        randomNumbers = new Random(); // cria gerador de n�mero aleat�rio

        // preenche baralho com objetos Card
        for ( int count = 0; count < NUMBER_OF_CARDS; count++ ) {

            if (faces[count % 12].equals("Ace")) {
                deck.add(new Card( faces[ count % 12 ], suits[ count / 12 ], 11 ));
            }

            else if (faces[count % 12].equals("Seven")) {
                deck.add(new Card( faces[ count % 12 ], suits[ count / 12 ], 10 ));
            }

            else if (faces[count % 12].equals("King")) {
                deck.add(new Card( faces[ count % 12 ], suits[ count / 12 ], 4 ));
            }

            else if (faces[count % 12].equals("Valet")) {
                deck.add(new Card( faces[ count % 12 ], suits[ count / 12 ], 3 ));
            }

            else if (faces[count % 12].equals("Lady")) {
                deck.add(new Card( faces[ count % 12 ], suits[ count / 12 ], 2 ));
            }

            else {
                deck.add(new Card( faces[ count % 12 ], suits[ count / 12 ], 0 ));
            }
        }
    } // fim do construtor DeckOfCards

    public DeckOfCardsSueca(DeckOfCardsSueca deck) {
        super(48);
        this.deck = new ArrayList<Card>();
        for (Card card: deck.deck) {
            this.deck.add((Card) card.clone());
        }
    }


    public Deck clone() {
        return new DeckOfCardsSueca(this);
    }

}
