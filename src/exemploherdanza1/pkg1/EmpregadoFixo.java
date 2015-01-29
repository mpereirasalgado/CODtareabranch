package exemploherdanza1.pkg1;


/**@author Administrador*/
public class EmpregadoFixo extends Traballador 
{
    //atributos
    private int antiguedade;
    //constructores
    public EmpregadoFixo() 
    {
        
    }

    public EmpregadoFixo(String nome, float soldo, int antiguedade) 
    {
        super(nome,soldo);
        this.antiguedade = antiguedade;
    }
    //metodos
    public int getAntiguedade() {
        return antiguedade;
    }

    public void setAntiguedade(int antiguedade) {
        this.antiguedade = antiguedade;
    }
    
    public float calcularAnti()
    {
        return 30*antiguedade;
    }
    //sobreescribo o metodo calcular soldo
    @Override
    public float calcularSoldo()
    {
        return(super.calcularSoldo()+this.calcularAnti());
    }
    
    @Override
    public String visualizarDato()
    {
        return (super.visualizarDato()+" Antiguedade "+antiguedade+" Soldo Final : "+this.calcularSoldo());
    }
    @Override
    public void amosarTipoTraballador()
    {
        System.out.println("son empregados fixos");
    }
}
