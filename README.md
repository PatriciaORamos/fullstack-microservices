# fullstack-microservice

Scaffold de microserviços com Spring Boot 3, Java 21, Kafka, Redis, Postgres, Elasticsearch, Gateway, Auth, AI e frontend Nginx.

## Rodar
```bash
docker compose up -d --build
```

Services:
- Gateway: http://localhost:8080
- Kafka (interno/externo): kafka:9093 / localhost:9093
- Elasticsearch: http://localhost:9200
- Kibana: http://localhost:5601
- Keycloak (opcional): http://localhost:8085
```
