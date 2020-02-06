package cardgameweek4;
/**
 * a class that models the Card Hand.
 * A Card hand has an array of cards. 
 * How can you change the size of the hand? how big is it right now?
 * @suthor dancye, 2019.
 */

public class CardHand {

        private int handSize = 108;
	public Card[] cards = new Card[handSize];

	
        /**
         * Add comments during class to explain what this method does.
         */
        public void generateHand()
        {
     
                int countCards = 0;
                while(countCards<48){
		for(Card.Suit s: Card.Suit.values())
                {
                    if(s!=Card.Suit.ChangeColour && s!=Card.Suit.PlusFour){
                    for(Card.Value v: Card.Value.values())
                    {
                      if(v!=Card.Value.ChangeColour && v!=Card.Value.PlusFour){
                        cards[countCards] = (new Card(s,v));
                        countCards++;
                    }
                    }
                    }
                }
                }//end outter for
                
                
                //generates duplicate cards
                while(countCards<100){
                for(Card.Suit s: Card.Suit.values())
                {
                     if(s!=Card.Suit.ChangeColour && s!=Card.Suit.PlusFour){
                    for(Card.Value v: Card.Value.values())
                    {
                        if (v!=Card.Value.Zero){
                            
                        if(v!=Card.Value.ChangeColour && v!=Card.Value.PlusFour){
                        cards[countCards] = (new Card(s,v));
                        countCards++;
                        }
                    }
                     }
                }
                }
                }
//end outter for
                for(;countCards<cards.length-4;){
                    cards[countCards]=(new Card(Card.Suit.ChangeColour,Card.Value.ChangeColour));
                    countCards++;
                }
                for(;countCards<cards.length;){
                    cards[countCards]=(new Card(Card.Suit.PlusFour,Card.Value.PlusFour));
                    countCards++;
                }
                
                
        }//end method
                }

