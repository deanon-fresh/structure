public class Main {
    public static void main(String[] args) {

        Book book = new Book(new Author("Лев", "Толстой", 10 ), "Война и мир",1900 , 1696);


        System.out.println("Правда ли что в книге более 500 страниц? " + book.isBig());
        System.out.println(book.matches("Лев"));
        System.out.println("Стоимость книги составит: " + book.estimatePrice() + " рублей.");
    }
}
