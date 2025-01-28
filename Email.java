/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cclases.ejercicios;

/**
 *
 * @author 50494
 */
public class Email {
    private String GuardarCorreoEmisor;
    private String asunto;
    private String contenido;
    private boolean seen;

    public Email(String GuardarCorreoEmisor, String asunto, String contenido) {
        this.GuardarCorreoEmisor = GuardarCorreoEmisor;
        this.asunto = asunto;
        this.contenido = contenido;
        this.seen = false;
    }

    public String getGuardarCorreoEmisor() {
        return GuardarCorreoEmisor;
    }

    public String getAsunto() {
        return asunto;
    }

    public boolean isSeen() {
        return seen;
    }
    
    public boolean Leido(){
        if (seen == true) {
            System.out.println("El correo ha sido visto");
            return true;
        }
        return false;
    }
    
    public void print(){
      System.out.println("DE " + GuardarCorreoEmisor + "\nASUNTO: " + asunto + "\n" + contenido);
    }
}
