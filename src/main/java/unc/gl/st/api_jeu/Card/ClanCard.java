package unc.gl.st.api_jeu.Card;


public class ClanCard {

    enum Color {
        
        Blue, Brown, Green, Red, Purple, Yellow;

        private static final Color[] colors = Color.values();
        public static Color getColor(int i) {
            return Color.colors[i];
            
        }
            
    }

    enum Strength {

        One, Two, Three, Four, Five, Six, Seven, Eight, Nine;

        private static Strength[] strengths = Strength.values();
        public static Strength getStrength(int i) {
            return Strength.strengths[i];
        }
    }
    
    //attributes of a card object:
    private final Color color;
    private final Strength strength;

    //constructor of the class
    public ClanCard(Color color, Strength strength) {
        this.strength = strength;
        this.color = color;
    }

    public String toString() {
        return color + "_" + strength;
    }

    
}
