// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs Empty = new CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs();

    @Import(name="items")
    private @Nullable Output<List<String>> items;

    public Optional<Output<List<String>>> items() {
        return Optional.ofNullable(this.items);
    }

    private CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs() {}

    private CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs $) {
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs $;

        public Builder() {
            $ = new CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs();
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs defaults) {
            $ = new CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder items(@Nullable Output<List<String>> items) {
            $.items = items;
            return this;
        }

        public Builder items(List<String> items) {
            return items(Output.of(items));
        }

        public Builder items(String... items) {
            return items(List.of(items));
        }

        public CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs build() {
            return $;
        }
    }

}
