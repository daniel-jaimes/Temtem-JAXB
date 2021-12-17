package dao;

import javax.xml.bind.JAXBContext;
import model.Player;
import model.Players;


import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;

public class UnmarshallXMLInput {
    private Players players;
    public UnmarshallXMLInput(){}
    public ArrayList<Player> getPlayers() {
        try {
            JAXBContext context = JAXBContext.newInstance(Players.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            players = (Players) unmarshaller.unmarshal(new File("files/entrada.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        if(players == null) System.out.println("ERROR MARSHALLING");
        else {
            return players.getPlayers();
        }
        return null;
    }
}
