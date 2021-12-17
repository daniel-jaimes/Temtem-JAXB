package model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;

@XmlRootElement(name="jugador")
@XmlType(propOrder = {"id", "nombre", "ciudad", "alta"})
public class Player {
    private int id;
    private String name;
    private String city;
    private Date dischargeDate;
    ArrayList<Object> objects;
    ArrayList<Temtem> temtems;

    public Player(int id, String name, String city, Date dischargeDate,
                  ArrayList<Object> objects, ArrayList<Temtem> temtems) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.dischargeDate = dischargeDate;
        this.objects = objects;
        this.temtems = temtems;
    }
    @XmlAttribute(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @XmlElement(name="nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @XmlElement(name="alta")
    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }
    @XmlElementWrapper(name="objetos")
    public ArrayList<Object> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<Object> objects) {
        this.objects = objects;
    }
    @XmlElementWrapper(name="temtems")
    public ArrayList<Temtem> getTemtems() {
        return temtems;
    }

    public void setTemtems(ArrayList<Temtem> temtems) {
        this.temtems = temtems;
    }

}
