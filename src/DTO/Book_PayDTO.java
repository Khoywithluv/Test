package DTO;

import java.sql.Date;

public class Book_PayDTO {
    private String id;
    private Date b_day;
    private Date p_day;
    private String id_card;
    private String id_emloyee;

    public Book_PayDTO(){}

    public Book_PayDTO(String id, Date b_day, Date p_day, String id_card, String id_employee){
        this.id = id;
        this.b_day = b_day;
        this.p_day = p_day;
        this.id_card = id_card;
        this.id_emloyee = id_employee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getB_day() {
        return b_day;
    }

    public void setB_day(Date b_day) {
        this.b_day = b_day;
    }

    public Date getP_day() {
        return p_day;
    }

    public void setP_day(Date p_day) {
        this.p_day = p_day;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getId_emloyee() {
        return id_emloyee;
    }

    public void setId_emloyee(String id_emloyee) {
        this.id_emloyee = id_emloyee;
    }
}
 