package br.com.teste.dao;

import br.com.teste.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by welson on 25/04/16.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
