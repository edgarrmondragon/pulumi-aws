// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoggingOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingOptionsArgs Empty = new LoggingOptionsArgs();

    /**
     * The default logging level. Valid Values: `&#34;DEBUG&#34;`, `&#34;INFO&#34;`, `&#34;ERROR&#34;`, `&#34;WARN&#34;`, `&#34;DISABLED&#34;`.
     * 
     */
    @Import(name="defaultLogLevel", required=true)
    private Output<String> defaultLogLevel;

    /**
     * @return The default logging level. Valid Values: `&#34;DEBUG&#34;`, `&#34;INFO&#34;`, `&#34;ERROR&#34;`, `&#34;WARN&#34;`, `&#34;DISABLED&#34;`.
     * 
     */
    public Output<String> defaultLogLevel() {
        return this.defaultLogLevel;
    }

    /**
     * If `true` all logs are disabled. The default is `false`.
     * 
     */
    @Import(name="disableAllLogs")
    private @Nullable Output<Boolean> disableAllLogs;

    /**
     * @return If `true` all logs are disabled. The default is `false`.
     * 
     */
    public Optional<Output<Boolean>> disableAllLogs() {
        return Optional.ofNullable(this.disableAllLogs);
    }

    /**
     * The ARN of the role that allows IoT to write to Cloudwatch logs.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The ARN of the role that allows IoT to write to Cloudwatch logs.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    private LoggingOptionsArgs() {}

    private LoggingOptionsArgs(LoggingOptionsArgs $) {
        this.defaultLogLevel = $.defaultLogLevel;
        this.disableAllLogs = $.disableAllLogs;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingOptionsArgs $;

        public Builder() {
            $ = new LoggingOptionsArgs();
        }

        public Builder(LoggingOptionsArgs defaults) {
            $ = new LoggingOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultLogLevel The default logging level. Valid Values: `&#34;DEBUG&#34;`, `&#34;INFO&#34;`, `&#34;ERROR&#34;`, `&#34;WARN&#34;`, `&#34;DISABLED&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder defaultLogLevel(Output<String> defaultLogLevel) {
            $.defaultLogLevel = defaultLogLevel;
            return this;
        }

        /**
         * @param defaultLogLevel The default logging level. Valid Values: `&#34;DEBUG&#34;`, `&#34;INFO&#34;`, `&#34;ERROR&#34;`, `&#34;WARN&#34;`, `&#34;DISABLED&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder defaultLogLevel(String defaultLogLevel) {
            return defaultLogLevel(Output.of(defaultLogLevel));
        }

        /**
         * @param disableAllLogs If `true` all logs are disabled. The default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableAllLogs(@Nullable Output<Boolean> disableAllLogs) {
            $.disableAllLogs = disableAllLogs;
            return this;
        }

        /**
         * @param disableAllLogs If `true` all logs are disabled. The default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableAllLogs(Boolean disableAllLogs) {
            return disableAllLogs(Output.of(disableAllLogs));
        }

        /**
         * @param roleArn The ARN of the role that allows IoT to write to Cloudwatch logs.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The ARN of the role that allows IoT to write to Cloudwatch logs.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public LoggingOptionsArgs build() {
            $.defaultLogLevel = Objects.requireNonNull($.defaultLogLevel, "expected parameter 'defaultLogLevel' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
