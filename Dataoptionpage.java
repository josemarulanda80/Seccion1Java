/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dataoptionpage;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Dataoptionpage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String cadena;
    int entero;
    char letra;
    double decimal;
    
    cadena= JOptionPane.showInputDialog("Digite una cadena: ");
    entero= Integer.parseInt(JOptionPane.showInputDialog("Digite un número entero: "));
    letra=  JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
    decimal=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero decimal: "));
    
    JOptionPane.showMessageDialog(null, "La cadena: "+ cadena);
    JOptionPane.showMessageDialog(null, "El numero entero es: "+entero);
    JOptionPane.showMessageDialog(null, "El caracter es: "+letra);
    JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
    
    
    }
}

