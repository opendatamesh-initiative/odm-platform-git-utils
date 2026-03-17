package org.opendatamesh.platform.git.client.exceptions;

/**
 * Internal exception for git-utils library (e.g. reflection or mapping failures).
 */
public class GitUtilsException extends RuntimeException {
    public GitUtilsException(String message) {
        super(message);
    }

    public GitUtilsException(String message, Throwable cause) {
        super(message, cause);
    }
}
