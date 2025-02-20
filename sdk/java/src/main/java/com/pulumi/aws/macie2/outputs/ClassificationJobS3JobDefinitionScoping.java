// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.outputs;

import com.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinitionScopingExcludes;
import com.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinitionScopingIncludes;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClassificationJobS3JobDefinitionScoping {
    /**
     * @return The property- or tag-based conditions that determine which objects to exclude from the analysis. (documented below)
     * 
     */
    private @Nullable ClassificationJobS3JobDefinitionScopingExcludes excludes;
    /**
     * @return The property- or tag-based conditions that determine which objects to include in the analysis. (documented below)
     * 
     */
    private @Nullable ClassificationJobS3JobDefinitionScopingIncludes includes;

    private ClassificationJobS3JobDefinitionScoping() {}
    /**
     * @return The property- or tag-based conditions that determine which objects to exclude from the analysis. (documented below)
     * 
     */
    public Optional<ClassificationJobS3JobDefinitionScopingExcludes> excludes() {
        return Optional.ofNullable(this.excludes);
    }
    /**
     * @return The property- or tag-based conditions that determine which objects to include in the analysis. (documented below)
     * 
     */
    public Optional<ClassificationJobS3JobDefinitionScopingIncludes> includes() {
        return Optional.ofNullable(this.includes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScoping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClassificationJobS3JobDefinitionScopingExcludes excludes;
        private @Nullable ClassificationJobS3JobDefinitionScopingIncludes includes;
        public Builder() {}
        public Builder(ClassificationJobS3JobDefinitionScoping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludes = defaults.excludes;
    	      this.includes = defaults.includes;
        }

        @CustomType.Setter
        public Builder excludes(@Nullable ClassificationJobS3JobDefinitionScopingExcludes excludes) {
            this.excludes = excludes;
            return this;
        }
        @CustomType.Setter
        public Builder includes(@Nullable ClassificationJobS3JobDefinitionScopingIncludes includes) {
            this.includes = includes;
            return this;
        }
        public ClassificationJobS3JobDefinitionScoping build() {
            final var o = new ClassificationJobS3JobDefinitionScoping();
            o.excludes = excludes;
            o.includes = includes;
            return o;
        }
    }
}
