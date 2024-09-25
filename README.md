[//]: # (todo: add readme of all services here itself instead of in individual modules)


### Circuit breaker pattern

Services maybe down or very slow, then we can use circuit breaker to prevent the system 
from going down. Circuit breaker pattern is similar to circuit breaker in electrical appliances
Whenever it recognises large no. of failed api calls, blocks all outgoing req from our service
to the service thats not responding.

* Saves network calls and avoids cascading failures.

-> implemented using resilient4j library, we use spring-cloud-starter-circuitbreaker-resilience4j to achieve this.

* first we implement this pattern in API gateway, then others