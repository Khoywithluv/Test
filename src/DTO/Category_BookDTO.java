package DTO;

public class Category_BookDTO {
    private int id_Cate;
    private String id_Book;

    public Category_BookDTO(){}

    public Category_BookDTO(int Cate, String Book){
        this.id_Cate = Cate;
        this.id_Book = Book;
    }

    public int getId_Cate() {
        return id_Cate;
    }

    public void setId_Cate(int id_Cate) {
        this.id_Cate = id_Cate;
    }

    public String getId_Book() {
        return id_Book;
    }

    public void setId_Book(String id_Book) {
        this.id_Book = id_Book;
    }
}
