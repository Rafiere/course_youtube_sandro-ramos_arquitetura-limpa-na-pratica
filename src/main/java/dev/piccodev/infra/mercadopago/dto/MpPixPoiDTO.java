package dev.piccodev.infra.mercadopago.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class MpPixPoiDTO {

    @JsonbProperty("transaction_data")
    private MpPixResponseTrxData trxData;

    public MpPixResponseTrxData getTrxData() {
        return trxData;
    }

    public void setTrxData(MpPixResponseTrxData trxData) {
        this.trxData = trxData;
    }
}
