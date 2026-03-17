package org.opendatamesh.platform.git.git;

import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.InitCommand;
import org.eclipse.jgit.api.LsRemoteCommand;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevWalk;

import java.io.File;
import java.io.IOException;

public class JGitFactory {

    public Git open(File repoDir) throws IOException {
        return Git.open(repoDir);
    }

    public InitCommand init() {
        return Git.init();
    }

    public LsRemoteCommand lsRemoteRepository() {
        return Git.lsRemoteRepository();
    }

    public CloneCommand cloneRepository() {
        return Git.cloneRepository();
    }

    public RevWalk createRevWalk(Repository repository) {
        return new RevWalk(repository);
    }
}
