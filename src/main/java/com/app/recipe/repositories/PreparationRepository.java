package com.app.recipe.repositories;

import com.app.recipe.models.Preparation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreparationRepository extends JpaRepository<Preparation,Long> {
}
