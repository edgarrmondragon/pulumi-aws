// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternAll;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPattern {
    /**
     * @return An empty configuration block that is used for inspecting all headers.
     * 
     */
    private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternAll all;
    private @Nullable List<String> includedPaths;

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPattern() {}
    /**
     * @return An empty configuration block that is used for inspecting all headers.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternAll> all() {
        return Optional.ofNullable(this.all);
    }
    public List<String> includedPaths() {
        return this.includedPaths == null ? List.of() : this.includedPaths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPattern defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternAll all;
        private @Nullable List<String> includedPaths;
        public Builder() {}
        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPattern defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.includedPaths = defaults.includedPaths;
        }

        @CustomType.Setter
        public Builder all(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternAll all) {
            this.all = all;
            return this;
        }
        @CustomType.Setter
        public Builder includedPaths(@Nullable List<String> includedPaths) {
            this.includedPaths = includedPaths;
            return this;
        }
        public Builder includedPaths(String... includedPaths) {
            return includedPaths(List.of(includedPaths));
        }
        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPattern build() {
            final var o = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPattern();
            o.all = all;
            o.includedPaths = includedPaths;
            return o;
        }
    }
}
