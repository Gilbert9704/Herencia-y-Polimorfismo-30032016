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
public class Scientist {

    private Mode mode;
    
    public Scientist() {
        mode = new WriteMode();
    }
   
    //Lo que hace el cientifico
    public void doing(){
        mode.work();
    }
    
    public void drink(){
        mode.drink();
    }
    
    //cambia los modos del metodo
    public void setWrite(){
        mode = new WriteMode();
    }
    /*
    public void setTeach(){ Si no implemento Mode0 puedo quitar esto como comentario
        mode = new TeachMode(); 
    }
    */
    public void setAdministrate(){
        mode = new AdmMode();
    }
    
    public static void main(String[] args){
        Scientist einstein = new Scientist();
        einstein.doing();
        //einstein.setTeach();
        einstein.doing();
    }
}
