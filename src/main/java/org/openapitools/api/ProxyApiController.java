package org.openapitools.api;

import org.openapitools.model.PostProxy200Response;
import org.openapitools.model.PostProxy400Response;
import org.openapitools.model.PostProxyRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.lang.Nullable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-26T19:35:46.310079470-04:00[America/New_York]", comments = "Generator version: 7.14.0")
@Controller
@RequestMapping("${openapi.play.base-path:}")
public class ProxyApiController implements ProxyApi {

    private final ProxyApiDelegate delegate;

    public ProxyApiController(@Autowired(required = false) ProxyApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ProxyApiDelegate() {});
    }

    @Override
    public ProxyApiDelegate getDelegate() {
        return delegate;
    }

}
