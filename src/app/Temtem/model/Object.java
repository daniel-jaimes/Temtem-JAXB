package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="objeto")
@XmlType(propOrder = {"nombre", "cantidad"})
public class Object {
    private String name;
    private int quantity;

    public Object(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    @XmlAttribute(name="nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @XmlElement(name="cantidad")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
