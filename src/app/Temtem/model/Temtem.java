package model;

import java.util.ArrayList;

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
}
