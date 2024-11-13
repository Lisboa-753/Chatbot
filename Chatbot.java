/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatbot;

/**
 *
 * @author Gabriel
 */
public abstract class Chatbot {
    protected String pergunta;
 
    public abstract void responderPergunta(String pergunta);
    
    public abstract void cumprimentar ();
    
    public abstract void finalizarConversa();

  
}
