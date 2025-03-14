// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package batch

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Batch Job Queue resource.
//
// ## Example Usage
// ### Basic Job Queue
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/batch"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := batch.NewJobQueue(ctx, "testQueue", &batch.JobQueueArgs{
//				State:    pulumi.String("ENABLED"),
//				Priority: pulumi.Int(1),
//				ComputeEnvironments: pulumi.StringArray{
//					aws_batch_compute_environment.Test_environment_1.Arn,
//					aws_batch_compute_environment.Test_environment_2.Arn,
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Job Queue with a fair share scheduling policy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/batch"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleSchedulingPolicy, err := batch.NewSchedulingPolicy(ctx, "exampleSchedulingPolicy", &batch.SchedulingPolicyArgs{
//				FairSharePolicy: &batch.SchedulingPolicyFairSharePolicyArgs{
//					ComputeReservation: pulumi.Int(1),
//					ShareDecaySeconds:  pulumi.Int(3600),
//					ShareDistributions: batch.SchedulingPolicyFairSharePolicyShareDistributionArray{
//						&batch.SchedulingPolicyFairSharePolicyShareDistributionArgs{
//							ShareIdentifier: pulumi.String("A1*"),
//							WeightFactor:    pulumi.Float64(0.1),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = batch.NewJobQueue(ctx, "exampleJobQueue", &batch.JobQueueArgs{
//				SchedulingPolicyArn: exampleSchedulingPolicy.Arn,
//				State:               pulumi.String("ENABLED"),
//				Priority:            pulumi.Int(1),
//				ComputeEnvironments: pulumi.StringArray{
//					aws_batch_compute_environment.Test_environment_1.Arn,
//					aws_batch_compute_environment.Test_environment_2.Arn,
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Using `pulumi import`, import Batch Job Queue using the `arn`. For example:
//
// ```sh
//
//	$ pulumi import aws:batch/jobQueue:JobQueue test_queue arn:aws:batch:us-east-1:123456789012:job-queue/sample
//
// ```
type JobQueue struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name of the job queue.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Specifies the set of compute environments
	// mapped to a job queue and their order.  The position of the compute environments
	// in the list will dictate the order.
	ComputeEnvironments pulumi.StringArrayOutput `pulumi:"computeEnvironments"`
	// Specifies the name of the job queue.
	Name pulumi.StringOutput `pulumi:"name"`
	// The priority of the job queue. Job queues with a higher priority
	// are evaluated first when associated with the same compute environment.
	Priority pulumi.IntOutput `pulumi:"priority"`
	// The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn't specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can't remove the fair share scheduling policy.
	SchedulingPolicyArn pulumi.StringPtrOutput `pulumi:"schedulingPolicyArn"`
	// The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
	State pulumi.StringOutput `pulumi:"state"`
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll  pulumi.StringMapOutput    `pulumi:"tagsAll"`
	Timeouts JobQueueTimeoutsPtrOutput `pulumi:"timeouts"`
}

