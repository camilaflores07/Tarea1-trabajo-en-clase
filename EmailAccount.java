/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cclases.ejercicios;

/**
 *
 * @author 50494
 */
public class EmailAccount {
    String DireccionEmail;
    String NombreUsuario;
    Email[] inbox;
    int totalCorreos;

    public EmailAccount(String DireccionEmail, String NombreUsuario, Email[] inbox) {
        this.DireccionEmail = DireccionEmail;
        this.NombreUsuario = NombreUsuario;
        this.inbox = new Email[100];
    }
    
    public void recibirEmail(Email em){
        for (int i = 0; i < inbox.length; i++) {
            if (inbox == null) {
                inbox[i] = em;
                System.out.println("Correo recibido en: " + i);
                return;   
            } 
        }
        System.out.println("Correo lleno");
    }
    
    public void printInbox() {
    System.out.println("La dirección es: " + DireccionEmail + "\nEl nombre es: " + NombreUsuario);

    int correosLeidos = 0;
    int correosNoLeidos = 0;

    for (int i = 0; i < inbox.length; i++) {
        if (inbox[i] != null) { 
            if (inbox[i].isSeen()) {
                correosLeidos++;
            } else {
                correosNoLeidos++;
            }
            System.out.println((i + 1) + " - " + inbox[i].getGuardarCorreoEmisor() + " - " + inbox[i].getAsunto() + " - " + (inbox[i].isSeen() ? "LEÍDO" : "SIN LEER"));
        }
    }
    System.out.println("\nCorreos sin leer: " + correosNoLeidos);
    System.out.println("Total de correos recibidos: " + (correosLeidos + correosNoLeidos));
}
    public void LeerInbox(int pos){
        int i = pos -1;
        
        if (i < 0 || i >= inbox.length || inbox[i] == null) {
            System.out.println("Correo No Existe");
            return;
    }
         System.out.println("Emisor: " + inbox[i].getGuardarCorreoEmisor());
         System.out.println("Asunto: " + inbox[i].getAsunto());
         inbox[i].print();

    }
    
    public void BorrarLeidos(){
        for (int i = 0; i < inbox.length; i++) {
        if (inbox[i] != null && inbox[i].isSeen()) {
            inbox[i] = null;
        }
    }
    System.out.println("Todos los corrreos leidos estan eliminados.");
        
    }
    
    
}
