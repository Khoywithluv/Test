package DTO;

public class AuthorDTO {
    private String maDG;
    private String HoTen;
    private String Note;

    public AuthorDTO(){}

    public AuthorDTO(String id, String name, String Note){
        this.maDG = id;
        this.HoTen = name;
        this.Note = Note;
    }

    public String getMaDG() {
        return maDG;
    }

    public void setMaDG(String maDG) {
        this.maDG = maDG;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

}
