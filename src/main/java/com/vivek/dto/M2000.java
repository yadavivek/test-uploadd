package com.vivek.dto;

import javax.persistence.*;

/**
 * Created by ttnd on 3/10/16.
 */


@Entity
@Table(name = "m2000")
public class M2000 {


    @Id
    @GeneratedValue
    @Column(name = "pnum")
    Integer pnum;

    @Column(name = "status")
    String status;

    @Column(name = "race")
    Integer race;

    @Column(name = "weight")
    Integer weight;

    @Column(name = "height")
    Integer height;

    @Column(name = "is_veg")
    Integer isVeg;



    public Integer getPnum() {
        return pnum;
    }

    public void setPnum(Integer pnum) {
        this.pnum = pnum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getRace() {
        return race;
    }

    public void setRace(Integer race) {
        this.race = race;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getIsVeg() {
        return isVeg;
    }

    public void setIsVeg(Integer isVeg) {
        this.isVeg = isVeg;
    }
}
