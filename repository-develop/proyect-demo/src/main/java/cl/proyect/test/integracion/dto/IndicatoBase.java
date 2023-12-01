package cl.proyect.test.integracion.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class IndicatoBase implements Serializable {

    private String version;
    private String autor;

}
