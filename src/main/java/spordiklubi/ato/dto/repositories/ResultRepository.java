package spordiklubi.ato.dto.repositories;

import org.springframework.data.repository.CrudRepository;
import spordiklubi.ato.dto.Result;

import java.util.ArrayList;


/**
 * Created by olevabel on 7/19/16.
 */
public interface ResultRepository extends CrudRepository<Result, Long> {

    ArrayList<Result> findAll();

    Result findOnceByCompetitorId(long competitorId);
}
