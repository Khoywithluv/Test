package DTO;

import java.sql.Date;

public class DetailDTO {
    private int id;
    private String note;
    private Date p_day;
    private int is_payed;
    private String id_Book;
    private int id_br_pay;

    public DetailDTO(){}

    public DetailDTO(int id, String note, Date p_day, int is_payed, String id_Book, int id_br_pay){
        this.id = id;
        this.note = note;
        this.p_day = p_day;
        this.is_payed = is_payed;
        this.id_Book = id_Book;
        this.id_br_pay = id_br_pay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getP_day() {
        return p_day;
    }

    public void setP_day(Date p_day) {
        this.p_day = p_day;
    }

    public int getIs_payed() {
        return is_payed;
    }

    public void setIs_payed(int is_payed) {
        this.is_payed = is_payed;
    }

    public String getId_Book() {
        return id_Book;
    }

    public void setId_Book(String id_Book) {
        this.id_Book = id_Book;
    }

    public int getId_br_pay() {
        return id_br_pay;
    }

    public void setId_br_pay(int id_br_pay) {
        this.id_br_pay = id_br_pay;
    }

}
