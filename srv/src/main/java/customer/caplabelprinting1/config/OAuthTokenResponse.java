package customer.caplabelprinting1.config;

public class OAuthTokenResponse {

    private String access_token;
    private String token_type;
    private Integer expires_in;
    private String scope;
    private String jti;

 
    public String getaccess_token() {
        return access_token;
    }
 
    public void setaccess_token(String access_token) {
        this.access_token = access_token;
    }
 
    public String gettoken_type() {
        return token_type;
    }
 
    public void settoken_type(String token_type) {
        this.token_type = token_type;
    }
 
    public Integer getexpires_in() {
        return expires_in;
    }
 
    public void setexpires_in(Integer expires_in) {
        this.expires_in = expires_in;
    }
 
    public String getjti() {
        return jti;
    }
 
    public void setjti(String jti) {
        this.jti = jti;
    }
 
    public String getScope() {
        return scope;
    }
 
    public void setScope(String scope) {
        this.scope = scope;
    }

}
