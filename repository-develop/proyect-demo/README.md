# Proyecto Spring Boot con Maven

Este es un proyecto Spring Boot desarrollado con Maven y alojado en GitHub.
El proyecto proporciona micro servicio para consultar los indicadores .

## Requisitos

- Java 8 
- Maven

## Enlaces Relevantes

- [Repositorio del proyecto en GitHub](https://github.com/universeflow/feature-demo-bco-chile.git)
- [Rama del proyecto] develop 


### Endpoints 

- `GET /api/`: devuelve todos indicadores.
- `GET /api/{tipo_indicador}`: recibe un tipo de indicador y devuelve el indicador según su tipo de indicador .
- `GET /api/{tipo_indicador}/{dd-mm-yyyy}`: recibe un tipo de indicador y una fecha con formarto dd-mm-yyy devuelve el indicador.


## Instrucciones de Uso


1. Clona el repositorio desde la [rama develop](https://github.com/universeflow/feature-demo-bco-chile.git).
2. Abre el proyecto en tu entorno de desarrollo favorito (por ejemplo, IntelliJ IDEA o Eclipse).
3. Asegúrate de tener instalado Maven y Java.
4. Configura la base de datos y las propiedades de la aplicación según sea necesario.
5. Ejecuta la aplicación Spring Boot.

## Levantar el proyecto

- mvn clean install
- mvn spring-boot:run

## Swagger 

Para utilizar swagger debemos acceder a la siguiente ruta  #server:#port/swagger-ui.html,
debemos reemplazar la variable server y port donde :
- `#server`: ip del servidor donde se esta levantando la aplicacion
- `#port`:  puerto del servidor donde se esta levantando la aplicacion

