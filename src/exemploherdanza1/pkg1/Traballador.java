package exemploherdanza1.pkg1;


/**@author Administrador*/
public abstract class Traballador 
{
    //atributos
    private String nome;
    private float soldo;
    //constructores

    /**
     *
     */
    public Traballador() {
    }

    /**
     *
     * @param nome
     * @param soldo
     */
    public Traballador(String nome, float soldo) {
        this.nome = nome;
        this.soldo = soldo;
    }

    /**
     *
     * @return
     */
    public String getNome() 
    {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public float getSoldo() 
    {
        return soldo;
    }

    /**
     *
     * @param soldo
     */
    public void setSoldo(float soldo) 
    {
        this.soldo = soldo;
    }

    /**
     *
     * @return
     */
    public String visualizarDato() 
    {
        return "Traballador " +nome+ " " +soldo+ "€";
    }

    /**
     *
     * @return
     */
    public float calcularSoldo()
    {
        return soldo;
    }
    //metodo abstracto

    /**
     *
     */
        public abstract void amosarTipoTraballador();
    
    
    
}
