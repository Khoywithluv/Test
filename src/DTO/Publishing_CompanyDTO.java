package DTO;

public class Publishing_CompanyDTO {
    private String id;
    private String name;
    private String email;
    private String representation;

    public Publishing_CompanyDTO(){}

    public Publishing_CompanyDTO(String id, String name, String email, String representation){
        this.id = id;
        this.name = name;
        this.email = email;
        this.representation = representation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRepresentation() {
        return representation;
    }

    public void setRepresentation(String representation) {
        this.representation = representation;
    }


}
