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
public class Coder extends Herramienta{
    
  public Coder(String nombre)  {
  this.nombre = nombre;
  }  
  
  @Override
  public String getNombre(){
  return nombre;
  }
  
  @Override
  public boolean isNull() {
   return false;
  
  } 
}
