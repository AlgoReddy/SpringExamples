package com.algoreddy.database;

import javax.sql.DataSource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import lombok.extern.java.Log;

@SpringBootApplication
@Log   // This generates: private static final Logger logger = Logger.getLogger(DatabaseApplication.class.getName());
public class DatabaseApplication implements CommandLineRunner {
    private final DataSource dataSource;

    public DatabaseApplication(final DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(DatabaseApplication.class, args);
    }

    @Override
    public void run(final String... args) {
        // Use 'logger' (not 'log') because @Log generates a variable named 'logger'
        logger.info("datasource: " + dataSource.toString());

        final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.execute("SELECT 1");
        logger.info("Query executed successfully ✅");
    }
}
