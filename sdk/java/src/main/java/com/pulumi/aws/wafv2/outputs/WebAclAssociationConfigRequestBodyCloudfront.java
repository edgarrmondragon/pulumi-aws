// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebAclAssociationConfigRequestBodyCloudfront {
    /**
     * @return Specifies the maximum size of the web request body component that an associated CloudFront distribution should send to AWS WAF for inspection. This applies to statements in the web ACL that inspect the body or JSON body. Valid values are `KB_16`, `KB_32`, `KB_48` and `KB_64`.
     * 
     */
    private String defaultSizeInspectionLimit;

    private WebAclAssociationConfigRequestBodyCloudfront() {}
    /**
     * @return Specifies the maximum size of the web request body component that an associated CloudFront distribution should send to AWS WAF for inspection. This applies to statements in the web ACL that inspect the body or JSON body. Valid values are `KB_16`, `KB_32`, `KB_48` and `KB_64`.
     * 
     */
    public String defaultSizeInspectionLimit() {
        return this.defaultSizeInspectionLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclAssociationConfigRequestBodyCloudfront defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String defaultSizeInspectionLimit;
        public Builder() {}
        public Builder(WebAclAssociationConfigRequestBodyCloudfront defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultSizeInspectionLimit = defaults.defaultSizeInspectionLimit;
        }

        @CustomType.Setter
        public Builder defaultSizeInspectionLimit(String defaultSizeInspectionLimit) {
            this.defaultSizeInspectionLimit = Objects.requireNonNull(defaultSizeInspectionLimit);
            return this;
        }
        public WebAclAssociationConfigRequestBodyCloudfront build() {
            final var o = new WebAclAssociationConfigRequestBodyCloudfront();
            o.defaultSizeInspectionLimit = defaultSizeInspectionLimit;
            return o;
        }
    }
}
