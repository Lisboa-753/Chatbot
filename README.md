# Chatbot

Descrição
Este projeto implementa um sistema de chatbot capaz de responder de maneira personalizada com base no tipo de chatbot escolhido. Cada chatbot é especializado em uma área específica e fornece respostas contextuais.

## Estrutura do Projeto

Classe Base
Chatbot: Classe abstrata que define os métodos:
responderPergunta(String pergunta): Responde a uma pergunta recebida.
cumprimentar(): Exibe uma saudação.
finalizarConversa(): Método abstrato para encerrar a conversa de forma específica para cada chatbot.

Classes Derivadas
ChatbotEducacional: Responde a perguntas com informações educacionais.
ChatbotFinanceiro: Responde a perguntas sobre investimentos e economia.
ChatbotEntretenimento: Responde a perguntas sobre entretenimento (filmes, jogos, etc).

## Programa Principal
O programa principal solicita ao usuário o tipo de chatbot que deseja cadastrar, cria uma lista de instâncias para cada tipo, e executa um loop para chamar cumprimentar() e responderPergunta("O que você faz?") para cada chatbot.

## Extra
Cada chatbot implementa finalizarConversa() para encerrar a interação de forma única, adaptada ao seu contexto.

## Executando o Projeto
Escolha o tipo de chatbot.
O chatbot responde com saudações e informações contextuais.
Encerre a conversa com o método finalizarConversa().
Tecnologias
Linguagem: Java (exemplo de implementação orientada a objetos)
