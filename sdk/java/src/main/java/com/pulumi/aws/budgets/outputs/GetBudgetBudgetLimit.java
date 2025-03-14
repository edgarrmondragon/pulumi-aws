// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.budgets.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBudgetBudgetLimit {
    /**
     * @return The cost or usage amount that&#39;s associated with a budget forecast, actual spend, or budget threshold. Length Constraints: Minimum length of `1`. Maximum length of `2147483647`.
     * 
     */
    private String amount;
    /**
     * @return The unit of measurement that&#39;s used for the budget forecast, actual spend, or budget threshold, such as USD or GBP. Length Constraints: Minimum length of `1`. Maximum length of `2147483647`.
     * 
     */
    private String unit;

    private GetBudgetBudgetLimit() {}
    /**
     * @return The cost or usage amount that&#39;s associated with a budget forecast, actual spend, or budget threshold. Length Constraints: Minimum length of `1`. Maximum length of `2147483647`.
     * 
     */
    public String amount() {
        return this.amount;
    }
    /**
     * @return The unit of measurement that&#39;s used for the budget forecast, actual spend, or budget threshold, such as USD or GBP. Length Constraints: Minimum length of `1`. Maximum length of `2147483647`.
     * 
     */
    public String unit() {
        return this.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBudgetBudgetLimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String amount;
        private String unit;
        public Builder() {}
        public Builder(GetBudgetBudgetLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.unit = defaults.unit;
        }

        @CustomType.Setter
        public Builder amount(String amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }
        @CustomType.Setter
        public Builder unit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }
        public GetBudgetBudgetLimit build() {
            final var o = new GetBudgetBudgetLimit();
            o.amount = amount;
            o.unit = unit;
            return o;
        }
    }
}
