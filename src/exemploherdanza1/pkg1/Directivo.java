package exemploherdanza1.pkg1;


/**@author Administrador*/
public abstract class Directivo extends Traballador
{
    //atributos
    float dietas;
    //constructores
    public Directivo() 
    {
        
    }

    public Directivo(String nome, float soldo, float dietas) 
    {
        super(nome, soldo);
        this.dietas = dietas;
    }
    //metodos

    public float getDietas() {
        return dietas;
    }

    public void setDietas(float dietas) {
        this.dietas = dietas;
    }
    
    public float calcularDietas()
    {
        return dietas;
    }
    @Override
    public float calcularSoldo()
    {
        return (super.calcularSoldo()+ this.dietas);
    }
    
    @Override
    public String visualizarDato()
    {
        return ("nome : "+super.getNome()+"soldo : "+this.calcularSoldo());
    }
}
