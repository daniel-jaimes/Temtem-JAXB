package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="atributo")
@XmlType(propOrder = {"id", "atributo",})
public class Atribute {
    private int id;
    private int value;

    public Atribute(int id, int value) {
        this.id = id;
        this.value = value;
    }
    @XmlAttribute(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @XmlAttribute(name="atributo")
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
