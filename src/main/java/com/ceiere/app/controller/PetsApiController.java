package com.ceiere.app.controller;

import com.ceiere.app.model.Error;
import com.ceiere.app.model.Pet;
import com.ceiere.app.model.Pets;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-08T17:59:56.553+08:00[Asia/Taipei]")
@Controller
public class PetsApiController implements PetsApi {

    private static final Logger log = LoggerFactory.getLogger(PetsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PetsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> createPets() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pets> listPets(@ApiParam(value = "How many items to return at one time (max 100)") @Valid @RequestParam(value = "limit", required = false) Integer limit
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Pets>(objectMapper.readValue("[ {\n  \"name\" : \"name\",\n  \"id\" : 0,\n  \"tag\" : \"tag\"\n}, {\n  \"name\" : \"name\",\n  \"id\" : 0,\n  \"tag\" : \"tag\"\n} ]", Pets.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Pets>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Pets>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pet> showPetById(@ApiParam(value = "The id of the pet to retrieve",required=true) @PathVariable("petId") String petId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Pet>(objectMapper.readValue("{\n  \"name\" : \"name\",\n  \"id\" : 0,\n  \"tag\" : \"tag\"\n}", Pet.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Pet>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Pet>(HttpStatus.NOT_IMPLEMENTED);
    }

}
