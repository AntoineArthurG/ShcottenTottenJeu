package unc.gl.st.api_jeu.Player;

public class Player {
    private String name;

    private Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
