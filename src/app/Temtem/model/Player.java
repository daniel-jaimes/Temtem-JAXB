package model;

import java.util.ArrayList;
import java.util.Date;

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
}
