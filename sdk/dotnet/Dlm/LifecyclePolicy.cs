// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Dlm
{
    /// <summary>
    /// Provides a [Data Lifecycle Manager (DLM) lifecycle policy](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-lifecycle.html) for managing snapshots.
    /// 
    /// ## Example Usage
    /// ### Example Event Based Policy Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var current = Aws.GetCallerIdentity.Invoke();
    /// 
    ///     var exampleLifecyclePolicy = new Aws.Dlm.LifecyclePolicy("exampleLifecyclePolicy", new()
    ///     {
    ///         Description = "tf-acc-basic",
    ///         ExecutionRoleArn = aws_iam_role.Example.Arn,
    ///         PolicyDetails = new Aws.Dlm.Inputs.LifecyclePolicyPolicyDetailsArgs
    ///         {
    ///             PolicyType = "EVENT_BASED_POLICY",
    ///             Action = new Aws.Dlm.Inputs.LifecyclePolicyPolicyDetailsActionArgs
    ///             {
    ///                 Name = "tf-acc-basic",
    ///                 CrossRegionCopies = new[]
    ///                 {
    ///                     new Aws.Dlm.Inputs.LifecyclePolicyPolicyDetailsActionCrossRegionCopyArgs
    ///                     {
    ///                         EncryptionConfiguration = null,
    ///                         RetainRule = new Aws.Dlm.Inputs.LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRuleArgs
    ///                         {
    ///                             Interval = 15,
    ///                             IntervalUnit = "MONTHS",
    ///                         },
    ///                         Target = "us-east-1",
    ///                     },
    ///                 },
    ///             },
    ///             EventSource = new Aws.Dlm.Inputs.LifecyclePolicyPolicyDetailsEventSourceArgs
    ///             {
    ///                 Type = "MANAGED_CWE",
    ///                 Parameters = new Aws.Dlm.Inputs.LifecyclePolicyPolicyDetailsEventSourceParametersArgs
    ///                 {
    ///                     DescriptionRegex = "^.*Created for policy: policy-1234567890abcdef0.*$",
    ///                     EventType = "shareSnapshot",
    ///                     SnapshotOwners = new[]
    ///                     {
    ///                         current.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.AccountId),
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var examplePolicy = Aws.Iam.GetPolicy.Invoke(new()
    ///     {
    ///         Name = "AWSDataLifecycleManagerServiceRole",
    ///     });
    /// 
    ///     var exampleRolePolicyAttachment = new Aws.Iam.RolePolicyAttachment("exampleRolePolicyAttachment", new()
    ///     {
    ///         Role = aws_iam_role.Example.Id,
    ///         PolicyArn = examplePolicy.Apply(getPolicyResult =&gt; getPolicyResult.Arn),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// In TODO v1.5.0 and later, use an `import` block to import DLM lifecycle policies using their policy ID. For exampleterraform import {
    /// 
    ///  to = aws_dlm_lifecycle_policy.example
    /// 
    ///  id = "policy-abcdef12345678901" } Using `TODO import`, import DLM lifecycle policies using their policy ID. For exampleconsole % TODO import aws_dlm_lifecycle_policy.example policy-abcdef12345678901
    /// </summary>
    [AwsResourceType("aws:dlm/lifecyclePolicy:LifecyclePolicy")]
    public partial class LifecyclePolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// A description for the DLM lifecycle policy.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The ARN of an IAM role that is able to be assumed by the DLM service.
        /// </summary>
        [Output("executionRoleArn")]
        public Output<string> ExecutionRoleArn { get; private set; } = null!;

        /// <summary>
        /// See the `policy_details` configuration block. Max of 1.
        /// </summary>
        [Output("policyDetails")]
        public Output<Outputs.LifecyclePolicyPolicyDetails> PolicyDetails { get; private set; } = null!;

        /// <summary>
        /// Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
        /// </summary>
        [Output("state")]
        public Output<string?> State { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a LifecyclePolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LifecyclePolicy(string name, LifecyclePolicyArgs args, CustomResourceOptions? options = null)
            : base("aws:dlm/lifecyclePolicy:LifecyclePolicy", name, args ?? new LifecyclePolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LifecyclePolicy(string name, Input<string> id, LifecyclePolicyState? state = null, CustomResourceOptions? options = null)
            : base("aws:dlm/lifecyclePolicy:LifecyclePolicy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "tagsAll",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing LifecyclePolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LifecyclePolicy Get(string name, Input<string> id, LifecyclePolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new LifecyclePolicy(name, id, state, options);
        }
    }

    public sealed class LifecyclePolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description for the DLM lifecycle policy.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// The ARN of an IAM role that is able to be assumed by the DLM service.
        /// </summary>
        [Input("executionRoleArn", required: true)]
        public Input<string> ExecutionRoleArn { get; set; } = null!;

        /// <summary>
        /// See the `policy_details` configuration block. Max of 1.
        /// </summary>
        [Input("policyDetails", required: true)]
        public Input<Inputs.LifecyclePolicyPolicyDetailsArgs> PolicyDetails { get; set; } = null!;

        /// <summary>
        /// Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public LifecyclePolicyArgs()
        {
        }
        public static new LifecyclePolicyArgs Empty => new LifecyclePolicyArgs();
    }

    public sealed class LifecyclePolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// A description for the DLM lifecycle policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The ARN of an IAM role that is able to be assumed by the DLM service.
        /// </summary>
        [Input("executionRoleArn")]
        public Input<string>? ExecutionRoleArn { get; set; }

        /// <summary>
        /// See the `policy_details` configuration block. Max of 1.
        /// </summary>
        [Input("policyDetails")]
        public Input<Inputs.LifecyclePolicyPolicyDetailsGetArgs>? PolicyDetails { get; set; }

        /// <summary>
        /// Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _tagsAll = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        public LifecyclePolicyState()
        {
        }
        public static new LifecyclePolicyState Empty => new LifecyclePolicyState();
    }
}
