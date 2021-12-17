package model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Objeto")
@XmlType(propOrder = {"nombre", "cantidad"})
public class Object {
    private String name;
    private int quantity;

    public Object(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}
