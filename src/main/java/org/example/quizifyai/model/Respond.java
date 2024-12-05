package org.example.quizifyai.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Respond {
    private String text;
    private String timestamp;

    // Constructor
    public Respond(String text, String timestamp) {
        this.text = text;
        this.timestamp = timestamp;
    }

}
