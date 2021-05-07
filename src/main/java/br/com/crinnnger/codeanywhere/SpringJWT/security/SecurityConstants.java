package br.com.crinnnger.codeanywhere.SpringJWT.security;

public class SecurityConstants {

    public static final String SECRET="SecretKeyToGenJWTs";
    public static final String TOKEN_PREFIX="Bearer ";
    public static final String HEADER_STRING="Authorization";
    public static final String SIGN_UP="/login";
    public static final String STATUS_URL="/status";
    public static final long EXPIRATION_TIME = 864_000_000;
}
