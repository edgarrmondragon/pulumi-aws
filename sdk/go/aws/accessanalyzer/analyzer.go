// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package accessanalyzer

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Manages an Access Analyzer Analyzer. More information can be found in the [Access Analyzer User Guide](https://docs.aws.amazon.com/IAM/latest/UserGuide/what-is-access-analyzer.html).
//
// ## Example Usage
// ### Account Analyzer
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/accessanalyzer"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := accessanalyzer.NewAnalyzer(ctx, "example", &accessanalyzer.AnalyzerArgs{
//				AnalyzerName: pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Organization Analyzer
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/accessanalyzer"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleOrganization, err := organizations.NewOrganization(ctx, "exampleOrganization", &organizations.OrganizationArgs{
//				AwsServiceAccessPrincipals: pulumi.StringArray{
//					pulumi.String("access-analyzer.amazonaws.com"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = accessanalyzer.NewAnalyzer(ctx, "exampleAnalyzer", &accessanalyzer.AnalyzerArgs{
//				AnalyzerName: pulumi.String("example"),
//				Type:         pulumi.String("ORGANIZATION"),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				exampleOrganization,
//			}))
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
// Using `pulumi import`, import Access Analyzer Analyzers using the `analyzer_name`. For example:
//
// ```sh
//
//	$ pulumi import aws:accessanalyzer/analyzer:Analyzer example example
//
// ```
type Analyzer struct {
	pulumi.CustomResourceState

	// Name of the Analyzer.
	//
	// The following arguments are optional:
	AnalyzerName pulumi.StringOutput `pulumi:"analyzerName"`
	// ARN of the Analyzer.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Type of Analyzer. Valid values are `ACCOUNT` or `ORGANIZATION`. Defaults to `ACCOUNT`.
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewAnalyzer registers a new resource with the given unique name, arguments, and options.
func NewAnalyzer(ctx *pulumi.Context,
	name string, args *AnalyzerArgs, opts ...pulumi.ResourceOption) (*Analyzer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AnalyzerName == nil {
		return nil, errors.New("invalid value for required argument 'AnalyzerName'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"tagsAll",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Analyzer
	err := ctx.RegisterResource("aws:accessanalyzer/analyzer:Analyzer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAnalyzer gets an existing Analyzer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAnalyzer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AnalyzerState, opts ...pulumi.ResourceOption) (*Analyzer, error) {
	var resource Analyzer
	err := ctx.ReadResource("aws:accessanalyzer/analyzer:Analyzer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Analyzer resources.
type analyzerState struct {
	// Name of the Analyzer.
	//
	// The following arguments are optional:
	AnalyzerName *string `pulumi:"analyzerName"`
	// ARN of the Analyzer.
	Arn *string `pulumi:"arn"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Type of Analyzer. Valid values are `ACCOUNT` or `ORGANIZATION`. Defaults to `ACCOUNT`.
	Type *string `pulumi:"type"`
}

type AnalyzerState struct {
	// Name of the Analyzer.
	//
	// The following arguments are optional:
	AnalyzerName pulumi.StringPtrInput
	// ARN of the Analyzer.
	Arn pulumi.StringPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// Type of Analyzer. Valid values are `ACCOUNT` or `ORGANIZATION`. Defaults to `ACCOUNT`.
	Type pulumi.StringPtrInput
}

func (AnalyzerState) ElementType() reflect.Type {
	return reflect.TypeOf((*analyzerState)(nil)).Elem()
}

type analyzerArgs struct {
	// Name of the Analyzer.
	//
	// The following arguments are optional:
	AnalyzerName string `pulumi:"analyzerName"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Type of Analyzer. Valid values are `ACCOUNT` or `ORGANIZATION`. Defaults to `ACCOUNT`.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a Analyzer resource.
type AnalyzerArgs struct {
	// Name of the Analyzer.
	//
	// The following arguments are optional:
	AnalyzerName pulumi.StringInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Type of Analyzer. Valid values are `ACCOUNT` or `ORGANIZATION`. Defaults to `ACCOUNT`.
	Type pulumi.StringPtrInput
}

func (AnalyzerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*analyzerArgs)(nil)).Elem()
}

type AnalyzerInput interface {
	pulumi.Input

	ToAnalyzerOutput() AnalyzerOutput
	ToAnalyzerOutputWithContext(ctx context.Context) AnalyzerOutput
}

func (*Analyzer) ElementType() reflect.Type {
	return reflect.TypeOf((**Analyzer)(nil)).Elem()
}

func (i *Analyzer) ToAnalyzerOutput() AnalyzerOutput {
	return i.ToAnalyzerOutputWithContext(context.Background())
}

func (i *Analyzer) ToAnalyzerOutputWithContext(ctx context.Context) AnalyzerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AnalyzerOutput)
}

func (i *Analyzer) ToOutput(ctx context.Context) pulumix.Output[*Analyzer] {
	return pulumix.Output[*Analyzer]{
		OutputState: i.ToAnalyzerOutputWithContext(ctx).OutputState,
	}
}

// AnalyzerArrayInput is an input type that accepts AnalyzerArray and AnalyzerArrayOutput values.
// You can construct a concrete instance of `AnalyzerArrayInput` via:
//
//	AnalyzerArray{ AnalyzerArgs{...} }
type AnalyzerArrayInput interface {
	pulumi.Input

	ToAnalyzerArrayOutput() AnalyzerArrayOutput
	ToAnalyzerArrayOutputWithContext(context.Context) AnalyzerArrayOutput
}

type AnalyzerArray []AnalyzerInput

func (AnalyzerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Analyzer)(nil)).Elem()
}

func (i AnalyzerArray) ToAnalyzerArrayOutput() AnalyzerArrayOutput {
	return i.ToAnalyzerArrayOutputWithContext(context.Background())
}

func (i AnalyzerArray) ToAnalyzerArrayOutputWithContext(ctx context.Context) AnalyzerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AnalyzerArrayOutput)
}

