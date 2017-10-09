# Spring Security using JWT (Json Web Token) in Spring Boot

This Project uses JWT to secure the REST endpoints.

The Following are the REST end points available in the example.
- `/token` - Generates the JWT token based on the JSON sent. Its a POST method which expects the JSON:
    ```
        { "username": "name", "id": 123, "role": "admin"}
    ```

    Copy this to your terminal :
    ```
    curl -d '{"username":"hendi", "id":"123", "role":"admin"}' -H "Content-Type: application/json" -X POST http://localhost:8084/token
    ```

- `/rest/hello` - Requires a JWT Token with Header `key - "Authorisation"` and `value - "Token <JWT_Token>"`

Copy the token to this :
```
curl -H "Authorisation: Token eyJhbGciOiJIUzUxMiJ9.eyJ1c2VySWQiOiIxMjMiLCJyb2xlIjoiYWRtaW4ifQ.FXDGleOARJDDzeu6Pxfa54BFh17w0D90gWOgLTvLCVrS55Yyz_Cm7nK0RC0cM1Are6eg-V_KD6I14WB8L0kVTQ" -X GET http://localhost:8084/rest/hello
```