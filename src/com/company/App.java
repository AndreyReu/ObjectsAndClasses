package com.company;

public class App {
    public static void main(String[] args) {
        Author author1 = new Author(" Рей ", " Бредбери ");
        Author author2 = new Author(" Виктор ", " Гюго");
        Book book1 = new Book("О скитаньях вечных и о Земле", 1988, author1);
        Book book2 = new Book("Собор парижской богоматери", 2011, author2);
        book1.setPublishingYear(1987);
        System.out.println("book1 = " + book1.getBookName() + book1.getPublishingYear() + " author1 = " + book1.getAuthor().getLastName() + book1.getAuthor().getLastName());
        System.out.println("book2 = " + book2.getBookName() + book2.getPublishingYear() + " author2 = " + book2.getAuthor().getFirstName() + book2.getAuthor().getLastName());
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(author1.equals(author2));
        System.out.println(book1.equals(book2));
    }
}
