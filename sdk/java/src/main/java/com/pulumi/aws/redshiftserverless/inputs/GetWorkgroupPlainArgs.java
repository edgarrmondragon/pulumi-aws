// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshiftserverless.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWorkgroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkgroupPlainArgs Empty = new GetWorkgroupPlainArgs();

    /**
     * The name of the workgroup associated with the database.
     * 
     */
    @Import(name="workgroupName", required=true)
    private String workgroupName;

    /**
     * @return The name of the workgroup associated with the database.
     * 
     */
    public String workgroupName() {
        return this.workgroupName;
    }

    private GetWorkgroupPlainArgs() {}

    private GetWorkgroupPlainArgs(GetWorkgroupPlainArgs $) {
        this.workgroupName = $.workgroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkgroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkgroupPlainArgs $;

        public Builder() {
            $ = new GetWorkgroupPlainArgs();
        }

        public Builder(GetWorkgroupPlainArgs defaults) {
            $ = new GetWorkgroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param workgroupName The name of the workgroup associated with the database.
         * 
         * @return builder
         * 
         */
        public Builder workgroupName(String workgroupName) {
            $.workgroupName = workgroupName;
            return this;
        }

        public GetWorkgroupPlainArgs build() {
            $.workgroupName = Objects.requireNonNull($.workgroupName, "expected parameter 'workgroupName' to be non-null");
            return $;
        }
    }

}
