package DTO;

public class UserDTO {
    private int id;
    private String username;
    private String pass;
    private String id_em;
    private int id_role;

    public UserDTO(){}

    public UserDTO(int id, String username, String pass, String id_em, int id_role){
        this.id = id;
        this.username = username;
        this.pass = pass;
        this.id_em = id_em;
        this.id_role = id_role;
    }

    public UserDTO(String username, String password){
        this.username = username;
        this.pass = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getId_em() {
        return id_em;
    }

    public void setId_em(String id_em) {
        this.id_em = id_em;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }
    
}
