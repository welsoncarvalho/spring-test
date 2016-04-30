package br.com.test.service;

import br.com.test.model.Group;

import java.util.List;

/**
 * Created by welson on 30/04/16.
 */
public interface GroupService {

    void save(Group group);

    List<Group> list();

    Group loadById(Long id);

}
