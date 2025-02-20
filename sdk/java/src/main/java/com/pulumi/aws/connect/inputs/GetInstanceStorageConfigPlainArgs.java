// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceStorageConfigPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceStorageConfigPlainArgs Empty = new GetInstanceStorageConfigPlainArgs();

    /**
     * The existing association identifier that uniquely identifies the resource type and storage config for the given instance ID.
     * 
     */
    @Import(name="associationId", required=true)
    private String associationId;

    /**
     * @return The existing association identifier that uniquely identifies the resource type and storage config for the given instance ID.
     * 
     */
    public String associationId() {
        return this.associationId;
    }

    /**
     * Reference to the hosting Amazon Connect Instance
     * 
     */
    @Import(name="instanceId", required=true)
    private String instanceId;

    /**
     * @return Reference to the hosting Amazon Connect Instance
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * A valid resource type. Valid Values: `CHAT_TRANSCRIPTS` | `CALL_RECORDINGS` | `SCHEDULED_REPORTS` | `MEDIA_STREAMS` | `CONTACT_TRACE_RECORDS` | `AGENT_EVENTS` | `REAL_TIME_CONTACT_ANALYSIS_SEGMENTS`.
     * 
     */
    @Import(name="resourceType", required=true)
    private String resourceType;

    /**
     * @return A valid resource type. Valid Values: `CHAT_TRANSCRIPTS` | `CALL_RECORDINGS` | `SCHEDULED_REPORTS` | `MEDIA_STREAMS` | `CONTACT_TRACE_RECORDS` | `AGENT_EVENTS` | `REAL_TIME_CONTACT_ANALYSIS_SEGMENTS`.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }

    private GetInstanceStorageConfigPlainArgs() {}

    private GetInstanceStorageConfigPlainArgs(GetInstanceStorageConfigPlainArgs $) {
        this.associationId = $.associationId;
        this.instanceId = $.instanceId;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceStorageConfigPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceStorageConfigPlainArgs $;

        public Builder() {
            $ = new GetInstanceStorageConfigPlainArgs();
        }

        public Builder(GetInstanceStorageConfigPlainArgs defaults) {
            $ = new GetInstanceStorageConfigPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param associationId The existing association identifier that uniquely identifies the resource type and storage config for the given instance ID.
         * 
         * @return builder
         * 
         */
        public Builder associationId(String associationId) {
            $.associationId = associationId;
            return this;
        }

        /**
         * @param instanceId Reference to the hosting Amazon Connect Instance
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param resourceType A valid resource type. Valid Values: `CHAT_TRANSCRIPTS` | `CALL_RECORDINGS` | `SCHEDULED_REPORTS` | `MEDIA_STREAMS` | `CONTACT_TRACE_RECORDS` | `AGENT_EVENTS` | `REAL_TIME_CONTACT_ANALYSIS_SEGMENTS`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public GetInstanceStorageConfigPlainArgs build() {
            $.associationId = Objects.requireNonNull($.associationId, "expected parameter 'associationId' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            return $;
        }
    }

}
