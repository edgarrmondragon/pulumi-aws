// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecLoggingAccessLogFile;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpecLoggingAccessLog {
    /**
     * @return File object to send virtual gateway access logs to.
     * 
     */
    private @Nullable VirtualGatewaySpecLoggingAccessLogFile file;

    private VirtualGatewaySpecLoggingAccessLog() {}
    /**
     * @return File object to send virtual gateway access logs to.
     * 
     */
    public Optional<VirtualGatewaySpecLoggingAccessLogFile> file() {
        return Optional.ofNullable(this.file);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecLoggingAccessLog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VirtualGatewaySpecLoggingAccessLogFile file;
        public Builder() {}
        public Builder(VirtualGatewaySpecLoggingAccessLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
        }

        @CustomType.Setter
        public Builder file(@Nullable VirtualGatewaySpecLoggingAccessLogFile file) {
            this.file = file;
            return this;
        }
        public VirtualGatewaySpecLoggingAccessLog build() {
            final var o = new VirtualGatewaySpecLoggingAccessLog();
            o.file = file;
            return o;
        }
    }
}
