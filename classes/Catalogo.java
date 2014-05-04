/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jony Fernando Schulz
 * Tia: 31336256
 * 
 * Classe que representa um catálogo de exemplares.
 * Um catálogo contém várias especificações de exemplares.
 * 
 */
public class Catalogo implements Searchable {
    
    /**  */
    public List<Exemplar> searchTitle(String q) {
        List<Exemplar> resultado = new ArrayList<Exemplar>();
        
        /** Usar Iterator para juntar as informações entre os exemplares. */
        for( Exemplar j : this.exemplares ){
            if( j.getTitulo().EqualsIgnoreCase(q) ){
                resultado.add(j);
            }//por no main uma validacao quando o array tiver vazio
            return resultado;
        }
        return null;
    }

    /**  */
    public List<Exemplar> searchAvailable(String q) {
            return null;
            //throw  new NotImplementedException();
    }
    
}
