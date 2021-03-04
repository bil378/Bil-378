package com.ITCollaboration.ITCollaboration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class ItCollaborationApplication /*implements CommandLineRunner*/ {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
//        Connection connection = null;
//        try {
//            Class.forName("org.postgresql.Driver");
//            connection = DriverManager.getConnection("jdbc:postgresql://localhost:8080/IT-Collaboration", "postgres", "password");
//            if (connection != null) {
//                System.out.println("done");
//            } else {
//                System.out.println("fail");
//            }
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
        SpringApplication.run(ItCollaborationApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        String sql = "INSERT INTO \"Temp\" (\"Email\", \"Password\") " +
//                "VALUES('nurs@gmail.com', 'nurs_nurs');";
//        int rows = jdbcTemplate.update(sql);
//        if (rows>0){
//            System.out.println("inserted");
//        }
//    }
}
