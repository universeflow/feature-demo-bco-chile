package cl.proyect.test.integracion.controller;


import cl.proyect.test.integracion.dto.IndicatorEconomicoDTOResponse;
import cl.proyect.test.integracion.dto.IndicatorTypeDTOResponse;
import cl.proyect.test.integracion.services.IndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IndicatorController {

    private final IndicatorService indicatorService;

    @Autowired
    public IndicatorController(IndicatorService indicatorService) {
        this.indicatorService = indicatorService;
    }

    @GetMapping
    public ResponseEntity<IndicatorEconomicoDTOResponse> getAll() {

        IndicatorEconomicoDTOResponse indicator = indicatorService.getAll();
        return new ResponseEntity<>(indicator, HttpStatus.OK);

    }

    @GetMapping("/{type}")
    public ResponseEntity<IndicatorTypeDTOResponse> getByTypeIndicator(@PathVariable String type){

        IndicatorTypeDTOResponse typeResponse = indicatorService.findByTypeIndicator(type);
        return new ResponseEntity<>(typeResponse, HttpStatus.OK);

    }

    @GetMapping("/{type}/{year}")
    public ResponseEntity<IndicatorTypeDTOResponse> getByTypeYear(@PathVariable String type, @PathVariable  String year){

       IndicatorTypeDTOResponse typeResponse = indicatorService.findIndicatorsByTypeAndDate(type,year);
        return new ResponseEntity<>(typeResponse, HttpStatus.OK);

    }

}
