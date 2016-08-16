package spordiklubi.ato.network.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spordiklubi.ato.dto.Competitor;
import spordiklubi.ato.dto.repositories.CompetitorRepository;

import java.util.*;

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
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
        return new ResponseEntity<>(competitor, headers, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/competitors")
    public ResponseEntity<ArrayList<Competitor>> getCompetitors() {
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
        return new ResponseEntity<>(this.competitorRepository.findAll(), headers, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/competitors")
    public ResponseEntity<Competitor> editCompetitor(@RequestBody Competitor competitor) {
        log.info("editCompetitor " + competitor.toString());
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        competitorRepository.save(competitor);
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
        return new ResponseEntity<>(competitor, headers, HttpStatus.OK);
    }
}
