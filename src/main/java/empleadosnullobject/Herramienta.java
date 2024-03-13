/*  La Clase Abstracta Herramienta.java implementa una variable (nombre) y dos métodos (isNull y 
    getNombre). Las clases Coder y NoHerramienta extienden de Herramienta y sobrescriben los 
    métodos
 */
package empleadosnullobject;

/**
 *
 * @author Robinson Concha
 */
public abstract class Herramienta {
    protected String nombre;
    public abstract boolean isNull();
    public abstract String getNombre();
    
}
