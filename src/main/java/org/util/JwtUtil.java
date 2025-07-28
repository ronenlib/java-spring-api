package org.util;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {

    // Key used for signing (HMAC SHA-256)
    private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    // Token lifetime (e.g. 1 hour)
    private final long EXPIRATION_MS = 3600_000;

    /**
     * Generate a JWT token for a given username
     */
    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_MS))
                .signWith(key)
                .compact();
    }

    /**
     * Validate and parse token. Returns username if valid.
     */
    public String validateAndGetUsername(String token) throws JwtException {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
}

