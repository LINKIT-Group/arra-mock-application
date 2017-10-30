package nl.linkit.arra.stateless.controllers;

import nl.linkit.arra.stateless.models.Phrase;
import nl.linkit.arra.stateless.services.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EinsteinController {

    private final PhraseService phraseService;

    @Autowired
    public EinsteinController(PhraseService phraseService) {
        this.phraseService = phraseService;
    }

    @GetMapping("/phrases/random")
    Phrase getPhrase(){
        return phraseService.getRandomPhrase();
    }

}
