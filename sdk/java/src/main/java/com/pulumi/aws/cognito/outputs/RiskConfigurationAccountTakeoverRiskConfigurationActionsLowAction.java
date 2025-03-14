// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction {
    /**
     * @return The action to take in response to the account takeover action. Valid values are `BLOCK`, `MFA_IF_CONFIGURED`, `MFA_REQUIRED` and `NO_ACTION`.
     * 
     */
    private String eventAction;
    private Boolean notify;

    private RiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction() {}
    /**
     * @return The action to take in response to the account takeover action. Valid values are `BLOCK`, `MFA_IF_CONFIGURED`, `MFA_REQUIRED` and `NO_ACTION`.
     * 
     */
    public String eventAction() {
        return this.eventAction;
    }
    public Boolean notify_() {
        return this.notify;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String eventAction;
        private Boolean notify;
        public Builder() {}
        public Builder(RiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventAction = defaults.eventAction;
    	      this.notify = defaults.notify;
        }

        @CustomType.Setter
        public Builder eventAction(String eventAction) {
            this.eventAction = Objects.requireNonNull(eventAction);
            return this;
        }
        @CustomType.Setter("notify")
        public Builder notify_(Boolean notify) {
            this.notify = Objects.requireNonNull(notify);
            return this;
        }
        public RiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction build() {
            final var o = new RiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction();
            o.eventAction = eventAction;
            o.notify = notify;
            return o;
        }
    }
}
