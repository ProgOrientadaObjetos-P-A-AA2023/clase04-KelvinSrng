/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Ejecutor02 {
    
    public static void main(String[] args) {
        // 1. Crear una persona de Barrio el Valle de la ciudad de Loja
        Ciudad ciudad1 = new Ciudad("Loja");
        Barrio barrio1 = new Barrio("Valle", ciudad1);
        
        Persona persona = new Persona("Kelvin", "1648251948",barrio1);
        
        System.out.printf("El barrio de la persona %s (%s) es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona.obtenerNombre(),
                persona.obtenerCedula(),
                persona.obtenerBarrio().obtenerNombre(),
                persona.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        
        
        // 2. Crear una persona del Barrio Central de la ciudad de Cuenca
        Ciudad ciudad2 = new Ciudad("Cuenca");
        Barrio barrio2 = new Barrio("Barrio Central", ciudad2);
        
        Persona persona1 = new Persona("Andres", "357486159",barrio2);
        
        System.out.printf("El barrio de la persona %s (%s) es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona1.obtenerNombre(),
                persona1.obtenerCedula(),
                persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        
        
        // 3. Crear una persona del Barrio Centenario de la ciuda de Guayaquil
        Ciudad ciudad3 = new Ciudad("Guayaquil");
        Barrio barrio3 = new Barrio("Barrio Centenario", ciudad3);
        
        Persona persona2 = new Persona("Juan", "321456657",barrio3);
        
        System.out.printf("El barrio de la persona %s (%s) es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona2.obtenerNombre(),
                persona2.obtenerCedula(),
                persona2.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
    }
}
