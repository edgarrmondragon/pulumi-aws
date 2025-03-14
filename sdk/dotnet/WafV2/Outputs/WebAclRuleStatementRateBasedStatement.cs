// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Outputs
{

    [OutputType]
    public sealed class WebAclRuleStatementRateBasedStatement
    {
        /// <summary>
        /// Setting that indicates how to aggregate the request counts. Valid values include: `CONSTANT`, `FORWARDED_IP` or `IP`. Default: `IP`.
        /// </summary>
        public readonly string? AggregateKeyType;
        /// <summary>
        /// Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. If `aggregate_key_type` is set to `FORWARDED_IP`, this block is required. See `forwarded_ip_config` below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementRateBasedStatementForwardedIpConfig? ForwardedIpConfig;
        /// <summary>
        /// Limit on requests per 5-minute period for a single originating IP address.
        /// </summary>
        public readonly int Limit;
        /// <summary>
        /// Optional nested statement that narrows the scope of the rate-based statement to matching web requests. This can be any nestable statement, and you can nest statements at any level below this scope-down statement. See `statement` above for details. If `aggregate_key_type` is set to `CONSTANT`, this block is required.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementRateBasedStatementScopeDownStatement? ScopeDownStatement;

        [OutputConstructor]
        private WebAclRuleStatementRateBasedStatement(
            string? aggregateKeyType,

            Outputs.WebAclRuleStatementRateBasedStatementForwardedIpConfig? forwardedIpConfig,

            int limit,

            Outputs.WebAclRuleStatementRateBasedStatementScopeDownStatement? scopeDownStatement)
        {
            AggregateKeyType = aggregateKeyType;
            ForwardedIpConfig = forwardedIpConfig;
            Limit = limit;
            ScopeDownStatement = scopeDownStatement;
        }
    }
}
