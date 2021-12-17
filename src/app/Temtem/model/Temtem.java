package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;

@XmlRootElement(name="temtem")
@XmlType(propOrder = {"id", "nombre", "tipo"})
public class Temtem {
    private int id;
    private String name;
    private String type;
    ArrayList<Atribute> atributes;

    public Temtem(int id, String name, String type, ArrayList<Atribute> atributes) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.atributes = atributes;
    }
    @XmlAttribute(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @XmlAttribute(name="nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @XmlAttribute(name="tipo")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Atribute> getAtributes() {
        return atributes;
    }

    public void setAtributes(ArrayList<Atribute> atributes) {
        this.atributes = atributes;
    }
}
