import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableAutoConfiguration
@ComponentScan(basePackages = {"controller", "service", "dao", "model", "listener"})
@EnableMongoRepositories({"repository"})
public class Application {
    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }
}
