package com.company;

public class App {
    public static void main(String[] args) {
        Book book1 = new Book("О скитаньях вечных и о Земле ", 1988);
        Book book2 = new Book("Собор парижской богоматери ", 2011);
        Author author1 = new Author("Рей Бредбери ");
        Author author2 = new Author("Виктор Гюго ");
        book1.setPublishingYear(1987);
        System.out.println("book1 = " + book1.getBookName() + book1.getPublishingYear() + " author1 = " + author1.getAuthor());
        System.out.println("book2 = " + book2.getBookName() + book2.getPublishingYear() + " author2 = " + author2.getAuthor());
    }
}
