package org.opendatamesh.platform.git.provider.gitlab.resources.getorganization;

import org.opendatamesh.platform.git.model.Organization;

public abstract class GitLabGetOrganizationMapper {

    public static Organization toInternalModel(GitLabGetOrganizationGroupRes groupRes) {
        if (groupRes == null) {
            return null;
        }

        return new Organization(
                String.valueOf(groupRes.getId()),
                groupRes.getName(),
                groupRes.getWebUrl()
        );
    }
}

