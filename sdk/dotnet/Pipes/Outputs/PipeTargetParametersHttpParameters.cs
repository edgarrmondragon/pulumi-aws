// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Pipes.Outputs
{

    [OutputType]
    public sealed class PipeTargetParametersHttpParameters
    {
        /// <summary>
        /// Key-value mapping of the headers that need to be sent as part of request invoking the API Gateway REST API or EventBridge ApiDestination.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? HeaderParameters;
        /// <summary>
        /// The path parameter values to be used to populate API Gateway REST API or EventBridge ApiDestination path wildcards ("*").
        /// </summary>
        public readonly string? PathParameterValues;
        /// <summary>
        /// Key-value mapping of the query strings that need to be sent as part of request invoking the API Gateway REST API or EventBridge ApiDestination.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? QueryStringParameters;

        [OutputConstructor]
        private PipeTargetParametersHttpParameters(
            ImmutableDictionary<string, string>? headerParameters,

            string? pathParameterValues,

            ImmutableDictionary<string, string>? queryStringParameters)
        {
            HeaderParameters = headerParameters;
            PathParameterValues = pathParameterValues;
            QueryStringParameters = queryStringParameters;
        }
    }
}
