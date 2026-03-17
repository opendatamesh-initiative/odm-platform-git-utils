# ODM Platform Git Utils

Open Data Mesh Platform Git utilities: a Java library providing a unified abstraction over Git hosting providers (
GitHub, GitLab, Bitbucket, Azure DevOps) and optional REST client helpers.

<!-- TOC -->

* [ODM Platform Git Utils](#odm-platform-git-utils)
    * [Overview](#overview)
    * [Prerequisites](#prerequisites)
    * [Building the Project](#building-the-project)
    * [Usage](#usage)
        * [Maven dependency](#maven-dependency)
        * [Repository configuration](#repository-configuration)
    * [Package Structure](#package-structure)
    * [Architecture](#architecture)
    * [Testing](#testing)
    * [Contributing](#contributing)
    * [License](#license)
    * [Support](#support)

<!-- TOC -->

## Overview

This library is part of the Open Data Mesh Platform. It offers:

- **Git provider abstraction** — A single `GitProvider` interface implemented for GitHub, GitLab, Bitbucket, and Azure
  DevOps, with operations for users, organizations, repositories, commits, branches, and tags.
- **Low-level Git operations** — Clone, init, add, commit, push, tag, and resolve HEAD via a `GitOperation` facade (
  JGit-based).
- **REST client utilities** — Optional helpers for HTTP calls and pagination (`org.opendatamesh.platform.git.client`).

Consuming applications (e.g.
the [ODM Platform Registry](https://github.com/opendatamesh-initiative/odm-platform-pp-registry-server)) implement their
own factory to create provider instances (using their own provider-type enum and credentials).

## Prerequisites

- Java 21 or higher
- Maven 3.6 or higher

## Building the Project

```bash
# Clone the repository
git clone https://github.com/opendatamesh-initiative/odm-platform-git-utils.git

# Navigate to project directory
cd odm-platform-git-utils

# Build the project
mvn clean install

# Run tests
mvn verify
```

## Usage

### Maven dependency

Add the library to your project:

```xml

<dependency>
    <groupId>org.opendatamesh</groupId>
    <artifactId>odm-platform-git-utils</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Repository configuration

If the artifact is published to GitHub Packages, add the repository (and matching server in `~/.m2/settings.xml` with
`GITHUB_TOKEN`):

```xml

<repositories>
    <repository>
        <id>odm-git-utils-repo</id>
        <name>GitHub Packages for ODM Platform Git Utils</name>
        <url>https://maven.pkg.github.com/opendatamesh-initiative/odm-platform-git-utils</url>
    </repository>
</repositories>
```

## Package Structure

- **`org.opendatamesh.platform.git.provider`** — `GitProvider` interface, `GitProviderIdentifier`, and implementations (
  GitHub, GitLab, Bitbucket, Azure DevOps).
- **`org.opendatamesh.platform.git.model`** — Shared models (Repository, Branch, Commit, Tag, User, Organization,
  RepositoryPointer, etc.).
- **`org.opendatamesh.platform.git.git`** — Low-level Git operations (`GitOperation`, `GitOperationImpl`) and credential
  types.
- **`org.opendatamesh.platform.git.exceptions`** — `GitException`, `GitOperationException`, `GitClientException`,
  `GitProviderAuthenticationException`, `GitProviderConfigurationException`.
- **`org.opendatamesh.platform.git.client`** — Optional REST client utilities and exceptions.

## Architecture

For detailed design, extension points, and how-to guides (extending resources, custom resources, adding a provider),
see:

**[Git Handler Architecture](docs/ARCHITECTURE.md)**

## Testing

Run the test suite:

```bash
# Run all tests
mvn test

# Full verify (tests + any checks)
mvn verify
```

Unit tests for each provider (GitHub, GitLab, Bitbucket, Azure) and for `GitOperationImpl` are under
`src/test/java/org/opendatamesh/platform/git/`, with JSON fixtures in `src/test/resources/`.

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the Apache License 2.0 — see the [LICENSE](LICENSE) file for details.

## Support

For support, please open an issue in
the [GitHub repository](https://github.com/opendatamesh-initiative/odm-platform-git-utils).
