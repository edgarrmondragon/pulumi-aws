// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.FleetSpotOptionsMaintenanceStrategies;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FleetSpotOptions {
    /**
     * @return How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`, `capacity-optimized`, `capacity-optimized-prioritized` and `price-capacity-optimized`. Default: `lowestPrice`.
     * 
     */
    private @Nullable String allocationStrategy;
    /**
     * @return Behavior when a Spot Instance is interrupted. Valid values: `hibernate`, `stop`, `terminate`. Default: `terminate`.
     * 
     */
    private @Nullable String instanceInterruptionBehavior;
    /**
     * @return Number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot `allocation_strategy` is set to `lowestPrice`. Default: `1`.
     * 
     */
    private @Nullable Integer instancePoolsToUseCount;
    /**
     * @return Nested argument containing maintenance strategies for managing your Spot Instances that are at an elevated risk of being interrupted. Defined below.
     * 
     */
    private @Nullable FleetSpotOptionsMaintenanceStrategies maintenanceStrategies;

    private FleetSpotOptions() {}
    /**
     * @return How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`, `capacity-optimized`, `capacity-optimized-prioritized` and `price-capacity-optimized`. Default: `lowestPrice`.
     * 
     */
    public Optional<String> allocationStrategy() {
        return Optional.ofNullable(this.allocationStrategy);
    }
    /**
     * @return Behavior when a Spot Instance is interrupted. Valid values: `hibernate`, `stop`, `terminate`. Default: `terminate`.
     * 
     */
    public Optional<String> instanceInterruptionBehavior() {
        return Optional.ofNullable(this.instanceInterruptionBehavior);
    }
    /**
     * @return Number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot `allocation_strategy` is set to `lowestPrice`. Default: `1`.
     * 
     */
    public Optional<Integer> instancePoolsToUseCount() {
        return Optional.ofNullable(this.instancePoolsToUseCount);
    }
    /**
     * @return Nested argument containing maintenance strategies for managing your Spot Instances that are at an elevated risk of being interrupted. Defined below.
     * 
     */
    public Optional<FleetSpotOptionsMaintenanceStrategies> maintenanceStrategies() {
        return Optional.ofNullable(this.maintenanceStrategies);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetSpotOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String allocationStrategy;
        private @Nullable String instanceInterruptionBehavior;
        private @Nullable Integer instancePoolsToUseCount;
        private @Nullable FleetSpotOptionsMaintenanceStrategies maintenanceStrategies;
        public Builder() {}
        public Builder(FleetSpotOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
    	      this.instanceInterruptionBehavior = defaults.instanceInterruptionBehavior;
    	      this.instancePoolsToUseCount = defaults.instancePoolsToUseCount;
    	      this.maintenanceStrategies = defaults.maintenanceStrategies;
        }

        @CustomType.Setter
        public Builder allocationStrategy(@Nullable String allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }
        @CustomType.Setter
        public Builder instanceInterruptionBehavior(@Nullable String instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = instanceInterruptionBehavior;
            return this;
        }
        @CustomType.Setter
        public Builder instancePoolsToUseCount(@Nullable Integer instancePoolsToUseCount) {
            this.instancePoolsToUseCount = instancePoolsToUseCount;
            return this;
        }
        @CustomType.Setter
        public Builder maintenanceStrategies(@Nullable FleetSpotOptionsMaintenanceStrategies maintenanceStrategies) {
            this.maintenanceStrategies = maintenanceStrategies;
            return this;
        }
        public FleetSpotOptions build() {
            final var o = new FleetSpotOptions();
            o.allocationStrategy = allocationStrategy;
            o.instanceInterruptionBehavior = instanceInterruptionBehavior;
            o.instancePoolsToUseCount = instancePoolsToUseCount;
            o.maintenanceStrategies = maintenanceStrategies;
            return o;
        }
    }
}
