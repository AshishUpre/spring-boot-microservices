This is a gateway for all our microservices. We will be using spring-cloud-gateway to create our gateway.
By using gateway, all our services will be internal communication so we dont have to use HTTPS and http is enough.

must read -----------> application.properties

### WHAT HAPPENED AFTER ADDING THIS MODULE =============================================================================
### after using api gateway, we can use localhost:8080/api/product and localhost:8080/api/inventory and localhost:8080/api/order
### even though those are not in same port, they are routed to same service.
### ====================================================================================================================



# API Gateway Overview

An **API Gateway** is a critical architectural component in modern software systems. It acts as a single entry point 
for all incoming API requests, handling request routing, security, rate limiting, and more. The API Gateway simplifies 
client integration, enhances security, and improves system performance, scalability, and flexibility.

## What is an API Gateway?

An **API Gateway** is a software layer that sits between clients (such as mobile apps, web applications, or IoT devices)
and backend services. It provides a unified entry point for clients to access multiple backend services while 
abstracting the complexity of the underlying system. This results in a simplified, more secure, and efficient way 
to manage API traffic.

## Benefits of an API Gateway

- **Simplified Client Integration**:
  Clients only need to interact with the API Gateway, rather than directly with multiple backend services. This reduces
  complexity on the client side.

- **Improved Security**:
  The gateway provides centralized control for security, including authentication, authorization, and rate limiting, 
  ensuring consistent policies across all backend services.

- **Increased Flexibility**:
  The API Gateway can route requests to different backend services based on business rules or client-specific requirements.

- **Better Monitoring and Analytics**:
  Centralizing API traffic through a gateway enables unified logging, monitoring, and analytics, providing a clearer 
  understanding of system performance and usage patterns.

## Key Features of an API Gateway

### 1. **Request Routing**
- Routes incoming API requests to the correct backend services based on the request's URL, method, headers, or body 
  parameters.

### 2. **Authentication and Authorization**
- Verifies client identity and enforces access control policies. Ensures only authorized clients can access specific 
  services.

### 3. **Rate Limiting**
- Limits the number of requests from a single client or IP address within a specified time frame to prevent misuse, 
  DoS attacks, or server overload.

### 4. **Caching**
- Stores frequently accessed responses locally at the API Gateway to reduce load on backend services and improve response times.

### 5. **Load Balancing**
- Distributes incoming requests across multiple instances of backend services to ensure high availability and scalability.

### 6. **API Composition**
- The API Gateway can aggregate multiple service calls into a single request to reduce client complexity and response latency.

## Load Balancing Capabilities

The API Gateway can distribute traffic across multiple instances of backend services, providing:
- **No Single Point of Failure**: Ensures system resiliency by routing requests to other available services if one goes down.
- **Improved Responsiveness**: Balances load evenly, reducing response times by avoiding overloading individual services.
- **Increased Scalability**: Easily scales backend services horizontally by adding more instances without impacting client interaction.

## API Gateway Design Patterns

### 1. **Microservices Architecture**
- The API Gateway acts as the entry point for a system composed of microservices, each responsible for a specific 
  business capability.

### 2. **Service-Oriented Architecture (SOA)**
- The API Gateway routes requests between clients and services in an SOA, hiding service complexity and orchestrating 
  communication between them.

### 3. **Event-Driven Architecture**
- In event-driven systems, the API Gateway can route events or notifications to the appropriate services responsible 
  for processing them.

## Security in API Gateway

An API Gateway plays a crucial role in securing the system:
- **SSL Termination**: The gateway manages SSL/TLS encryption, ensuring secure communication between clients and the gateway.
- **OAuth & JWT Authentication**: The gateway integrates with OAuth or JWT to provide token-based authentication mechanisms.
- **API Key Management**: It manages API keys, allowing backend services to focus on core functionality rather than managing client authentication.

## Best Practices for Implementing an API Gateway

### 1. **Keep It Simple**
- Avoid introducing complex business logic in the API Gateway. Its main responsibility should be routing, security, 
  and load balancing.

### 2. **Use Standard Protocols**
- Implement standard protocols like HTTP, HTTPS, and WebSockets to facilitate communication between the API Gateway, 
  clients, and backend services.

### 3. **Monitor and Analyze**
- Implement robust logging and monitoring at the API Gateway level to analyze traffic, track performance, and 
  troubleshoot issues efficiently.

### 4. **Ensure High Availability**
- Make the API Gateway highly available by deploying it across multiple regions or availability zones to avoid outages.

### 5. **Versioning APIs**
- The API Gateway should handle API versioning, allowing clients to request specific versions of an API without breaking 
  compatibility with older services.

## Common Use Cases for an API Gateway

### 1. **Mobile Applications**
- An API Gateway acts as a single point of contact for mobile applications, simplifying the communication with multiple 
  backend services.

### 2. **Web Applications**
- Web apps leverage the API Gateway to manage interactions with different services, such as authentication, content 
 management, and user data storage.

### 3. **IoT Systems**
- IoT devices use the API Gateway to communicate with backend services efficiently. The gateway handles load balancing, 
  security, and traffic management across many devices.

## Advanced API Gateway Features

### 1. **Throttling**
- Throttling limits traffic spikes by controlling the number of requests processed within a specific time frame, 
  protecting backend services from being overwhelmed.

### 2. **Circuit Breaker**
- The circuit breaker pattern is implemented to prevent the gateway from forwarding requests to an unresponsive service. 
  It improves the system's fault tolerance.

### 3. **Dynamic Service Discovery**
- The API Gateway can dynamically discover backend services through a service registry like Eureka, allowing it to 
  automatically route requests to healthy service instances.

### 4. **Global Rate Limiting**
- The API Gateway can apply global rate-limiting policies across all services, preventing abusive users from 
  overwhelming any part of the system.

## Conclusion

An API Gateway is an essential component of modern architectures, especially in microservices and cloud-native systems. 
It simplifies client communication, secures traffic, manages load balancing, and monitors performance—all through a
single entry point. Properly implementing an API Gateway enables greater flexibility, scalability, and control, 
improving both system performance and user experience.

