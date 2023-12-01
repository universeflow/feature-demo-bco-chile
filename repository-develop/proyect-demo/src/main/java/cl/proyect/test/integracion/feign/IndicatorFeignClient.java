package cl.proyect.test.integracion.feign;

import cl.proyect.test.integracion.dto.IndicatorEconomicoDTOResponse;
import cl.proyect.test.integracion.dto.IndicatorTypeDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "indicatorClient", url = "${demo.feign.externalServer.url}")
public interface IndicatorFeignClient {
    @GetMapping("/api")
    IndicatorEconomicoDTOResponse getAll();

    @GetMapping("/api/{type}")
    IndicatorTypeDTOResponse findByTypeIndicator(@PathVariable String type);

    @GetMapping("/api/{type}/{year}")
    IndicatorTypeDTOResponse findIndicatorsByTypeAndDate(@PathVariable String type, @PathVariable String year);
}