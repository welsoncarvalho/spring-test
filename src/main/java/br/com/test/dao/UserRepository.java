package br.com.test.dao;

import br.com.test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by welson on 25/04/16.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByRegistry(Long registry);

    User findByNameLike(String name);

}
