package br.com.test.service;

import br.com.test.model.Funcionality;

import java.util.List;

/**
 * Created by welson on 25/04/16.
 */
public interface FuncionalityService {

    void save(Funcionality funcionality);

    List<Funcionality> list();

}
