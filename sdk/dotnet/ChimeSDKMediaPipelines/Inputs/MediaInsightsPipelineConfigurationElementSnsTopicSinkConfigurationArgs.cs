// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ChimeSDKMediaPipelines.Inputs
{

    public sealed class MediaInsightsPipelineConfigurationElementSnsTopicSinkConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Kinesis Data Stream to deliver results.
        /// </summary>
        [Input("insightsTarget", required: true)]
        public Input<string> InsightsTarget { get; set; } = null!;

        public MediaInsightsPipelineConfigurationElementSnsTopicSinkConfigurationArgs()
        {
        }
        public static new MediaInsightsPipelineConfigurationElementSnsTopicSinkConfigurationArgs Empty => new MediaInsightsPipelineConfigurationElementSnsTopicSinkConfigurationArgs();
    }
}
