package DTO;

import java.sql.Date;

public class EmployeeDTO {
    private String maNV;
    private String hoTen;
    private Date ngaySinh;

    public EmployeeDTO(){}

    public EmployeeDTO(String id, String name, Date dob){
        this.maNV = id;
        this.hoTen = name;
        this.ngaySinh = dob;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}