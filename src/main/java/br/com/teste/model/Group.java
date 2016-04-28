package br.com.teste.model;

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

    @JoinTable(name = "group_func",
            joinColumns = {@JoinColumn(name = "id_group", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "id_funcionality", referencedColumnName = "id")})
    @ElementCollection(targetClass = Funcionality.class)
    private Set<Funcionality> funcionalities;

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

    public Set<Funcionality> getFuncionalities() {
        return funcionalities;
    }

    public void setFuncionalities(Set<Funcionality> funcionalities) {
        this.funcionalities = funcionalities;
    }
}
