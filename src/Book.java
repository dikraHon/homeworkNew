public class Book {

    public String nameBook;
    private String authorBook;
    private int yearPublications;

    public Book(String nameBook, String authorBook, int yearPublications){
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.yearPublications = yearPublications;
    }

    public void enterInformation(){
        System.out.println("Name book: " + nameBook + "\nAuthor: " + authorBook + "\nyear publication: " + yearPublications);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.nameBook.equals(((Book) obj).nameBook) && this.authorBook.equals(((Book) obj).authorBook)){
            return true;
        } else {
            return false;
        }
    }
}
