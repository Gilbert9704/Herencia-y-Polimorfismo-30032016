/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciapolimorfismo;

/**
 *
 * @author Estudiante
 */
public class TeachMode implements Mode0 {

    @Override
    public void work(){
        System.out.println("Teach");
    }
    
    @Override
    public void drink(){
        System.out.println("Water");
    }
    
}