// NewJobQueue registers a new resource with the given unique name, arguments, and options.
func NewJobQueue(ctx *pulumi.Context,
	name string, args *JobQueueArgs, opts ...pulumi.ResourceOption) (*JobQueue, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ComputeEnvironments == nil {
		return nil, errors.New("invalid value for required argument 'ComputeEnvironments'")
	}
	if args.Priority == nil {
		return nil, errors.New("invalid value for required argument 'Priority'")
	}
	if args.State == nil {
		return nil, errors.New("invalid value for required argument 'State'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"tagsAll",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource JobQueue
	err := ctx.RegisterResource("aws:batch/jobQueue:JobQueue", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetJobQueue gets an existing JobQueue resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetJobQueue(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *JobQueueState, opts ...pulumi.ResourceOption) (*JobQueue, error) {
	var resource JobQueue
	err := ctx.ReadResource("aws:batch/jobQueue:JobQueue", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering JobQueue resources.
type jobQueueState struct {
	// The Amazon Resource Name of the job queue.
	Arn *string `pulumi:"arn"`
	// Specifies the set of compute environments
	// mapped to a job queue and their order.  The position of the compute environments
	// in the list will dictate the order.
	ComputeEnvironments []string `pulumi:"computeEnvironments"`
	// Specifies the name of the job queue.
	Name *string `pulumi:"name"`
	// The priority of the job queue. Job queues with a higher priority
	// are evaluated first when associated with the same compute environment.
	Priority *int `pulumi:"priority"`
	// The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn't specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can't remove the fair share scheduling policy.
	SchedulingPolicyArn *string `pulumi:"schedulingPolicyArn"`
	// The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
	State *string `pulumi:"state"`
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll  map[string]string `pulumi:"tagsAll"`
	Timeouts *JobQueueTimeouts `pulumi:"timeouts"`
}

type JobQueueState struct {
	// The Amazon Resource Name of the job queue.
	Arn pulumi.StringPtrInput
	// Specifies the set of compute environments
	// mapped to a job queue and their order.  The position of the compute environments
	// in the list will dictate the order.
	ComputeEnvironments pulumi.StringArrayInput
	// Specifies the name of the job queue.
	Name pulumi.StringPtrInput
	// The priority of the job queue. Job queues with a higher priority
	// are evaluated first when associated with the same compute environment.
	Priority pulumi.IntPtrInput
	// The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn't specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can't remove the fair share scheduling policy.
	SchedulingPolicyArn pulumi.StringPtrInput
	// The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
	State pulumi.StringPtrInput
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll  pulumi.StringMapInput
	Timeouts JobQueueTimeoutsPtrInput
}

func (JobQueueState) ElementType() reflect.Type {
	return reflect.TypeOf((*jobQueueState)(nil)).Elem()
}

type jobQueueArgs struct {
	// Specifies the set of compute environments
	// mapped to a job queue and their order.  The position of the compute environments
	// in the list will dictate the order.
	ComputeEnvironments []string `pulumi:"computeEnvironments"`
	// Specifies the name of the job queue.
	Name *string `pulumi:"name"`
	// The priority of the job queue. Job queues with a higher priority
	// are evaluated first when associated with the same compute environment.
	Priority int `pulumi:"priority"`
	// The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn't specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can't remove the fair share scheduling policy.
	SchedulingPolicyArn *string `pulumi:"schedulingPolicyArn"`
	// The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
	State string `pulumi:"state"`
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags     map[string]string `pulumi:"tags"`
	Timeouts *JobQueueTimeouts `pulumi:"timeouts"`
}

// The set of arguments for constructing a JobQueue resource.
type JobQueueArgs struct {
	// Specifies the set of compute environments
	// mapped to a job queue and their order.  The position of the compute environments
	// in the list will dictate the order.
	ComputeEnvironments pulumi.StringArrayInput
	// Specifies the name of the job queue.
	Name pulumi.StringPtrInput
	// The priority of the job queue. Job queues with a higher priority
	// are evaluated first when associated with the same compute environment.
	Priority pulumi.IntInput
	// The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn't specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can't remove the fair share scheduling policy.
	SchedulingPolicyArn pulumi.StringPtrInput
	// The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
	State pulumi.StringInput
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags     pulumi.StringMapInput
	Timeouts JobQueueTimeoutsPtrInput
}

func (JobQueueArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*jobQueueArgs)(nil)).Elem()
}

type JobQueueInput interface {
	pulumi.Input

	ToJobQueueOutput() JobQueueOutput
	ToJobQueueOutputWithContext(ctx context.Context) JobQueueOutput
}

func (*JobQueue) ElementType() reflect.Type {
	return reflect.TypeOf((**JobQueue)(nil)).Elem()
}

func (i *JobQueue) ToJobQueueOutput() JobQueueOutput {
	return i.ToJobQueueOutputWithContext(context.Background())
}

func (i *JobQueue) ToJobQueueOutputWithContext(ctx context.Context) JobQueueOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobQueueOutput)
}

func (i *JobQueue) ToOutput(ctx context.Context) pulumix.Output[*JobQueue] {
	return pulumix.Output[*JobQueue]{
		OutputState: i.ToJobQueueOutputWithContext(ctx).OutputState,
	}
}

// JobQueueArrayInput is an input type that accepts JobQueueArray and JobQueueArrayOutput values.
// You can construct a concrete instance of `JobQueueArrayInput` via:
//
//	JobQueueArray{ JobQueueArgs{...} }
type JobQueueArrayInput interface {
	pulumi.Input

	ToJobQueueArrayOutput() JobQueueArrayOutput
	ToJobQueueArrayOutputWithContext(context.Context) JobQueueArrayOutput
}

type JobQueueArray []JobQueueInput

func (JobQueueArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*JobQueue)(nil)).Elem()
}

func (i JobQueueArray) ToJobQueueArrayOutput() JobQueueArrayOutput {
	return i.ToJobQueueArrayOutputWithContext(context.Background())
}

func (i JobQueueArray) ToJobQueueArrayOutputWithContext(ctx context.Context) JobQueueArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobQueueArrayOutput)
}

func (i JobQueueArray) ToOutput(ctx context.Context) pulumix.Output[[]*JobQueue] {
	return pulumix.Output[[]*JobQueue]{
		OutputState: i.ToJobQueueArrayOutputWithContext(ctx).OutputState,
	}
}

// JobQueueMapInput is an input type that accepts JobQueueMap and JobQueueMapOutput values.
// You can construct a concrete instance of `JobQueueMapInput` via:
//
//	JobQueueMap{ "key": JobQueueArgs{...} }
type JobQueueMapInput interface {
	pulumi.Input

	ToJobQueueMapOutput() JobQueueMapOutput
	ToJobQueueMapOutputWithContext(context.Context) JobQueueMapOutput
}

