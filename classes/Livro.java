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
 * Classe e/ou entidade onde englobará, respectivamente, uma lista de todos os
 * livros comuns e seus exemplares que pertencem ao catalógo da biblioteca.
 * 
 */
public class Livro extends Exemplar {
    
    /** Variável: Sinopse sintetizando o assunto do livro. */
    private String sinopse;
    /** Variável: Autor do livro. */
    private Autor autor;

    /** Método: Recupera via Get o valor da variável sinopse. */
    public String getSinopse() {
        return this.sinopse;
    }

    /** Método: Recupera via Get o valor da variável autor. */
    public Autor getAutor() {
        return this.autor;
    }

    /** Método: Insere via Set o valor da variavel sinopse. */
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    /** Método: Insere via Set o valor da variavel autor. */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    /** Constructor: Construtor default. */
    public Livro() {

    }

    /** Constructor: Construtor com todos os atributos inicializados. */
    public Livro(String sinopse, Autor autor) {
        this.sinopse = sinopse;
        this.Autor = autor;
    }


}
