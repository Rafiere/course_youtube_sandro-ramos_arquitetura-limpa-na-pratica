package dev.piccodev.domain.repositories;

import dev.piccodev.domain.dto.PixDTO;

/* We want that all implementations (Mercado Pago, Cellcoin etc) respects this contract. */
public interface IPixRepository {

    PixDTO create(PixDTO dto);
}
