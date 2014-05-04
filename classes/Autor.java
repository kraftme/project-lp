/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

/**
 *
 * @author Jony Fernando Schulz < Tia: 31336256 >
 * 
 * Classe com dados excusivos do autor do livro.
 * 
 */
class Autor extends Pessoa {

	/** Variável: Bibliografia do autor. */
	private String bibliografia;

	/** Método: Recupera via Get o valor da variável bibliografia. */
	public String getBibliografia() {
	    return this.bibliografia;
	}

	/** Método: Insere via Set o valor da variavel bibliografia. */
	public void setBibliografia(String bibliografia) {
	    this.bibliografia = bibliografia;
	}

    
}
