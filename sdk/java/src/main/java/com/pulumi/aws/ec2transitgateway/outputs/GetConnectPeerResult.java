// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway.outputs;

import com.pulumi.aws.ec2transitgateway.outputs.GetConnectPeerFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetConnectPeerResult {
    /**
     * @return EC2 Transit Gateway Connect Peer ARN
     * 
     */
    private String arn;
    /**
     * @return BGP ASN number assigned customer device
     * 
     */
    private String bgpAsn;
    /**
     * @return The IP address assigned to customer device, which is used as BGP IP address.
     * 
     */
    private String bgpPeerAddress;
    /**
     * @return The IP addresses assigned to Transit Gateway, which are used as BGP IP addresses.
     * 
     */
    private List<String> bgpTransitGatewayAddresses;
    private @Nullable List<GetConnectPeerFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return CIDR blocks that will be used for addressing within the tunnel.
     * 
     */
    private List<String> insideCidrBlocks;
    /**
     * @return IP addressed assigned to customer device, which is used as tunnel endpoint
     * 
     */
    private String peerAddress;
    /**
     * @return Key-value tags for the EC2 Transit Gateway Connect Peer
     * 
     */
    private Map<String,String> tags;
    /**
     * @return The IP address assigned to Transit Gateway, which is used as tunnel endpoint.
     * 
     */
    private String transitGatewayAddress;
    /**
     * @return The Transit Gateway Connect
     * 
     */
    private String transitGatewayAttachmentId;
    private String transitGatewayConnectPeerId;

    private GetConnectPeerResult() {}
    /**
     * @return EC2 Transit Gateway Connect Peer ARN
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return BGP ASN number assigned customer device
     * 
     */
    public String bgpAsn() {
        return this.bgpAsn;
    }
    /**
     * @return The IP address assigned to customer device, which is used as BGP IP address.
     * 
     */
    public String bgpPeerAddress() {
        return this.bgpPeerAddress;
    }
    /**
     * @return The IP addresses assigned to Transit Gateway, which are used as BGP IP addresses.
     * 
     */
    public List<String> bgpTransitGatewayAddresses() {
        return this.bgpTransitGatewayAddresses;
    }
    public List<GetConnectPeerFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return CIDR blocks that will be used for addressing within the tunnel.
     * 
     */
    public List<String> insideCidrBlocks() {
        return this.insideCidrBlocks;
    }
    /**
     * @return IP addressed assigned to customer device, which is used as tunnel endpoint
     * 
     */
    public String peerAddress() {
        return this.peerAddress;
    }
    /**
     * @return Key-value tags for the EC2 Transit Gateway Connect Peer
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The IP address assigned to Transit Gateway, which is used as tunnel endpoint.
     * 
     */
    public String transitGatewayAddress() {
        return this.transitGatewayAddress;
    }
    /**
     * @return The Transit Gateway Connect
     * 
     */
    public String transitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }
    public String transitGatewayConnectPeerId() {
        return this.transitGatewayConnectPeerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectPeerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String bgpAsn;
        private String bgpPeerAddress;
        private List<String> bgpTransitGatewayAddresses;
        private @Nullable List<GetConnectPeerFilter> filters;
        private String id;
        private List<String> insideCidrBlocks;
        private String peerAddress;
        private Map<String,String> tags;
        private String transitGatewayAddress;
        private String transitGatewayAttachmentId;
        private String transitGatewayConnectPeerId;
        public Builder() {}
        public Builder(GetConnectPeerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.bgpAsn = defaults.bgpAsn;
    	      this.bgpPeerAddress = defaults.bgpPeerAddress;
    	      this.bgpTransitGatewayAddresses = defaults.bgpTransitGatewayAddresses;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.insideCidrBlocks = defaults.insideCidrBlocks;
    	      this.peerAddress = defaults.peerAddress;
    	      this.tags = defaults.tags;
    	      this.transitGatewayAddress = defaults.transitGatewayAddress;
    	      this.transitGatewayAttachmentId = defaults.transitGatewayAttachmentId;
    	      this.transitGatewayConnectPeerId = defaults.transitGatewayConnectPeerId;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder bgpAsn(String bgpAsn) {
            this.bgpAsn = Objects.requireNonNull(bgpAsn);
            return this;
        }
        @CustomType.Setter
        public Builder bgpPeerAddress(String bgpPeerAddress) {
            this.bgpPeerAddress = Objects.requireNonNull(bgpPeerAddress);
            return this;
        }
        @CustomType.Setter
        public Builder bgpTransitGatewayAddresses(List<String> bgpTransitGatewayAddresses) {
            this.bgpTransitGatewayAddresses = Objects.requireNonNull(bgpTransitGatewayAddresses);
            return this;
        }
        public Builder bgpTransitGatewayAddresses(String... bgpTransitGatewayAddresses) {
            return bgpTransitGatewayAddresses(List.of(bgpTransitGatewayAddresses));
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetConnectPeerFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetConnectPeerFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder insideCidrBlocks(List<String> insideCidrBlocks) {
            this.insideCidrBlocks = Objects.requireNonNull(insideCidrBlocks);
            return this;
        }
        public Builder insideCidrBlocks(String... insideCidrBlocks) {
            return insideCidrBlocks(List.of(insideCidrBlocks));
        }
        @CustomType.Setter
        public Builder peerAddress(String peerAddress) {
            this.peerAddress = Objects.requireNonNull(peerAddress);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder transitGatewayAddress(String transitGatewayAddress) {
            this.transitGatewayAddress = Objects.requireNonNull(transitGatewayAddress);
            return this;
        }
        @CustomType.Setter
        public Builder transitGatewayAttachmentId(String transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = Objects.requireNonNull(transitGatewayAttachmentId);
            return this;
        }
        @CustomType.Setter
        public Builder transitGatewayConnectPeerId(String transitGatewayConnectPeerId) {
            this.transitGatewayConnectPeerId = Objects.requireNonNull(transitGatewayConnectPeerId);
            return this;
        }
        public GetConnectPeerResult build() {
            final var o = new GetConnectPeerResult();
            o.arn = arn;
            o.bgpAsn = bgpAsn;
            o.bgpPeerAddress = bgpPeerAddress;
            o.bgpTransitGatewayAddresses = bgpTransitGatewayAddresses;
            o.filters = filters;
            o.id = id;
            o.insideCidrBlocks = insideCidrBlocks;
            o.peerAddress = peerAddress;
            o.tags = tags;
            o.transitGatewayAddress = transitGatewayAddress;
            o.transitGatewayAttachmentId = transitGatewayAttachmentId;
            o.transitGatewayConnectPeerId = transitGatewayConnectPeerId;
            return o;
        }
    }
}
