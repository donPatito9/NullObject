/*  Por último, en la clase cliente HerramientaNullObject.java se instancia y envia el string con la 
    herramienta, para verificar si existe o no entregando resultado.
 */
package empleadosnullobject;

/**
 *
 * @author Robinson Concha
 */
public class HerramientaNullObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Herramienta herr1 = HerramientaData.getHerramienta("Martillo");
        Herramienta herr2 = HerramientaData.getHerramienta("Taladro");
        Herramienta herr3 = HerramientaData.getHerramienta("Alicate");
        Herramienta herr4 = HerramientaData.getHerramienta("Sierra");
        Herramienta herr5 = HerramientaData.getHerramienta("Huincha");
        //Herramienta herr6 = HerramientaData.getHerramienta("Destornillador");
        
        System.out.println(herr1.getNombre());
        System.out.println(herr2.getNombre());
        System.out.println(herr3.getNombre());
        System.out.println(herr4.getNombre());
        System.out.println(herr5.getNombre());
        //System.out.println(herr6.getNombre());
    } 
}
