package org.opendatamesh.platform.git.git;

import org.springframework.http.HttpHeaders;

public class GitCredentialHttps extends GitCredential {
    private HttpHeaders httpAuthHeaders;

    public GitCredentialHttps() {
        super(TransportProtocol.HTTP);
    }

    public HttpHeaders getHttpAuthHeaders() {
        return httpAuthHeaders;
    }

    public void setHttpAuthHeaders(HttpHeaders httpAuthHeaders) {
        this.httpAuthHeaders = httpAuthHeaders;
    }
}
