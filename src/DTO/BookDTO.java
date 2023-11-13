package DTO;

public class BookDTO {
    private String maSach;
    private String tenSach;
    private int p_Year;
    private int soLuong;
    private String id_pc;

    public BookDTO(){}

    public BookDTO(String maSach, String tenSach, int p_Year, int soLuong, String id_pc){
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.p_Year = p_Year;
        this.soLuong = soLuong;
        this.id_pc = id_pc;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getP_Year() {
        return p_Year;
    }

    public void setP_Year(int p_Year) {
        this.p_Year = p_Year;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getId_pc() {
        return id_pc;
    }

    public void setId_pc(String id_pc) {
        this.id_pc = id_pc;
    }

    
}
