package com.app.recipe.models;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cooking_preparation")
public class Preparation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Lob
    @Column(name = "preparation_steps")
    List<String> prepSteps;

    public Preparation(List<String> prepSteps) {
        this.prepSteps = prepSteps;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getPrepSteps() {
        return prepSteps;
    }

    public void setPrepSteps(List<String> prepSteps) {
        this.prepSteps = prepSteps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Preparation that = (Preparation) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(prepSteps, that.prepSteps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prepSteps);
    }

    @Override
    public String toString() {
        return "Preparation{" +
                "id=" + id +
                ", prepSteps=" + prepSteps +
                '}';
    }
}
