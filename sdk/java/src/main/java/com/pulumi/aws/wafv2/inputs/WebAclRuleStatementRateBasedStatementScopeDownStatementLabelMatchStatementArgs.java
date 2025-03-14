// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementArgs();

    /**
     * String to match against.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return String to match against.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Specify whether you want to match using the label name or just the namespace. Valid values are `LABEL` or `NAMESPACE`.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return Specify whether you want to match using the label name or just the namespace. Valid values are `LABEL` or `NAMESPACE`.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementArgs() {}

    private WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementArgs(WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementArgs $) {
        this.key = $.key;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementArgs();
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementArgs defaults) {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key String to match against.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key String to match against.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param scope Specify whether you want to match using the label name or just the namespace. Valid values are `LABEL` or `NAMESPACE`.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Specify whether you want to match using the label name or just the namespace. Valid values are `LABEL` or `NAMESPACE`.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
