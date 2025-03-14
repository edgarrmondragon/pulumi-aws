// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudwatch

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides an EventBridge event bus resource.
//
// > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cloudwatch"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudwatch.NewEventBus(ctx, "messenger", nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cloudwatch"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			examplepartnerEventSource, err := cloudwatch.GetEventSource(ctx, &cloudwatch.GetEventSourceArgs{
//				NamePrefix: pulumi.StringRef("aws.partner/examplepartner.com"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = cloudwatch.NewEventBus(ctx, "examplepartnerEventBus", &cloudwatch.EventBusArgs{
//				EventSourceName: *pulumi.String(examplepartnerEventSource.Name),
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
// Using `pulumi import`, import EventBridge event buses using the `name` (which can also be a partner event source name). For example:
//
// ```sh
//
//	$ pulumi import aws:cloudwatch/eventBus:EventBus messenger chat-messages
//
// ```
type EventBus struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the event bus.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The partner event source that the new event bus will be matched with. Must match `name`.
	EventSourceName pulumi.StringPtrOutput `pulumi:"eventSourceName"`
	// The name of the new event bus. The names of custom event buses can't contain the / character. To create a partner event bus, ensure the `name` matches the `eventSourceName`.
	Name pulumi.StringOutput `pulumi:"name"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewEventBus registers a new resource with the given unique name, arguments, and options.
func NewEventBus(ctx *pulumi.Context,
	name string, args *EventBusArgs, opts ...pulumi.ResourceOption) (*EventBus, error) {
	if args == nil {
		args = &EventBusArgs{}
	}

	secrets := pulumi.AdditionalSecretOutputs([]string{
		"tagsAll",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EventBus
	err := ctx.RegisterResource("aws:cloudwatch/eventBus:EventBus", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventBus gets an existing EventBus resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventBus(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventBusState, opts ...pulumi.ResourceOption) (*EventBus, error) {
	var resource EventBus
	err := ctx.ReadResource("aws:cloudwatch/eventBus:EventBus", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventBus resources.
type eventBusState struct {
	// The Amazon Resource Name (ARN) of the event bus.
	Arn *string `pulumi:"arn"`
	// The partner event source that the new event bus will be matched with. Must match `name`.
	EventSourceName *string `pulumi:"eventSourceName"`
	// The name of the new event bus. The names of custom event buses can't contain the / character. To create a partner event bus, ensure the `name` matches the `eventSourceName`.
	Name *string `pulumi:"name"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type EventBusState struct {
	// The Amazon Resource Name (ARN) of the event bus.
	Arn pulumi.StringPtrInput
	// The partner event source that the new event bus will be matched with. Must match `name`.
	EventSourceName pulumi.StringPtrInput
	// The name of the new event bus. The names of custom event buses can't contain the / character. To create a partner event bus, ensure the `name` matches the `eventSourceName`.
	Name pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (EventBusState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventBusState)(nil)).Elem()
}

