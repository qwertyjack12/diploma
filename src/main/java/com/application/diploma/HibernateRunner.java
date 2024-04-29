package com.application.diploma;

import com.application.diploma.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Timestamp;

public class HibernateRunner {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();

        configuration.addAnnotatedClass(Users.class);
        configuration.addAnnotatedClass(Status.class);
        configuration.addAnnotatedClass(Categories.class);
        configuration.addAnnotatedClass(Fixed_assets.class);
        configuration.addAnnotatedClass(Material_resources.class);
        configuration.addAnnotatedClass(Fixed_assets_status.class);

        try(SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession()){

            session.beginTransaction();
            Fixed_assets fixed_assets = Fixed_assets.builder()
                    .pk_inventory_number("111")
                    .factory_number("facnum")
                    .auditory("a.3430")
                    .name("name")
                    .model("model")
                    .cost(77777)
                    .annotation("adawdawdawdf")
                    .photo("path/to/photo")
                    .fk_category(2)
                    .build();

            session.save(fixed_assets);
            session.getTransaction().commit();
//            Status status = Status.builder()
//                    .status("What")
//                    .date_of_change(new Timestamp(System.currentTimeMillis()))
//                    .build();
//            session.save(status);
//            session.getTransaction().commit();

            System.out.println("Record added successfully");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
