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
public class WriteMode extends Mode {
    
    @Override
    public void work(){
        System.out.println("Write");
    }
    
    @Override
    public void drink(){
        System.out.println("Coffee");
    }
    
}
