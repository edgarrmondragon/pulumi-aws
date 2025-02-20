// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GetRouteSpecTcpRouteTimeoutIdle;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRouteSpecTcpRouteTimeout {
    private List<GetRouteSpecTcpRouteTimeoutIdle> idles;

    private GetRouteSpecTcpRouteTimeout() {}
    public List<GetRouteSpecTcpRouteTimeoutIdle> idles() {
        return this.idles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteSpecTcpRouteTimeout defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetRouteSpecTcpRouteTimeoutIdle> idles;
        public Builder() {}
        public Builder(GetRouteSpecTcpRouteTimeout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idles = defaults.idles;
        }

        @CustomType.Setter
        public Builder idles(List<GetRouteSpecTcpRouteTimeoutIdle> idles) {
            this.idles = Objects.requireNonNull(idles);
            return this;
        }
        public Builder idles(GetRouteSpecTcpRouteTimeoutIdle... idles) {
            return idles(List.of(idles));
        }
        public GetRouteSpecTcpRouteTimeout build() {
            final var o = new GetRouteSpecTcpRouteTimeout();
            o.idles = idles;
            return o;
        }
    }
}
