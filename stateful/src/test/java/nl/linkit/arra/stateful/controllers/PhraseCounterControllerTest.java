package nl.linkit.arra.stateful.controllers;


import nl.linkit.arra.stateful.services.DefaultPhraseServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class PhraseCounterControllerTest {

    public static final String PHRASE_ID = "999";
    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new PhraseCounterController(new DefaultPhraseServiceImpl())).build();
    }

    @Test
    public void getPhraseCount() throws Exception {
        mockMvc.perform(get("/phrases/" + PHRASE_ID + "/count").contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.id").exists())
                .andExpect(jsonPath("$.id", is(Integer.parseInt(PHRASE_ID))))
                .andExpect(jsonPath("$.count").exists())
                .andExpect(jsonPath("$.count", is(1)));

        mockMvc.perform(get("/phrases/" + PHRASE_ID + "/count").contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.id").exists())
                .andExpect(jsonPath("$.id", is(Integer.parseInt(PHRASE_ID))))
                .andExpect(jsonPath("$.count").exists())
                .andExpect(jsonPath("$.count", is(2)));
    }

    @Test
    public void getPhaseCountForNull() throws Exception {
        mockMvc.perform(get("/phrases//count").contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isNotFound());
    }
}