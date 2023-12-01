package cl.proyect.test.integracion.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@JsonPropertyOrder({
        "version",
        "autor",
        "codigo",
        "nombre",
        "unidad_medida",
        "serie"
})
@Data
public class IndicatorTypeDTOResponse extends IndicatoBase implements Serializable {

    private String codigo ;
    private String nombre;
    @JsonProperty("unidad_medida")
    private String unidadMedida;
    private List<SerieIndicatorDto> serie;
}
