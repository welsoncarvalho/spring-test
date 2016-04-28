package br.com.test.service.impl;

import br.com.test.dao.FuncionalityRepository;
import br.com.test.model.Funcionality;
import br.com.test.service.FuncionalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by welson on 25/04/16.
 */
@Service("funcionalityService")
public class FuncionalityServiceImpl implements FuncionalityService {

    @Autowired
    private FuncionalityRepository funcionalityRepository;

    public void save(Funcionality funcionality) {
        funcionalityRepository.save(funcionality);
    }

    public List<Funcionality> list() {
        return funcionalityRepository.findAll();
    }
}
