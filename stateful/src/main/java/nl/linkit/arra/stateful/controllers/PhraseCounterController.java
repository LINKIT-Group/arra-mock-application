package nl.linkit.arra.stateful.controllers;

import nl.linkit.arra.stateful.exceptions.ResourceNotFoundException;
import nl.linkit.arra.stateful.models.PhraseCounter;
import nl.linkit.arra.stateful.services.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhraseCounterController {

    private final PhraseService phraseService;

    @Autowired
    public PhraseCounterController(PhraseService phraseService) {
        this.phraseService = phraseService;
    }

    @GetMapping("/phrases/{phraseId}/count")
    PhraseCounter getPhraseCount(@PathVariable Integer phraseId) {
        if (phraseId == null) {
            throw new ResourceNotFoundException();
        }
        return phraseService.getPhraseCounter(phraseId);
    }
}
