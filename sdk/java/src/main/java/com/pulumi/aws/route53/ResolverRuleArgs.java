// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.aws.route53.inputs.ResolverRuleTargetIpArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResolverRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResolverRuleArgs Empty = new ResolverRuleArgs();

    /**
     * DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
     * 
     */
    @Import(name="domainName", required=true)
    private Output<String> domainName;

    /**
     * @return DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    @Import(name="resolverEndpointId")
    private @Nullable Output<String> resolverEndpointId;

    /**
     * @return The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    public Optional<Output<String>> resolverEndpointId() {
        return Optional.ofNullable(this.resolverEndpointId);
    }

    /**
     * The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
     * 
     */
    @Import(name="ruleType", required=true)
    private Output<String> ruleType;

    /**
     * @return The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
     * 
     */
    public Output<String> ruleType() {
        return this.ruleType;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    @Import(name="targetIps")
    private @Nullable Output<List<ResolverRuleTargetIpArgs>> targetIps;

    /**
     * @return Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    public Optional<Output<List<ResolverRuleTargetIpArgs>>> targetIps() {
        return Optional.ofNullable(this.targetIps);
    }

    private ResolverRuleArgs() {}

    private ResolverRuleArgs(ResolverRuleArgs $) {
        this.domainName = $.domainName;
        this.name = $.name;
        this.resolverEndpointId = $.resolverEndpointId;
        this.ruleType = $.ruleType;
        this.tags = $.tags;
        this.targetIps = $.targetIps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResolverRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResolverRuleArgs $;

        public Builder() {
            $ = new ResolverRuleArgs();
        }

        public Builder(ResolverRuleArgs defaults) {
            $ = new ResolverRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainName DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
         * 
         * @return builder
         * 
         */
        public Builder domainName(Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param name A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resolverEndpointId The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
         * This argument should only be specified for `FORWARD` type rules.
         * 
         * @return builder
         * 
         */
        public Builder resolverEndpointId(@Nullable Output<String> resolverEndpointId) {
            $.resolverEndpointId = resolverEndpointId;
            return this;
        }

        /**
         * @param resolverEndpointId The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
         * This argument should only be specified for `FORWARD` type rules.
         * 
         * @return builder
         * 
         */
        public Builder resolverEndpointId(String resolverEndpointId) {
            return resolverEndpointId(Output.of(resolverEndpointId));
        }

        /**
         * @param ruleType The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
         * 
         * @return builder
         * 
         */
        public Builder ruleType(Output<String> ruleType) {
            $.ruleType = ruleType;
            return this;
        }

        /**
         * @param ruleType The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
         * 
         * @return builder
         * 
         */
        public Builder ruleType(String ruleType) {
            return ruleType(Output.of(ruleType));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param targetIps Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
         * This argument should only be specified for `FORWARD` type rules.
         * 
         * @return builder
         * 
         */
        public Builder targetIps(@Nullable Output<List<ResolverRuleTargetIpArgs>> targetIps) {
            $.targetIps = targetIps;
            return this;
        }

        /**
         * @param targetIps Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
         * This argument should only be specified for `FORWARD` type rules.
         * 
         * @return builder
         * 
         */
        public Builder targetIps(List<ResolverRuleTargetIpArgs> targetIps) {
            return targetIps(Output.of(targetIps));
        }

        /**
         * @param targetIps Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
         * This argument should only be specified for `FORWARD` type rules.
         * 
         * @return builder
         * 
         */
        public Builder targetIps(ResolverRuleTargetIpArgs... targetIps) {
            return targetIps(List.of(targetIps));
        }

        public ResolverRuleArgs build() {
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            $.ruleType = Objects.requireNonNull($.ruleType, "expected parameter 'ruleType' to be non-null");
            return $;
        }
    }

}
