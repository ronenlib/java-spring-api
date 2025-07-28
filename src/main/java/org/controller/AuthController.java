package org.controller;

import org.openapitools.api.AuthApi;
import org.openapitools.model.LoginRequest;
import org.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthController implements AuthApi {
    @Autowired
    private AuthService authService;

    @Override
    public ResponseEntity<?> _postLogin(LoginRequest loginRequest) {
        return this.authService.postLogin(loginRequest);
    }
}
