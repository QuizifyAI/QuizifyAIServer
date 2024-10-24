package org.example.quizifyai;

public class Respond {
    private String text;
    private String timestamp;

    // Constructor
    public Respond(String text, String timestamp) {
        this.text = text;
        this.timestamp = timestamp;
    }

    // Getters and Setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
