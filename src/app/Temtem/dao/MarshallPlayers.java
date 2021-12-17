package dao;

import model.Player;
import model.Players;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;

public class MarshallPlayers {
    private Players players;
    public MarshallPlayers(ArrayList<Player> players){
        Players p = new Players(players);
        this.players = p;
    }

    public void init() {
        try {
            JAXBContext context = JAXBContext.newInstance(Players.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(players, new File("files/salida.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
