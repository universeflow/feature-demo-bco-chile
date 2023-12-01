package cl.proyect.test.integracion.config;

import cl.proyect.test.integracion.controller.handler.CustomErrorDecoder;
import cl.proyect.test.integracion.properties.PropertiesFeign;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfiguration {

    @Bean
    public ErrorDecoder errorDecoder() {
        return new CustomErrorDecoder(new PropertiesFeign());
    }

}
