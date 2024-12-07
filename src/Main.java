//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Петя", "Табуретник");
        Author author2 = new Author("Афанасий", "Восемьнасемь");

        Book book1 = new Book("Просто книга", author1, 1902);
        Book book2 = new Book("Непросто книга", author2, 1782);

        System.out.println(book1.getTitle() + " написана в " + book1.getPublicationYear() + "г." + " Автор " + book1.getAuthor().getName() + " " + book1.getAuthor().getLastName());
        System.out.println(book2.getTitle() + " написана в " + book2.getPublicationYear() + "г." + " Автор " + book2.getAuthor().getName() + " " + book2.getAuthor().getLastName());
    }
}