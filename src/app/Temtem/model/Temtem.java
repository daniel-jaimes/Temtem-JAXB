package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;

@XmlRootElement(name="temtem")
@XmlType(propOrder = {"id", "name", "type", "atributes"})
public class Temtem {
    @XmlAttribute(name="id")
    private String id;
    @XmlElement(name="nombre")
    private String name;
    @XmlElement(name="tipo")
    private String type;
    @XmlElement(name="atributo")
    ArrayList<Atribute> atributes;

    public Temtem(){

    }
    public Temtem(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
        atributes = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public ArrayList<Atribute> getAtributes() {
        return atributes;
    }

    @Override
    public String toString() {
        return "Temtem{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", atributes=" + atributes +
                '}';
    }
}
