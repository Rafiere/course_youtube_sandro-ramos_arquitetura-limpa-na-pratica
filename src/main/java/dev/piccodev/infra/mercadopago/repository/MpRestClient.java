package dev.piccodev.infra.mercadopago.repository;

import dev.piccodev.infra.mercadopago.dto.MpPixDTO;
import dev.piccodev.infra.mercadopago.dto.MpPixResponse;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@ApplicationScoped
@RegisterRestClient(baseUri = "https://api.mercadopago.com")
public interface MpRestClient {

    @POST
    @Path("/v1/payments")
    @Consumes(MediaType.APPLICATION_JSON)
    MpPixResponse createPix(@HeaderParam("Authorization") String authorization,
                            @HeaderParam("X-Idempotency-Key") String idempotency,
                            MpPixDTO payload);
}
