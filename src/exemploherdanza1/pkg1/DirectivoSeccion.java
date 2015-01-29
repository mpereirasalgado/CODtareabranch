/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploherdanza1.pkg1;

/**
 *
 * @author mpereirasalgado
 */
public class DirectivoSeccion extends Directivo
{

    public DirectivoSeccion() 
    {
        
    }

    public DirectivoSeccion(String nome, float soldo, float dietas) 
    {
        super(nome, soldo, dietas);
    }
    @Override
    public void amosarTipoTraballador()
    {
        System.out.println("son directivos de seccion");
    }
}
