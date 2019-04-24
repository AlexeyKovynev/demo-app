# REST API test app (backend only)

This application allows user to login, create/read/delete users (for logged in users only)

**Postman collection for testing is available in source files**

## Run

**Preconditions: Java 8, Maven 3.5+, Docker (including docker-compose) should be installed**.

*Steps to run:*

1. Download source files;
2. Run 'mvn clean package' command in root folder ('demo-app');
3. Run 'docker-compose build';
4. Run 'docker-compose up';
5. Open Postman collection;
6. Default created user has username: "user" and password "password";
7. After logging in using POST request to 'localhost:8080/api/auth/login' you can use provided token for next requests;
8. Put token into header with key 'Authorization' and prefix 'Bearer_' in value field;

*P.S. Frontend is not provided (I had no time to create it).*<br />
*P.P.S Logout is not implemented as it requires something like Redis to blacklist tokens.*<br />
*P.P.S. I had lack of time to write unit tests. Probably I will add them later to this repository*