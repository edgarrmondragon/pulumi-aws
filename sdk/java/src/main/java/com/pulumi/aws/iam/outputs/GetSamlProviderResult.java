// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSamlProviderResult {
    private String arn;
    /**
     * @return Creation date of the SAML provider in RFC1123 format, e.g. `Mon, 02 Jan 2006 15:04:05 MST`.
     * 
     */
    private String createDate;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Name of the provider.
     * 
     */
    private String name;
    /**
     * @return The XML document generated by an identity provider that supports SAML 2.0.
     * 
     */
    private String samlMetadataDocument;
    /**
     * @return Tags attached to the SAML provider.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return Expiration date and time for the SAML provider in RFC1123 format, e.g. `Mon, 02 Jan 2007 15:04:05 MST`.
     * 
     */
    private String validUntil;

    private GetSamlProviderResult() {}
    public String arn() {
        return this.arn;
    }
    /**
     * @return Creation date of the SAML provider in RFC1123 format, e.g. `Mon, 02 Jan 2006 15:04:05 MST`.
     * 
     */
    public String createDate() {
        return this.createDate;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the provider.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The XML document generated by an identity provider that supports SAML 2.0.
     * 
     */
    public String samlMetadataDocument() {
        return this.samlMetadataDocument;
    }
    /**
     * @return Tags attached to the SAML provider.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Expiration date and time for the SAML provider in RFC1123 format, e.g. `Mon, 02 Jan 2007 15:04:05 MST`.
     * 
     */
    public String validUntil() {
        return this.validUntil;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSamlProviderResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String createDate;
        private String id;
        private String name;
        private String samlMetadataDocument;
        private Map<String,String> tags;
        private String validUntil;
        public Builder() {}
        public Builder(GetSamlProviderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createDate = defaults.createDate;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.samlMetadataDocument = defaults.samlMetadataDocument;
    	      this.tags = defaults.tags;
    	      this.validUntil = defaults.validUntil;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder createDate(String createDate) {
            this.createDate = Objects.requireNonNull(createDate);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder samlMetadataDocument(String samlMetadataDocument) {
            this.samlMetadataDocument = Objects.requireNonNull(samlMetadataDocument);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder validUntil(String validUntil) {
            this.validUntil = Objects.requireNonNull(validUntil);
            return this;
        }
        public GetSamlProviderResult build() {
            final var o = new GetSamlProviderResult();
            o.arn = arn;
            o.createDate = createDate;
            o.id = id;
            o.name = name;
            o.samlMetadataDocument = samlMetadataDocument;
            o.tags = tags;
            o.validUntil = validUntil;
            return o;
        }
    }
}
