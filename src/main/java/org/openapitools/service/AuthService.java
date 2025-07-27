package org.openapitools.service;

import org.openapitools.api.AuthApiDelegate;
import org.openapitools.model.PostLogin200Response;
import org.openapitools.model.PostLoginRequest;
import org.openapitools.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements AuthApiDelegate {
    @Autowired
    private JwtUtil jwtUtil;


    @Override
    public ResponseEntity<PostLogin200Response> postLogin(PostLoginRequest postLoginRequest) {
        String username = postLoginRequest.getUsername();
        String password = postLoginRequest.getPassword();

        // TODO Simple hardcoded user check (replace with DB/service later)
        if ("admin".equals(username) && "admin".equals(password)) {
            String token = jwtUtil.generateToken(username);

            PostLogin200Response response = new PostLogin200Response();
            response.setToken(token);

            return ResponseEntity.ok(response);
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}
