// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppAutoScaling.Inputs
{

    public sealed class PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationArgs : global::Pulumi.ResourceArgs
    {
        [Input("dimensions")]
        private InputList<Inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionArgs>? _dimensions;

        /// <summary>
        /// Configuration block(s) with the dimensions of the metric if the metric was published with dimensions. Detailed below.
        /// </summary>
        public InputList<Inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionArgs> Dimensions
        {
            get => _dimensions ?? (_dimensions = new InputList<Inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionArgs>());
            set => _dimensions = value;
        }

        /// <summary>
        /// Name of the metric.
        /// </summary>
        [Input("metricName")]
        public Input<string>? MetricName { get; set; }

        [Input("metrics")]
        private InputList<Inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricArgs>? _metrics;

        /// <summary>
        /// Metrics to include, as a metric data query.
        /// </summary>
        public InputList<Inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricArgs> Metrics
        {
            get => _metrics ?? (_metrics = new InputList<Inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricArgs>());
            set => _metrics = value;
        }

        /// <summary>
        /// Namespace of the metric.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// Statistic of the metric. Valid values: `Average`, `Minimum`, `Maximum`, `SampleCount`, and `Sum`.
        /// </summary>
        [Input("statistic")]
        public Input<string>? Statistic { get; set; }

        /// <summary>
        /// Unit of the metric.
        /// </summary>
        [Input("unit")]
        public Input<string>? Unit { get; set; }

        public PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationArgs()
        {
        }
        public static new PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationArgs Empty => new PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationArgs();
    }
}
