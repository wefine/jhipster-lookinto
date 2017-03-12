package org.wefine.hipster.mapper;

import org.mapstruct.Mapper;
import org.wefine.hipster.domain.SimpleDestination;
import org.wefine.hipster.domain.SimpleSource;

@Mapper
public interface SimpleSourceDestinationMapper {
    SimpleDestination sourceToDestination(SimpleSource source);

    SimpleSource destinationToSource(SimpleDestination destination);
}