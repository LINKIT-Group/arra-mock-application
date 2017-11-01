package nl.linkit.arra.stateful.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PhraseCounter {
    int id;
    int count;
}