type JobQueueMap map[string]JobQueueInput

func (JobQueueMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*JobQueue)(nil)).Elem()
}

func (i JobQueueMap) ToJobQueueMapOutput() JobQueueMapOutput {
	return i.ToJobQueueMapOutputWithContext(context.Background())
}

func (i JobQueueMap) ToJobQueueMapOutputWithContext(ctx context.Context) JobQueueMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobQueueMapOutput)
}

func (i JobQueueMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*JobQueue] {
	return pulumix.Output[map[string]*JobQueue]{
		OutputState: i.ToJobQueueMapOutputWithContext(ctx).OutputState,
	}
}

type JobQueueOutput struct{ *pulumi.OutputState }

func (JobQueueOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**JobQueue)(nil)).Elem()
}

func (o JobQueueOutput) ToJobQueueOutput() JobQueueOutput {
	return o
}

func (o JobQueueOutput) ToJobQueueOutputWithContext(ctx context.Context) JobQueueOutput {
	return o
}

func (o JobQueueOutput) ToOutput(ctx context.Context) pulumix.Output[*JobQueue] {
	return pulumix.Output[*JobQueue]{
		OutputState: o.OutputState,
	}
}

// The Amazon Resource Name of the job queue.
func (o JobQueueOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *JobQueue) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Specifies the set of compute environments
// mapped to a job queue and their order.  The position of the compute environments
// in the list will dictate the order.
func (o JobQueueOutput) ComputeEnvironments() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *JobQueue) pulumi.StringArrayOutput { return v.ComputeEnvironments }).(pulumi.StringArrayOutput)
}

// Specifies the name of the job queue.
func (o JobQueueOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *JobQueue) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The priority of the job queue. Job queues with a higher priority
// are evaluated first when associated with the same compute environment.
func (o JobQueueOutput) Priority() pulumi.IntOutput {
	return o.ApplyT(func(v *JobQueue) pulumi.IntOutput { return v.Priority }).(pulumi.IntOutput)
}

// The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn't specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can't remove the fair share scheduling policy.
func (o JobQueueOutput) SchedulingPolicyArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *JobQueue) pulumi.StringPtrOutput { return v.SchedulingPolicyArn }).(pulumi.StringPtrOutput)
}

// The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
func (o JobQueueOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *JobQueue) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o JobQueueOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *JobQueue) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o JobQueueOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *JobQueue) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

func (o JobQueueOutput) Timeouts() JobQueueTimeoutsPtrOutput {
	return o.ApplyT(func(v *JobQueue) JobQueueTimeoutsPtrOutput { return v.Timeouts }).(JobQueueTimeoutsPtrOutput)
}

type JobQueueArrayOutput struct{ *pulumi.OutputState }

func (JobQueueArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*JobQueue)(nil)).Elem()
}

func (o JobQueueArrayOutput) ToJobQueueArrayOutput() JobQueueArrayOutput {
	return o
}

func (o JobQueueArrayOutput) ToJobQueueArrayOutputWithContext(ctx context.Context) JobQueueArrayOutput {
	return o
}

func (o JobQueueArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*JobQueue] {
	return pulumix.Output[[]*JobQueue]{
		OutputState: o.OutputState,
	}
}

func (o JobQueueArrayOutput) Index(i pulumi.IntInput) JobQueueOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *JobQueue {
		return vs[0].([]*JobQueue)[vs[1].(int)]
	}).(JobQueueOutput)
}

type JobQueueMapOutput struct{ *pulumi.OutputState }

func (JobQueueMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*JobQueue)(nil)).Elem()
}

func (o JobQueueMapOutput) ToJobQueueMapOutput() JobQueueMapOutput {
	return o
}

func (o JobQueueMapOutput) ToJobQueueMapOutputWithContext(ctx context.Context) JobQueueMapOutput {
	return o
}

func (o JobQueueMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*JobQueue] {
	return pulumix.Output[map[string]*JobQueue]{
		OutputState: o.OutputState,
	}
}

func (o JobQueueMapOutput) MapIndex(k pulumi.StringInput) JobQueueOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *JobQueue {
		return vs[0].(map[string]*JobQueue)[vs[1].(string)]
	}).(JobQueueOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*JobQueueInput)(nil)).Elem(), &JobQueue{})
	pulumi.RegisterInputType(reflect.TypeOf((*JobQueueArrayInput)(nil)).Elem(), JobQueueArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*JobQueueMapInput)(nil)).Elem(), JobQueueMap{})
	pulumi.RegisterOutputType(JobQueueOutput{})
	pulumi.RegisterOutputType(JobQueueArrayOutput{})
	pulumi.RegisterOutputType(JobQueueMapOutput{})
}
