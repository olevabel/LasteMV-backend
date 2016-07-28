package spordiklubi.ato.network.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spordiklubi.ato.dto.Competitor;
import spordiklubi.ato.dto.repositories.CompetitorRepository;

import java.util.ArrayList;

/**
 * Created by olevabel on 7/19/16.
 */
@RestController
public class CompetitorController {

    private Logger log = LoggerFactory.getLogger(CompetitorController.class);
    private CompetitorRepository competitorRepository;

    @Autowired
    public CompetitorController(CompetitorRepository competitorRepository) {
        this.competitorRepository = competitorRepository;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/competitors")
    public ResponseEntity<Competitor> addCompetitor(@RequestBody Competitor competitor) {
        log.info("inserted competitor " + competitor.toString());
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        competitorRepository.save(competitor);
        return new ResponseEntity<>(competitor, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/competitors")
    public ArrayList<Competitor> getCompetitors() { return this.competitorRepository.findAll();}
}
