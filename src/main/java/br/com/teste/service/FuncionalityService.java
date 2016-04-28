package br.com.teste.service;

import br.com.teste.model.Funcionality;

import java.util.List;

/**
 * Created by welson on 25/04/16.
 */
public interface FuncionalityService {

    void save(Funcionality funcionality);

    List<Funcionality> list();

}
