package DTO;

import java.sql.Date;

public class Library_cardDTO {
    private int id;
    private Date d_start;
    private Date d_end;
    private String note;

    public Library_cardDTO(){}

    public Library_cardDTO(int id, Date d_start, Date d_end, String note){
        this.id = id;
        this.d_start = d_start;
        this.d_end = d_end;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getD_start() {
        return d_start;
    }

    public void setD_start(Date d_start) {
        this.d_start = d_start;
    }

    public Date getD_end() {
        return d_end;
    }

    public void setD_end(Date d_end) {
        this.d_end = d_end;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    
}