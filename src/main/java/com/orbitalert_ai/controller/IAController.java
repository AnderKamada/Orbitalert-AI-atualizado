package com.orbitalert_ai.controller;

import com.orbitalert_ai.dto.AnaliseRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.*;

@Tag(
        name = "Inteligência Artificial",
        description = "Análise de riscos climáticos com Spring AI e Ollama"
)
@RestController
@RequestMapping("/ia")
public class IAController {

    private final ChatClient chatClient;

    public IAController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @Operation(
            summary = "Analisa risco climático",
            description = "Utiliza modelo LLM local via Ollama para gerar uma análise textual"
    )
    @PostMapping("/analisar")
    public String analisar(@RequestBody AnaliseRequest request){

        return chatClient.prompt()
                .user("""
                        Analise o seguinte risco climático:

                        %s

                        Retorne uma análise objetiva.
                        """.formatted(request.descricao()))
                .call()
                .content();
    }
}