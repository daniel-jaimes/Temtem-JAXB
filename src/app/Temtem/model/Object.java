package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="objeto")
@XmlType(propOrder = {"name", "quantity"})
public class Object {
    @XmlAttribute(name="name")
    private String name;
    @XmlElement(name="cantidad")
    private String quantity;
    public Object(){

    }
    public Object(String name, String quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Object{" +
                "name='" + name + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
