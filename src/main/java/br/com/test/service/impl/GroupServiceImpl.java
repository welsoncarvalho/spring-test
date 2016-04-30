package br.com.test.service.impl;

import br.com.test.dao.GroupRepository;
import br.com.test.model.Group;
import br.com.test.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by welson on 30/04/16.
 */
@Service("groupService")
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public void save(Group group) {
        groupRepository.save(group);
    }

    public List<Group> list() {
        return groupRepository.findAll();
    }

    public Group loadById(Long id) {
        return groupRepository.findOne(id);
    }
}
