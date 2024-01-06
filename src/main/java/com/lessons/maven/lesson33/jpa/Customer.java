//package com.lessons.maven.lesson33.jpa;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.JoinTable;
//import jakarta.persistence.ManyToMany;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//public class Customer extends User {
//    @ManyToMany
//    @JoinTable(name = "tb_custoer_products",joinColumns = @JoinColumn(name = "customer",nullable = false),
//            inverseJoinColumns = @JoinColumn(name="products"))
//    private List<Product>productList = new ArrayList<>();
//}