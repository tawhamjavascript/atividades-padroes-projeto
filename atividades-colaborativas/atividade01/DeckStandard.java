
public class DeckStandard extends DeckTemplate implements Prototype {
   // construtor preenche baralho de cartas
   public DeckStandard() {
      super();
   }

   public DeckStandard(DeckStandard deckStandard) {
      super(deckStandard);
   }

   public void editDeck() {
      // TODO Auto-generated method stub
      
   }
   public void editDeckValues() {
      // TODO Auto-generated method stub
      
   }

   public Prototype clone() {
      return new DeckStandard(this);
   }
}
