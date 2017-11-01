package nl.linkit.arra.stateful.services;

import nl.linkit.arra.stateful.models.PhraseCounter;

public interface PhraseService {
    PhraseCounter getPhraseCounter(int phraseId);
}
