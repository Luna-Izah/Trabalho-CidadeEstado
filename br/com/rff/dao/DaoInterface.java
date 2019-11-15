package br.com.rff.dao;

import br.com.rff.contracts.ICriteria;
import java.util.ArrayList;

/**
 *
 * @author RENATO
 */
public interface DaoInterface {
    
    //Retorna uma lista de objetos conforme 
    
    public ArrayList <Object> getByCriterios(ICriteria c);
    
    //salvar um objeto qualquer
    //o
    public void salvar (Object o);
    
    //remove um objeto qualquer
    //o
    public void remover(Object o);
    
    //retorna um objeto pelo id
    //id id do objeto
    public Object getById(long id);
    
}
