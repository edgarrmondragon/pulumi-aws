// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UserDefinedFunctionResourceUri {
    /**
     * @return The type of the resource. can be one of `JAR`, `FILE`, and `ARCHIVE`.
     * 
     */
    private String resourceType;
    /**
     * @return The URI for accessing the resource.
     * 
     */
    private String uri;

    private UserDefinedFunctionResourceUri() {}
    /**
     * @return The type of the resource. can be one of `JAR`, `FILE`, and `ARCHIVE`.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }
    /**
     * @return The URI for accessing the resource.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserDefinedFunctionResourceUri defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String resourceType;
        private String uri;
        public Builder() {}
        public Builder(UserDefinedFunctionResourceUri defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        @CustomType.Setter
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public UserDefinedFunctionResourceUri build() {
            final var o = new UserDefinedFunctionResourceUri();
            o.resourceType = resourceType;
            o.uri = uri;
            return o;
        }
    }
}