func (i AnalyzerArray) ToOutput(ctx context.Context) pulumix.Output[[]*Analyzer] {
	return pulumix.Output[[]*Analyzer]{
		OutputState: i.ToAnalyzerArrayOutputWithContext(ctx).OutputState,
	}
}

// AnalyzerMapInput is an input type that accepts AnalyzerMap and AnalyzerMapOutput values.
// You can construct a concrete instance of `AnalyzerMapInput` via:
//
//	AnalyzerMap{ "key": AnalyzerArgs{...} }
type AnalyzerMapInput interface {
	pulumi.Input

	ToAnalyzerMapOutput() AnalyzerMapOutput
	ToAnalyzerMapOutputWithContext(context.Context) AnalyzerMapOutput
}

type AnalyzerMap map[string]AnalyzerInput

func (AnalyzerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Analyzer)(nil)).Elem()
}

func (i AnalyzerMap) ToAnalyzerMapOutput() AnalyzerMapOutput {
	return i.ToAnalyzerMapOutputWithContext(context.Background())
}

func (i AnalyzerMap) ToAnalyzerMapOutputWithContext(ctx context.Context) AnalyzerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AnalyzerMapOutput)
}

func (i AnalyzerMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Analyzer] {
	return pulumix.Output[map[string]*Analyzer]{
		OutputState: i.ToAnalyzerMapOutputWithContext(ctx).OutputState,
	}
}

type AnalyzerOutput struct{ *pulumi.OutputState }

func (AnalyzerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Analyzer)(nil)).Elem()
}

func (o AnalyzerOutput) ToAnalyzerOutput() AnalyzerOutput {
	return o
}

func (o AnalyzerOutput) ToAnalyzerOutputWithContext(ctx context.Context) AnalyzerOutput {
	return o
}

func (o AnalyzerOutput) ToOutput(ctx context.Context) pulumix.Output[*Analyzer] {
	return pulumix.Output[*Analyzer]{
		OutputState: o.OutputState,
	}
}

// Name of the Analyzer.
//
// The following arguments are optional:
func (o AnalyzerOutput) AnalyzerName() pulumi.StringOutput {
	return o.ApplyT(func(v *Analyzer) pulumi.StringOutput { return v.AnalyzerName }).(pulumi.StringOutput)
}

// ARN of the Analyzer.
func (o AnalyzerOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Analyzer) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o AnalyzerOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Analyzer) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o AnalyzerOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Analyzer) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Type of Analyzer. Valid values are `ACCOUNT` or `ORGANIZATION`. Defaults to `ACCOUNT`.
func (o AnalyzerOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Analyzer) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

type AnalyzerArrayOutput struct{ *pulumi.OutputState }

func (AnalyzerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Analyzer)(nil)).Elem()
}

func (o AnalyzerArrayOutput) ToAnalyzerArrayOutput() AnalyzerArrayOutput {
	return o
}

func (o AnalyzerArrayOutput) ToAnalyzerArrayOutputWithContext(ctx context.Context) AnalyzerArrayOutput {
	return o
}

func (o AnalyzerArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Analyzer] {
	return pulumix.Output[[]*Analyzer]{
		OutputState: o.OutputState,
	}
}

func (o AnalyzerArrayOutput) Index(i pulumi.IntInput) AnalyzerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Analyzer {
		return vs[0].([]*Analyzer)[vs[1].(int)]
	}).(AnalyzerOutput)
}

type AnalyzerMapOutput struct{ *pulumi.OutputState }

func (AnalyzerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Analyzer)(nil)).Elem()
}

func (o AnalyzerMapOutput) ToAnalyzerMapOutput() AnalyzerMapOutput {
	return o
}

func (o AnalyzerMapOutput) ToAnalyzerMapOutputWithContext(ctx context.Context) AnalyzerMapOutput {
	return o
}

func (o AnalyzerMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Analyzer] {
	return pulumix.Output[map[string]*Analyzer]{
		OutputState: o.OutputState,
	}
}

func (o AnalyzerMapOutput) MapIndex(k pulumi.StringInput) AnalyzerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Analyzer {
		return vs[0].(map[string]*Analyzer)[vs[1].(string)]
	}).(AnalyzerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AnalyzerInput)(nil)).Elem(), &Analyzer{})
	pulumi.RegisterInputType(reflect.TypeOf((*AnalyzerArrayInput)(nil)).Elem(), AnalyzerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AnalyzerMapInput)(nil)).Elem(), AnalyzerMap{})
	pulumi.RegisterOutputType(AnalyzerOutput{})
	pulumi.RegisterOutputType(AnalyzerArrayOutput{})
	pulumi.RegisterOutputType(AnalyzerMapOutput{})
}
