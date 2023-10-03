import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeckSueca extends DeckTemplate implements Prototype {

    private String nipeTrump;
    
    public DeckSueca() {
        super();
        createTrump();
    
    }

    public DeckSueca(DeckSueca deckSueca) {
        super(deckSueca);
        this.nipeTrump = deckSueca.nipeTrump;
    }

    private void createTrump() {
        int index = randomNumbers.nextInt(number_of_cards);
        this.nipeTrump = this.deck.get(index).getFace();
        Card card = this.deck.get(index);
        this.deck.remove(index);
        this.deck.add(0, card);
    }
    
    public void editDeck() {
        List<String> cardRemoved = new ArrayList<String>();
        cardRemoved.add("Eight");
        cardRemoved.add("Nine");
        cardRemoved.add("Ten");

        for(int i = this.deck.size() - 1; i > - 1; i --) {
            if(cardRemoved.contains(this.deck.get(i).getFace())) {
                this.deck.remove(i); 
                this.number_of_cards--;
            }
        }
    }


    public void editDeckValues() {
        Map<String, Integer> cardValues = new HashMap<String, Integer>();
        
        cardValues.put("Ace", 11);
        cardValues.put("Seven", 10);
        cardValues.put("King", 4);
        cardValues.put("Jack", 3);
        cardValues.put("Queen", 2);

        this.deck.forEach(card -> {
            if(cardValues.containsKey(card.getFace())) {
                card.setValue(cardValues.get(card.getFace()));
            }
            else {
                card.setValue(0);
            }
        });
    }  
    
    public Prototype clone() {
        return new DeckSueca(this);
    }
}
