Spring Data REST is a part of the Spring Data project that simplifies the creation of RESTful APIs for accessing and managing data in a Spring Boot application. 
It allows you to expose Spring Data repositories (such as JpaRepository) as RESTful web services with minimal configuration and code.

1. Automatic REST Endpoints
 ex -http://localhost:8080/employees
2. HATEOAS (Hypermedia as the engine of application state)

3. Customizing Endpoints
While Spring Data REST automatically generates REST endpoints for your repositories, you can customize these endpoints. For instance, you can:

Use annotations like @RestResource to customize the name of the endpoint.
Add custom methods in the repository to expose additional functionality. 

4. Paging and Sorting
