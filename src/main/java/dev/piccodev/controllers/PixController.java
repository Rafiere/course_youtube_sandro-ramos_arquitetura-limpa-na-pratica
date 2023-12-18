package dev.piccodev.controllers;

import dev.piccodev.domain.dto.PixDTO;
import dev.piccodev.service.PixService;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/v1")
public class PixController {

    @Inject
    PixService pixService;

    @POST
    @Path("/pix")
    @Produces(MediaType.TEXT_PLAIN)
    public PixDTO hello(PixDTO dto) {
        return pixService.generatePix(dto);
    }
}
