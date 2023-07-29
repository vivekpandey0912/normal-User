package com.vivek.bej.usermodule.domain;

import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Objects;
public class Book {

    @MongoId
    private String bookId;
    private String title;
    private String ISBN;
    private String bookImage;
    private String yearOfPublication;
    private Author author;
    private Genre genre;

    public Book(String bookId, String title, String ISBN, String bookImage, String yearOfPublication, Author author, Genre genre) {
        this.bookId = bookId;
        this.title = title;
        this.ISBN = ISBN;
        this.bookImage = bookImage;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
        this.genre = genre;
    }

    public Book() {
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookId, book.bookId) && Objects.equals(title, book.title) && Objects.equals(ISBN, book.ISBN) && Objects.equals(bookImage, book.bookImage) && Objects.equals(yearOfPublication, book.yearOfPublication) && Objects.equals(author, book.author) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, ISBN, bookImage, yearOfPublication, author, genre);

    }

    @Override
    public String toString() {
        return "com.vivek.bej.usermodule.domain.Book{" +
                "bookId='" + bookId + '\'' +
                ", title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", bookImage='" + bookImage + '\'' +
                ", yearOfPublication='" + yearOfPublication + '\'' +
                ", author=" + author +
                ", genre=" + genre +
                '}';
    }
}

