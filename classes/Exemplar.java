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
 * Classe que conterá os dados específicos e distintos dos exemplares.
 * 
 */
public abstract class Exemplar {
    
    /** Variável: Codigo de cadastro interno. */
    private int codCatalografico;
    /** Variável: Número de edição do exemplar. */
    private int edicao;
    /** Variável: Data de publicação do exemplar. */
    private int dataPublicacao;
    /** Variável: Nome dano como título do exemplar. */
    private String titulo;
    /** Variável: De que tipo, genero ou categoria o exemplar se encaixa. */
    private String genero;
    /** Variável: Editora do exemplar. */
    private String editora;
    /** Variável: Idiona do exemplar. */
    private String idioma;
    /** Variável: Status do exemplar, ou seja, emprestado ou não à algum usuário. */
    private boolean status;

    /** Método: Recupera via Get o valor da variável codCatalografico. */
    public int getCodCatalografico() {
        return this.codCatalografico;
    }

    /** Método: Recupera via Get o valor da variável edicao. */
    public int getEdicao() {
        return this.edicao;
    }

    /** Método: Recupera via Get o valor da variável dataPublicacao. */
    public int getDataPublicacao() {
        return this.dataPublicacao;
    }

    /** Método: Recupera via Get o valor da variável titulo. */
    public String getTitulo() {
        return this.titulo;
    }

    /** Método: Recupera via Get o valor da variável genero. */
    public String getGenero() {
        return this.genero;
    }

    /** Método: Recupera via Get o valor da variável editora. */
    public String getEditora() {
        return this.editora;
    }

    /** Método: Recupera via Get o valor da variável idioma. */
    public String getIdioma() {
        return this.idioma;
    }

    /** Método: Recupera via Get o valor da variável status. */
    public boolean getStatus() {
        return this.status;
    }

    /** Método: Insere via Set o valor da variavel codCatalografico. */
    public void setCodCatalografico(int codCatalografico) {
        this.codCatalografico = codCatalografico;
    }

    /** Método: Insere via Set o valor da variavel codCatalografico. */
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    /** Método: Insere via Set o valor da variavel edicao. */
    public void setDataPublicacao(int dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    /** Método: Insere via Set o valor da variavel titulo. */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /** Método: Insere via Set o valor da variavel genero. */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /** Método: Insere via Set o valor da variavel editora. */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /** Método: Insere via Set o valor da variavel idioma. */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /** Método: Insere via Set o valor da variavel status. */
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    /** Constructor: Construtor default, sem inicialização das vriárveis. */
    public Exemplar() {

    }
    
    /** Constructor: Construtor com todos os atributos inicializados. */
    public Exemplar( int codCatalografico, int edicao, int dataPublicacao, String titulo, String genero, String editora , String idioma, boolean status ) {
        super();

        this.codCatalografico = codCatalografico;
        this.edicao = edicao;
        this.dataPublicacao = dataPublicacao;
        this.titulo = titulo;
        this.genero = genero;
        this.editora = editora;
        this.idioma = idioma;
        this.status = status;
        
    }
    
}
