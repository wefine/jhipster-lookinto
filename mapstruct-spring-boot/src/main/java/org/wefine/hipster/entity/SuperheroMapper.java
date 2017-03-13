package org.wefine.hipster.entity;

import org.wefine.hipster.dto.SuperheroDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(uses = { SuperheroAlignmentMapper.class }, componentModel = "spring")
public interface SuperheroMapper {

    @Mappings({
        @Mapping(source = "good", target = "alignment"),
        @Mapping(target = "identity", expression = "java(new org.wefine.hipster.dto.SuperheroIdentityDTO(superhero.getFirstName(), superhero.getLastName()))")
    })
    SuperheroDTO toSuperheroDTO(Superhero superhero);

    List<SuperheroDTO> toSuperheroDTOs(List<Superhero> superheroes);
}
