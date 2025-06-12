public class Main {
    public static void main(String[] args) {

        Book book = new Book("Война и мир", 2005/*,"Толстой Лев" */, 1696);

        Author author = new Author("Лев", "Толстой", 8);

        System.out.println("Правда ли что в книге более 500 страниц? " + book.isBig());
        System.out.println(book.matches("лев"));
        System.out.println("Стоимость книги составит: " + book.estimatePrice() + " рублей.");
    }
}