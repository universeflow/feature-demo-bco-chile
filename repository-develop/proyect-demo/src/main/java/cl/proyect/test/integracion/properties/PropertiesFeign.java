package cl.proyect.test.integracion.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "demo.feign")
public class PropertiesFeign {

    private int days;

    private int month;

    private String message;

    private String genericError;
}
