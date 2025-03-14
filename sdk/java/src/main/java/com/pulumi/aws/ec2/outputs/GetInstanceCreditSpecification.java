// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceCreditSpecification {
    private String cpuCredits;

    private GetInstanceCreditSpecification() {}
    public String cpuCredits() {
        return this.cpuCredits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceCreditSpecification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cpuCredits;
        public Builder() {}
        public Builder(GetInstanceCreditSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCredits = defaults.cpuCredits;
        }

        @CustomType.Setter
        public Builder cpuCredits(String cpuCredits) {
            this.cpuCredits = Objects.requireNonNull(cpuCredits);
            return this;
        }
        public GetInstanceCreditSpecification build() {
            final var o = new GetInstanceCreditSpecification();
            o.cpuCredits = cpuCredits;
            return o;
        }
    }
}
