package com.app.recipe.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ingredent")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Float size;
    private String metric;
    private String name;
    private String description;

    public Ingredient(Float size, String metric, String name, String description) {
        this.size = size;
        this.metric = metric;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(size, that.size) &&
                Objects.equals(metric, that.metric) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, size, metric, name, description);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", size=" + size +
                ", metric='" + metric + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
