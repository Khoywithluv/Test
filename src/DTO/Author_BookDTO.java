package DTO;

public class Author_BookDTO {
    private String id_Author;
    private String id_Book;

    public Author_BookDTO(){}

    public Author_BookDTO(String id_author, String id_book){
        this.id_Author = id_author;
        this.id_Book = id_book;
    }

    public String getId_Author() {
        return id_Author;
    }

    public void setId_Author(String id_Author) {
        this.id_Author = id_Author;
    }

    public String getId_Book() {
        return id_Book;
    }

    public void setId_Book(String id_Book) {
        this.id_Book = id_Book;
    }
}
