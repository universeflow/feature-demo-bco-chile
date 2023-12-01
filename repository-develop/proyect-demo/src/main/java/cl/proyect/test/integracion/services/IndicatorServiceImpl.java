package cl.proyect.test.integracion.services;

import cl.proyect.test.integracion.dto.IndicatorEconomicoDTOResponse;
import cl.proyect.test.integracion.dto.IndicatorTypeDTOResponse;
import cl.proyect.test.integracion.feign.IndicatorFeignClient;
import cl.proyect.test.integracion.properties.PropertiesFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.stream.Collectors;

@Service
@Slf4j
public class IndicatorServiceImpl implements IndicatorService {


    private final PropertiesFeign propertiesFeign;
    private final IndicatorFeignClient indicatorFeignClient;

    @Autowired
    public IndicatorServiceImpl(PropertiesFeign propertiesFeign, IndicatorFeignClient indicatorFeignClient) {
        this.propertiesFeign = propertiesFeign;
        this.indicatorFeignClient = indicatorFeignClient;
    }

    @Override
    public IndicatorEconomicoDTOResponse getAll() {
        log.info(" Método  getAll ");

        return indicatorFeignClient.getAll();
    }

    @Override
    public IndicatorTypeDTOResponse findByTypeIndicator(String type) {
        log.info(" Inicio método  getByTypeIndicator {} ",type);
        IndicatorTypeDTOResponse responseFeign = indicatorFeignClient.findByTypeIndicator(type);

        responseFeign.setSerie(responseFeign.getSerie().stream()
                .filter(item -> isLastMonth(item.getFecha(), LocalDateTime.now()))
                .collect(Collectors.toList()));

        log.info(" Fin método  getByTypeIndicator ");
        return responseFeign;

    }

    @Override
    public IndicatorTypeDTOResponse findIndicatorsByTypeAndDate(String type, String year) {
        log.info(" Método  getByTypeIndicator  tipo {} ,  fecha {}",type,year);
        return  indicatorFeignClient.findIndicatorsByTypeAndDate(type,year);

    }

    private boolean isLastMonth(LocalDateTime dateItem, LocalDateTime dateNow) {

        Duration duration = Duration.between(dateItem, dateNow);
        long diffMonth = duration.toDays() / propertiesFeign.getDays();

        return diffMonth <= propertiesFeign.getMonth();
    }

}
