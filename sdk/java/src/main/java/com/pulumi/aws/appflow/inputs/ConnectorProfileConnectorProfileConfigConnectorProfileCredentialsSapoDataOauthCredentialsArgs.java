// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.inputs;

import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsOauthRequestArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs Empty = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs();

    /**
     * The access token used to access the connector on your behalf.
     * 
     */
    @Import(name="accessToken")
    private @Nullable Output<String> accessToken;

    /**
     * @return The access token used to access the connector on your behalf.
     * 
     */
    public Optional<Output<String>> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }

    /**
     * The identifier for the desired client.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return The identifier for the desired client.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * The client secret used by the OAuth client to authenticate to the authorization server.
     * 
     */
    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    /**
     * @return The client secret used by the OAuth client to authenticate to the authorization server.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    /**
     * Used by select connectors for which the OAuth workflow is supported. See OAuth Request for more details.
     * 
     */
    @Import(name="oauthRequest")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsOauthRequestArgs> oauthRequest;

    /**
     * @return Used by select connectors for which the OAuth workflow is supported. See OAuth Request for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsOauthRequestArgs>> oauthRequest() {
        return Optional.ofNullable(this.oauthRequest);
    }

    /**
     * The refresh token used to refresh an expired access token.
     * 
     */
    @Import(name="refreshToken")
    private @Nullable Output<String> refreshToken;

    /**
     * @return The refresh token used to refresh an expired access token.
     * 
     */
    public Optional<Output<String>> refreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs() {}

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs $) {
        this.accessToken = $.accessToken;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.oauthRequest = $.oauthRequest;
        this.refreshToken = $.refreshToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs $;

        public Builder() {
            $ = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs();
        }

        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs defaults) {
            $ = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessToken The access token used to access the connector on your behalf.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(@Nullable Output<String> accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        /**
         * @param accessToken The access token used to access the connector on your behalf.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(String accessToken) {
            return accessToken(Output.of(accessToken));
        }

        /**
         * @param clientId The identifier for the desired client.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The identifier for the desired client.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The client secret used by the OAuth client to authenticate to the authorization server.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The client secret used by the OAuth client to authenticate to the authorization server.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param oauthRequest Used by select connectors for which the OAuth workflow is supported. See OAuth Request for more details.
         * 
         * @return builder
         * 
         */
        public Builder oauthRequest(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsOauthRequestArgs> oauthRequest) {
            $.oauthRequest = oauthRequest;
            return this;
        }

        /**
         * @param oauthRequest Used by select connectors for which the OAuth workflow is supported. See OAuth Request for more details.
         * 
         * @return builder
         * 
         */
        public Builder oauthRequest(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsOauthRequestArgs oauthRequest) {
            return oauthRequest(Output.of(oauthRequest));
        }

        /**
         * @param refreshToken The refresh token used to refresh an expired access token.
         * 
         * @return builder
         * 
         */
        public Builder refreshToken(@Nullable Output<String> refreshToken) {
            $.refreshToken = refreshToken;
            return this;
        }

        /**
         * @param refreshToken The refresh token used to refresh an expired access token.
         * 
         * @return builder
         * 
         */
        public Builder refreshToken(String refreshToken) {
            return refreshToken(Output.of(refreshToken));
        }

        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.clientSecret = Objects.requireNonNull($.clientSecret, "expected parameter 'clientSecret' to be non-null");
            return $;
        }
    }

}
