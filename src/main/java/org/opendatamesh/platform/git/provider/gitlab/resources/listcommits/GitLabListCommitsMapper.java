package org.opendatamesh.platform.git.provider.gitlab.resources.listcommits;

import org.opendatamesh.platform.git.model.Commit;

public abstract class GitLabListCommitsMapper {

    public static Commit toInternalModel(GitLabListCommitsCommitRes commitRes) {
        if (commitRes == null) {
            return null;
        }

        return new Commit(
                commitRes.getId(),
                commitRes.getMessage(),
                commitRes.getAuthorName(),
                commitRes.getAuthorEmail(),
                commitRes.getAuthoredDate()
        );
    }

    public static Commit toInternalModel(GitLabCompareCommitsRes.CompareCommitRes commitRes) {
        if (commitRes == null) {
            return null;
        }
        return new Commit(
                commitRes.getId(),
                commitRes.getMessage(),
                commitRes.getAuthorName(),
                commitRes.getAuthorEmail(),
                commitRes.getAuthoredDate()
        );
    }
}

