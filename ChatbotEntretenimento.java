/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatbot;

/**
 *
 * @author Gabriel
 */
public class ChatbotEntretenimento extends Chatbot {

    @Override
    public void cumprimentar() {
        System.out.println("Ola, que bom te-lo de volta!");
    }
    
    @Override
    public void responderPergunta(String pergunta) {
        this.pergunta = pergunta;
       // pergunta = sc.nextLine();
        System.out.println("Sua pergunta: " + pergunta);
        System.out.println("Sou um chat de interacao com humanos, respondo perguntas sobre questoes de entretenimento! ");
    }

    @Override
    public void finalizarConversa() {
        
    }
    
}
