package model;

import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name="alta")
public class Discharged {
    @XmlAttribute(name="ciudad")
    private String city;
    @XmlValue
    private String dischargeDate;
    public Discharged(){

    }
    public Discharged(String city, String dischargeDate){
        this.city = city;
        this.dischargeDate = dischargeDate;
    }

    public String getCity() {
        return city;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    @Override
    public String toString() {
        return "Discharged{" +
                "city='" + city + '\'' +
                ", dischargeDate='" + dischargeDate + '\'' +
                '}';
    }
}
