package com.groupeisi.m2gl.atoumane.faye.controller.api;

import com.groupeisi.m2gl.atoumane.faye.model.Palyndrome;
import com.groupeisi.m2gl.atoumane.faye.url.Constants;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin("*")
public interface PalyndromeApi {

    @PostMapping(value = Constants.ROOT,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Palyndrome> save(@RequestBody Palyndrome palyndrome);

}
