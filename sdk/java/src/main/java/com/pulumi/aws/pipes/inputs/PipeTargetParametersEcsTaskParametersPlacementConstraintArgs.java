// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pipes.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipeTargetParametersEcsTaskParametersPlacementConstraintArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipeTargetParametersEcsTaskParametersPlacementConstraintArgs Empty = new PipeTargetParametersEcsTaskParametersPlacementConstraintArgs();

    /**
     * A cluster query language expression to apply to the constraint. You cannot specify an expression if the constraint type is distinctInstance. Maximum length of 2,000.
     * 
     */
    @Import(name="expression")
    private @Nullable Output<String> expression;

    /**
     * @return A cluster query language expression to apply to the constraint. You cannot specify an expression if the constraint type is distinctInstance. Maximum length of 2,000.
     * 
     */
    public Optional<Output<String>> expression() {
        return Optional.ofNullable(this.expression);
    }

    /**
     * The type of resource to assign to a container. The supported resources include GPU, MEMORY, and VCPU.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of resource to assign to a container. The supported resources include GPU, MEMORY, and VCPU.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private PipeTargetParametersEcsTaskParametersPlacementConstraintArgs() {}

    private PipeTargetParametersEcsTaskParametersPlacementConstraintArgs(PipeTargetParametersEcsTaskParametersPlacementConstraintArgs $) {
        this.expression = $.expression;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipeTargetParametersEcsTaskParametersPlacementConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipeTargetParametersEcsTaskParametersPlacementConstraintArgs $;

        public Builder() {
            $ = new PipeTargetParametersEcsTaskParametersPlacementConstraintArgs();
        }

        public Builder(PipeTargetParametersEcsTaskParametersPlacementConstraintArgs defaults) {
            $ = new PipeTargetParametersEcsTaskParametersPlacementConstraintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expression A cluster query language expression to apply to the constraint. You cannot specify an expression if the constraint type is distinctInstance. Maximum length of 2,000.
         * 
         * @return builder
         * 
         */
        public Builder expression(@Nullable Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression A cluster query language expression to apply to the constraint. You cannot specify an expression if the constraint type is distinctInstance. Maximum length of 2,000.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param type The type of resource to assign to a container. The supported resources include GPU, MEMORY, and VCPU.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of resource to assign to a container. The supported resources include GPU, MEMORY, and VCPU.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public PipeTargetParametersEcsTaskParametersPlacementConstraintArgs build() {
            return $;
        }
    }

}
