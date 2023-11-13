package DTO;

import java.sql.Date;

public class Reader_ChildrenDTO {
    private String id;
    private String name;
    private String img;
    private Date dob;
    private String id_adult;

    public Reader_ChildrenDTO(){}

    public Reader_ChildrenDTO(String id, String name, String img, Date dob, String id_adult){
        this.id = id;
        this.name = name;
        this.img = img;
        this.dob = dob;
        this.id_adult = id_adult;
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

    public String getId_adult() {
        return id_adult;
    }

    public void setId_adult(String id_adult) {
        this.id_adult = id_adult;
    }

    
}
