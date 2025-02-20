// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideArgs();

    /**
     * Override action to use, in place of the configured action of the rule in the rule group. See `action` for details.
     * 
     */
    @Import(name="actionToUse", required=true)
    private Output<WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseArgs> actionToUse;

    /**
     * @return Override action to use, in place of the configured action of the rule in the rule group. See `action` for details.
     * 
     */
    public Output<WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseArgs> actionToUse() {
        return this.actionToUse;
    }

    /**
     * Name of the rule to override. See the [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-list.html) for a list of names in the appropriate rule group in use.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the rule to override. See the [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-list.html) for a list of names in the appropriate rule group in use.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideArgs() {}

    private WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideArgs(WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideArgs $) {
        this.actionToUse = $.actionToUse;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideArgs $;

        public Builder() {
            $ = new WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideArgs();
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideArgs defaults) {
            $ = new WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionToUse Override action to use, in place of the configured action of the rule in the rule group. See `action` for details.
         * 
         * @return builder
         * 
         */
        public Builder actionToUse(Output<WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseArgs> actionToUse) {
            $.actionToUse = actionToUse;
            return this;
        }

        /**
         * @param actionToUse Override action to use, in place of the configured action of the rule in the rule group. See `action` for details.
         * 
         * @return builder
         * 
         */
        public Builder actionToUse(WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseArgs actionToUse) {
            return actionToUse(Output.of(actionToUse));
        }

        /**
         * @param name Name of the rule to override. See the [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-list.html) for a list of names in the appropriate rule group in use.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the rule to override. See the [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-list.html) for a list of names in the appropriate rule group in use.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideArgs build() {
            $.actionToUse = Objects.requireNonNull($.actionToUse, "expected parameter 'actionToUse' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
