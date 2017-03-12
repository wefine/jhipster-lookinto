package org.wefine.hipster.mapper;

import org.mapstruct.Mapper;
import org.wefine.hipster.dto.SimpleSourceDTO;
import org.wefine.hipster.domain.SimpleSource;

@Mapper
public interface SimpleSourceDestinationMapper {
    SimpleSourceDTO sourceToDestination(SimpleSource source);

    SimpleSource destinationToSource(SimpleSourceDTO destination);
}