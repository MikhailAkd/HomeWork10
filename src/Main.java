public class Main {
    public static void main(String[] args) {
        Author authorOne = new Author( "Александр ", "Сергеевич ", "Пушкин");
        Author authorTwo = new Author( "Михаил ", "Юрьевич ", "Лермонтов");

        Book bookOne = new Book ("Сказка о рыбаке и рыбке", authorOne, 1833);
        Book bookTwo = new Book ("Герой нашего времени", authorTwo, 1840);

        bookTwo.setYear(1843);

        System.out.println("Список книг: ");
        System.out.println("Наименование: " + bookOne.getName() + ". Автор: " + bookOne.getAuthor().authorNameFull() + ". Год издания: " + bookOne.getYear());
        System.out.println("Наименование: " + bookTwo.getName() + ". Автор: " + bookTwo.getAuthor().authorNameFull() + ". Год издания: " + bookTwo.getYear());
    }
}