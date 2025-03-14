// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ExperimentTemplateLogConfigurationCloudwatchLogsConfiguration {
    /**
     * @return The Amazon Resource Name (ARN) of the destination Amazon CloudWatch Logs log group.
     * 
     */
    private String logGroupArn;

    private ExperimentTemplateLogConfigurationCloudwatchLogsConfiguration() {}
    /**
     * @return The Amazon Resource Name (ARN) of the destination Amazon CloudWatch Logs log group.
     * 
     */
    public String logGroupArn() {
        return this.logGroupArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentTemplateLogConfigurationCloudwatchLogsConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String logGroupArn;
        public Builder() {}
        public Builder(ExperimentTemplateLogConfigurationCloudwatchLogsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupArn = defaults.logGroupArn;
        }

        @CustomType.Setter
        public Builder logGroupArn(String logGroupArn) {
            this.logGroupArn = Objects.requireNonNull(logGroupArn);
            return this;
        }
        public ExperimentTemplateLogConfigurationCloudwatchLogsConfiguration build() {
            final var o = new ExperimentTemplateLogConfigurationCloudwatchLogsConfiguration();
            o.logGroupArn = logGroupArn;
            return o;
        }
    }
}
