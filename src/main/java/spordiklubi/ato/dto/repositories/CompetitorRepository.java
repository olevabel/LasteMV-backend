package spordiklubi.ato.dto.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import spordiklubi.ato.dto.Competitor;
import spordiklubi.ato.dto.Result;
import spordiklubi.ato.network.controller.CompetitorController;

import java.util.ArrayList;

/**
 * Created by olevabel on 7/19/16.
 */
public interface CompetitorRepository extends CrudRepository<Competitor, Long> {

    ArrayList<Competitor> findAll();

    Competitor findByFirstname(String firstname);
}
