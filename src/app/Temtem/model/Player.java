package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;

@XmlRootElement(name="jugador")
@XmlType(propOrder = {"id", "name", "discharged", "objects", "temtems"})
public class Player {
    @XmlAttribute(name="id")
    private String id;
    @XmlElement(name="nombre")
    private String name;
    @XmlElement(name="alta")
    private Discharged discharged;
    @XmlElementWrapper(name="objetos")
    @XmlElement(name="objeto")
    private ArrayList<Object> objects;
    @XmlElementWrapper(name="temtems")
    @XmlElement(name="temtem")
    private ArrayList<Temtem> temtems;
    public Player() {}
    public Player(String id, String name, Discharged discharged) {
        this.id = id;
        this.name = name;
        this.discharged = discharged;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Discharged getDischarged(){
        return discharged;
    }

    public ArrayList<Object> getObjects() {
        return objects;
    }

    public ArrayList<Temtem> getTemtems() {
        return temtems;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", discharged=" + discharged +
                ", objectsQ=" + sumObjectsQuantities() +
                ", temtemsQ=" + temtems.size() +
                '}';

    }

    private int sumObjectsQuantities() {
        return objects.stream()
                .mapToInt(o -> Integer.parseInt(o.getQuantity()))
                .sum();
    }

}
