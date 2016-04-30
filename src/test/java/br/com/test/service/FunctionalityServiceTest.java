package br.com.test.service;

import br.com.test.model.Functionality;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by welson on 25/04/16.
 */
public class FunctionalityServiceTest extends ServiceTest {

    private static final String NAME_NEW_FUNCTIONALITY = "New Functionality";

    @Autowired
    private FunctionalityService functionalityService;

    @Test
    public void testSave() {
        Functionality functionality = new Functionality();
        functionality.setName(NAME_NEW_FUNCTIONALITY);

        functionalityService.save(functionality);

        Functionality functionalityDB = functionalityService.loadById(functionality.getId());
        Assert.assertEquals(NAME_NEW_FUNCTIONALITY, functionalityDB.getName());
    }

    @Test
    public void testList() {
        List<Functionality> listFunctionality = functionalityService.list();
        Assert.assertTrue(listFunctionality.size() > 0);
    }

}
