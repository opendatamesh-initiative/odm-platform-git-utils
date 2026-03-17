package org.opendatamesh.platform.git.provider.github.resources.listbranches;

import org.opendatamesh.platform.git.model.Branch;

public abstract class GitHubListBranchesMapper {

    public static Branch toInternalModel(GitHubListBranchesBranchRes branchRes) {
        if (branchRes == null) {
            return null;
        }

        Branch branch = new Branch(
                branchRes.getName(),
                branchRes.getCommit() != null ? branchRes.getCommit().getSha() : null
        );
        branch.setProtected(branchRes.isProtected());

        return branch;
    }
}

