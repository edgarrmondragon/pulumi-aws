// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackOauthRequest;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlack {
    /**
     * @return The access token used to access the connector on your behalf.
     * 
     */
    private @Nullable String accessToken;
    /**
     * @return The identifier for the desired client.
     * 
     */
    private String clientId;
    /**
     * @return The client secret used by the OAuth client to authenticate to the authorization server.
     * 
     */
    private String clientSecret;
    /**
     * @return Used by select connectors for which the OAuth workflow is supported. See OAuth Request for more details.
     * 
     */
    private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackOauthRequest oauthRequest;

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlack() {}
    /**
     * @return The access token used to access the connector on your behalf.
     * 
     */
    public Optional<String> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * @return The identifier for the desired client.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The client secret used by the OAuth client to authenticate to the authorization server.
     * 
     */
    public String clientSecret() {
        return this.clientSecret;
    }
    /**
     * @return Used by select connectors for which the OAuth workflow is supported. See OAuth Request for more details.
     * 
     */
    public Optional<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackOauthRequest> oauthRequest() {
        return Optional.ofNullable(this.oauthRequest);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlack defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessToken;
        private String clientId;
        private String clientSecret;
        private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackOauthRequest oauthRequest;
        public Builder() {}
        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlack defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.oauthRequest = defaults.oauthRequest;
        }

        @CustomType.Setter
        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        @CustomType.Setter
        public Builder oauthRequest(@Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackOauthRequest oauthRequest) {
            this.oauthRequest = oauthRequest;
            return this;
        }
        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlack build() {
            final var o = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlack();
            o.accessToken = accessToken;
            o.clientId = clientId;
            o.clientSecret = clientSecret;
            o.oauthRequest = oauthRequest;
            return o;
        }
    }
}
