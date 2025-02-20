// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SigningProfileSignatureValidityPeriod {
    private String type;
    private Integer value;

    private SigningProfileSignatureValidityPeriod() {}
    public String type() {
        return this.type;
    }
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningProfileSignatureValidityPeriod defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        private Integer value;
        public Builder() {}
        public Builder(SigningProfileSignatureValidityPeriod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder value(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public SigningProfileSignatureValidityPeriod build() {
            final var o = new SigningProfileSignatureValidityPeriod();
            o.type = type;
            o.value = value;
            return o;
        }
    }
}
