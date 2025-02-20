// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.outputs;

import com.pulumi.aws.codebuild.outputs.ProjectEnvironmentEnvironmentVariable;
import com.pulumi.aws.codebuild.outputs.ProjectEnvironmentRegistryCredential;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectEnvironment {
    /**
     * @return ARN of the S3 bucket, path prefix and object key that contains the PEM-encoded certificate.
     * 
     */
    private @Nullable String certificate;
    /**
     * @return Information about the compute resources the build project will use. Valid values: `BUILD_GENERAL1_SMALL`, `BUILD_GENERAL1_MEDIUM`, `BUILD_GENERAL1_LARGE`, `BUILD_GENERAL1_2XLARGE`. `BUILD_GENERAL1_SMALL` is only valid if `type` is set to `LINUX_CONTAINER`. When `type` is set to `LINUX_GPU_CONTAINER`, `compute_type` must be `BUILD_GENERAL1_LARGE`.
     * 
     */
    private String computeType;
    /**
     * @return Configuration block. Detailed below.
     * 
     */
    private @Nullable List<ProjectEnvironmentEnvironmentVariable> environmentVariables;
    /**
     * @return Docker image to use for this build project. Valid values include [Docker images provided by CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html) (e.g `aws/codebuild/amazonlinux2-x86_64-standard:4.0`), [Docker Hub images](https://hub.docker.com/) (e.g., `pulumi/pulumi:latest`), and full Docker repository URIs such as those for ECR (e.g., `137112412989.dkr.ecr.us-west-2.amazonaws.com/amazonlinux:latest`).
     * 
     */
    private String image;
    /**
     * @return Type of credentials AWS CodeBuild uses to pull images in your build. Valid values: `CODEBUILD`, `SERVICE_ROLE`. When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CodeBuild credentials. Defaults to `CODEBUILD`.
     * 
     */
    private @Nullable String imagePullCredentialsType;
    /**
     * @return Whether to enable running the Docker daemon inside a Docker container. Defaults to `false`.
     * 
     */
    private @Nullable Boolean privilegedMode;
    /**
     * @return Configuration block. Detailed below.
     * 
     */
    private @Nullable ProjectEnvironmentRegistryCredential registryCredential;
    /**
     * @return Type of environment variable. Valid values: `PARAMETER_STORE`, `PLAINTEXT`, `SECRETS_MANAGER`.
     * 
     */
    private String type;

    private ProjectEnvironment() {}
    /**
     * @return ARN of the S3 bucket, path prefix and object key that contains the PEM-encoded certificate.
     * 
     */
    public Optional<String> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * @return Information about the compute resources the build project will use. Valid values: `BUILD_GENERAL1_SMALL`, `BUILD_GENERAL1_MEDIUM`, `BUILD_GENERAL1_LARGE`, `BUILD_GENERAL1_2XLARGE`. `BUILD_GENERAL1_SMALL` is only valid if `type` is set to `LINUX_CONTAINER`. When `type` is set to `LINUX_GPU_CONTAINER`, `compute_type` must be `BUILD_GENERAL1_LARGE`.
     * 
     */
    public String computeType() {
        return this.computeType;
    }
    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public List<ProjectEnvironmentEnvironmentVariable> environmentVariables() {
        return this.environmentVariables == null ? List.of() : this.environmentVariables;
    }
    /**
     * @return Docker image to use for this build project. Valid values include [Docker images provided by CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html) (e.g `aws/codebuild/amazonlinux2-x86_64-standard:4.0`), [Docker Hub images](https://hub.docker.com/) (e.g., `pulumi/pulumi:latest`), and full Docker repository URIs such as those for ECR (e.g., `137112412989.dkr.ecr.us-west-2.amazonaws.com/amazonlinux:latest`).
     * 
     */
    public String image() {
        return this.image;
    }
    /**
     * @return Type of credentials AWS CodeBuild uses to pull images in your build. Valid values: `CODEBUILD`, `SERVICE_ROLE`. When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CodeBuild credentials. Defaults to `CODEBUILD`.
     * 
     */
    public Optional<String> imagePullCredentialsType() {
        return Optional.ofNullable(this.imagePullCredentialsType);
    }
    /**
     * @return Whether to enable running the Docker daemon inside a Docker container. Defaults to `false`.
     * 
     */
    public Optional<Boolean> privilegedMode() {
        return Optional.ofNullable(this.privilegedMode);
    }
    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Optional<ProjectEnvironmentRegistryCredential> registryCredential() {
        return Optional.ofNullable(this.registryCredential);
    }
    /**
     * @return Type of environment variable. Valid values: `PARAMETER_STORE`, `PLAINTEXT`, `SECRETS_MANAGER`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectEnvironment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String certificate;
        private String computeType;
        private @Nullable List<ProjectEnvironmentEnvironmentVariable> environmentVariables;
        private String image;
        private @Nullable String imagePullCredentialsType;
        private @Nullable Boolean privilegedMode;
        private @Nullable ProjectEnvironmentRegistryCredential registryCredential;
        private String type;
        public Builder() {}
        public Builder(ProjectEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.computeType = defaults.computeType;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.image = defaults.image;
    	      this.imagePullCredentialsType = defaults.imagePullCredentialsType;
    	      this.privilegedMode = defaults.privilegedMode;
    	      this.registryCredential = defaults.registryCredential;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder certificate(@Nullable String certificate) {
            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder computeType(String computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }
        @CustomType.Setter
        public Builder environmentVariables(@Nullable List<ProjectEnvironmentEnvironmentVariable> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder environmentVariables(ProjectEnvironmentEnvironmentVariable... environmentVariables) {
            return environmentVariables(List.of(environmentVariables));
        }
        @CustomType.Setter
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        @CustomType.Setter
        public Builder imagePullCredentialsType(@Nullable String imagePullCredentialsType) {
            this.imagePullCredentialsType = imagePullCredentialsType;
            return this;
        }
        @CustomType.Setter
        public Builder privilegedMode(@Nullable Boolean privilegedMode) {
            this.privilegedMode = privilegedMode;
            return this;
        }
        @CustomType.Setter
        public Builder registryCredential(@Nullable ProjectEnvironmentRegistryCredential registryCredential) {
            this.registryCredential = registryCredential;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ProjectEnvironment build() {
            final var o = new ProjectEnvironment();
            o.certificate = certificate;
            o.computeType = computeType;
            o.environmentVariables = environmentVariables;
            o.image = image;
            o.imagePullCredentialsType = imagePullCredentialsType;
            o.privilegedMode = privilegedMode;
            o.registryCredential = registryCredential;
            o.type = type;
            return o;
        }
    }
}
