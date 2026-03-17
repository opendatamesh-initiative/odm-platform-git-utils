package org.opendatamesh.platform.git.provider.github.resources.listtags;

import org.opendatamesh.platform.git.model.Tag;

public abstract class GitHubListTagsMapper {

    public static Tag toInternalModel(GitHubListTagsTagRes tagRes) {
        if (tagRes == null) {
            return null;
        }

        return new Tag(
                tagRes.getName(),
                tagRes.getCommit() != null ? tagRes.getCommit().getSha() : null
        );
    }
}

