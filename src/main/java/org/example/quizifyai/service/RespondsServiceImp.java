package org.example.quizifyai.service;

import org.example.quizifyai.model.Respond;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RespondsServiceImp implements ResponsService {

    @Override
    public List<Respond> getTheResponds() {
        List<Respond> responses = new ArrayList<>();
        responses.add(new Respond("Hello, how can I assist you?", "2024-10-24T10:15:00"));
        responses.add(new Respond("Sure, I can help with that!", "2024-10-24T10:17:00"));
        responses.add(new Respond("Let me look that up for you.", "2024-10-24T10:18:00"));
        responses.add(new Respond("That seems like a common issue. Here's what you can do...", "2024-10-24T10:19:00"));
        responses.add(new Respond("Thanks for your patience, here’s what I found.", "2024-10-24T10:20:00"));

        return responses;
    }
}
