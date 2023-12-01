package cl.proyect.test.integracion.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DomainException extends RuntimeException{

     private final String code;

     public DomainException(String arg) {
          this.code = arg;
     }
}
