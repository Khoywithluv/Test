package DTO;

public class CategoryDTO {
    private int maTL;
    private String tenTL;

    public CategoryDTO(){}

    public CategoryDTO(int id, String name) {
        this.maTL = id;
        this.tenTL = name;
    }

    public int getMaTL() {
        return maTL;
    }

    public void setMaTL(int maTL) {
        this.maTL = maTL;
    }

    public String getTenTL() {
        return tenTL;
    }

    public void setTenTL(String tenTL) {
        this.tenTL = tenTL;
    }

}
