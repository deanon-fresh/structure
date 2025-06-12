public class Book {
    public String title;
    public int releaseYear;
    //public String author; // под редактирование
    public Author surname;
    public Author name;
    public Author rating;
    public int pages;

    public Book (String title,int releaseYear, /*String author, */ int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        //this.author = author;
        this.pages = pages;
    }


    public boolean isBig(){
        if (pages > 500 ) {
            return true;
        } else {
            return false;
        }
        }

    public int estimatePrice(){
        int y = (int) Math.floor(Math.sqrt(rating));
        int x = (int) ((pages * 3) * y);
        if (x > 250) {
            return x;
        } else {
            x = 250;
            return x;
        }
    }

    public boolean matches(String word) {
        if (title.contains(word)) {
            return true;
        } else if (surname.surname.contains(word)) { // почему дважды?
            return true;
        } else if (name.name.contains(word)) {
            return true;
        } else {
            return false;
        }
    }
}

