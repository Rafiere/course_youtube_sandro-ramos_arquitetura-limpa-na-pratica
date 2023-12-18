package dev.piccodev.domain.mappers;

import dev.piccodev.domain.dto.PixDTO;
import dev.piccodev.domain.entities.PixBO;

public class PixMapper {

    public static PixDTO toDTO(PixBO pixBO) {

        return PixDTO.of(
            pixBO.getId().toString(),
            pixBO.getAmount(),
            pixBO.getEmail(),
            pixBO.getDescription(),
            pixBO.getEmv(),
            pixBO.getBase64(),
            pixBO.getExpiration()
        );
    }

    public static PixBO toBO(PixDTO pixDTO) {

        return new PixBO(
            pixDTO.getId(),
            pixDTO.getAmount(),
            pixDTO.getEmail(),
            pixDTO.getDescription(),
            pixDTO.getEmv(),
            pixDTO.getBase64(),
            pixDTO.getExpiration()
        );
    }
}
