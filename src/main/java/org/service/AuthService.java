package org.service;

import org.openapitools.model.ErrorResponse;
import org.openapitools.model.LoginRequest;
import org.openapitools.model.LoginSuccessResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.util.JwtUtil;

@Service
public class AuthService {
    @Autowired
    private JwtUtil jwtUtil;

    public ResponseEntity<?> postLogin(LoginRequest postLoginRequest) {
        String username = postLoginRequest.getUsername();
        String password = postLoginRequest.getPassword();

        // TODO Simple hardcoded user check (replace with DB/service later)
        if ("admin".equals(username) && "admin".equals(password)) {
            String token = jwtUtil.generateToken(username);

            LoginSuccessResponse response = new LoginSuccessResponse();
            response.setToken(token);

            return ResponseEntity.ok(response);
        }

        ErrorResponse error = new ErrorResponse();
        error.setCode("UNAUTHORIZED");
        error.setMessage("Invalid username or password");
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(error);
    }
}
