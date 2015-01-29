package exemploherdanza1.pkg1;


/**@author Administrador*/
public class EmpregadoTemporal extends Traballador 
{
    public EmpregadoTemporal()
    {
        
    }
    public EmpregadoTemporal(String nome, float soldo)
    {
        super(nome,soldo);
    }
    @Override
    public void amosarTipoTraballador()
    {
        System.out.println("son empregados  temporais");
    }
}
