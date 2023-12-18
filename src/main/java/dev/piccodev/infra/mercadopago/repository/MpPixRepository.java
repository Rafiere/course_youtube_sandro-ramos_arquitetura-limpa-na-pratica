package dev.piccodev.infra.mercadopago.repository;

import dev.piccodev.domain.dto.PixDTO;
import dev.piccodev.domain.repositories.IPixRepository;
import dev.piccodev.infra.mercadopago.dto.MpPixDTO;
import dev.piccodev.infra.mercadopago.dto.MpPixPayerDTO;
import dev.piccodev.infra.mercadopago.dto.MpPixResponse;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.UUID;

public class MpPixRepository implements IPixRepository {

    @Inject
    @RestClient
    MpRestClient restClient;

    @Override
    public PixDTO create(PixDTO dto) {

        String token = "teste";
        String idempotencyKey = UUID.randomUUID().toString();

        MpPixPayerDTO payerDTO = new MpPixPayerDTO();
        MpPixDTO pixDTO = new MpPixDTO();
        payerDTO.setEmail(dto.getEmail());

        pixDTO.setAmount(dto.getAmount());
        pixDTO.setDescription(dto.getDescription());
        pixDTO.setPaymentMethodId("pix");
        pixDTO.setPayer(payerDTO);

        MpPixResponse response = restClient.createPix(token, idempotencyKey, pixDTO);

        dto.setEmv(response.getPoi().getTrxData().getEmv());
        dto.setBase64(response.getPoi().getTrxData().getBase64());

        return dto;
    }
}
