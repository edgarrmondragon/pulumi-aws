// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GetVirtualNodeSpecListenerConnectionPool;
import com.pulumi.aws.appmesh.outputs.GetVirtualNodeSpecListenerHealthCheck;
import com.pulumi.aws.appmesh.outputs.GetVirtualNodeSpecListenerOutlierDetection;
import com.pulumi.aws.appmesh.outputs.GetVirtualNodeSpecListenerPortMapping;
import com.pulumi.aws.appmesh.outputs.GetVirtualNodeSpecListenerTimeout;
import com.pulumi.aws.appmesh.outputs.GetVirtualNodeSpecListenerTl;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualNodeSpecListener {
    private List<GetVirtualNodeSpecListenerConnectionPool> connectionPools;
    private List<GetVirtualNodeSpecListenerHealthCheck> healthChecks;
    private List<GetVirtualNodeSpecListenerOutlierDetection> outlierDetections;
    private List<GetVirtualNodeSpecListenerPortMapping> portMappings;
    private List<GetVirtualNodeSpecListenerTimeout> timeouts;
    private List<GetVirtualNodeSpecListenerTl> tls;

    private GetVirtualNodeSpecListener() {}
    public List<GetVirtualNodeSpecListenerConnectionPool> connectionPools() {
        return this.connectionPools;
    }
    public List<GetVirtualNodeSpecListenerHealthCheck> healthChecks() {
        return this.healthChecks;
    }
    public List<GetVirtualNodeSpecListenerOutlierDetection> outlierDetections() {
        return this.outlierDetections;
    }
    public List<GetVirtualNodeSpecListenerPortMapping> portMappings() {
        return this.portMappings;
    }
    public List<GetVirtualNodeSpecListenerTimeout> timeouts() {
        return this.timeouts;
    }
    public List<GetVirtualNodeSpecListenerTl> tls() {
        return this.tls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNodeSpecListener defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetVirtualNodeSpecListenerConnectionPool> connectionPools;
        private List<GetVirtualNodeSpecListenerHealthCheck> healthChecks;
        private List<GetVirtualNodeSpecListenerOutlierDetection> outlierDetections;
        private List<GetVirtualNodeSpecListenerPortMapping> portMappings;
        private List<GetVirtualNodeSpecListenerTimeout> timeouts;
        private List<GetVirtualNodeSpecListenerTl> tls;
        public Builder() {}
        public Builder(GetVirtualNodeSpecListener defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPools = defaults.connectionPools;
    	      this.healthChecks = defaults.healthChecks;
    	      this.outlierDetections = defaults.outlierDetections;
    	      this.portMappings = defaults.portMappings;
    	      this.timeouts = defaults.timeouts;
    	      this.tls = defaults.tls;
        }

        @CustomType.Setter
        public Builder connectionPools(List<GetVirtualNodeSpecListenerConnectionPool> connectionPools) {
            this.connectionPools = Objects.requireNonNull(connectionPools);
            return this;
        }
        public Builder connectionPools(GetVirtualNodeSpecListenerConnectionPool... connectionPools) {
            return connectionPools(List.of(connectionPools));
        }
        @CustomType.Setter
        public Builder healthChecks(List<GetVirtualNodeSpecListenerHealthCheck> healthChecks) {
            this.healthChecks = Objects.requireNonNull(healthChecks);
            return this;
        }
        public Builder healthChecks(GetVirtualNodeSpecListenerHealthCheck... healthChecks) {
            return healthChecks(List.of(healthChecks));
        }
        @CustomType.Setter
        public Builder outlierDetections(List<GetVirtualNodeSpecListenerOutlierDetection> outlierDetections) {
            this.outlierDetections = Objects.requireNonNull(outlierDetections);
            return this;
        }
        public Builder outlierDetections(GetVirtualNodeSpecListenerOutlierDetection... outlierDetections) {
            return outlierDetections(List.of(outlierDetections));
        }
        @CustomType.Setter
        public Builder portMappings(List<GetVirtualNodeSpecListenerPortMapping> portMappings) {
            this.portMappings = Objects.requireNonNull(portMappings);
            return this;
        }
        public Builder portMappings(GetVirtualNodeSpecListenerPortMapping... portMappings) {
            return portMappings(List.of(portMappings));
        }
        @CustomType.Setter
        public Builder timeouts(List<GetVirtualNodeSpecListenerTimeout> timeouts) {
            this.timeouts = Objects.requireNonNull(timeouts);
            return this;
        }
        public Builder timeouts(GetVirtualNodeSpecListenerTimeout... timeouts) {
            return timeouts(List.of(timeouts));
        }
        @CustomType.Setter
        public Builder tls(List<GetVirtualNodeSpecListenerTl> tls) {
            this.tls = Objects.requireNonNull(tls);
            return this;
        }
        public Builder tls(GetVirtualNodeSpecListenerTl... tls) {
            return tls(List.of(tls));
        }
        public GetVirtualNodeSpecListener build() {
            final var o = new GetVirtualNodeSpecListener();
            o.connectionPools = connectionPools;
            o.healthChecks = healthChecks;
            o.outlierDetections = outlierDetections;
            o.portMappings = portMappings;
            o.timeouts = timeouts;
            o.tls = tls;
            return o;
        }
    }
}
