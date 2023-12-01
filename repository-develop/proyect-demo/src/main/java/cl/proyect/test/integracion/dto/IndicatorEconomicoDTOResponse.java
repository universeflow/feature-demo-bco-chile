package cl.proyect.test.integracion.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@JsonPropertyOrder({
        "version",
        "autor",
        "fecha",
        "uf",
        "ivp",
        "dolar",
        "euro",
        "ipc",
        "utm",
        "imacec",
        "tpm",
        "bitcoin",
        "dolar_intercambio",
        "libra_cobre",
        "tasa_desempleo"
})
@Data
public class IndicatorEconomicoDTOResponse extends IndicatoBase implements Serializable {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private LocalDateTime fecha;
    private Indicator uf;
    private Indicator ivp;
    private Indicator dolar;
    @JsonProperty("dolar_intercambio")
    private Indicator dolarIntercambio;
    private Indicator euro;
    private Indicator ipc;
    private Indicator utm;
    private Indicator imacec;
    private Indicator tpm;
    @JsonProperty("libra_cobre")
    private Indicator libraCobre;
    @JsonProperty("tasa_desempleo")
    private Indicator tasaDesempleo;
    private Indicator bitcoin;
}
