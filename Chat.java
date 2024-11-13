/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatbot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Chat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        List<Chatbot> chatbots = new ArrayList<>();
        
        System.out.println("Qual o tipo de chatbot voce deseja adicionar?");
        System.out.println("1 - Chat Educacional?");
        System.out.println("2 - Chat Financeiro?");
        System.out.println("3 - Chat Entreterimento?");
        System.out.println("Por favor, escolha uma opcao ou apenas tecle 0 para sair");
        int entrada = sc.nextInt();
        sc.nextLine();
           
            switch(entrada){
                case 1:
                    chatbots.add(new ChatbotEducacional());
                    break;
                case 2:
                    chatbots.add(new ChatbotFinanceiro());
                    break;
                case 3:
                    chatbots.add(new ChatbotEntretenimento());
                    break;
                default:
                    System.out.println("Opcao invalida. tente novamente!");
                    return;
            }
            

        for (Chatbot chatbot : chatbots){
            chatbot.cumprimentar();
            chatbot.responderPergunta("O que voce faz ? ");
            chatbot.finalizarConversa();
            System.out.println();
            
        }
        
        sc.close();
    }
}
