package com.company;

public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Рей ", "Бредбери ");
        Author author2 = new Author("Виктор ", "Гюго");
        Book book1 = new Book("О скитаньях вечных и о Земле ", 1988, author1);
        Book book2 = new Book("Собор парижской богоматери ", 2011, author2);
        book1.setPublishingYear(1987);
        System.out.println("book1 = " + book1.getBookName() + book1.getPublishingYear() + " author1 = " + author1.getFirstName() + author1.getLastName());
        System.out.println("book2 = " + book2.getBookName() + book2.getPublishingYear() + " author2 = " + author2.getFirstName() + author2.getLastName());
    }
}
