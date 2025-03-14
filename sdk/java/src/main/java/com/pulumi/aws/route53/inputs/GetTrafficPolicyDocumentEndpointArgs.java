// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTrafficPolicyDocumentEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetTrafficPolicyDocumentEndpointArgs Empty = new GetTrafficPolicyDocumentEndpointArgs();

    /**
     * ID of an endpoint you want to assign.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return ID of an endpoint you want to assign.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * To route traffic to an Amazon S3 bucket that is configured as a website endpoint, specify the region in which you created the bucket for `region`.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return To route traffic to an Amazon S3 bucket that is configured as a website endpoint, specify the region in which you created the bucket for `region`.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Type of the endpoint. Valid values are `value` , `cloudfront` , `elastic-load-balancer`, `s3-website`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the endpoint. Valid values are `value` , `cloudfront` , `elastic-load-balancer`, `s3-website`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Value of the `type`.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value of the `type`.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private GetTrafficPolicyDocumentEndpointArgs() {}

    private GetTrafficPolicyDocumentEndpointArgs(GetTrafficPolicyDocumentEndpointArgs $) {
        this.id = $.id;
        this.region = $.region;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTrafficPolicyDocumentEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTrafficPolicyDocumentEndpointArgs $;

        public Builder() {
            $ = new GetTrafficPolicyDocumentEndpointArgs();
        }

        public Builder(GetTrafficPolicyDocumentEndpointArgs defaults) {
            $ = new GetTrafficPolicyDocumentEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of an endpoint you want to assign.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of an endpoint you want to assign.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param region To route traffic to an Amazon S3 bucket that is configured as a website endpoint, specify the region in which you created the bucket for `region`.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region To route traffic to an Amazon S3 bucket that is configured as a website endpoint, specify the region in which you created the bucket for `region`.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param type Type of the endpoint. Valid values are `value` , `cloudfront` , `elastic-load-balancer`, `s3-website`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the endpoint. Valid values are `value` , `cloudfront` , `elastic-load-balancer`, `s3-website`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value Value of the `type`.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the `type`.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GetTrafficPolicyDocumentEndpointArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
