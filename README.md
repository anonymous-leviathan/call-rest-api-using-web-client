# Call REST API Using WebClient

This Java package demonstrates how to call a REST API using the Spring WebFlux `WebClient`.

## Introduction

This project provides a simple example of how to make HTTP requests to a REST API using the `WebClient` class provided by the Spring Framework. It fetches data from the [Fake Store API](https://fakestoreapi.com/) and demonstrates how to handle both a list of products and a single product response.

## Dependencies

This project requires:

- Java Development Kit (JDK) version 8 or higher
- Spring Boot
- Lombok

## Usage

1. Clone this repository to your local machine.
2. Build the project using your preferred IDE or build tool.
3. Run the `CallRestApiUsingWebClientApplication` class.
4. The application will fetch a list of products from the Fake Store API and log the response.
5. It will also fetch a single product with ID 1 and log the response.

## Code Explanation

- The `main` method in the `CallRestApiUsingWebClientApplication` class initializes a Spring Boot application.
- It uses `WebClient.Builder` to create a `WebClient` instance.
- The first request fetches a list of products from the specified URI and logs the response.
- The second request fetches a single product with ID 1 and logs the response.

## Further Information

For more details about Spring WebFlux and `WebClient`, please refer to the [official documentation](https://docs.spring.io/spring-framework/reference/web/webflux.html).

## License

This project is licensed under the [MIT License](LICENSE).
