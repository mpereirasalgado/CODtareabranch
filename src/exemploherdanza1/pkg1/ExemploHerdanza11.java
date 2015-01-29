/**
 *tarea cod ramas 
 */
 
package exemploherdanza1.pkg1;

/**@author Administrador*/
public class ExemploHerdanza11 {

    public static void main(String[] args)
    {
        EmpregadoTemporal emT= new EmpregadoTemporal("aa",1000f);
        EmpregadoFixo emF= new EmpregadoFixo("bb",1000f,30);
        Directivo dir= new Directivo("cc",2000f,350f);
        Traballador traballador =new EmpregadoFixo("tt",3000f,40);
        System.out.println(emT.visualizarDato());
        System.out.println(emF.visualizarDato());
        System.out.println("hola ");
        System.out.println(dir.visualizarDato());
        System.out.println(traballador.visualizarDato());
    }
    
}
