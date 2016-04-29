package br.com.test.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by welson on 25/04/16.
 */
@Entity
@Table(name = "adm_group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(name = "group_func",
            joinColumns = {@JoinColumn(name = "id_group", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "id_functionality", referencedColumnName = "id")},
            uniqueConstraints = {@UniqueConstraint(columnNames = {"id_group", "id_functionality"})})
    private Set<Functionality> functionalities;

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

    public Set<Functionality> getFunctionalities() {
        return functionalities;
    }

    public void setFunctionalities(Set<Functionality> functionalities) {
        this.functionalities = functionalities;
    }
}
