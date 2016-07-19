package spordiklubi.ato.dto.repositories;

import org.springframework.data.repository.CrudRepository;
import spordiklubi.ato.dto.Competitor;

/**
 * Created by olevabel on 7/19/16.
 */
public interface CompetitorRepository extends CrudRepository<Competitor, Long> {
    Competitor findByFirstname(String firstname);
}
