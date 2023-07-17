# USERS
Microservicio de usuarios del ecosistema de nomina bahiasDev

## Requisitos
- Java 11

## Configuración

Describe los pasos necesarios para configurar el proyecto localmente. Esto puede incluir:

1. Clonar el repositorio: `git clone <URL_DEL_REPOSITORIO>`
2. Importar el proyecto en tu IDE (IntelliJ, Eclipse, etc.)

## Uso

Ejecutas el proyecto y queda listo para que lo pruebes desde la URL: http://localhost:8080/swagger-ui/index.htm
Tambien puedes validar la persistencia en la url de su BD en memoria: http://localhost:8080/h2-console

## Estructura del Proyecto

Tiene una estructura hexagonal:

- Config: donde configuraremos los beans necesarios
- Domain: donde existira toda la logica de negocio y definiremos los puertos de entrada y de salida al dominio
- Infraestructure: donde implementaremos los adaptadores de los puertos para el dominio

## Dependencias

- Spring Boot
- H2
- Lombok
- MapStruct

