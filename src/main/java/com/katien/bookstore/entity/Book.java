package com.katien.bookstore.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author katerina <ekaterina.pomitova@mail.ru
 */
@Entity
@NamedQuery(name = "findAllBooks", query = "SELECT b FROM Book b ORDER BY b.title desc ")
public class Book implements Serializable {
    
    @Id @GeneratedValue
    private Long id;

    @NotNull @Size(min = 4, max = 50)
    @Column(nullable = false)
    private String title;
    
    private Float price;
    
    @Column(length = 2000)
    private String description;
    
    private Integer numOfPage;
    
    private Boolean hasIllustrations;

    public Book() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumOfPage() {
        return numOfPage;
    }

    public void setNumOfPage(Integer numOfPage) {
        this.numOfPage = numOfPage;
    }

    public Boolean getHasIllustrations() {
        return hasIllustrations;
    }

    public void setHasIllustrations(Boolean hasIllustrations) {
        this.hasIllustrations = hasIllustrations;
    }

    
    
    
}
