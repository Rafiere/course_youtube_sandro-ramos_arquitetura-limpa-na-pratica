package dev.piccodev.service;

import dev.piccodev.domain.dto.PixDTO;
import dev.piccodev.domain.usecases.CreatePix;
import dev.piccodev.infra.mercadopago.repository.MpPixRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PixService {

    @Inject
    MpPixRepository mpPixRepository;

    public PixDTO generatePix(PixDTO dto){

        CreatePix createPix = new CreatePix(mpPixRepository);

        return createPix.execute(dto);
    }
}
