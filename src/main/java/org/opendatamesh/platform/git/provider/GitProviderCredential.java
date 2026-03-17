package org.opendatamesh.platform.git.provider;

import org.opendatamesh.platform.git.git.GitCredential;
import org.springframework.http.HttpHeaders;

public interface GitProviderCredential {

    GitCredential createGitCredential();

    HttpHeaders createGitProviderHeaders();
}
