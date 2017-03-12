package org.wefine.hipster.service.impl;

import org.wefine.hipster.dto.SuperheroDTO;
import org.wefine.hipster.entity.SuperheroMapper;
import org.wefine.hipster.repository.SuperheroRepository;
import org.wefine.hipster.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperheroServiceImpl implements SuperheroService {
    @Autowired
    private SuperheroRepository repository;
    @Autowired
    private SuperheroMapper mapper;

    @Override
    public List<SuperheroDTO> findAll() {
        return mapper.toSuperheroDTOs(repository.findAll());
    }
}
