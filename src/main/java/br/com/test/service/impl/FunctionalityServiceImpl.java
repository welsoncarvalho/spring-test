package br.com.test.service.impl;

import br.com.test.dao.FunctionalityRepository;
import br.com.test.model.Functionality;
import br.com.test.service.FunctionalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by welson on 25/04/16.
 */
@Service("functionalityService")
public class FunctionalityServiceImpl implements FunctionalityService {

    @Autowired
    private FunctionalityRepository functionalityRepository;

    public void save(Functionality functionality) {
        functionalityRepository.save(functionality);
    }

    public List<Functionality> list() {
        return functionalityRepository.findAll();
    }

    public Functionality loadById(Long id) {
        return functionalityRepository.findOne(id);
    }
}
