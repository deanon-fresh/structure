public class Book {
    public String title;
    public Author author;
    public int releaseYear;
    public int pages;

    public Book (Author author, String title, int releaseYear, int pages) {
        this.author = author;
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;

    }

    public boolean isBig(){
        return pages > 500;
        }

    public int estimatePrice(){
        int price = (int)(3 * pages * Math.sqrt(author.rating));
        return Math.max(250, price);
    }

    public boolean matches(String word) {
        return title.contains(word) || author.name.contains(word) || author.surname.contains(word);
    }
}

