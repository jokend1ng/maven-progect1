package com.lessons.maven.lesson33.jpa;

import com.lessons.maven.exams4.model.Boat;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("lesson33.jpa");
        EntityManager manager= factory.createEntityManager();
        Boat firm = new Boat();
        manager.getTransaction().begin();
        manager.getTransaction().commit();
//        Product product =new Product("title","description",Product.Category.SPORT);
//        manager.getTransaction().begin();
//        manager.persist(product);
//        manager.merge(product);
//        manager.find(Provider.class,1);
//
//
//        manager.getTransaction().commit();
////        manager.remove(product);
////        manager.detach(product);
    }
}
