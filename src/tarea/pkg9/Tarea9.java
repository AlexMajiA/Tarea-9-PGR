/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg9;

/**
 *
 * @author amjpa
 */
public class Tarea9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        ConectorBaseDatos cn = new ConectorBaseDatos();
        
     // int resultado = cn.altas(2, "Alex", 5, 5);
        
     // System.out.println(resultado);
        
        System.out.println(cn.mostrar());
        cn.actualizar(1, "pilar", 99, 77);
        System.out.println(cn.mostrar());
        
        int j = cn.borrado(1);
         System.out.println(cn.mostrar());
    }
    
}
