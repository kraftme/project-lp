/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import classes.Exemplar;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Jony Fernando Schulz < Tia 31336256 >
 * 
 * Interface.
 * 
 */
public interface Searchable {
    public List<Exemplar> searchTitle(String q);
    public List<Exemplar> searchDatePublic(Calendar data);
    public List<Exemplar> searchAuthor(String q);
    public List<Exemplar> searchAvailable(String q);
}
