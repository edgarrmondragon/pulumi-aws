// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class EfsLocationEc2Config {
    /**
     * @return List of Amazon Resource Names (ARNs) of the EC2 Security Groups that are associated with the EFS Mount Target.
     * 
     */
    private List<String> securityGroupArns;
    /**
     * @return Amazon Resource Name (ARN) of the EC2 Subnet that is associated with the EFS Mount Target.
     * 
     */
    private String subnetArn;

    private EfsLocationEc2Config() {}
    /**
     * @return List of Amazon Resource Names (ARNs) of the EC2 Security Groups that are associated with the EFS Mount Target.
     * 
     */
    public List<String> securityGroupArns() {
        return this.securityGroupArns;
    }
    /**
     * @return Amazon Resource Name (ARN) of the EC2 Subnet that is associated with the EFS Mount Target.
     * 
     */
    public String subnetArn() {
        return this.subnetArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EfsLocationEc2Config defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> securityGroupArns;
        private String subnetArn;
        public Builder() {}
        public Builder(EfsLocationEc2Config defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupArns = defaults.securityGroupArns;
    	      this.subnetArn = defaults.subnetArn;
        }

        @CustomType.Setter
        public Builder securityGroupArns(List<String> securityGroupArns) {
            this.securityGroupArns = Objects.requireNonNull(securityGroupArns);
            return this;
        }
        public Builder securityGroupArns(String... securityGroupArns) {
            return securityGroupArns(List.of(securityGroupArns));
        }
        @CustomType.Setter
        public Builder subnetArn(String subnetArn) {
            this.subnetArn = Objects.requireNonNull(subnetArn);
            return this;
        }
        public EfsLocationEc2Config build() {
            final var o = new EfsLocationEc2Config();
            o.securityGroupArns = securityGroupArns;
            o.subnetArn = subnetArn;
            return o;
        }
    }
}
