package unc.gl.st.api_jeu.Game;

import java.time.Instant;

public class GameOptions {
    private Instant created;
    private String name;

    public GameOptions(Instant created, String name) {
        this.created = created;
        this.name = name;
    }

    public Instant getCreated() {
        return created;
    }
    public String getName() {
        return name;
    }
}
