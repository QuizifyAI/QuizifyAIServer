package org.example.quizifyai.router;

import org.example.quizifyai.Respond;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class QuizifyAiService {
    private WebClient webClient;

    public QuizifyAiService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8080").build();
    }


    public Mono<Respond> greetings(String text) {
        return this.webClient.get().uri("/api/responses",text)
                .retrieve()
                .bodyToMono(Respond.class);

    }

}
