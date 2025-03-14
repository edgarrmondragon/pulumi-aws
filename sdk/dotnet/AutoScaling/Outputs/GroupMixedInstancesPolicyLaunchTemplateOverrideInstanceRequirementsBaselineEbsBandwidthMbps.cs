// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AutoScaling.Outputs
{

    [OutputType]
    public sealed class GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsBaselineEbsBandwidthMbps
    {
        /// <summary>
        /// Maximum. Set to `0` to exclude instance types with accelerators.
        /// </summary>
        public readonly int? Max;
        /// <summary>
        /// Minimum.
        /// </summary>
        public readonly int? Min;

        [OutputConstructor]
        private GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsBaselineEbsBandwidthMbps(
            int? max,

            int? min)
        {
            Max = max;
            Min = min;
        }
    }
}
