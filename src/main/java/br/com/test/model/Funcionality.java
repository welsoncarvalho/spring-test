package br.com.test.model;

import javax.persistence.*;

/**
 * Created by welson on 25/04/16.
 */
@Entity
@Table(name = "adm_funcionality")
public class Funcionality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