type eventBusArgs struct {
	// The partner event source that the new event bus will be matched with. Must match `name`.
	EventSourceName *string `pulumi:"eventSourceName"`
	// The name of the new event bus. The names of custom event buses can't contain the / character. To create a partner event bus, ensure the `name` matches the `eventSourceName`.
	Name *string `pulumi:"name"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a EventBus resource.
type EventBusArgs struct {
	// The partner event source that the new event bus will be matched with. Must match `name`.
	EventSourceName pulumi.StringPtrInput
	// The name of the new event bus. The names of custom event buses can't contain the / character. To create a partner event bus, ensure the `name` matches the `eventSourceName`.
	Name pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (EventBusArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventBusArgs)(nil)).Elem()
}

type EventBusInput interface {
	pulumi.Input

	ToEventBusOutput() EventBusOutput
	ToEventBusOutputWithContext(ctx context.Context) EventBusOutput
}

func (*EventBus) ElementType() reflect.Type {
	return reflect.TypeOf((**EventBus)(nil)).Elem()
}

func (i *EventBus) ToEventBusOutput() EventBusOutput {
	return i.ToEventBusOutputWithContext(context.Background())
}

func (i *EventBus) ToEventBusOutputWithContext(ctx context.Context) EventBusOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventBusOutput)
}

func (i *EventBus) ToOutput(ctx context.Context) pulumix.Output[*EventBus] {
	return pulumix.Output[*EventBus]{
		OutputState: i.ToEventBusOutputWithContext(ctx).OutputState,
	}
}

// EventBusArrayInput is an input type that accepts EventBusArray and EventBusArrayOutput values.
// You can construct a concrete instance of `EventBusArrayInput` via:
//
//	EventBusArray{ EventBusArgs{...} }
type EventBusArrayInput interface {
	pulumi.Input

	ToEventBusArrayOutput() EventBusArrayOutput
	ToEventBusArrayOutputWithContext(context.Context) EventBusArrayOutput
}

type EventBusArray []EventBusInput

func (EventBusArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventBus)(nil)).Elem()
}

func (i EventBusArray) ToEventBusArrayOutput() EventBusArrayOutput {
	return i.ToEventBusArrayOutputWithContext(context.Background())
}

func (i EventBusArray) ToEventBusArrayOutputWithContext(ctx context.Context) EventBusArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventBusArrayOutput)
}

func (i EventBusArray) ToOutput(ctx context.Context) pulumix.Output[[]*EventBus] {
	return pulumix.Output[[]*EventBus]{
		OutputState: i.ToEventBusArrayOutputWithContext(ctx).OutputState,
	}
}

// EventBusMapInput is an input type that accepts EventBusMap and EventBusMapOutput values.
// You can construct a concrete instance of `EventBusMapInput` via:
//
//	EventBusMap{ "key": EventBusArgs{...} }
type EventBusMapInput interface {
	pulumi.Input

	ToEventBusMapOutput() EventBusMapOutput
	ToEventBusMapOutputWithContext(context.Context) EventBusMapOutput
}

type EventBusMap map[string]EventBusInput

func (EventBusMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventBus)(nil)).Elem()
}

func (i EventBusMap) ToEventBusMapOutput() EventBusMapOutput {
	return i.ToEventBusMapOutputWithContext(context.Background())
}

func (i EventBusMap) ToEventBusMapOutputWithContext(ctx context.Context) EventBusMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventBusMapOutput)
}

func (i EventBusMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*EventBus] {
	return pulumix.Output[map[string]*EventBus]{
		OutputState: i.ToEventBusMapOutputWithContext(ctx).OutputState,
	}
}

type EventBusOutput struct{ *pulumi.OutputState }

func (EventBusOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventBus)(nil)).Elem()
}

func (o EventBusOutput) ToEventBusOutput() EventBusOutput {
	return o
}

func (o EventBusOutput) ToEventBusOutputWithContext(ctx context.Context) EventBusOutput {
	return o
}

func (o EventBusOutput) ToOutput(ctx context.Context) pulumix.Output[*EventBus] {
	return pulumix.Output[*EventBus]{
		OutputState: o.OutputState,
	}
}

// The Amazon Resource Name (ARN) of the event bus.
func (o EventBusOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *EventBus) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The partner event source that the new event bus will be matched with. Must match `name`.
func (o EventBusOutput) EventSourceName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventBus) pulumi.StringPtrOutput { return v.EventSourceName }).(pulumi.StringPtrOutput)
}

// The name of the new event bus. The names of custom event buses can't contain the / character. To create a partner event bus, ensure the `name` matches the `eventSourceName`.
func (o EventBusOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EventBus) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o EventBusOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *EventBus) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o EventBusOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *EventBus) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type EventBusArrayOutput struct{ *pulumi.OutputState }

func (EventBusArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventBus)(nil)).Elem()
}

func (o EventBusArrayOutput) ToEventBusArrayOutput() EventBusArrayOutput {
	return o
}

func (o EventBusArrayOutput) ToEventBusArrayOutputWithContext(ctx context.Context) EventBusArrayOutput {
	return o
}

func (o EventBusArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*EventBus] {
	return pulumix.Output[[]*EventBus]{
		OutputState: o.OutputState,
	}
}

func (o EventBusArrayOutput) Index(i pulumi.IntInput) EventBusOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EventBus {
		return vs[0].([]*EventBus)[vs[1].(int)]
	}).(EventBusOutput)
}

type EventBusMapOutput struct{ *pulumi.OutputState }

func (EventBusMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventBus)(nil)).Elem()
}

func (o EventBusMapOutput) ToEventBusMapOutput() EventBusMapOutput {
	return o
}

func (o EventBusMapOutput) ToEventBusMapOutputWithContext(ctx context.Context) EventBusMapOutput {
	return o
}

func (o EventBusMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*EventBus] {
	return pulumix.Output[map[string]*EventBus]{
		OutputState: o.OutputState,
	}
}

func (o EventBusMapOutput) MapIndex(k pulumi.StringInput) EventBusOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EventBus {
		return vs[0].(map[string]*EventBus)[vs[1].(string)]
	}).(EventBusOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EventBusInput)(nil)).Elem(), &EventBus{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventBusArrayInput)(nil)).Elem(), EventBusArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventBusMapInput)(nil)).Elem(), EventBusMap{})
	pulumi.RegisterOutputType(EventBusOutput{})
	pulumi.RegisterOutputType(EventBusArrayOutput{})
	pulumi.RegisterOutputType(EventBusMapOutput{})
}
