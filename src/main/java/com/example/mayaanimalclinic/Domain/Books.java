package com.example.mayaanimalclinic.Domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
   private String book_name;
   private int book_num;

   @ManyToOne
   private Publisher publisher;

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", book_name='" + book_name + '\'' +
                ", book_num=" + book_num +
                ", publisher=" + publisher +
                '}';
    }

    public Books() {

    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Books books = (Books) o;

        return id == books.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    public String getBook_name() {
        return book_name;
    }

    public Books(String book_name, int book_num, Publisher publisher) {
        this.book_name = book_name;
        this.book_num = book_num;
        this.publisher = publisher;
    }

    public Books(String book_name, int book_num) {
        this.book_name = book_name;
        this.book_num = book_num;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getBook_num() {
        return book_num;
    }

    public void setBook_num(int book_num) {
        this.book_num = book_num;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    @ManyToMany
    @JoinTable(name ="author_book", joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "author_id"))
   private Set<Author> authors = new HashSet<>();
}
