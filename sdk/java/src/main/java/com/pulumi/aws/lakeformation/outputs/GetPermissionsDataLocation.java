// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPermissionsDataLocation {
    /**
     * @return ARN that uniquely identifies the data location resource.
     * 
     * The following argument is optional:
     * 
     */
    private String arn;
    /**
     * @return Identifier for the Data Catalog where the location is registered with Lake Formation. By default, it is the account ID of the caller.
     * 
     */
    private String catalogId;

    private GetPermissionsDataLocation() {}
    /**
     * @return ARN that uniquely identifies the data location resource.
     * 
     * The following argument is optional:
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Identifier for the Data Catalog where the location is registered with Lake Formation. By default, it is the account ID of the caller.
     * 
     */
    public String catalogId() {
        return this.catalogId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionsDataLocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String catalogId;
        public Builder() {}
        public Builder(GetPermissionsDataLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.catalogId = defaults.catalogId;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder catalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }
        public GetPermissionsDataLocation build() {
            final var o = new GetPermissionsDataLocation();
            o.arn = arn;
            o.catalogId = catalogId;
            return o;
        }
    }
}
