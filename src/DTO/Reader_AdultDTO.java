package DTO;

import java.sql.Date;

public class Reader_AdultDTO{
    private String id;
    private String name;
    private String img;
    private Date dob;
    private int id_card;

    public Reader_AdultDTO(){}

    public Reader_AdultDTO(String id, String name, String img, Date dob, int id_card){
        this.id = id;
        this.name = name;
        this.img = img;
        this.dob = dob;
        this.id_card = id_card;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getId_card() {
        return id_card;
    }

    public void setId_card(int id_card) {
        this.id_card = id_card;
    }
    
}