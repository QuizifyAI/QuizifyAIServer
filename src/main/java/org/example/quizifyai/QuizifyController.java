package org.example.quizifyai;

import org.example.quizifyai.router.QuizifyAiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
public class QuizifyController {
    // logger
    private static final Logger logger = LoggerFactory.getLogger(QuizifyController.class);

    @Autowired
    private QuizifyAiService quizifyAiService;

    @GetMapping("/api/responses")
    public List<Respond> getTheResponds(){
        List<Respond> responses = new ArrayList<>();
        responses.add(new Respond("Hello, how can I assist you?", "2024-10-24T10:15:00"));
        responses.add(new Respond("Sure, I can help with that!", "2024-10-24T10:17:00"));
        responses.add(new Respond("Let me look that up for you.", "2024-10-24T10:18:00"));
        responses.add(new Respond("That seems like a common issue. Here's what you can do...", "2024-10-24T10:19:00"));
        responses.add(new Respond("Thanks for your patience, here’s what I found.", "2024-10-24T10:20:00"));

      // return (List<Respond>) quizifyAiService.greetings("Hello, how can I assist you?");
        return responses;
    }


}
