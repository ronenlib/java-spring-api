package org.openapitools.api.service;

import org.openapitools.api.ProxyApiDelegate;
import org.openapitools.model.PostProxy200Response;
import org.openapitools.model.PostProxyRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProxyApiService implements ProxyApiDelegate {
    @Override
    public ResponseEntity<PostProxy200Response> postProxy(PostProxyRequest request) {
        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
}
