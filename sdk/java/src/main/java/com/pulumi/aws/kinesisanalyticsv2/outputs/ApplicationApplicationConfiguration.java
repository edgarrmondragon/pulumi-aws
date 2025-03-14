// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.outputs;

import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationApplicationCodeConfiguration;
import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationApplicationSnapshotConfiguration;
import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationEnvironmentProperties;
import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationFlinkApplicationConfiguration;
import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationRunConfiguration;
import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfiguration;
import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationVpcConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApplicationConfiguration {
    /**
     * @return The code location and type parameters for the application.
     * 
     */
    private ApplicationApplicationConfigurationApplicationCodeConfiguration applicationCodeConfiguration;
    /**
     * @return Describes whether snapshots are enabled for a Flink-based application.
     * 
     */
    private @Nullable ApplicationApplicationConfigurationApplicationSnapshotConfiguration applicationSnapshotConfiguration;
    /**
     * @return Describes execution properties for a Flink-based application.
     * 
     */
    private @Nullable ApplicationApplicationConfigurationEnvironmentProperties environmentProperties;
    /**
     * @return The configuration of a Flink-based application.
     * 
     */
    private @Nullable ApplicationApplicationConfigurationFlinkApplicationConfiguration flinkApplicationConfiguration;
    /**
     * @return Describes the starting properties for a Flink-based application.
     * 
     */
    private @Nullable ApplicationApplicationConfigurationRunConfiguration runConfiguration;
    /**
     * @return The configuration of a SQL-based application.
     * 
     */
    private @Nullable ApplicationApplicationConfigurationSqlApplicationConfiguration sqlApplicationConfiguration;
    /**
     * @return The VPC configuration of a Flink-based application.
     * 
     */
    private @Nullable ApplicationApplicationConfigurationVpcConfiguration vpcConfiguration;

    private ApplicationApplicationConfiguration() {}
    /**
     * @return The code location and type parameters for the application.
     * 
     */
    public ApplicationApplicationConfigurationApplicationCodeConfiguration applicationCodeConfiguration() {
        return this.applicationCodeConfiguration;
    }
    /**
     * @return Describes whether snapshots are enabled for a Flink-based application.
     * 
     */
    public Optional<ApplicationApplicationConfigurationApplicationSnapshotConfiguration> applicationSnapshotConfiguration() {
        return Optional.ofNullable(this.applicationSnapshotConfiguration);
    }
    /**
     * @return Describes execution properties for a Flink-based application.
     * 
     */
    public Optional<ApplicationApplicationConfigurationEnvironmentProperties> environmentProperties() {
        return Optional.ofNullable(this.environmentProperties);
    }
    /**
     * @return The configuration of a Flink-based application.
     * 
     */
    public Optional<ApplicationApplicationConfigurationFlinkApplicationConfiguration> flinkApplicationConfiguration() {
        return Optional.ofNullable(this.flinkApplicationConfiguration);
    }
    /**
     * @return Describes the starting properties for a Flink-based application.
     * 
     */
    public Optional<ApplicationApplicationConfigurationRunConfiguration> runConfiguration() {
        return Optional.ofNullable(this.runConfiguration);
    }
    /**
     * @return The configuration of a SQL-based application.
     * 
     */
    public Optional<ApplicationApplicationConfigurationSqlApplicationConfiguration> sqlApplicationConfiguration() {
        return Optional.ofNullable(this.sqlApplicationConfiguration);
    }
    /**
     * @return The VPC configuration of a Flink-based application.
     * 
     */
    public Optional<ApplicationApplicationConfigurationVpcConfiguration> vpcConfiguration() {
        return Optional.ofNullable(this.vpcConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ApplicationApplicationConfigurationApplicationCodeConfiguration applicationCodeConfiguration;
        private @Nullable ApplicationApplicationConfigurationApplicationSnapshotConfiguration applicationSnapshotConfiguration;
        private @Nullable ApplicationApplicationConfigurationEnvironmentProperties environmentProperties;
        private @Nullable ApplicationApplicationConfigurationFlinkApplicationConfiguration flinkApplicationConfiguration;
        private @Nullable ApplicationApplicationConfigurationRunConfiguration runConfiguration;
        private @Nullable ApplicationApplicationConfigurationSqlApplicationConfiguration sqlApplicationConfiguration;
        private @Nullable ApplicationApplicationConfigurationVpcConfiguration vpcConfiguration;
        public Builder() {}
        public Builder(ApplicationApplicationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationCodeConfiguration = defaults.applicationCodeConfiguration;
    	      this.applicationSnapshotConfiguration = defaults.applicationSnapshotConfiguration;
    	      this.environmentProperties = defaults.environmentProperties;
    	      this.flinkApplicationConfiguration = defaults.flinkApplicationConfiguration;
    	      this.runConfiguration = defaults.runConfiguration;
    	      this.sqlApplicationConfiguration = defaults.sqlApplicationConfiguration;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        @CustomType.Setter
        public Builder applicationCodeConfiguration(ApplicationApplicationConfigurationApplicationCodeConfiguration applicationCodeConfiguration) {
            this.applicationCodeConfiguration = Objects.requireNonNull(applicationCodeConfiguration);
            return this;
        }
        @CustomType.Setter
        public Builder applicationSnapshotConfiguration(@Nullable ApplicationApplicationConfigurationApplicationSnapshotConfiguration applicationSnapshotConfiguration) {
            this.applicationSnapshotConfiguration = applicationSnapshotConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder environmentProperties(@Nullable ApplicationApplicationConfigurationEnvironmentProperties environmentProperties) {
            this.environmentProperties = environmentProperties;
            return this;
        }
        @CustomType.Setter
        public Builder flinkApplicationConfiguration(@Nullable ApplicationApplicationConfigurationFlinkApplicationConfiguration flinkApplicationConfiguration) {
            this.flinkApplicationConfiguration = flinkApplicationConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder runConfiguration(@Nullable ApplicationApplicationConfigurationRunConfiguration runConfiguration) {
            this.runConfiguration = runConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder sqlApplicationConfiguration(@Nullable ApplicationApplicationConfigurationSqlApplicationConfiguration sqlApplicationConfiguration) {
            this.sqlApplicationConfiguration = sqlApplicationConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder vpcConfiguration(@Nullable ApplicationApplicationConfigurationVpcConfiguration vpcConfiguration) {
            this.vpcConfiguration = vpcConfiguration;
            return this;
        }
        public ApplicationApplicationConfiguration build() {
            final var o = new ApplicationApplicationConfiguration();
            o.applicationCodeConfiguration = applicationCodeConfiguration;
            o.applicationSnapshotConfiguration = applicationSnapshotConfiguration;
            o.environmentProperties = environmentProperties;
            o.flinkApplicationConfiguration = flinkApplicationConfiguration;
            o.runConfiguration = runConfiguration;
            o.sqlApplicationConfiguration = sqlApplicationConfiguration;
            o.vpcConfiguration = vpcConfiguration;
            return o;
        }
    }
}
