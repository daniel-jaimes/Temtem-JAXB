package model;

import javax.xml.bind.annotation.*;

@XmlType(propOrder = {"id"})
public class Atribute {
    @XmlAttribute(name="id")
    private String id;
    @XmlValue
    private String value;

    public Atribute(){

    }
    public Atribute(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Atribute{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
