/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac2;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Examen {
    
    public static void main(String[] args) {
       
        int r=0;
       
        while (r!=3) {
              r= Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion: \n\n 1)Agregar Producto \n 2)Calcular Todo \n 3)Salir "));
        switch (r) {
            case 1:
              
              int n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos ingresara"));
                
               String productos[]=new String[n]; 
               int cantidad[]=new int[n];
               double precio[]=new double[n];
                
                for (int i = 0; i < n; i++) {
                    
                    productos[i]=JOptionPane.showInputDialog("Ingrese el producto "+(i+1)+": ");
                    cantidad[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de producto "));
                    precio[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
                    
                    
                }
                
                for (int i = 0; i < n; i++) {
                    
                    JOptionPane.showMessageDialog(null, "Producto \n "+productos[i]+ "\nCantidad \n "+cantidad[i]+"\nPrecio \n "+precio[i] );
                    
                }
                
                break;
             
            case 2:
                
            
                
                
                
                break;
            
        }   
        }    
    }
    
}
