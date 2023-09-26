// Fig. 7.11: DeckOfCardsTest.java
// Aplicativo de embaralhar e distribuir cartas.

import java.util.Scanner;

public class DeckOfCardsTest
{
   // executa o aplicativo
   public static void main( String args[] )
   {
      final int SUECA = 1;
      final int NORMAL = 2;

      System.out.println("Escolha o tipo de baralho: ");
      System.out.println("1 - Baralho Sueca");
      System.out.println("2 - Baralho Normal");

      Scanner sc = new Scanner(System.in);
      int tipo = sc.nextInt();

      Deck deck = null;

      if (tipo == SUECA) {
         deck = new DeckOfCardsSueca();
      }
      else {
         deck = new DeckOfCards();
      }

      // imprime todas as 52 cartas na ordem em que elas s�o distribu�das
      System.out.println( "Size: " + deck.size());
      System.out.println( deck );

      System.out.println( "Removendo 26 cartas a partir do topo do baralho: ");
      
      for ( int i = 0; i < 26; i++ ) {
    	  System.out.printf( "%-20s\n",deck.dealCard());
         // distribui e imprime 4 Cards
        // System.out.printf( "%-20s%-20s%-20s%-20s\n",
         //   myDeckOfCards.dealCard(), myDeckOfCards.dealCard(), 
         //   myDeckOfCards.dealCard(), myDeckOfCards.dealCard() );
      } // for final
      System.out.println( "Size: " + deck.size());
      
   } // fim de main
} // fim da classe DeckOfCardsTest


