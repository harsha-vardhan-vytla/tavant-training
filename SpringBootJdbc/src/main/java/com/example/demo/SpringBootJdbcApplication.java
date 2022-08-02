package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner{

   @Autowired
   private JdbcTemplate jdbcTemplate;
   public static void main(String[] args) {
       SpringApplication.run(SpringBootJdbcApplication.class, args);
   }

   @Override
   public void run(String... args) throws Exception {
       // TODO Auto-generated method stub
       String sql = "INSERT INTO stud (id, name) VALUES ("
               + "2, 'xyz')";
               int rows = jdbcTemplate.update (sql);
               if (rows > 0) {
               System.out.println ("One row inserted.");  
   }

}
}
