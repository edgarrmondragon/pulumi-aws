// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsMotionGraphicsConfigurationMotionGraphicsSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelEncoderSettingsMotionGraphicsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelEncoderSettingsMotionGraphicsConfigurationArgs Empty = new ChannelEncoderSettingsMotionGraphicsConfigurationArgs();

    /**
     * Motion Graphics Insertion.
     * 
     */
    @Import(name="motionGraphicsInsertion")
    private @Nullable Output<String> motionGraphicsInsertion;

    /**
     * @return Motion Graphics Insertion.
     * 
     */
    public Optional<Output<String>> motionGraphicsInsertion() {
        return Optional.ofNullable(this.motionGraphicsInsertion);
    }

    /**
     * Motion Graphics Settings. See Motion Graphics Settings for more details.
     * 
     */
    @Import(name="motionGraphicsSettings", required=true)
    private Output<ChannelEncoderSettingsMotionGraphicsConfigurationMotionGraphicsSettingsArgs> motionGraphicsSettings;

    /**
     * @return Motion Graphics Settings. See Motion Graphics Settings for more details.
     * 
     */
    public Output<ChannelEncoderSettingsMotionGraphicsConfigurationMotionGraphicsSettingsArgs> motionGraphicsSettings() {
        return this.motionGraphicsSettings;
    }

    private ChannelEncoderSettingsMotionGraphicsConfigurationArgs() {}

    private ChannelEncoderSettingsMotionGraphicsConfigurationArgs(ChannelEncoderSettingsMotionGraphicsConfigurationArgs $) {
        this.motionGraphicsInsertion = $.motionGraphicsInsertion;
        this.motionGraphicsSettings = $.motionGraphicsSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelEncoderSettingsMotionGraphicsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelEncoderSettingsMotionGraphicsConfigurationArgs $;

        public Builder() {
            $ = new ChannelEncoderSettingsMotionGraphicsConfigurationArgs();
        }

        public Builder(ChannelEncoderSettingsMotionGraphicsConfigurationArgs defaults) {
            $ = new ChannelEncoderSettingsMotionGraphicsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param motionGraphicsInsertion Motion Graphics Insertion.
         * 
         * @return builder
         * 
         */
        public Builder motionGraphicsInsertion(@Nullable Output<String> motionGraphicsInsertion) {
            $.motionGraphicsInsertion = motionGraphicsInsertion;
            return this;
        }

        /**
         * @param motionGraphicsInsertion Motion Graphics Insertion.
         * 
         * @return builder
         * 
         */
        public Builder motionGraphicsInsertion(String motionGraphicsInsertion) {
            return motionGraphicsInsertion(Output.of(motionGraphicsInsertion));
        }

        /**
         * @param motionGraphicsSettings Motion Graphics Settings. See Motion Graphics Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder motionGraphicsSettings(Output<ChannelEncoderSettingsMotionGraphicsConfigurationMotionGraphicsSettingsArgs> motionGraphicsSettings) {
            $.motionGraphicsSettings = motionGraphicsSettings;
            return this;
        }

        /**
         * @param motionGraphicsSettings Motion Graphics Settings. See Motion Graphics Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder motionGraphicsSettings(ChannelEncoderSettingsMotionGraphicsConfigurationMotionGraphicsSettingsArgs motionGraphicsSettings) {
            return motionGraphicsSettings(Output.of(motionGraphicsSettings));
        }

        public ChannelEncoderSettingsMotionGraphicsConfigurationArgs build() {
            $.motionGraphicsSettings = Objects.requireNonNull($.motionGraphicsSettings, "expected parameter 'motionGraphicsSettings' to be non-null");
            return $;
        }
    }

}
