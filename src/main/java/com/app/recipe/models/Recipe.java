package com.app.recipe.models;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "recipe_name")
    private String name;

    @OneToMany()
    private Set<Ingredient> ingredients;

    @OneToMany()
    private Set<Preparation> preparations;

    @OneToMany()
    private Set<Direction> directions;

    public Recipe(String name, Set<Ingredient> ingredients, Set<Preparation> preparations, Set<Direction> directions) {
        this.name = name;
        this.ingredients = ingredients;
        this.preparations = preparations;
        this.directions = directions;
    }

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

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Set<Preparation> getPreparations() {
        return preparations;
    }

    public void setPreparations(Set<Preparation> preparations) {
        this.preparations = preparations;
    }

    public Set<Direction> getDirections() {
        return directions;
    }

    public void setDirections(Set<Direction> directions) {
        this.directions = directions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(id, recipe.id) &&
                Objects.equals(name, recipe.name) &&
                Objects.equals(ingredients, recipe.ingredients) &&
                Objects.equals(preparations, recipe.preparations) &&
                Objects.equals(directions, recipe.directions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ingredients, preparations, directions);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", preparations=" + preparations +
                ", directions=" + directions +
                '}';
    }
}

