# Calculadora Spring Boot (Tarea)

Incluye ejemplos de:
- `@PathVariable` en `/calc/{oper}/{n1}/{n2}`
- `@RequestParam` en `/hello?name=...&carrera=...`
- `@RequestBody` en `POST /prod`

## Requisitos
- Java 17
- Maven (o usar `./mvnw` si lo generas desde IDE)

## Ejecutar
```bash
mvn spring-boot:run
```

## Probar endpoints

- GET `http://localhost:8080/`
- GET `http://localhost:8080/calc/resta/3/34`
- GET `http://localhost:8080/hello?name=Diego&carrera=ISC`
- POST `http://localhost:8080/prod` con JSON:
```json
{
  "id": 1,
  "name": "Gorra",
  "price": 499.99
}
```
