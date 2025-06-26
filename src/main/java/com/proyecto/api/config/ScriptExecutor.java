package com.proyecto.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;

@Component
public class ScriptExecutor implements CommandLineRunner {

    @Autowired
    private DataSource dataSource;

    @Override
    public void run(String... args) throws Exception {
        try (Connection connection = dataSource.getConnection()) {
            System.out.println("🚀 Ejecutando scripts SQL...");
            ScriptUtils.executeSqlScript(connection, new ClassPathResource("sql/1_esquema_base.sql"));
            ScriptUtils.executeSqlScript(connection, new ClassPathResource("sql/2_datos_iniciales.sql"));
            System.out.println("✅ Scripts SQL ejecutados correctamente.");
        } catch (Exception e) {
             System.out.println("⚠️ Los datos ya están en la base de datos. No se insertarán de nuevo.");
        }
    }
}
