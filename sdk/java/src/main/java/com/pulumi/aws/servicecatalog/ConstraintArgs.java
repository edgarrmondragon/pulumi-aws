// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConstraintArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConstraintArgs Empty = new ConstraintArgs();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @Import(name="acceptLanguage")
    private @Nullable Output<String> acceptLanguage;

    /**
     * @return Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    public Optional<Output<String>> acceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }

    /**
     * Description of the constraint.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the constraint.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Constraint parameters in JSON format. The syntax depends on the constraint type. See details below.
     * 
     */
    @Import(name="parameters", required=true)
    private Output<String> parameters;

    /**
     * @return Constraint parameters in JSON format. The syntax depends on the constraint type. See details below.
     * 
     */
    public Output<String> parameters() {
        return this.parameters;
    }

    /**
     * Portfolio identifier.
     * 
     */
    @Import(name="portfolioId", required=true)
    private Output<String> portfolioId;

    /**
     * @return Portfolio identifier.
     * 
     */
    public Output<String> portfolioId() {
        return this.portfolioId;
    }

    /**
     * Product identifier.
     * 
     */
    @Import(name="productId", required=true)
    private Output<String> productId;

    /**
     * @return Product identifier.
     * 
     */
    public Output<String> productId() {
        return this.productId;
    }

    /**
     * Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ConstraintArgs() {}

    private ConstraintArgs(ConstraintArgs $) {
        this.acceptLanguage = $.acceptLanguage;
        this.description = $.description;
        this.parameters = $.parameters;
        this.portfolioId = $.portfolioId;
        this.productId = $.productId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConstraintArgs $;

        public Builder() {
            $ = new ConstraintArgs();
        }

        public Builder(ConstraintArgs defaults) {
            $ = new ConstraintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptLanguage Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
         * 
         * @return builder
         * 
         */
        public Builder acceptLanguage(@Nullable Output<String> acceptLanguage) {
            $.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * @param acceptLanguage Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
         * 
         * @return builder
         * 
         */
        public Builder acceptLanguage(String acceptLanguage) {
            return acceptLanguage(Output.of(acceptLanguage));
        }

        /**
         * @param description Description of the constraint.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the constraint.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param parameters Constraint parameters in JSON format. The syntax depends on the constraint type. See details below.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Output<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Constraint parameters in JSON format. The syntax depends on the constraint type. See details below.
         * 
         * @return builder
         * 
         */
        public Builder parameters(String parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param portfolioId Portfolio identifier.
         * 
         * @return builder
         * 
         */
        public Builder portfolioId(Output<String> portfolioId) {
            $.portfolioId = portfolioId;
            return this;
        }

        /**
         * @param portfolioId Portfolio identifier.
         * 
         * @return builder
         * 
         */
        public Builder portfolioId(String portfolioId) {
            return portfolioId(Output.of(portfolioId));
        }

        /**
         * @param productId Product identifier.
         * 
         * @return builder
         * 
         */
        public Builder productId(Output<String> productId) {
            $.productId = productId;
            return this;
        }

        /**
         * @param productId Product identifier.
         * 
         * @return builder
         * 
         */
        public Builder productId(String productId) {
            return productId(Output.of(productId));
        }

        /**
         * @param type Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ConstraintArgs build() {
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            $.portfolioId = Objects.requireNonNull($.portfolioId, "expected parameter 'portfolioId' to be non-null");
            $.productId = Objects.requireNonNull($.productId, "expected parameter 'productId' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
