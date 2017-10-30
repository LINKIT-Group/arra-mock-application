package nl.linkit.arra.stateless.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Phrase {
    private int id;
    private String text;
}
