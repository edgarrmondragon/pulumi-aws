// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettings;
import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsRawSettings;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettings {
    /**
     * @return M2ts Settings. See [M2ts Settings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-m2tssettings.html) for more details.
     * 
     */
    private @Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettings m2tsSettings;
    /**
     * @return Raw Settings. This can be set as an empty block.
     * 
     */
    private @Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsRawSettings rawSettings;

    private ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettings() {}
    /**
     * @return M2ts Settings. See [M2ts Settings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-m2tssettings.html) for more details.
     * 
     */
    public Optional<ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettings> m2tsSettings() {
        return Optional.ofNullable(this.m2tsSettings);
    }
    /**
     * @return Raw Settings. This can be set as an empty block.
     * 
     */
    public Optional<ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsRawSettings> rawSettings() {
        return Optional.ofNullable(this.rawSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettings m2tsSettings;
        private @Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsRawSettings rawSettings;
        public Builder() {}
        public Builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.m2tsSettings = defaults.m2tsSettings;
    	      this.rawSettings = defaults.rawSettings;
        }

        @CustomType.Setter
        public Builder m2tsSettings(@Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettings m2tsSettings) {
            this.m2tsSettings = m2tsSettings;
            return this;
        }
        @CustomType.Setter
        public Builder rawSettings(@Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsRawSettings rawSettings) {
            this.rawSettings = rawSettings;
            return this;
        }
        public ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettings build() {
            final var o = new ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettings();
            o.m2tsSettings = m2tsSettings;
            o.rawSettings = rawSettings;
            return o;
        }
    }
}
