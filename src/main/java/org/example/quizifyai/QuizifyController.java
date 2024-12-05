package org.example.quizifyai;

import org.example.quizifyai.model.Respond;
import org.example.quizifyai.router.QuizifyAiService;
import org.example.quizifyai.service.RespondsServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuizifyController {
    // logger
    private static final Logger logger = LoggerFactory.getLogger(QuizifyController.class);


    @Autowired
    private QuizifyAiService quizifyAiService;

    @Autowired
    private RespondsServiceImp respondsServiceImp;

    @GetMapping("/api/responses")
    public Respond getTheResponds() {
        Random random = new Random();
        int index = random.nextInt(respondsServiceImp.getTheResponds().size());
        return respondsServiceImp.getTheResponds().get(index);

    }

    @PostMapping("/api/question/{text}")
    public Respond getResponse(@PathVariable("text") String text) {
        return quizifyAiService.greetings().block();
    }


}
