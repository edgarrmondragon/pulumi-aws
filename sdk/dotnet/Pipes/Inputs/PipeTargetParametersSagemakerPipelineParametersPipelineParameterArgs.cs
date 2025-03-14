// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Pipes.Inputs
{

    public sealed class PipeTargetParametersSagemakerPipelineParametersPipelineParameterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the pipe. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The value of the key-value pair. For environment variables, this is the value of the environment variable.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public PipeTargetParametersSagemakerPipelineParametersPipelineParameterArgs()
        {
        }
        public static new PipeTargetParametersSagemakerPipelineParametersPipelineParameterArgs Empty => new PipeTargetParametersSagemakerPipelineParametersPipelineParameterArgs();
    }
}
