
package com.backendap.argentinaprograma.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreSkills;
    private int percent;
    private String img;
    
    //Constructores

    public Skills() {
    }

    public Skills(String nombreSkills, int percent, String img) {
        this.nombreSkills = nombreSkills;
        this.percent = percent;
        this.img = img;
    }
    
    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreSkills() {
        return nombreSkills;
    }

    public void setNombreSkills(String nombreSkills) {
        this.nombreSkills = nombreSkills;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
}
