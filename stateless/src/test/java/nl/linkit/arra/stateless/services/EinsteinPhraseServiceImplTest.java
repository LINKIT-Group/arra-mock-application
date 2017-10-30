package nl.linkit.arra.stateless.services;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class EinsteinPhraseServiceImplTest {

    private final PhraseService einsteinPhraseService = new EinsteinPhraseServiceImpl();

    @Test
    public void getRandomPhrase() throws Exception {
        assertNotNull("A phrase should be a null", einsteinPhraseService.getRandomPhrase());
    }

}