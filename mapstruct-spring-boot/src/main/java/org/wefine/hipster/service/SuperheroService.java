package org.wefine.hipster.service;

import org.wefine.hipster.dto.SuperheroDTO;

import java.util.List;

public interface SuperheroService {
    List<SuperheroDTO> findAll();
}
