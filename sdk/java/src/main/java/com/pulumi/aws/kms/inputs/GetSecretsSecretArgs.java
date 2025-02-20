// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretsSecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetSecretsSecretArgs Empty = new GetSecretsSecretArgs();

    /**
     * An optional mapping that makes up the Encryption Context for the secret.
     * 
     */
    @Import(name="context")
    private @Nullable Output<Map<String,String>> context;

    /**
     * @return An optional mapping that makes up the Encryption Context for the secret.
     * 
     */
    public Optional<Output<Map<String,String>>> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * The encryption algorithm that will be used to decrypt the ciphertext. This parameter is required only when the ciphertext was encrypted under an asymmetric KMS key. Valid Values: SYMMETRIC_DEFAULT | RSAES_OAEP_SHA_1 | RSAES_OAEP_SHA_256 | SM2PKE
     * 
     */
    @Import(name="encryptionAlgorithm")
    private @Nullable Output<String> encryptionAlgorithm;

    /**
     * @return The encryption algorithm that will be used to decrypt the ciphertext. This parameter is required only when the ciphertext was encrypted under an asymmetric KMS key. Valid Values: SYMMETRIC_DEFAULT | RSAES_OAEP_SHA_1 | RSAES_OAEP_SHA_256 | SM2PKE
     * 
     */
    public Optional<Output<String>> encryptionAlgorithm() {
        return Optional.ofNullable(this.encryptionAlgorithm);
    }

    /**
     * An optional list of Grant Tokens for the secret.
     * 
     */
    @Import(name="grantTokens")
    private @Nullable Output<List<String>> grantTokens;

    /**
     * @return An optional list of Grant Tokens for the secret.
     * 
     */
    public Optional<Output<List<String>>> grantTokens() {
        return Optional.ofNullable(this.grantTokens);
    }

    /**
     * Specifies the KMS key that AWS KMS uses to decrypt the ciphertext. This parameter is required only when the ciphertext was encrypted under an asymmetric KMS key.
     * 
     * For more information on `context` and `grant_tokens` see the [KMS
     * Concepts](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html)
     * 
     */
    @Import(name="keyId")
    private @Nullable Output<String> keyId;

    /**
     * @return Specifies the KMS key that AWS KMS uses to decrypt the ciphertext. This parameter is required only when the ciphertext was encrypted under an asymmetric KMS key.
     * 
     * For more information on `context` and `grant_tokens` see the [KMS
     * Concepts](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html)
     * 
     */
    public Optional<Output<String>> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    /**
     * Name to export this secret under in the attributes.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name to export this secret under in the attributes.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Base64 encoded payload, as returned from a KMS encrypt operation.
     * 
     */
    @Import(name="payload", required=true)
    private Output<String> payload;

    /**
     * @return Base64 encoded payload, as returned from a KMS encrypt operation.
     * 
     */
    public Output<String> payload() {
        return this.payload;
    }

    private GetSecretsSecretArgs() {}

    private GetSecretsSecretArgs(GetSecretsSecretArgs $) {
        this.context = $.context;
        this.encryptionAlgorithm = $.encryptionAlgorithm;
        this.grantTokens = $.grantTokens;
        this.keyId = $.keyId;
        this.name = $.name;
        this.payload = $.payload;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretsSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretsSecretArgs $;

        public Builder() {
            $ = new GetSecretsSecretArgs();
        }

        public Builder(GetSecretsSecretArgs defaults) {
            $ = new GetSecretsSecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param context An optional mapping that makes up the Encryption Context for the secret.
         * 
         * @return builder
         * 
         */
        public Builder context(@Nullable Output<Map<String,String>> context) {
            $.context = context;
            return this;
        }

        /**
         * @param context An optional mapping that makes up the Encryption Context for the secret.
         * 
         * @return builder
         * 
         */
        public Builder context(Map<String,String> context) {
            return context(Output.of(context));
        }

        /**
         * @param encryptionAlgorithm The encryption algorithm that will be used to decrypt the ciphertext. This parameter is required only when the ciphertext was encrypted under an asymmetric KMS key. Valid Values: SYMMETRIC_DEFAULT | RSAES_OAEP_SHA_1 | RSAES_OAEP_SHA_256 | SM2PKE
         * 
         * @return builder
         * 
         */
        public Builder encryptionAlgorithm(@Nullable Output<String> encryptionAlgorithm) {
            $.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }

        /**
         * @param encryptionAlgorithm The encryption algorithm that will be used to decrypt the ciphertext. This parameter is required only when the ciphertext was encrypted under an asymmetric KMS key. Valid Values: SYMMETRIC_DEFAULT | RSAES_OAEP_SHA_1 | RSAES_OAEP_SHA_256 | SM2PKE
         * 
         * @return builder
         * 
         */
        public Builder encryptionAlgorithm(String encryptionAlgorithm) {
            return encryptionAlgorithm(Output.of(encryptionAlgorithm));
        }

        /**
         * @param grantTokens An optional list of Grant Tokens for the secret.
         * 
         * @return builder
         * 
         */
        public Builder grantTokens(@Nullable Output<List<String>> grantTokens) {
            $.grantTokens = grantTokens;
            return this;
        }

        /**
         * @param grantTokens An optional list of Grant Tokens for the secret.
         * 
         * @return builder
         * 
         */
        public Builder grantTokens(List<String> grantTokens) {
            return grantTokens(Output.of(grantTokens));
        }

        /**
         * @param grantTokens An optional list of Grant Tokens for the secret.
         * 
         * @return builder
         * 
         */
        public Builder grantTokens(String... grantTokens) {
            return grantTokens(List.of(grantTokens));
        }

        /**
         * @param keyId Specifies the KMS key that AWS KMS uses to decrypt the ciphertext. This parameter is required only when the ciphertext was encrypted under an asymmetric KMS key.
         * 
         * For more information on `context` and `grant_tokens` see the [KMS
         * Concepts](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html)
         * 
         * @return builder
         * 
         */
        public Builder keyId(@Nullable Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param keyId Specifies the KMS key that AWS KMS uses to decrypt the ciphertext. This parameter is required only when the ciphertext was encrypted under an asymmetric KMS key.
         * 
         * For more information on `context` and `grant_tokens` see the [KMS
         * Concepts](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html)
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        /**
         * @param name Name to export this secret under in the attributes.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name to export this secret under in the attributes.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param payload Base64 encoded payload, as returned from a KMS encrypt operation.
         * 
         * @return builder
         * 
         */
        public Builder payload(Output<String> payload) {
            $.payload = payload;
            return this;
        }

        /**
         * @param payload Base64 encoded payload, as returned from a KMS encrypt operation.
         * 
         * @return builder
         * 
         */
        public Builder payload(String payload) {
            return payload(Output.of(payload));
        }

        public GetSecretsSecretArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.payload = Objects.requireNonNull($.payload, "expected parameter 'payload' to be non-null");
            return $;
        }
    }

}
