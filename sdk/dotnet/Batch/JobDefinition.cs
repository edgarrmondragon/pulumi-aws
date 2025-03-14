// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Batch
{
    /// <summary>
    /// Provides a Batch Job Definition resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Aws.Batch.JobDefinition("test", new()
    ///     {
    ///         Type = "container",
    ///         ContainerProperties = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["command"] = new[]
    ///             {
    ///                 "ls",
    ///                 "-la",
    ///             },
    ///             ["image"] = "busybox",
    ///             ["resourceRequirements"] = new[]
    ///             {
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["type"] = "VCPU",
    ///                     ["value"] = "0.25",
    ///                 },
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["type"] = "MEMORY",
    ///                     ["value"] = "512",
    ///                 },
    ///             },
    ///             ["volumes"] = new[]
    ///             {
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["host"] = new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["sourcePath"] = "/tmp",
    ///                     },
    ///                     ["name"] = "tmp",
    ///                 },
    ///             },
    ///             ["environment"] = new[]
    ///             {
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["name"] = "VARNAME",
    ///                     ["value"] = "VARVAL",
    ///                 },
    ///             },
    ///             ["mountPoints"] = new[]
    ///             {
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["sourceVolume"] = "tmp",
    ///                     ["containerPath"] = "/tmp",
    ///                     ["readOnly"] = false,
    ///                 },
    ///             },
    ///             ["ulimits"] = new[]
    ///             {
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["hardLimit"] = 1024,
    ///                     ["name"] = "nofile",
    ///                     ["softLimit"] = 1024,
    ///                 },
    ///             },
    ///         }),
    ///     });
    /// 
    /// });
    /// ```
    /// ### Fargate Platform Capability
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var assumeRolePolicy = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Actions = new[]
    ///                 {
    ///                     "sts:AssumeRole",
    ///                 },
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "Service",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "ecs-tasks.amazonaws.com",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var ecsTaskExecutionRole = new Aws.Iam.Role("ecsTaskExecutionRole", new()
    ///     {
    ///         AssumeRolePolicy = assumeRolePolicy.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var ecsTaskExecutionRolePolicy = new Aws.Iam.RolePolicyAttachment("ecsTaskExecutionRolePolicy", new()
    ///     {
    ///         Role = ecsTaskExecutionRole.Name,
    ///         PolicyArn = "arn:aws:iam::aws:policy/service-role/AmazonECSTaskExecutionRolePolicy",
    ///     });
    /// 
    ///     var test = new Aws.Batch.JobDefinition("test", new()
    ///     {
    ///         Type = "container",
    ///         PlatformCapabilities = new[]
    ///         {
    ///             "FARGATE",
    ///         },
    ///         ContainerProperties = ecsTaskExecutionRole.Arn.Apply(arn =&gt; JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["command"] = new[]
    ///             {
    ///                 "echo",
    ///                 "test",
    ///             },
    ///             ["image"] = "busybox",
    ///             ["jobRoleArn"] = "arn:aws:iam::123456789012:role/AWSBatchS3ReadOnly",
    ///             ["fargatePlatformConfiguration"] = new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["platformVersion"] = "LATEST",
    ///             },
    ///             ["resourceRequirements"] = new[]
    ///             {
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["type"] = "VCPU",
    ///                     ["value"] = "0.25",
    ///                 },
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["type"] = "MEMORY",
    ///                     ["value"] = "512",
    ///                 },
    ///             },
    ///             ["executionRoleArn"] = arn,
    ///         })),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Batch Job Definition using the `arn`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:batch/jobDefinition:JobDefinition test arn:aws:batch:us-east-1:123456789012:job-definition/sample
    /// ```
    /// </summary>
    [AwsResourceType("aws:batch/jobDefinition:JobDefinition")]
    public partial class JobDefinition : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name of the job definition.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
        /// provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
        /// </summary>
        [Output("containerProperties")]
        public Output<string?> ContainerProperties { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the job definition.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the parameter substitution placeholders to set in the job definition.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableDictionary<string, string>?> Parameters { get; private set; } = null!;

        /// <summary>
        /// The platform capabilities required by the job definition. If no value is specified, it defaults to `EC2`. To run the job on Fargate resources, specify `FARGATE`.
        /// </summary>
        [Output("platformCapabilities")]
        public Output<ImmutableArray<string>> PlatformCapabilities { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to propagate the tags from the job definition to the corresponding Amazon ECS task. Default is `false`.
        /// </summary>
        [Output("propagateTags")]
        public Output<bool?> PropagateTags { get; private set; } = null!;

        /// <summary>
        /// Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
        /// Maximum number of `retry_strategy` is `1`.  Defined below.
        /// </summary>
        [Output("retryStrategy")]
        public Output<Outputs.JobDefinitionRetryStrategy?> RetryStrategy { get; private set; } = null!;

        /// <summary>
        /// The revision of the job definition.
        /// </summary>
        [Output("revision")]
        public Output<int> Revision { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
        /// </summary>
        [Output("timeout")]
        public Output<Outputs.JobDefinitionTimeout?> Timeout { get; private set; } = null!;

        /// <summary>
        /// The type of job definition. Must be `container`.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a JobDefinition resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public JobDefinition(string name, JobDefinitionArgs args, CustomResourceOptions? options = null)
            : base("aws:batch/jobDefinition:JobDefinition", name, args ?? new JobDefinitionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private JobDefinition(string name, Input<string> id, JobDefinitionState? state = null, CustomResourceOptions? options = null)
            : base("aws:batch/jobDefinition:JobDefinition", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing JobDefinition resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static JobDefinition Get(string name, Input<string> id, JobDefinitionState? state = null, CustomResourceOptions? options = null)
        {
            return new JobDefinition(name, id, state, options);
        }
    }

    public sealed class JobDefinitionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
        /// provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
        /// </summary>
        [Input("containerProperties")]
        public Input<string>? ContainerProperties { get; set; }

        /// <summary>
        /// Specifies the name of the job definition.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// Specifies the parameter substitution placeholders to set in the job definition.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        [Input("platformCapabilities")]
        private InputList<string>? _platformCapabilities;

        /// <summary>
        /// The platform capabilities required by the job definition. If no value is specified, it defaults to `EC2`. To run the job on Fargate resources, specify `FARGATE`.
        /// </summary>
        public InputList<string> PlatformCapabilities
        {
            get => _platformCapabilities ?? (_platformCapabilities = new InputList<string>());
            set => _platformCapabilities = value;
        }

        /// <summary>
        /// Specifies whether to propagate the tags from the job definition to the corresponding Amazon ECS task. Default is `false`.
        /// </summary>
        [Input("propagateTags")]
        public Input<bool>? PropagateTags { get; set; }

        /// <summary>
        /// Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
        /// Maximum number of `retry_strategy` is `1`.  Defined below.
        /// </summary>
        [Input("retryStrategy")]
        public Input<Inputs.JobDefinitionRetryStrategyArgs>? RetryStrategy { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
        /// </summary>
        [Input("timeout")]
        public Input<Inputs.JobDefinitionTimeoutArgs>? Timeout { get; set; }

        /// <summary>
        /// The type of job definition. Must be `container`.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public JobDefinitionArgs()
        {
        }
        public static new JobDefinitionArgs Empty => new JobDefinitionArgs();
    }

    public sealed class JobDefinitionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name of the job definition.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
        /// provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
        /// </summary>
        [Input("containerProperties")]
        public Input<string>? ContainerProperties { get; set; }

        /// <summary>
        /// Specifies the name of the job definition.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// Specifies the parameter substitution placeholders to set in the job definition.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        [Input("platformCapabilities")]
        private InputList<string>? _platformCapabilities;

        /// <summary>
        /// The platform capabilities required by the job definition. If no value is specified, it defaults to `EC2`. To run the job on Fargate resources, specify `FARGATE`.
        /// </summary>
        public InputList<string> PlatformCapabilities
        {
            get => _platformCapabilities ?? (_platformCapabilities = new InputList<string>());
            set => _platformCapabilities = value;
        }

        /// <summary>
        /// Specifies whether to propagate the tags from the job definition to the corresponding Amazon ECS task. Default is `false`.
        /// </summary>
        [Input("propagateTags")]
        public Input<bool>? PropagateTags { get; set; }

        /// <summary>
        /// Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
        /// Maximum number of `retry_strategy` is `1`.  Defined below.
        /// </summary>
        [Input("retryStrategy")]
        public Input<Inputs.JobDefinitionRetryStrategyGetArgs>? RetryStrategy { get; set; }

        /// <summary>
        /// The revision of the job definition.
        /// </summary>
        [Input("revision")]
        public Input<int>? Revision { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        /// <summary>
        /// Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
        /// </summary>
        [Input("timeout")]
        public Input<Inputs.JobDefinitionTimeoutGetArgs>? Timeout { get; set; }

        /// <summary>
        /// The type of job definition. Must be `container`.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public JobDefinitionState()
        {
        }
        public static new JobDefinitionState Empty => new JobDefinitionState();
    }
}
