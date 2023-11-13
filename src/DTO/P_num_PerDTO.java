package DTO;

public class P_num_PerDTO {
    private String id;
    private String p_number;

    public P_num_PerDTO(){}

    public P_num_PerDTO(String id, String p_number){
        this.id = id;
        this.p_number = p_number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_number() {
        return p_number;
    }

    public void setP_number(String p_number) {
        this.p_number = p_number;
    }

    
}
