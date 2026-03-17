package org.opendatamesh.platform.git.provider;

import org.opendatamesh.platform.git.model.ProviderCustomResourceDefinition;

import java.util.List;

public interface GitProviderModelExtension {
    boolean support(GitProviderModelResourceType resourceType);

    List<ProviderCustomResourceDefinition> getCustomResourcesDefinitions();
}
