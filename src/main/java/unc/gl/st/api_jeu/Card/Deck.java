package unc.gl.st.api_jeu.Card;

public class Deck {
    private ClanCard[] cards;
    private int nbCardsInDeck;

    public Deck() {
        cards = new ClanCard[54];
    }

    public void fillDeck() {
        ClanCard.Color[] colors = ClanCard.Color.values(); //array of the enum "Color" filled with the values of the enum
        nbCardsInDeck = 0;

        for (int i = 0; i < colors.length; i++) {
            ClanCard.Color color = colors[i];

            cards[nbCardsInDeck++] = new ClanCard(color, ClanCard.Strength.getStrength(i));
        }
    }
}
