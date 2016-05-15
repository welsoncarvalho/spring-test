package br.com.test.service;

import br.com.test.model.Functionality;
import br.com.test.model.Group;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by welson on 30/04/16.
 */
public class GroupServiceTest extends AbstractServiceTest {

    private static final Long ID_GROUP_ADM = 1L;
    private static final String NEW_GROUP = "New Group";

    @Autowired
    private GroupService groupService;

    @Autowired
    private FunctionalityService functionalityService;

    @Test
    public void testSave() {
        Group group = buildNewGroup();
        groupService.save(group);

        Assert.assertNotNull(group.getId());
    }

    @Test
    public void testLoadById() {
        Group group = groupService.loadById(ID_GROUP_ADM);
        Assert.assertNotNull(group);
    }

    @Test
    public void testList() {
        List<Group> groups = groupService.list();
        Assert.assertTrue(!groups.isEmpty());
    }

    private Group buildNewGroup() {
        Group group = new Group();
        group.setName(NEW_GROUP);
        group.setFunctionalities(getFunctionalities());
        return group;
    }

    private Set<Functionality> getFunctionalities() {
        List<Functionality> functionalities = functionalityService.list();
        return new HashSet<>(functionalities);
    }

}
