package com.gbcreation.app.demo.liquibase;

import liquibase.integration.spring.SpringLiquibase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Slf4j
@Profile("test")
public class LiquibaseTest {

    //TODO GBE. sert a rien si par spring boot. class a mettre dans package normal et mettre le profil ou un test lors recup datasource
    private static final String LIQUIBASE_CHANGELOG_FILE = "classpath:liquibase-changelog.sql";
    private static final String LIQUIBASE_CONTEXT = "integrationtest";

    @Autowired
    private DataSource dataSource;

    @Bean
    public SpringLiquibase liquibase() {
        SpringLiquibase liquibase = new SpringLiquibase();

        log.info("Verifying database integrity");
        liquibase.setDataSource(dataSource);
        liquibase.setChangeLog(LIQUIBASE_CHANGELOG_FILE);
        liquibase.setContexts(LIQUIBASE_CONTEXT);

        return liquibase;
    }
}
