// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PolicyIncludeMap {
    /**
     * @return A list of AWS Organization member Accounts that you want to include for this AWS FMS Policy.
     * 
     */
    private @Nullable List<String> accounts;
    /**
     * @return A list of IDs of the AWS Organizational Units that you want to include for this AWS FMS Policy. Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its child OUs, including any child OUs and accounts that are added at a later time.
     * 
     * You can specify inclusions or exclusions, but not both. If you specify an `include_map`, AWS Firewall Manager applies the policy to all accounts specified by the `include_map`, and does not evaluate any `exclude_map` specifications. If you do not specify an `include_map`, then Firewall Manager applies the policy to all accounts except for those specified by the `exclude_map`.
     * 
     */
    private @Nullable List<String> orgunits;

    private PolicyIncludeMap() {}
    /**
     * @return A list of AWS Organization member Accounts that you want to include for this AWS FMS Policy.
     * 
     */
    public List<String> accounts() {
        return this.accounts == null ? List.of() : this.accounts;
    }
    /**
     * @return A list of IDs of the AWS Organizational Units that you want to include for this AWS FMS Policy. Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its child OUs, including any child OUs and accounts that are added at a later time.
     * 
     * You can specify inclusions or exclusions, but not both. If you specify an `include_map`, AWS Firewall Manager applies the policy to all accounts specified by the `include_map`, and does not evaluate any `exclude_map` specifications. If you do not specify an `include_map`, then Firewall Manager applies the policy to all accounts except for those specified by the `exclude_map`.
     * 
     */
    public List<String> orgunits() {
        return this.orgunits == null ? List.of() : this.orgunits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyIncludeMap defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> accounts;
        private @Nullable List<String> orgunits;
        public Builder() {}
        public Builder(PolicyIncludeMap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
    	      this.orgunits = defaults.orgunits;
        }

        @CustomType.Setter
        public Builder accounts(@Nullable List<String> accounts) {
            this.accounts = accounts;
            return this;
        }
        public Builder accounts(String... accounts) {
            return accounts(List.of(accounts));
        }
        @CustomType.Setter
        public Builder orgunits(@Nullable List<String> orgunits) {
            this.orgunits = orgunits;
            return this;
        }
        public Builder orgunits(String... orgunits) {
            return orgunits(List.of(orgunits));
        }
        public PolicyIncludeMap build() {
            final var o = new PolicyIncludeMap();
            o.accounts = accounts;
            o.orgunits = orgunits;
            return o;
        }
    }
}
