/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatbot;

import java.util.Scanner;

public class ChatbotEducacional extends Chatbot {

    Scanner sc = new Scanner(System.in);
    
    @Override
    public void cumprimentar() {
        System.out.println("Ola, que bom te-lo de volta!");
    }
    
    @Override
    public void responderPergunta(String pergunta) {
        this.pergunta = pergunta;
       // pergunta = sc.nextLine();
        System.out.println("Sua pergunta: " + pergunta);
        System.out.println("Sou um chat de interacao com humanos! respondo perguntas sobre questoes educacionais ");
    }

    @Override
    public void finalizarConversa() {
        System.out.println("Ainda estou aprendendo com minhas interacoes com os humanos, em breve estarei evoluido!");
    }
}
