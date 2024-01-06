//package com.lessons.maven.lesson33.jpa;
//
//import jakarta.persistence.*;
//
//import java.util.ArrayList;
//import java.util.List;
//@NamedQuery(name="get_all", query ="Select prod from Product prod")
//@NamedQuery(name="get_all_by_title", query ="Select prod from Product prod where title = :title_param")
//@Entity
//@Table(name = "tb_products")
//public class Product {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    private String title;
//    @Column(nullable = false, length = 1000)
//    private String description;
//    @Enumerated(value = EnumType.STRING)
//    @Column(name = "product_category", nullable = false)
//    private Category category;
//
//    public Product(String title, String description, Category category) {
//        this.title = title;
//        this.description = description;
//        this.category = category;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "provider_name", nullable = false)
//    private Provider provider;
//    @ManyToMany(mappedBy ="productList")
//    private List<Customer> customerList = new ArrayList<Customer>();
//
//    public Product() {
//    }
//
//    public enum Category {
//        SPORT, HOME, STUDY
//    }
//}
//
