package br.com.test.service;

import br.com.test.model.Group;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by welson on 30/04/16.
 */
public class GroupServiceTest extends ServiceTest {

    @Autowired
    private GroupService groupService;

    @Test
    public void testList() {
        List<Group> groups = groupService.list();
        Assert.assertTrue(groups.size() > 0);
    }

}
