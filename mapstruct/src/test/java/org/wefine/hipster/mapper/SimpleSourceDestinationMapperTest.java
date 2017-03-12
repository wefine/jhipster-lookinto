package org.wefine.hipster.mapper;

import org.junit.Test;
import org.mapstruct.factory.Mappers;
import org.wefine.hipster.domain.SimpleDestination;
import org.wefine.hipster.domain.SimpleSource;

import static org.junit.Assert.assertEquals;

public class SimpleSourceDestinationMapperTest {
 
    private SimpleSourceDestinationMapper mapper
      = Mappers.getMapper(SimpleSourceDestinationMapper.class);
 
    @Test
    public void givenSourceToDestination_whenMaps_thenCorrect() {
        SimpleSource simpleSource = new SimpleSource();
        simpleSource.setName("SourceName");
        simpleSource.setDescription("SourceDescription");
        SimpleDestination destination = mapper.sourceToDestination(simpleSource);
  
        assertEquals(simpleSource.getName(), destination.getName());
        assertEquals(simpleSource.getDescription(), 
          destination.getDescription());
    }
 
    @Test
    public void givenDestinationToSource_whenMaps_thenCorrect() {
        SimpleDestination destination = new SimpleDestination();
        destination.setName("DestinationName");
        destination.setDescription("DestinationDescription");
 
        SimpleSource source = mapper.destinationToSource(destination);
 
        assertEquals(destination.getName(), source.getName());
        assertEquals(destination.getDescription(),
          source.getDescription());
    }
}