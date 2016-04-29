package br.com.test.dao;

import br.com.test.model.Functionality;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by welson on 25/04/16.
 */
public interface FunctionalityRepository extends JpaRepository<Functionality, Long> {
}
