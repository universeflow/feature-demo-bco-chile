package cl.proyect.test.integracion.exception;

public class NotImplementedException extends RuntimeException {

    public NotImplementedException(String str) {

        super(str);
    }

    @Override
    public String toString() {
        return  getMessage();
    }
}
