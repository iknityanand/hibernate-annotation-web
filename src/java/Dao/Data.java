/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import com.model.Vendors;
import org.hibernate.Session;
import org.hibernate.*;  
import org.hibernate.cfg.*;  

/**
 *
 * @author Vineet
 */
public class Data {
    private Session session;
    private Vendors vendors;
    private HibernateUtil helper;
    
    public void addVendor(){
        vendors=new Vendors("Captiain littlewood co ltd");
        session=helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(vendors);
        session.close();
    }
    
}
