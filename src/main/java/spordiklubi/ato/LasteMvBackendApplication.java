package spordiklubi.ato;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import spordiklubi.ato.dto.Competitor;
import spordiklubi.ato.dto.Result;
import spordiklubi.ato.dto.repositories.CompetitorRepository;
import spordiklubi.ato.dto.Referee;
import spordiklubi.ato.dto.repositories.RefereeRepository;
import spordiklubi.ato.dto.repositories.ResultRepository;

@SpringBootApplication
public class LasteMvBackendApplication {

    private static final Logger log = LoggerFactory.getLogger(LasteMvBackendApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LasteMvBackendApplication.class, args);

    }

    @Bean
    public CommandLineRunner demo(ResultRepository resultRepository, CompetitorRepository competitorRepository) {
        return (args) -> {
            resultRepository.deleteAll();
            competitorRepository.deleteAll();
            competitorRepository.save(new Competitor("Olev", "Abel", 23, "M", "Käru", "+37253308299", "olevabel@gmail.com", 0));
            competitorRepository.save(new Competitor("Mari", "Maasikas", 13, "N", "Käru", "+37253308299", "olevabel@gmail.com", 0));
            competitorRepository.save(new Competitor("Paavo", "Vaarikas", 3, "M", "Vigala", "+37253303499", "pvaarikas@gmail.com", 0));

            resultRepository.save(new Result(competitorRepository.findByFirstname("Olev").getId(), "20", "4.34", "X.X", "14.35", "6", "1.23:32", "12", "3", "1.34:43", "X.X"));
            resultRepository.save(new Result(competitorRepository.findByFirstname("Mari").getId(), "18", "4.34", "X.X", "14.35", "6", "X.X", "12", "3", "1.34:43", "X.X"));
            resultRepository.save(new Result(competitorRepository.findByFirstname("Paavo").getId(), "14", "4.34", "X.X", "14.35", "6", "1.23:32", "12", "3", "1.34:43", "X.X"));
        };
    }


}
