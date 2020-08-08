package com.example.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class SpringbootDataJdbcApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
      Connection connection= dataSource.getConnection();
        System.out.println(dataSource);
        System.out.println(connection);
        System.out.println("-----------------------");
        System.out.println(dataSource.getClass());
        System.out.println(connection.getClass());
    }

}
