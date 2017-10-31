package nl.linkit.arra.stateful.services;

import nl.linkit.arra.stateful.models.PhraseCounter;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DefaultPhraseServiceImplTest {

    public static final int PHRASE_ID = 1;
    private PhraseService phraseService = new DefaultPhraseServiceImpl();

    @Test
    public void getPhraseCounter() throws Exception {
        PhraseCounter firstCounter = phraseService.getPhraseCounter(PHRASE_ID);
        assertNotNull("A counter shouldn't be a null", firstCounter);
        assertTrue("A phrase Id the same", PHRASE_ID == firstCounter.getId());
        assertTrue("A phrase counter equals 1", 1 == firstCounter.getCount());

        PhraseCounter secondCounter = phraseService.getPhraseCounter(PHRASE_ID);
        assertNotNull("A counter shouldn't be a null", secondCounter);
        assertTrue("A phrase Id the same", PHRASE_ID == secondCounter.getId());
        assertTrue("A phrase counter equals 2", 2 == secondCounter.getCount());
    }

}