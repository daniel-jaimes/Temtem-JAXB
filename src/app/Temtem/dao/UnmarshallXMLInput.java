package dao;

import model.Player;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;

public class UnmarshallXMLInput {
    public UnmarshallXMLInput(){}
    public void init(){
        try {
            JAXBContext context = JAXBContext.newInstance(Player[].class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Player[] players = (Player[]) unmarshaller.unmarshal(new File("files/entrada.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
