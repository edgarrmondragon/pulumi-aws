// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class VirtualNodeSpecListenerOutlierDetectionIntervalArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerOutlierDetectionIntervalArgs Empty = new VirtualNodeSpecListenerOutlierDetectionIntervalArgs();

    /**
     * Unit of time. Valid values: `ms`, `s`.
     * 
     */
    @Import(name="unit", required=true)
    private Output<String> unit;

    /**
     * @return Unit of time. Valid values: `ms`, `s`.
     * 
     */
    public Output<String> unit() {
        return this.unit;
    }

    /**
     * The specified value for the JSON. Must be between 1 and 100 characters in length.
     * 
     */
    @Import(name="value", required=true)
    private Output<Integer> value;

    /**
     * @return The specified value for the JSON. Must be between 1 and 100 characters in length.
     * 
     */
    public Output<Integer> value() {
        return this.value;
    }

    private VirtualNodeSpecListenerOutlierDetectionIntervalArgs() {}

    private VirtualNodeSpecListenerOutlierDetectionIntervalArgs(VirtualNodeSpecListenerOutlierDetectionIntervalArgs $) {
        this.unit = $.unit;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecListenerOutlierDetectionIntervalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecListenerOutlierDetectionIntervalArgs $;

        public Builder() {
            $ = new VirtualNodeSpecListenerOutlierDetectionIntervalArgs();
        }

        public Builder(VirtualNodeSpecListenerOutlierDetectionIntervalArgs defaults) {
            $ = new VirtualNodeSpecListenerOutlierDetectionIntervalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param unit Unit of time. Valid values: `ms`, `s`.
         * 
         * @return builder
         * 
         */
        public Builder unit(Output<String> unit) {
            $.unit = unit;
            return this;
        }

        /**
         * @param unit Unit of time. Valid values: `ms`, `s`.
         * 
         * @return builder
         * 
         */
        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        /**
         * @param value The specified value for the JSON. Must be between 1 and 100 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<Integer> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The specified value for the JSON. Must be between 1 and 100 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public VirtualNodeSpecListenerOutlierDetectionIntervalArgs build() {
            $.unit = Objects.requireNonNull($.unit, "expected parameter 'unit' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
