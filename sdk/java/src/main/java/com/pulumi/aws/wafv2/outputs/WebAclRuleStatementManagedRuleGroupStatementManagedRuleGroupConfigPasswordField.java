// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigPasswordField {
    /**
     * @return The name of the password field.
     * 
     */
    private String identifier;

    private WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigPasswordField() {}
    /**
     * @return The name of the password field.
     * 
     */
    public String identifier() {
        return this.identifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigPasswordField defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String identifier;
        public Builder() {}
        public Builder(WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigPasswordField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifier = defaults.identifier;
        }

        @CustomType.Setter
        public Builder identifier(String identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }
        public WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigPasswordField build() {
            final var o = new WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigPasswordField();
            o.identifier = identifier;
            return o;
        }
    }
}
