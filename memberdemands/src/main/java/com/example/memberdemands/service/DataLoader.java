package com.example.memberdemands.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.memberdemands.entity.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
 
@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        // Define SQL statement to create member table
        String createTableSQL = "CREATE TABLE member (" +
                                "id INT AUTO_INCREMENT PRIMARY KEY," +
                                "eid VARCHAR(255) NOT NULL," +
                                "first_name VARCHAR(255) NOT NULL," +
                                "last_name VARCHAR(255) NOT NULL," +
                                "doj DATE NOT NULL," +
                                "level VARCHAR(50) NOT NULL," +
                                "location VARCHAR(255) NOT NULL," +
                                "overall_exp INT NOT NULL," +
                                "status VARCHAR(50) NOT NULL," +
                                "skills VARCHAR(255) NOT NULL" +
                                ")";

        // Execute SQL statement to create table
        jdbcTemplate.execute(createTableSQL);

        // Define list of member objects
        List<Member> members = new ArrayList<>();
        members.add(new Member(1L, "EID1", "FirstName1", "LastName1", "2024-03-05", "Level1", "Location1", 2, "Status1", Map.of("Java", 12, "Springboot", 12, "Maven", 12)));
        members.add(new Member(2L, "EID2", "FirstName2", "LastName2", "2024-03-05", "Level2", "Location2", 4, "Status2", Map.of("Java", 10, "Springboot", 10, "Maven", 10)));
        // Add more members as needed

        // Insert predefined members
        for (Member member : members) {
            String insertSQL = "INSERT INTO member (id, eid, first_name, last_name, doj, level, location, overall_exp, status, skills) " +
                               "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            jdbcTemplate.update(insertSQL, member.getId(), member.getEid(), member.getFirstName(), member.getLastName(), member.getDoj(),
                                 member.getLevel(), member.getLocation(), member.getOverallExp(), member.getStatus(), member.getSkills().toString());
        }
    }
}

