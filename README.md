# OrbitalAlert AI

Microserviço de Inteligência Artificial desenvolvido para o ecossistema OrbitalAlert.

A solução utiliza Spring AI integrado ao Ollama para executar modelos de linguagem localmente e gerar análises automáticas sobre riscos climáticos.

## Tecnologias

- Java 21
- Spring Boot 3.5
- Spring AI
- Ollama
- Llama 3.2
- Maven
- Swagger/OpenAPI

## Funcionalidades

- Análise automática de riscos climáticos
- Geração de recomendações utilizando IA
- Integração com modelos LLM locais
- API REST documentada com Swagger

## Endpoint Principal

POST /ia/analisar

Exemplo:

```json
{
  "descricao": "Temperatura acima de 40 graus com risco de enchente"
}
