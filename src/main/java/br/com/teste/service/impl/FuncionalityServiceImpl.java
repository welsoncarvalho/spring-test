package br.com.teste.service.impl;

import br.com.teste.dao.FuncionalityRepository;
import br.com.teste.model.Funcionality;
import br.com.teste.service.FuncionalityService;
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
