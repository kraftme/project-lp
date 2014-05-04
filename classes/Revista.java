/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

/**
 *
 * @author Jony Fernando Schulz < Tia 31336256 >
 * 
 * Classe e/ou entidade onde englobará, respectivamente, uma lista de todos as
 * revistas comuns e seus exemplares que pertencem ao catalógo da biblioteca.
 * 
 */
public class Revista extends Exemplar {
    
    /** Variável: Número de reportagens da revista. */
    protected int reportagens;
    /** Variável: Edições da revista. */
    protected int numero;

	/** Método: Recupera via Get o valor da variável reportagens. */
    public int getReportagens() {
        return this.reportagens;
    }

	/** Método: Recupera via Get o valor da variável numero. */
    public int getNumero() {
        return this.numero;
    }

	/** Método: Insere via Set o valor da variavel reportagens. */
    public void setReportagens(int reportagens) {
        this.reportagens = reportagens;
    }

	/** Método: Insere via Set o valor da variavel numero. */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /** Constructor{Revista}: Construtor default, sem inicialização das vriárveis. */
    public Revista() {}

    /** Constructor{Revista}: Construtor com todos os atributos inicializados. */
    public Revista(int reportagens, int numero) {
        this.reportagens = reportagens;
        this.numero = numero;
    }

    
}
