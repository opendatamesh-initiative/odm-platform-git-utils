package org.opendatamesh.platform.git.provider.gitlab.resources.listrepositories;

import org.opendatamesh.platform.git.model.RepositoryOwnerType;
import org.opendatamesh.platform.git.model.Repository;
import org.opendatamesh.platform.git.model.RepositoryVisibility;

public abstract class GitLabListRepositoriesMapper {

    public static Repository toInternalModel(GitLabListRepositoriesProjectRes projectRes,
            RepositoryOwnerType ownerType) {
        if (projectRes == null) {
            return null;
        }

        String ownerId = projectRes.getCreatorId() != null ? String.valueOf(projectRes.getCreatorId()) :
                (projectRes.getNamespace() != null ? String.valueOf(projectRes.getNamespace().getId()) : null);

        return new Repository(
                String.valueOf(projectRes.getId()),
                projectRes.getName(),
                projectRes.getDescription(),
                projectRes.getHttpUrlToRepo(),
                projectRes.getSshUrlToRepo(),
                projectRes.getDefaultBranch(),
                ownerType,
                ownerId,
                projectRes.getVisibility().equals("private") ? RepositoryVisibility.PRIVATE
                        : RepositoryVisibility.PUBLIC
        );
    }
}

