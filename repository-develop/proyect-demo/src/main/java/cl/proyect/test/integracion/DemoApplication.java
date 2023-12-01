package cl.proyect.test.integracion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
		(scanBasePackages = { "cl.proyect.test.integracion"})
@EnableFeignClients(basePackages = {"cl.proyect.test.integracion.feign"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
