package DTO;

public class RoleDTO {
    private int id;
    private int role;

    public RoleDTO(){}
    public RoleDTO(int id, int role){
        this.id = id;
        this.role = role;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getRole() {
        return role;
    }
    public void setRole(int role) {
        this.role = role;
    }

}
