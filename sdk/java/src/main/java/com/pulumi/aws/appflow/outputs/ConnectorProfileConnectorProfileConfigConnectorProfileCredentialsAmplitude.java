// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsAmplitude {
    /**
     * @return Unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API.
     * 
     */
    private String apiKey;
    /**
     * @return The Secret Access Key portion of the credentials.
     * 
     */
    private String secretKey;

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsAmplitude() {}
    /**
     * @return Unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API.
     * 
     */
    public String apiKey() {
        return this.apiKey;
    }
    /**
     * @return The Secret Access Key portion of the credentials.
     * 
     */
    public String secretKey() {
        return this.secretKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsAmplitude defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiKey;
        private String secretKey;
        public Builder() {}
        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsAmplitude defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.secretKey = defaults.secretKey;
        }

        @CustomType.Setter
        public Builder apiKey(String apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(String secretKey) {
            this.secretKey = Objects.requireNonNull(secretKey);
            return this;
        }
        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsAmplitude build() {
            final var o = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsAmplitude();
            o.apiKey = apiKey;
            o.secretKey = secretKey;
            return o;
        }
    }
}
