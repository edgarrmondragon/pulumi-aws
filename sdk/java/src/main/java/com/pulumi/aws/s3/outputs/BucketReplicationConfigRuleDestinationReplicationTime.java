// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.aws.s3.outputs.BucketReplicationConfigRuleDestinationReplicationTimeTime;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketReplicationConfigRuleDestinationReplicationTime {
    /**
     * @return Status of the Replication Time Control. Either `&#34;Enabled&#34;` or `&#34;Disabled&#34;`.
     * 
     */
    private String status;
    /**
     * @return Configuration block specifying the time by which replication should be complete for all objects and operations on objects. See below.
     * 
     */
    private BucketReplicationConfigRuleDestinationReplicationTimeTime time;

    private BucketReplicationConfigRuleDestinationReplicationTime() {}
    /**
     * @return Status of the Replication Time Control. Either `&#34;Enabled&#34;` or `&#34;Disabled&#34;`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Configuration block specifying the time by which replication should be complete for all objects and operations on objects. See below.
     * 
     */
    public BucketReplicationConfigRuleDestinationReplicationTimeTime time() {
        return this.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationReplicationTime defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String status;
        private BucketReplicationConfigRuleDestinationReplicationTimeTime time;
        public Builder() {}
        public Builder(BucketReplicationConfigRuleDestinationReplicationTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.time = defaults.time;
        }

        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder time(BucketReplicationConfigRuleDestinationReplicationTimeTime time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }
        public BucketReplicationConfigRuleDestinationReplicationTime build() {
            final var o = new BucketReplicationConfigRuleDestinationReplicationTime();
            o.status = status;
            o.time = time;
            return o;
        }
    }
}
