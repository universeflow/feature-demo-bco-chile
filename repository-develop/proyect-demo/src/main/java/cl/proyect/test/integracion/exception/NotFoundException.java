package cl.proyect.test.integracion.exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String str) {

        super(str);
    }

    @Override
    public String toString() {
        return  getMessage();
    }
}