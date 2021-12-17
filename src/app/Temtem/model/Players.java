package model;

import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

@XmlRootElement(name="jugadores")
public class Players {
    @XmlElement(name="jugador")
    private ArrayList<Player> players;

    public Players() {};

    public Players(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
}
