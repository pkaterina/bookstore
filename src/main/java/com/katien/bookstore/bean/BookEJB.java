package com.katien.bookstore.bean;

import com.katien.bookstore.entity.Book;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author katerina <ekaterina.pomitova@mail.ru>
 */

@Named
@Stateless
public class BookEJB implements Serializable {
    
    @PersistenceContext(unitName = "bookstore_unit")
    private EntityManager em;
    
    public Book createBook(Book book) {
        em.persist(book);
        return book;
    }
    
    public List<Book> findAllBooks() {
        return em.createNamedQuery("findAllBooks", Book.class).getResultList();
    }
    
    public Book findBookById(Long id) {
        return em.find(Book.class, id);
    }
    
}
