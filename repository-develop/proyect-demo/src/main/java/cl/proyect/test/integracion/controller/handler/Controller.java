package cl.proyect.test.integracion.controller.handler;

import cl.proyect.test.integracion.exception.DomainException;
import cl.proyect.test.integracion.exception.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestControllerAdvice
public class Controller {


    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ResponseEntity<ErrorResponse> handleNotFoundException(DomainException ex) {
        return buildResponse(ex);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> generalError(Exception exception) {

        return buildResponse(exception);
    }

    private ResponseEntity<ErrorResponse> buildResponse( Object detail) {

        ErrorResponse errorResponse = ErrorResponse.builder()
                .message(detail.toString())
                .build();
        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_IMPLEMENTED);
    }
}
