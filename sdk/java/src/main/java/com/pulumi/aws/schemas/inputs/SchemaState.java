// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.schemas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SchemaState extends com.pulumi.resources.ResourceArgs {

    public static final SchemaState Empty = new SchemaState();

    /**
     * The Amazon Resource Name (ARN) of the discoverer.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the discoverer.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The schema specification. Must be a valid Open API 3.0 spec.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return The schema specification. Must be a valid Open API 3.0 spec.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The description of the schema. Maximum of 256 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the schema. Maximum of 256 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The last modified date of the schema.
     * 
     */
    @Import(name="lastModified")
    private @Nullable Output<String> lastModified;

    /**
     * @return The last modified date of the schema.
     * 
     */
    public Optional<Output<String>> lastModified() {
        return Optional.ofNullable(this.lastModified);
    }

    /**
     * The name of the schema. Maximum of 385 characters consisting of lower case letters, upper case letters, ., -, _, @.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the schema. Maximum of 385 characters consisting of lower case letters, upper case letters, ., -, _, @.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the registry in which this schema belongs.
     * 
     */
    @Import(name="registryName")
    private @Nullable Output<String> registryName;

    /**
     * @return The name of the registry in which this schema belongs.
     * 
     */
    public Optional<Output<String>> registryName() {
        return Optional.ofNullable(this.registryName);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The type of the schema. Valid values: `OpenApi3`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the schema. Valid values: `OpenApi3`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The version of the schema.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The version of the schema.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    /**
     * The created date of the version of the schema.
     * 
     */
    @Import(name="versionCreatedDate")
    private @Nullable Output<String> versionCreatedDate;

    /**
     * @return The created date of the version of the schema.
     * 
     */
    public Optional<Output<String>> versionCreatedDate() {
        return Optional.ofNullable(this.versionCreatedDate);
    }

    private SchemaState() {}

    private SchemaState(SchemaState $) {
        this.arn = $.arn;
        this.content = $.content;
        this.description = $.description;
        this.lastModified = $.lastModified;
        this.name = $.name;
        this.registryName = $.registryName;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.type = $.type;
        this.version = $.version;
        this.versionCreatedDate = $.versionCreatedDate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaState $;

        public Builder() {
            $ = new SchemaState();
        }

        public Builder(SchemaState defaults) {
            $ = new SchemaState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the discoverer.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the discoverer.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param content The schema specification. Must be a valid Open API 3.0 spec.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The schema specification. Must be a valid Open API 3.0 spec.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param description The description of the schema. Maximum of 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the schema. Maximum of 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param lastModified The last modified date of the schema.
         * 
         * @return builder
         * 
         */
        public Builder lastModified(@Nullable Output<String> lastModified) {
            $.lastModified = lastModified;
            return this;
        }

        /**
         * @param lastModified The last modified date of the schema.
         * 
         * @return builder
         * 
         */
        public Builder lastModified(String lastModified) {
            return lastModified(Output.of(lastModified));
        }

        /**
         * @param name The name of the schema. Maximum of 385 characters consisting of lower case letters, upper case letters, ., -, _, @.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the schema. Maximum of 385 characters consisting of lower case letters, upper case letters, ., -, _, @.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param registryName The name of the registry in which this schema belongs.
         * 
         * @return builder
         * 
         */
        public Builder registryName(@Nullable Output<String> registryName) {
            $.registryName = registryName;
            return this;
        }

        /**
         * @param registryName The name of the registry in which this schema belongs.
         * 
         * @return builder
         * 
         */
        public Builder registryName(String registryName) {
            return registryName(Output.of(registryName));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         * @deprecated
         * Please use `tags` instead.
         * 
         */
        @Deprecated /* Please use `tags` instead. */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         * @deprecated
         * Please use `tags` instead.
         * 
         */
        @Deprecated /* Please use `tags` instead. */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param type The type of the schema. Valid values: `OpenApi3`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the schema. Valid values: `OpenApi3`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param version The version of the schema.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the schema.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        /**
         * @param versionCreatedDate The created date of the version of the schema.
         * 
         * @return builder
         * 
         */
        public Builder versionCreatedDate(@Nullable Output<String> versionCreatedDate) {
            $.versionCreatedDate = versionCreatedDate;
            return this;
        }

        /**
         * @param versionCreatedDate The created date of the version of the schema.
         * 
         * @return builder
         * 
         */
        public Builder versionCreatedDate(String versionCreatedDate) {
            return versionCreatedDate(Output.of(versionCreatedDate));
        }

        public SchemaState build() {
            return $;
        }
    }

}
