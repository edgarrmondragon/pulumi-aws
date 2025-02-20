// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.vpclattice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetListenerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetListenerArgs Empty = new GetListenerArgs();

    /**
     * ID or Amazon Resource Name (ARN) of the listener
     * 
     */
    @Import(name="listenerIdentifier", required=true)
    private Output<String> listenerIdentifier;

    /**
     * @return ID or Amazon Resource Name (ARN) of the listener
     * 
     */
    public Output<String> listenerIdentifier() {
        return this.listenerIdentifier;
    }

    /**
     * ID or Amazon Resource Name (ARN) of the service network
     * 
     */
    @Import(name="serviceIdentifier", required=true)
    private Output<String> serviceIdentifier;

    /**
     * @return ID or Amazon Resource Name (ARN) of the service network
     * 
     */
    public Output<String> serviceIdentifier() {
        return this.serviceIdentifier;
    }

    /**
     * List of tags associated with the listener.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return List of tags associated with the listener.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetListenerArgs() {}

    private GetListenerArgs(GetListenerArgs $) {
        this.listenerIdentifier = $.listenerIdentifier;
        this.serviceIdentifier = $.serviceIdentifier;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetListenerArgs $;

        public Builder() {
            $ = new GetListenerArgs();
        }

        public Builder(GetListenerArgs defaults) {
            $ = new GetListenerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param listenerIdentifier ID or Amazon Resource Name (ARN) of the listener
         * 
         * @return builder
         * 
         */
        public Builder listenerIdentifier(Output<String> listenerIdentifier) {
            $.listenerIdentifier = listenerIdentifier;
            return this;
        }

        /**
         * @param listenerIdentifier ID or Amazon Resource Name (ARN) of the listener
         * 
         * @return builder
         * 
         */
        public Builder listenerIdentifier(String listenerIdentifier) {
            return listenerIdentifier(Output.of(listenerIdentifier));
        }

        /**
         * @param serviceIdentifier ID or Amazon Resource Name (ARN) of the service network
         * 
         * @return builder
         * 
         */
        public Builder serviceIdentifier(Output<String> serviceIdentifier) {
            $.serviceIdentifier = serviceIdentifier;
            return this;
        }

        /**
         * @param serviceIdentifier ID or Amazon Resource Name (ARN) of the service network
         * 
         * @return builder
         * 
         */
        public Builder serviceIdentifier(String serviceIdentifier) {
            return serviceIdentifier(Output.of(serviceIdentifier));
        }

        /**
         * @param tags List of tags associated with the listener.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags List of tags associated with the listener.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetListenerArgs build() {
            $.listenerIdentifier = Objects.requireNonNull($.listenerIdentifier, "expected parameter 'listenerIdentifier' to be non-null");
            $.serviceIdentifier = Objects.requireNonNull($.serviceIdentifier, "expected parameter 'serviceIdentifier' to be non-null");
            return $;
        }
    }

}
