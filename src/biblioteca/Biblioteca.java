/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author its
 */
public class Biblioteca {
    //se declara atributos

    private String tamaño, diseño, autor, editorial;
    private double precio;
//declarar metodo

    public void abrirLibro() {
        System.out.println("abro libro");
    }

    public void cerrarLibro() {
        System.out.println("cerrar libro");
    }

    public static void main(String[] args) {
        Biblioteca primerobjeto = new Biblioteca();
        primerobjeto.abrirLibro();
        primerobjeto.cerrarLibro();
    }
}
