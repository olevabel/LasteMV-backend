package spordiklubi.ato.network.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spordiklubi.ato.dto.Result;
import spordiklubi.ato.dto.repositories.ResultRepository;

import java.util.ArrayList;


/**
 * Created by olevabel on 7/19/16.
 */
@RestController
public class ResultController {

    private ResultRepository resultRepository;

    @Autowired
    public ResultController(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/results")
    public ArrayList<Result> getResults() {
        return this.resultRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/result")
    public Result getResultById(@RequestParam(value = "competitor_id", defaultValue="15") long competitorId) {

        return this.resultRepository.findOnceByCompetitorId(competitorId);
    }
}
