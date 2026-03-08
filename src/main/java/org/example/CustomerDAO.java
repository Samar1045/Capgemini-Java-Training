package org.example;

import jakarta.persistence.*;
import java.util.List;

public class CustomerDAO {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("customerPU");

    EntityManager em = emf.createEntityManager();

    public void insertCustomer(Customer customer){

        em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();

        System.out.println("Customer inserted");
    }


    public Customer fetchCustomerById(int id){

        return em.find(Customer.class,id);
    }

    public List<Customer> fetchAllCustomers(){

        return em.createQuery("SELECT c FROM Customer c",
                Customer.class).getResultList();
    }

    public void updateCustomer(int id,String name){

        em.getTransaction().begin();

        Customer c = em.find(Customer.class,id);
        c.setCustomerName(name);

        em.getTransaction().commit();
    }

    public void deleteCustomer(int id){

        em.getTransaction().begin();

        Customer c = em.find(Customer.class,id);
        em.remove(c);

        em.getTransaction().commit();
    }

    //JPQL query
    public Customer findCustomerByEmail(String email){

        return em.createQuery(
                        "SELECT c FROM Customer c WHERE c.email=:email",
                        Customer.class)
                .setParameter("email",email)
                .getSingleResult();
    }
}