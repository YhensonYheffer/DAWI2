package pe.edu.i202311582.cl1_jpa_data_gervacio_yhenson.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class ConexionesConfig {

    @Value("${DB_WORLD_URL}")
    private String dbWorldUrl;
    @Value("${DB_WORLD_USER}")
    private String dbWorldUser;
    @Value("${DB_WORLD_PASS}")
    private String dbWorldPass;
    @Value("${DB_WORLD_DRIVER}")
    private String dbWorldDriver;

    @Bean
    public HikariDataSource hikariDataSource() {
        HikariConfig config = new HikariConfig();

        /**
         * Configurar propiedad de conexión a la base de datos
         */
        config.setJdbcUrl(dbWorldUrl);
        config.setUsername(dbWorldUser);
        config.setPassword(dbWorldPass);
        config.setDriverClassName(dbWorldDriver);

        /**
         * Configurar propiedades del pool de conexiones de HikariCP
         * - MaximumPoolSize: Máximo número de conexiones en el pool.
         * - MinimumIdle: Mínimo número de conexiones inactivas.
         * - IdleTimeout: Tiempo máximo de inactividad antes de cerrar conexiones (en milisegundos).
         * - ConnectionTimeout: Tiempo máximo de espera para obtener una conexión del pool (en milisegundos).
         */
        config.setMaximumPoolSize(30);
        config.setMinimumIdle(4);
        config.setIdleTimeout(240000);
        config.setConnectionTimeout(45000);

        System.out.println("###### HikariCP initialized with custom configuration ######");
        return new HikariDataSource(config);
    }


}
