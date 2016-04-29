package br.com.test.service;

import br.com.test.model.Functionality;

import java.util.List;

/**
 * Created by welson on 25/04/16.
 */
public interface FunctionalityService {

    void save(Functionality functionality);

    List<Functionality> list();

    Functionality loadById(Long id);

}
