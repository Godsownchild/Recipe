package com.app.recipe.models;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "cooking_direction")
public class Direction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Lob
    @Column(name = "direction_steps")
    List<String> dirSteps;


    public Direction(List<String> dirSteps) {
        this.dirSteps = dirSteps;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getDirSteps() {
        return dirSteps;
    }

    public void setDirSteps(List<String> dirSteps) {
        this.dirSteps = dirSteps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direction direction = (Direction) o;
        return Objects.equals(id, direction.id) &&
                Objects.equals(dirSteps, direction.dirSteps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dirSteps);
    }

    @Override
    public String toString() {
        return "Direction{" +
                "id=" + id +
                ", dirSteps=" + dirSteps +
                '}';
    }
}
