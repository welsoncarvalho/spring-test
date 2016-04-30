package br.com.test.dao;

import br.com.test.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by welson on 30/04/16.
 */
public interface GroupRepository extends JpaRepository<Group, Long> {
}
