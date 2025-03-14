// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.outputs;

import com.pulumi.aws.transfer.outputs.WorkflowStepCopyStepDetailsDestinationFileLocation;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowStepCopyStepDetails {
    /**
     * @return Specifies the location for the file being copied. Use ${Transfer:username} in this field to parametrize the destination prefix by username.
     * 
     */
    private @Nullable WorkflowStepCopyStepDetailsDestinationFileLocation destinationFileLocation;
    /**
     * @return The name of the step, used as an identifier.
     * 
     */
    private @Nullable String name;
    /**
     * @return A flag that indicates whether or not to overwrite an existing file of the same name. The default is `FALSE`. Valid values are `TRUE` and `FALSE`.
     * 
     */
    private @Nullable String overwriteExisting;
    /**
     * @return Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow. Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value. Enter ${original.file} to use the originally-uploaded file location as input for this step.
     * 
     */
    private @Nullable String sourceFileLocation;

    private WorkflowStepCopyStepDetails() {}
    /**
     * @return Specifies the location for the file being copied. Use ${Transfer:username} in this field to parametrize the destination prefix by username.
     * 
     */
    public Optional<WorkflowStepCopyStepDetailsDestinationFileLocation> destinationFileLocation() {
        return Optional.ofNullable(this.destinationFileLocation);
    }
    /**
     * @return The name of the step, used as an identifier.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return A flag that indicates whether or not to overwrite an existing file of the same name. The default is `FALSE`. Valid values are `TRUE` and `FALSE`.
     * 
     */
    public Optional<String> overwriteExisting() {
        return Optional.ofNullable(this.overwriteExisting);
    }
    /**
     * @return Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow. Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value. Enter ${original.file} to use the originally-uploaded file location as input for this step.
     * 
     */
    public Optional<String> sourceFileLocation() {
        return Optional.ofNullable(this.sourceFileLocation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowStepCopyStepDetails defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WorkflowStepCopyStepDetailsDestinationFileLocation destinationFileLocation;
        private @Nullable String name;
        private @Nullable String overwriteExisting;
        private @Nullable String sourceFileLocation;
        public Builder() {}
        public Builder(WorkflowStepCopyStepDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationFileLocation = defaults.destinationFileLocation;
    	      this.name = defaults.name;
    	      this.overwriteExisting = defaults.overwriteExisting;
    	      this.sourceFileLocation = defaults.sourceFileLocation;
        }

        @CustomType.Setter
        public Builder destinationFileLocation(@Nullable WorkflowStepCopyStepDetailsDestinationFileLocation destinationFileLocation) {
            this.destinationFileLocation = destinationFileLocation;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder overwriteExisting(@Nullable String overwriteExisting) {
            this.overwriteExisting = overwriteExisting;
            return this;
        }
        @CustomType.Setter
        public Builder sourceFileLocation(@Nullable String sourceFileLocation) {
            this.sourceFileLocation = sourceFileLocation;
            return this;
        }
        public WorkflowStepCopyStepDetails build() {
            final var o = new WorkflowStepCopyStepDetails();
            o.destinationFileLocation = destinationFileLocation;
            o.name = name;
            o.overwriteExisting = overwriteExisting;
            o.sourceFileLocation = sourceFileLocation;
            return o;
        }
    }
}
