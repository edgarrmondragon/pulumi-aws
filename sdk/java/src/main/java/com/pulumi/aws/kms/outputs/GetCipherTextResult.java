// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetCipherTextResult {
    /**
     * @return Base64 encoded ciphertext
     * 
     */
    private String ciphertextBlob;
    private @Nullable Map<String,String> context;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String keyId;
    private String plaintext;

    private GetCipherTextResult() {}
    /**
     * @return Base64 encoded ciphertext
     * 
     */
    public String ciphertextBlob() {
        return this.ciphertextBlob;
    }
    public Map<String,String> context() {
        return this.context == null ? Map.of() : this.context;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String keyId() {
        return this.keyId;
    }
    public String plaintext() {
        return this.plaintext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCipherTextResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ciphertextBlob;
        private @Nullable Map<String,String> context;
        private String id;
        private String keyId;
        private String plaintext;
        public Builder() {}
        public Builder(GetCipherTextResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ciphertextBlob = defaults.ciphertextBlob;
    	      this.context = defaults.context;
    	      this.id = defaults.id;
    	      this.keyId = defaults.keyId;
    	      this.plaintext = defaults.plaintext;
        }

        @CustomType.Setter
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.ciphertextBlob = Objects.requireNonNull(ciphertextBlob);
            return this;
        }
        @CustomType.Setter
        public Builder context(@Nullable Map<String,String> context) {
            this.context = context;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        @CustomType.Setter
        public Builder plaintext(String plaintext) {
            this.plaintext = Objects.requireNonNull(plaintext);
            return this;
        }
        public GetCipherTextResult build() {
            final var o = new GetCipherTextResult();
            o.ciphertextBlob = ciphertextBlob;
            o.context = context;
            o.id = id;
            o.keyId = keyId;
            o.plaintext = plaintext;
            return o;
        }
    }
}
