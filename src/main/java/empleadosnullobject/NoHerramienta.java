/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadosnullobject;

/**
 *
 * @author Robinson Concha
 */
public class NoHerramienta extends Herramienta {
    
    @Override
    public String getNombre() {
    return "No Existe Herramienta";
    }
    
    @Override
    public boolean isNull(){
    return true;
    }
}
