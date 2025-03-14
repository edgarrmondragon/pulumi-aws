// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra;

import com.pulumi.aws.kendra.inputs.QuerySuggestionsBlockListSourceS3PathArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QuerySuggestionsBlockListArgs extends com.pulumi.resources.ResourceArgs {

    public static final QuerySuggestionsBlockListArgs Empty = new QuerySuggestionsBlockListArgs();

    /**
     * Description for a block list.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description for a block list.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Identifier of the index for a block list.
     * 
     */
    @Import(name="indexId", required=true)
    private Output<String> indexId;

    /**
     * @return Identifier of the index for a block list.
     * 
     */
    public Output<String> indexId() {
        return this.indexId;
    }

    /**
     * Name for the block list.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name for the block list.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * IAM (Identity and Access Management) role used to access the block list text file in S3.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return IAM (Identity and Access Management) role used to access the block list text file in S3.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * S3 path where your block list text file is located. See details below.
     * 
     * The `source_s3_path` configuration block supports the following arguments:
     * 
     */
    @Import(name="sourceS3Path", required=true)
    private Output<QuerySuggestionsBlockListSourceS3PathArgs> sourceS3Path;

    /**
     * @return S3 path where your block list text file is located. See details below.
     * 
     * The `source_s3_path` configuration block supports the following arguments:
     * 
     */
    public Output<QuerySuggestionsBlockListSourceS3PathArgs> sourceS3Path() {
        return this.sourceS3Path;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private QuerySuggestionsBlockListArgs() {}

    private QuerySuggestionsBlockListArgs(QuerySuggestionsBlockListArgs $) {
        this.description = $.description;
        this.indexId = $.indexId;
        this.name = $.name;
        this.roleArn = $.roleArn;
        this.sourceS3Path = $.sourceS3Path;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QuerySuggestionsBlockListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QuerySuggestionsBlockListArgs $;

        public Builder() {
            $ = new QuerySuggestionsBlockListArgs();
        }

        public Builder(QuerySuggestionsBlockListArgs defaults) {
            $ = new QuerySuggestionsBlockListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description for a block list.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description for a block list.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param indexId Identifier of the index for a block list.
         * 
         * @return builder
         * 
         */
        public Builder indexId(Output<String> indexId) {
            $.indexId = indexId;
            return this;
        }

        /**
         * @param indexId Identifier of the index for a block list.
         * 
         * @return builder
         * 
         */
        public Builder indexId(String indexId) {
            return indexId(Output.of(indexId));
        }

        /**
         * @param name Name for the block list.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name for the block list.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param roleArn IAM (Identity and Access Management) role used to access the block list text file in S3.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn IAM (Identity and Access Management) role used to access the block list text file in S3.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param sourceS3Path S3 path where your block list text file is located. See details below.
         * 
         * The `source_s3_path` configuration block supports the following arguments:
         * 
         * @return builder
         * 
         */
        public Builder sourceS3Path(Output<QuerySuggestionsBlockListSourceS3PathArgs> sourceS3Path) {
            $.sourceS3Path = sourceS3Path;
            return this;
        }

        /**
         * @param sourceS3Path S3 path where your block list text file is located. See details below.
         * 
         * The `source_s3_path` configuration block supports the following arguments:
         * 
         * @return builder
         * 
         */
        public Builder sourceS3Path(QuerySuggestionsBlockListSourceS3PathArgs sourceS3Path) {
            return sourceS3Path(Output.of(sourceS3Path));
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public QuerySuggestionsBlockListArgs build() {
            $.indexId = Objects.requireNonNull($.indexId, "expected parameter 'indexId' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.sourceS3Path = Objects.requireNonNull($.sourceS3Path, "expected parameter 'sourceS3Path' to be non-null");
            return $;
        }
    }

}
