// classe DeckOfCards representa um baralho.
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards extends Deck {

   // construtor preenche baralho de cartas
   public DeckOfCards() {
      super(52);
      String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };    
      String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };     

      deck = new ArrayList<Card>(); // cria List de objetos Card
      randomNumbers = new Random(); // cria gerador de n�mero aleat�rio

      // preenche baralho com objetos Card
      for ( int count = 0; count < NUMBER_OF_CARDS; count++ )   {
         deck.add(new Card( faces[ count % 13 ], suits[ count / 13 ], (count % 13) +1  ));
      }
   } // fim do construtor DeckOfCards


   public DeckOfCards(DeckOfCards deck) {
      super(52);
      this.deck = new ArrayList<Card>();
      for (Card card: deck.deck) {
         this.deck.add((Card) card.clone());
      }
      this.randomNumbers = new Random();
   }

    public Deck clone() {
        return new DeckOfCards(this);
    }
   
   
} // fim da classe DeckOfCards


