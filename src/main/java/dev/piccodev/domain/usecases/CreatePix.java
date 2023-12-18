package dev.piccodev.domain.usecases;

import dev.piccodev.domain.dto.PixDTO;
import dev.piccodev.domain.entities.PixBO;
import dev.piccodev.domain.mappers.PixMapper;
import dev.piccodev.domain.repositories.IPixRepository;

/* All of system features should be inserted in the "usecases" folder. */
public class CreatePix {

    private IPixRepository pixRepository;

    public CreatePix(IPixRepository pixRepository) {
        this.pixRepository = pixRepository;
    }

    public PixDTO execute(PixDTO pixDTO) {

        PixBO bo = PixMapper.toBO(pixDTO);

        PixDTO createdPix = pixRepository.create(pixDTO);

        bo.updateEmvData(createdPix.getEmv(), createdPix.getBase64(), createdPix.getExpiration());

        return createdPix;
    }
}
