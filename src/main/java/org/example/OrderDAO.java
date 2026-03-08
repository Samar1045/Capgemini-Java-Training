package org.example;

import jakarta.persistence.*;

public class OrderDAO {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("customerPU");

    EntityManager em = emf.createEntityManager();

    public Order fetchOrderById(int id){

        return em.find(Order.class,id);
    }

    public void updateOrder(int id,double price){

        em.getTransaction().begin();

        Order order = em.find(Order.class,id);
        order.setPrice(price);

        em.getTransaction().commit();
    }
}