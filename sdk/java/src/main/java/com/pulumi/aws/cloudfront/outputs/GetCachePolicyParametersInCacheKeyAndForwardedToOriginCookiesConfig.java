// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig {
    /**
     * @return Determines whether any cookies in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
     */
    private String cookieBehavior;
    /**
     * @return Object that contains a list of cookie names. See Items for more information.
     * 
     */
    private List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie> cookies;

    private GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig() {}
    /**
     * @return Determines whether any cookies in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
     */
    public String cookieBehavior() {
        return this.cookieBehavior;
    }
    /**
     * @return Object that contains a list of cookie names. See Items for more information.
     * 
     */
    public List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie> cookies() {
        return this.cookies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cookieBehavior;
        private List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie> cookies;
        public Builder() {}
        public Builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieBehavior = defaults.cookieBehavior;
    	      this.cookies = defaults.cookies;
        }

        @CustomType.Setter
        public Builder cookieBehavior(String cookieBehavior) {
            this.cookieBehavior = Objects.requireNonNull(cookieBehavior);
            return this;
        }
        @CustomType.Setter
        public Builder cookies(List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie> cookies) {
            this.cookies = Objects.requireNonNull(cookies);
            return this;
        }
        public Builder cookies(GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie... cookies) {
            return cookies(List.of(cookies));
        }
        public GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig build() {
            final var o = new GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig();
            o.cookieBehavior = cookieBehavior;
            o.cookies = cookies;
            return o;
        }
    }
}
