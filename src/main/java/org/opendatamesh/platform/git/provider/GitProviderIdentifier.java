package org.opendatamesh.platform.git.provider;

public record GitProviderIdentifier(
        String type,
        String baseUrl
) {
}
