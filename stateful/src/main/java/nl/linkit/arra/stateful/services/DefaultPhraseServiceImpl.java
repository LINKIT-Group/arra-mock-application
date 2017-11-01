package nl.linkit.arra.stateful.services;

import nl.linkit.arra.stateful.models.PhraseCounter;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class DefaultPhraseServiceImpl implements PhraseService {

    private ConcurrentMap<Integer, AtomicInteger> couterStore = new ConcurrentHashMap<>();

    @Override
    public PhraseCounter getPhraseCounter(int phraseId) {
        couterStore.putIfAbsent(phraseId, new AtomicInteger(0));
        return new PhraseCounter(phraseId, couterStore.get(phraseId).incrementAndGet());
    }
}
