/*
    La clase HerramientaData.java guarda en una variable las herramientas disponibles y a travez del 
    método getHerramientas comprueba si la herramienta ingresada existe o no y devuelve el nombre 
    o un el mensaje codificado en NoHerramienta.
 */
package empleadosnullobject;

/**
 *
 * @author Robinson Concha
 */
public class HerramientaData {
    public static final String[] nombres = {"Martillo", "Alicate", "Huincha"};
    
    public static Herramienta getHerramienta(String nombre) {
      for(int i = 0; i < nombres.length; i++){
          if(nombres[i].equalsIgnoreCase(nombre)){
          return new Coder(nombre);
          }
      
      }
      return new NoHerramienta();
    }
}
