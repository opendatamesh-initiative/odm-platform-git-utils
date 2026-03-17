package org.opendatamesh.platform.git.provider.github.credentials;

import org.opendatamesh.platform.git.git.GitCredential;
import org.opendatamesh.platform.git.git.GitCredentialHttps;
import org.opendatamesh.platform.git.provider.GitProviderCredential;
import org.springframework.http.HttpHeaders;

public class GitHubPatCredential implements GitProviderCredential {

    private final String token;

    public GitHubPatCredential(String token) {
        this.token = token;
    }

    @Override
    public GitCredential createGitCredential() {
        GitCredentialHttps ctx = new GitCredentialHttps();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", token);
        ctx.setHttpAuthHeaders(headers);
        return ctx;
    }

    @Override
    public HttpHeaders createGitProviderHeaders() {

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);

        // Add common headers for GitHub API
        headers.set("Accept", "application/vnd.github.v3+json");
        headers.set("User-Agent", "GitProviderDemo/1.0");
        return headers;
    }
}
