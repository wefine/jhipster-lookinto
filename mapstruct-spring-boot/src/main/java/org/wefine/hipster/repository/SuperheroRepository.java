package org.wefine.hipster.repository;

import org.wefine.hipster.entity.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperheroRepository extends JpaRepository<Superhero, Long> {
}
