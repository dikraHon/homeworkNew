public class Author extends Book {
    public String name;
    public int age;

    public Author(String nameBook, String authorBook, int yearPublications) {
        super(nameBook, authorBook, yearPublications);
        this.name = nameBook;
        this.age = yearPublications;
    }
}
