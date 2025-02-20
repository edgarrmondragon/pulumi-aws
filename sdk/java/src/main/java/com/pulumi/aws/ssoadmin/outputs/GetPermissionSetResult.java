// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssoadmin.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetPermissionSetResult {
    private String arn;
    private String createdDate;
    /**
     * @return Description of the Permission Set.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String instanceArn;
    private String name;
    /**
     * @return Relay state URL used to redirect users within the application during the federation authentication process.
     * 
     */
    private String relayState;
    /**
     * @return Length of time that the application user sessions are valid in the ISO-8601 standard.
     * 
     */
    private String sessionDuration;
    /**
     * @return Key-value map of resource tags.
     * 
     */
    private Map<String,String> tags;

    private GetPermissionSetResult() {}
    public String arn() {
        return this.arn;
    }
    public String createdDate() {
        return this.createdDate;
    }
    /**
     * @return Description of the Permission Set.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instanceArn() {
        return this.instanceArn;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Relay state URL used to redirect users within the application during the federation authentication process.
     * 
     */
    public String relayState() {
        return this.relayState;
    }
    /**
     * @return Length of time that the application user sessions are valid in the ISO-8601 standard.
     * 
     */
    public String sessionDuration() {
        return this.sessionDuration;
    }
    /**
     * @return Key-value map of resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionSetResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String createdDate;
        private String description;
        private String id;
        private String instanceArn;
        private String name;
        private String relayState;
        private String sessionDuration;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetPermissionSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdDate = defaults.createdDate;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.instanceArn = defaults.instanceArn;
    	      this.name = defaults.name;
    	      this.relayState = defaults.relayState;
    	      this.sessionDuration = defaults.sessionDuration;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceArn(String instanceArn) {
            this.instanceArn = Objects.requireNonNull(instanceArn);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder relayState(String relayState) {
            this.relayState = Objects.requireNonNull(relayState);
            return this;
        }
        @CustomType.Setter
        public Builder sessionDuration(String sessionDuration) {
            this.sessionDuration = Objects.requireNonNull(sessionDuration);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetPermissionSetResult build() {
            final var o = new GetPermissionSetResult();
            o.arn = arn;
            o.createdDate = createdDate;
            o.description = description;
            o.id = id;
            o.instanceArn = instanceArn;
            o.name = name;
            o.relayState = relayState;
            o.sessionDuration = sessionDuration;
            o.tags = tags;
            return o;
        }
    }
}
