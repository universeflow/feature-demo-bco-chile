package cl.proyect.test.integracion.services;

import cl.proyect.test.integracion.dto.IndicatorEconomicoDTOResponse;
import cl.proyect.test.integracion.dto.IndicatorTypeDTOResponse;

public interface IndicatorService {
    IndicatorEconomicoDTOResponse getAll();

    IndicatorTypeDTOResponse findByTypeIndicator(String type);

    IndicatorTypeDTOResponse findIndicatorsByTypeAndDate(String type, String year);
}
