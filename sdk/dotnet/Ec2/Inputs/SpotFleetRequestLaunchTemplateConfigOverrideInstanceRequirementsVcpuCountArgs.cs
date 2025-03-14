// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Inputs
{

    public sealed class SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Maximum. Set to `0` to exclude instance types with accelerators.
        /// </summary>
        [Input("max")]
        public Input<int>? Max { get; set; }

        /// <summary>
        /// Minimum.
        /// </summary>
        [Input("min")]
        public Input<int>? Min { get; set; }

        public SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs()
        {
        }
        public static new SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs Empty => new SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs();
    }
}
