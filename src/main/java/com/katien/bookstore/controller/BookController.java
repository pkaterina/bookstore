package com.katien.bookstore.controller;

import com.katien.bookstore.bean.BookEJB;
import com.katien.bookstore.entity.Book;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author katerina <ekaterina.pomitova@mail.ru>
 */

@Named
@RequestScoped
public class BookController {
    
    @Inject
    private BookEJB bookEJB;
    
    private Book book = new Book();
    
    public String doCreateBook() {
        bookEJB.createBook(book);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO, 
                        "Book created", "Book " + book.getTitle() + " was created with id  = " + book.getId()));
        return "newBook.xhtml";
    }
    
    public void doFindBookById() {
        book = bookEJB.findBookById(book.getId());
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
}
