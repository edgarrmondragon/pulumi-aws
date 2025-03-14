// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager;

import com.pulumi.aws.networkmanager.inputs.ConnectPeerBgpOptionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectPeerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectPeerArgs Empty = new ConnectPeerArgs();

    /**
     * The Connect peer BGP options.
     * 
     */
    @Import(name="bgpOptions")
    private @Nullable Output<ConnectPeerBgpOptionsArgs> bgpOptions;

    /**
     * @return The Connect peer BGP options.
     * 
     */
    public Optional<Output<ConnectPeerBgpOptionsArgs>> bgpOptions() {
        return Optional.ofNullable(this.bgpOptions);
    }

    /**
     * The ID of the connection attachment.
     * 
     */
    @Import(name="connectAttachmentId", required=true)
    private Output<String> connectAttachmentId;

    /**
     * @return The ID of the connection attachment.
     * 
     */
    public Output<String> connectAttachmentId() {
        return this.connectAttachmentId;
    }

    /**
     * A Connect peer core network address.
     * 
     */
    @Import(name="coreNetworkAddress")
    private @Nullable Output<String> coreNetworkAddress;

    /**
     * @return A Connect peer core network address.
     * 
     */
    public Optional<Output<String>> coreNetworkAddress() {
        return Optional.ofNullable(this.coreNetworkAddress);
    }

    /**
     * The inside IP addresses used for BGP peering.
     * 
     */
    @Import(name="insideCidrBlocks", required=true)
    private Output<List<String>> insideCidrBlocks;

    /**
     * @return The inside IP addresses used for BGP peering.
     * 
     */
    public Output<List<String>> insideCidrBlocks() {
        return this.insideCidrBlocks;
    }

    /**
     * The Connect peer address.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="peerAddress", required=true)
    private Output<String> peerAddress;

    /**
     * @return The Connect peer address.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> peerAddress() {
        return this.peerAddress;
    }

    /**
     * Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ConnectPeerArgs() {}

    private ConnectPeerArgs(ConnectPeerArgs $) {
        this.bgpOptions = $.bgpOptions;
        this.connectAttachmentId = $.connectAttachmentId;
        this.coreNetworkAddress = $.coreNetworkAddress;
        this.insideCidrBlocks = $.insideCidrBlocks;
        this.peerAddress = $.peerAddress;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectPeerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectPeerArgs $;

        public Builder() {
            $ = new ConnectPeerArgs();
        }

        public Builder(ConnectPeerArgs defaults) {
            $ = new ConnectPeerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bgpOptions The Connect peer BGP options.
         * 
         * @return builder
         * 
         */
        public Builder bgpOptions(@Nullable Output<ConnectPeerBgpOptionsArgs> bgpOptions) {
            $.bgpOptions = bgpOptions;
            return this;
        }

        /**
         * @param bgpOptions The Connect peer BGP options.
         * 
         * @return builder
         * 
         */
        public Builder bgpOptions(ConnectPeerBgpOptionsArgs bgpOptions) {
            return bgpOptions(Output.of(bgpOptions));
        }

        /**
         * @param connectAttachmentId The ID of the connection attachment.
         * 
         * @return builder
         * 
         */
        public Builder connectAttachmentId(Output<String> connectAttachmentId) {
            $.connectAttachmentId = connectAttachmentId;
            return this;
        }

        /**
         * @param connectAttachmentId The ID of the connection attachment.
         * 
         * @return builder
         * 
         */
        public Builder connectAttachmentId(String connectAttachmentId) {
            return connectAttachmentId(Output.of(connectAttachmentId));
        }

        /**
         * @param coreNetworkAddress A Connect peer core network address.
         * 
         * @return builder
         * 
         */
        public Builder coreNetworkAddress(@Nullable Output<String> coreNetworkAddress) {
            $.coreNetworkAddress = coreNetworkAddress;
            return this;
        }

        /**
         * @param coreNetworkAddress A Connect peer core network address.
         * 
         * @return builder
         * 
         */
        public Builder coreNetworkAddress(String coreNetworkAddress) {
            return coreNetworkAddress(Output.of(coreNetworkAddress));
        }

        /**
         * @param insideCidrBlocks The inside IP addresses used for BGP peering.
         * 
         * @return builder
         * 
         */
        public Builder insideCidrBlocks(Output<List<String>> insideCidrBlocks) {
            $.insideCidrBlocks = insideCidrBlocks;
            return this;
        }

        /**
         * @param insideCidrBlocks The inside IP addresses used for BGP peering.
         * 
         * @return builder
         * 
         */
        public Builder insideCidrBlocks(List<String> insideCidrBlocks) {
            return insideCidrBlocks(Output.of(insideCidrBlocks));
        }

        /**
         * @param insideCidrBlocks The inside IP addresses used for BGP peering.
         * 
         * @return builder
         * 
         */
        public Builder insideCidrBlocks(String... insideCidrBlocks) {
            return insideCidrBlocks(List.of(insideCidrBlocks));
        }

        /**
         * @param peerAddress The Connect peer address.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder peerAddress(Output<String> peerAddress) {
            $.peerAddress = peerAddress;
            return this;
        }

        /**
         * @param peerAddress The Connect peer address.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder peerAddress(String peerAddress) {
            return peerAddress(Output.of(peerAddress));
        }

        /**
         * @param tags Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ConnectPeerArgs build() {
            $.connectAttachmentId = Objects.requireNonNull($.connectAttachmentId, "expected parameter 'connectAttachmentId' to be non-null");
            $.insideCidrBlocks = Objects.requireNonNull($.insideCidrBlocks, "expected parameter 'insideCidrBlocks' to be non-null");
            $.peerAddress = Objects.requireNonNull($.peerAddress, "expected parameter 'peerAddress' to be non-null");
            return $;
        }
    }

}
