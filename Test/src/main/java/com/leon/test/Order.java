package com.leon.test;

import java.util.Collection;
import java.util.LinkedHashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * An order.
 */
@Entity
@Table(name = "T_ORDER")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customer;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ORDER_ID")
    private Collection<Item> items = new LinkedHashSet<Item>();

    /**
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer
     *            the customer to set
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * @return the items
     */
    public Collection<Item> getItems() {
        return items;
    }

    /**
     * @param items
     *            the items to set
     */
    public void setItems(Collection<Item> items) {
        this.items = items;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    // hhh
    
    public static void main(String[] args) {
        System.out.println("master");
        System.out.println("test3");
        System.out.println("master merge");
        System.out.println("test4 merge");
        System.out.println("master test5 reb");
        System.out.println("test5 reb");
        System.out.println("test6 mer");
        System.out.println("test6 master");
        System.out.println("good commit");
    }

}
