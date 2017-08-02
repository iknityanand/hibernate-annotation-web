/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import com.model.Articles;
import com.model.Category;
import org.hibernate.Session;
import org.hibernate.*;  
import org.hibernate.cfg.*;  

/**
 *
 * @author Vineet
 */
public class Data {
    private Session session;
    private HibernateUtil helper;
    
    public void addArticles(){
        session=helper.getSessionFactory().openSession();
        session.beginTransaction();
        Category c=new Category();
        c.setName("Self-help");
        session.save(c);
        session.getTransaction().commit();
        session.beginTransaction();
        
        Articles a=new Articles();
        a.setTitle("1 Extraodinary");
        a.setDescription("1 Extraodinary People do Extraordinary things");
        a.setCategory(c);
        session.save(a);
        Articles a2=new Articles();
        a2.setTitle("2 Extraodinary again");
        a2.setDescription("2 odinary People do Extraordinary things");
        a2.setCategory(c);
        session.save(a2);
//        c.getArticles().add(a);
        session.getTransaction().commit();
        session.close();
    }
    
}
