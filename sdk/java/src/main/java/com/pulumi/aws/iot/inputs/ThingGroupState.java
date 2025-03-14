// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.inputs;

import com.pulumi.aws.iot.inputs.ThingGroupMetadataArgs;
import com.pulumi.aws.iot.inputs.ThingGroupPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThingGroupState extends com.pulumi.resources.ResourceArgs {

    public static final ThingGroupState Empty = new ThingGroupState();

    /**
     * The ARN of the Thing Group.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the Thing Group.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    @Import(name="metadatas")
    private @Nullable Output<List<ThingGroupMetadataArgs>> metadatas;

    public Optional<Output<List<ThingGroupMetadataArgs>>> metadatas() {
        return Optional.ofNullable(this.metadatas);
    }

    /**
     * The name of the Thing Group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Thing Group.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the parent Thing Group.
     * 
     */
    @Import(name="parentGroupName")
    private @Nullable Output<String> parentGroupName;

    /**
     * @return The name of the parent Thing Group.
     * 
     */
    public Optional<Output<String>> parentGroupName() {
        return Optional.ofNullable(this.parentGroupName);
    }

    /**
     * The Thing Group properties. Defined below.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<ThingGroupPropertiesArgs> properties;

    /**
     * @return The Thing Group properties. Defined below.
     * 
     */
    public Optional<Output<ThingGroupPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Key-value mapping of resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The current version of the Thing Group record in the registry.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return The current version of the Thing Group record in the registry.
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private ThingGroupState() {}

    private ThingGroupState(ThingGroupState $) {
        this.arn = $.arn;
        this.metadatas = $.metadatas;
        this.name = $.name;
        this.parentGroupName = $.parentGroupName;
        this.properties = $.properties;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThingGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThingGroupState $;

        public Builder() {
            $ = new ThingGroupState();
        }

        public Builder(ThingGroupState defaults) {
            $ = new ThingGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the Thing Group.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the Thing Group.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder metadatas(@Nullable Output<List<ThingGroupMetadataArgs>> metadatas) {
            $.metadatas = metadatas;
            return this;
        }

        public Builder metadatas(List<ThingGroupMetadataArgs> metadatas) {
            return metadatas(Output.of(metadatas));
        }

        public Builder metadatas(ThingGroupMetadataArgs... metadatas) {
            return metadatas(List.of(metadatas));
        }

        /**
         * @param name The name of the Thing Group.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Thing Group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parentGroupName The name of the parent Thing Group.
         * 
         * @return builder
         * 
         */
        public Builder parentGroupName(@Nullable Output<String> parentGroupName) {
            $.parentGroupName = parentGroupName;
            return this;
        }

        /**
         * @param parentGroupName The name of the parent Thing Group.
         * 
         * @return builder
         * 
         */
        public Builder parentGroupName(String parentGroupName) {
            return parentGroupName(Output.of(parentGroupName));
        }

        /**
         * @param properties The Thing Group properties. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<ThingGroupPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The Thing Group properties. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder properties(ThingGroupPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param tags Key-value mapping of resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value mapping of resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
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
         * @param version The current version of the Thing Group record in the registry.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The current version of the Thing Group record in the registry.
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public ThingGroupState build() {
            return $;
        }
    }

}
