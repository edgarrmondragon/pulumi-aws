// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelectionArgs Empty = new ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelectionArgs();

    /**
     * Selects a specific three-letter language code from within an audio source.
     * 
     */
    @Import(name="languageCode", required=true)
    private Output<String> languageCode;

    /**
     * @return Selects a specific three-letter language code from within an audio source.
     * 
     */
    public Output<String> languageCode() {
        return this.languageCode;
    }

    /**
     * When set to “strict”, the transport stream demux strictly identifies audio streams by their language descriptor. If a PMT update occurs such that an audio stream matching the initially selected language is no longer present then mute will be encoded until the language returns. If “loose”, then on a PMT update the demux will choose another audio stream in the program with the same stream type if it can’t find one with the same language.
     * 
     */
    @Import(name="languageSelectionPolicy")
    private @Nullable Output<String> languageSelectionPolicy;

    /**
     * @return When set to “strict”, the transport stream demux strictly identifies audio streams by their language descriptor. If a PMT update occurs such that an audio stream matching the initially selected language is no longer present then mute will be encoded until the language returns. If “loose”, then on a PMT update the demux will choose another audio stream in the program with the same stream type if it can’t find one with the same language.
     * 
     */
    public Optional<Output<String>> languageSelectionPolicy() {
        return Optional.ofNullable(this.languageSelectionPolicy);
    }

    private ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelectionArgs() {}

    private ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelectionArgs(ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelectionArgs $) {
        this.languageCode = $.languageCode;
        this.languageSelectionPolicy = $.languageSelectionPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelectionArgs $;

        public Builder() {
            $ = new ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelectionArgs();
        }

        public Builder(ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelectionArgs defaults) {
            $ = new ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param languageCode Selects a specific three-letter language code from within an audio source.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        /**
         * @param languageCode Selects a specific three-letter language code from within an audio source.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        /**
         * @param languageSelectionPolicy When set to “strict”, the transport stream demux strictly identifies audio streams by their language descriptor. If a PMT update occurs such that an audio stream matching the initially selected language is no longer present then mute will be encoded until the language returns. If “loose”, then on a PMT update the demux will choose another audio stream in the program with the same stream type if it can’t find one with the same language.
         * 
         * @return builder
         * 
         */
        public Builder languageSelectionPolicy(@Nullable Output<String> languageSelectionPolicy) {
            $.languageSelectionPolicy = languageSelectionPolicy;
            return this;
        }

        /**
         * @param languageSelectionPolicy When set to “strict”, the transport stream demux strictly identifies audio streams by their language descriptor. If a PMT update occurs such that an audio stream matching the initially selected language is no longer present then mute will be encoded until the language returns. If “loose”, then on a PMT update the demux will choose another audio stream in the program with the same stream type if it can’t find one with the same language.
         * 
         * @return builder
         * 
         */
        public Builder languageSelectionPolicy(String languageSelectionPolicy) {
            return languageSelectionPolicy(Output.of(languageSelectionPolicy));
        }

        public ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelectionArgs build() {
            $.languageCode = Objects.requireNonNull($.languageCode, "expected parameter 'languageCode' to be non-null");
            return $;
        }
    }

}
