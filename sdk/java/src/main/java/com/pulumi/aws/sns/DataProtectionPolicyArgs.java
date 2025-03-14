// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sns;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DataProtectionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataProtectionPolicyArgs Empty = new DataProtectionPolicyArgs();

    /**
     * The ARN of the SNS topic
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return The ARN of the SNS topic
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    /**
     * The fully-formed AWS policy as JSON. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide.
     * 
     */
    @Import(name="policy", required=true)
    private Output<String> policy;

    /**
     * @return The fully-formed AWS policy as JSON. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    private DataProtectionPolicyArgs() {}

    private DataProtectionPolicyArgs(DataProtectionPolicyArgs $) {
        this.arn = $.arn;
        this.policy = $.policy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataProtectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataProtectionPolicyArgs $;

        public Builder() {
            $ = new DataProtectionPolicyArgs();
        }

        public Builder(DataProtectionPolicyArgs defaults) {
            $ = new DataProtectionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the SNS topic
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the SNS topic
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param policy The fully-formed AWS policy as JSON. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide.
         * 
         * @return builder
         * 
         */
        public Builder policy(Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy The fully-formed AWS policy as JSON. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public DataProtectionPolicyArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            $.policy = Objects.requireNonNull($.policy, "expected parameter 'policy' to be non-null");
            return $;
        }
    }

}
