package org.opendatamesh.platform.git.git;

/**
 * Defines which changes are staged when adding to the Git index. Each mode maps
 * to a supported Git {@code add} behavior (see {@link GitOperation#add}).
 */
public enum AddMode {

    /**
     * Stage all changes: new, modified, and deleted files.
     * Equivalent to: {@code git add -A}
     */
    ALL,

    /**
     * Stage only tracked files (modified and deleted). Excludes new/untracked
     * files.
     * Equivalent to: {@code git add -u}
     */
    TRACKED_ONLY,

    /**
     * Stage new and modified files, but do not stage deletions of tracked files.
     * Equivalent to: {@code git add --ignore-removal .}
     */
    NO_DELETIONS
}
