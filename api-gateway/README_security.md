Run keycloak as 
docker run -p 8181:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:25.0.6 start-dev

then open localhost:8181 and create a new realm(spring-boot-microservices-realm) and configure 
new client(spring-cloud-client). 

use issuer uri http://localhost:8181/auth/realms/spring-boot-microservices-realm/

and spring boot will get rest of info from keycloak.

