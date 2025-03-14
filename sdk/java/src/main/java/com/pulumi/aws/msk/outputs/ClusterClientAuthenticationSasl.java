// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClientAuthenticationSasl {
    /**
     * @return Enables SASL/IAM authentication for VPC connectivity.
     * 
     */
    private @Nullable Boolean iam;
    /**
     * @return Enables SASL/SCRAM authentication for VPC connectivity.
     * 
     */
    private @Nullable Boolean scram;

    private ClusterClientAuthenticationSasl() {}
    /**
     * @return Enables SASL/IAM authentication for VPC connectivity.
     * 
     */
    public Optional<Boolean> iam() {
        return Optional.ofNullable(this.iam);
    }
    /**
     * @return Enables SASL/SCRAM authentication for VPC connectivity.
     * 
     */
    public Optional<Boolean> scram() {
        return Optional.ofNullable(this.scram);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClientAuthenticationSasl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean iam;
        private @Nullable Boolean scram;
        public Builder() {}
        public Builder(ClusterClientAuthenticationSasl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iam = defaults.iam;
    	      this.scram = defaults.scram;
        }

        @CustomType.Setter
        public Builder iam(@Nullable Boolean iam) {
            this.iam = iam;
            return this;
        }
        @CustomType.Setter
        public Builder scram(@Nullable Boolean scram) {
            this.scram = scram;
            return this;
        }
        public ClusterClientAuthenticationSasl build() {
            final var o = new ClusterClientAuthenticationSasl();
            o.iam = iam;
            o.scram = scram;
            return o;
        }
    }
}
