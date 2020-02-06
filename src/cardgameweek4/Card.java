package cardgameweek4;
/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * @author dancye, 2019
 * @author Nicolas Chatziargiriou, 2019
 */
public class Card {
    
        public enum Suit {RED,BLUE,YELLOW,GREEN,PlusFour,ChangeColour};
       
        public enum Value{Zero,One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Skip,Reverese,PlusTwo,PlusFour,ChangeColour};
        private final Suit suit;
        private final Value value;
        
     
        
      
        
        
        
        
        public Card(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }
	public Value getValue() {
		return this.value;
	}

	
	public Suit getSuit() {
		return this.suit;
        }
}