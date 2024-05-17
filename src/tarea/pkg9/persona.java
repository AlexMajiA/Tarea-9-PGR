/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg9;

/**
 *
 * @author amjpa
 */
public class persona {
    
    //atributos de la clase
    private int codigo;
    private String nombre;
    private int id_localizacion;
    private int id_manager;

    //Cosntructores.
    public persona() {
    }

    public persona(int codigo, String nombre, int id_localizacion, int id_manager) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.id_localizacion = id_localizacion;
        this.id_manager = id_manager;
    }

    //Setter y Getter.
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_localizacion() {
        return id_localizacion;
    }

    public void setId_localizacion(int id_localizacion) {
        this.id_localizacion = id_localizacion;
    }

    public int getId_manager() {
        return id_manager;
    }

    public void setId_manager(int id_manager) {
        this.id_manager = id_manager;
    }
    
    
    
}
