package org.wefine.hipster.entity;

import org.wefine.hipster.dto.SuperheroAlignmentDTO;
import org.springframework.stereotype.Component;

@Component
public class SuperheroAlignmentMapper {

    public SuperheroAlignmentDTO toAlignment(boolean good) {
        if (good) {
            return SuperheroAlignmentDTO.GOOD;
        } else {
            return SuperheroAlignmentDTO.EVIL;
        }
    }
}
