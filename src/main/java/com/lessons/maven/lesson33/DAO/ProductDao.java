//package com.lessons.maven.lesson33.DAO;
//
//import com.lessons.maven.lesson33.jpa.Product;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.TypedQuery;
//import jakarta.persistence.criteria.CriteriaBuilder;
//import jakarta.persistence.criteria.CriteriaQuery;
//import jakarta.persistence.criteria.Predicate;
//import jakarta.persistence.criteria.Root;
//
//import java.util.List;
//
//public class ProductDao {
//    private EntityManager entityManager;
//
//    public ProductDao(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//    public List<Product>allProducts(){
//        TypedQuery<Product> query = entityManager.createNamedQuery("get_all",Product.class);
//        TypedQuery<Product> query1 = entityManager.createQuery("select prod from Product prod ",Product.class);
//        TypedQuery<Product> query2 = (TypedQuery<Product>) entityManager.createNativeQuery("select * from tb_products ",Product.class);
//        List<Product>products = query.getResultList();
//        return products;
//    }
//    public Product productByTitle(String title){
//        TypedQuery<Product> query = entityManager.createNamedQuery("get_all_by_title", Product.class);
//        query.setParameter("title_param", title);
//        Product product = query.getSingleResult();
//        //Criteria API
//
//        CriteriaBuilder criteriaBuilder =entityManager.getCriteriaBuilder();
//        CriteriaQuery<Product> criteriaQuery = criteriaBuilder.createQuery(Product.class);
//        //From
//        Root<Product> root = criteriaQuery.from(Product.class);
//        //Where
//        Predicate condition = criteriaBuilder.equal(root.get("title"),title);
//        criteriaQuery.select(root).where(condition);
//        TypedQuery<Product> queryCriteria = entityManager.createQuery(criteriaQuery);
//        Product productCreteria = queryCriteria.getSingleResult();
//
//        return product;
//    }
//}
