package spordiklubi.ato.database;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by olevabel on 7/21/16.
 */
@Configuration
public class CustomDataSource {

    @Bean
    public DataSource dataSource() {
        try {
            String password = "";
            URI uri = new URI(System.getenv("DATABASE_URL"));
            String[] userinfo = uri.getUserInfo().split(":");
            String username = uri.getUserInfo().split(":")[0];
            if (userinfo.length > 1) {
                password = userinfo[1];
            }
            String dbUrl = System.getenv("JDBC_DRIVER") + uri.getHost() + ":" + uri.getPort() + uri.getPath();
            return new DriverManagerDataSource(dbUrl, username, password);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }
}
