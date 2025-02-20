// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettings;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettings {
    /**
     * @return M2ts Settings. See [M2ts Settings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-m2tssettings.html) for more details.
     * 
     */
    private @Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettings m2tsSettings;

    private ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettings() {}
    /**
     * @return M2ts Settings. See [M2ts Settings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-m2tssettings.html) for more details.
     * 
     */
    public Optional<ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettings> m2tsSettings() {
        return Optional.ofNullable(this.m2tsSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettings m2tsSettings;
        public Builder() {}
        public Builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.m2tsSettings = defaults.m2tsSettings;
        }

        @CustomType.Setter
        public Builder m2tsSettings(@Nullable ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettings m2tsSettings) {
            this.m2tsSettings = m2tsSettings;
            return this;
        }
        public ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettings build() {
            final var o = new ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettings();
            o.m2tsSettings = m2tsSettings;
            return o;
        }
    }
}
