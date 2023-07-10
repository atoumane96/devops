package com.groupeisi.m2gl.atoumane.faye.controller;

import com.groupeisi.m2gl.atoumane.faye.controller.api.PalyndromeApi;
import com.groupeisi.m2gl.atoumane.faye.model.Palyndrome;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPalyndrome implements PalyndromeApi {

    @Override
    public ResponseEntity<Palyndrome> save(Palyndrome palyndrome) {

        // Supprimer les espaces et convertir en minuscules pour simplifier la vérification
        String cleanStr = palyndrome.getName().replaceAll("\\s+", "").toLowerCase();

        // Vérifier si la chaîne est un palindrome
        int length = cleanStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(length - 1 - i)) {
                ResponseEntity.ok(true);;
            }
        }
        return null;
    }
}
