// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package transfer

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a AWS Transfer AS2 Connector resource.
//
// ## Example Usage
// ### Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/transfer"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := transfer.NewConnector(ctx, "example", &transfer.ConnectorArgs{
//				AccessRole: pulumi.Any(aws_iam_role.Test.Arn),
//				As2Config: &transfer.ConnectorAs2ConfigArgs{
//					Compression:         pulumi.String("DISABLED"),
//					EncryptionAlgorithm: pulumi.String("AWS128_CBC"),
//					MessageSubject:      pulumi.String("For Connector"),
//					LocalProfileId:      pulumi.Any(aws_transfer_profile.Local.Profile_id),
//					MdnResponse:         pulumi.String("NONE"),
//					MdnSigningAlgorithm: pulumi.String("NONE"),
//					PartnerProfileId:    pulumi.Any(aws_transfer_profile.Partner.Profile_id),
//					SigningAlgorithm:    pulumi.String("NONE"),
//				},
//				Url: pulumi.String("http://www.test.com"),
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
// Using `pulumi import`, import Transfer AS2 Connector using the `connector_id`. For example:
//
// ```sh
//
//	$ pulumi import aws:transfer/connector:Connector example c-4221a88afd5f4362a
//
// ```
type Connector struct {
	pulumi.CustomResourceState

	// The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
	AccessRole pulumi.StringOutput `pulumi:"accessRole"`
	// The ARN of the connector.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The parameters to configure for the connector object. Fields documented below.
	As2Config ConnectorAs2ConfigOutput `pulumi:"as2Config"`
	// The unique identifier for the AS2 profile.
	ConnectorId pulumi.StringOutput `pulumi:"connectorId"`
	// The IAM Role which is required for allowing the connector to turn on CloudWatch logging for Amazon S3 events.
	LoggingRole pulumi.StringPtrOutput `pulumi:"loggingRole"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The URL of the partners AS2 endpoint.
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewConnector registers a new resource with the given unique name, arguments, and options.
func NewConnector(ctx *pulumi.Context,
	name string, args *ConnectorArgs, opts ...pulumi.ResourceOption) (*Connector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccessRole == nil {
		return nil, errors.New("invalid value for required argument 'AccessRole'")
	}
	if args.As2Config == nil {
		return nil, errors.New("invalid value for required argument 'As2Config'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"tagsAll",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Connector
	err := ctx.RegisterResource("aws:transfer/connector:Connector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnector gets an existing Connector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectorState, opts ...pulumi.ResourceOption) (*Connector, error) {
	var resource Connector
	err := ctx.ReadResource("aws:transfer/connector:Connector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Connector resources.
type connectorState struct {
	// The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
	AccessRole *string `pulumi:"accessRole"`
	// The ARN of the connector.
	Arn *string `pulumi:"arn"`
	// The parameters to configure for the connector object. Fields documented below.
	As2Config *ConnectorAs2Config `pulumi:"as2Config"`
	// The unique identifier for the AS2 profile.
	ConnectorId *string `pulumi:"connectorId"`
	// The IAM Role which is required for allowing the connector to turn on CloudWatch logging for Amazon S3 events.
	LoggingRole *string `pulumi:"loggingRole"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The URL of the partners AS2 endpoint.
	Url *string `pulumi:"url"`
}

type ConnectorState struct {
	// The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
	AccessRole pulumi.StringPtrInput
	// The ARN of the connector.
	Arn pulumi.StringPtrInput
	// The parameters to configure for the connector object. Fields documented below.
	As2Config ConnectorAs2ConfigPtrInput
	// The unique identifier for the AS2 profile.
	ConnectorId pulumi.StringPtrInput
	// The IAM Role which is required for allowing the connector to turn on CloudWatch logging for Amazon S3 events.
	LoggingRole pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The URL of the partners AS2 endpoint.
	Url pulumi.StringPtrInput
}

func (ConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorState)(nil)).Elem()
}

type connectorArgs struct {
	// The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
	AccessRole string `pulumi:"accessRole"`
	// The parameters to configure for the connector object. Fields documented below.
	As2Config ConnectorAs2Config `pulumi:"as2Config"`
	// The IAM Role which is required for allowing the connector to turn on CloudWatch logging for Amazon S3 events.
	LoggingRole *string `pulumi:"loggingRole"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The URL of the partners AS2 endpoint.
	Url string `pulumi:"url"`
}

// The set of arguments for constructing a Connector resource.
type ConnectorArgs struct {
	// The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
	AccessRole pulumi.StringInput
	// The parameters to configure for the connector object. Fields documented below.
	As2Config ConnectorAs2ConfigInput
	// The IAM Role which is required for allowing the connector to turn on CloudWatch logging for Amazon S3 events.
	LoggingRole pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The URL of the partners AS2 endpoint.
	Url pulumi.StringInput
}

func (ConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorArgs)(nil)).Elem()
}

type ConnectorInput interface {
	pulumi.Input

	ToConnectorOutput() ConnectorOutput
	ToConnectorOutputWithContext(ctx context.Context) ConnectorOutput
}

func (*Connector) ElementType() reflect.Type {
	return reflect.TypeOf((**Connector)(nil)).Elem()
}

func (i *Connector) ToConnectorOutput() ConnectorOutput {
	return i.ToConnectorOutputWithContext(context.Background())
}

func (i *Connector) ToConnectorOutputWithContext(ctx context.Context) ConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorOutput)
}

func (i *Connector) ToOutput(ctx context.Context) pulumix.Output[*Connector] {
	return pulumix.Output[*Connector]{
		OutputState: i.ToConnectorOutputWithContext(ctx).OutputState,
	}
}

// ConnectorArrayInput is an input type that accepts ConnectorArray and ConnectorArrayOutput values.
// You can construct a concrete instance of `ConnectorArrayInput` via:
//
//	ConnectorArray{ ConnectorArgs{...} }
type ConnectorArrayInput interface {
	pulumi.Input

	ToConnectorArrayOutput() ConnectorArrayOutput
	ToConnectorArrayOutputWithContext(context.Context) ConnectorArrayOutput
}

type ConnectorArray []ConnectorInput

func (ConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connector)(nil)).Elem()
}

func (i ConnectorArray) ToConnectorArrayOutput() ConnectorArrayOutput {
	return i.ToConnectorArrayOutputWithContext(context.Background())
}

func (i ConnectorArray) ToConnectorArrayOutputWithContext(ctx context.Context) ConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorArrayOutput)
}

func (i ConnectorArray) ToOutput(ctx context.Context) pulumix.Output[[]*Connector] {
	return pulumix.Output[[]*Connector]{
		OutputState: i.ToConnectorArrayOutputWithContext(ctx).OutputState,
	}
}

// ConnectorMapInput is an input type that accepts ConnectorMap and ConnectorMapOutput values.
// You can construct a concrete instance of `ConnectorMapInput` via:
//
//	ConnectorMap{ "key": ConnectorArgs{...} }
type ConnectorMapInput interface {
	pulumi.Input

	ToConnectorMapOutput() ConnectorMapOutput
	ToConnectorMapOutputWithContext(context.Context) ConnectorMapOutput
}

type ConnectorMap map[string]ConnectorInput

func (ConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connector)(nil)).Elem()
}

func (i ConnectorMap) ToConnectorMapOutput() ConnectorMapOutput {
	return i.ToConnectorMapOutputWithContext(context.Background())
}

func (i ConnectorMap) ToConnectorMapOutputWithContext(ctx context.Context) ConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorMapOutput)
}

func (i ConnectorMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Connector] {
	return pulumix.Output[map[string]*Connector]{
		OutputState: i.ToConnectorMapOutputWithContext(ctx).OutputState,
	}
}

type ConnectorOutput struct{ *pulumi.OutputState }

func (ConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Connector)(nil)).Elem()
}

func (o ConnectorOutput) ToConnectorOutput() ConnectorOutput {
	return o
}

func (o ConnectorOutput) ToConnectorOutputWithContext(ctx context.Context) ConnectorOutput {
	return o
}

func (o ConnectorOutput) ToOutput(ctx context.Context) pulumix.Output[*Connector] {
	return pulumix.Output[*Connector]{
		OutputState: o.OutputState,
	}
}

// The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
func (o ConnectorOutput) AccessRole() pulumi.StringOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringOutput { return v.AccessRole }).(pulumi.StringOutput)
}

// The ARN of the connector.
func (o ConnectorOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The parameters to configure for the connector object. Fields documented below.
func (o ConnectorOutput) As2Config() ConnectorAs2ConfigOutput {
	return o.ApplyT(func(v *Connector) ConnectorAs2ConfigOutput { return v.As2Config }).(ConnectorAs2ConfigOutput)
}

// The unique identifier for the AS2 profile.
func (o ConnectorOutput) ConnectorId() pulumi.StringOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringOutput { return v.ConnectorId }).(pulumi.StringOutput)
}

// The IAM Role which is required for allowing the connector to turn on CloudWatch logging for Amazon S3 events.
func (o ConnectorOutput) LoggingRole() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringPtrOutput { return v.LoggingRole }).(pulumi.StringPtrOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ConnectorOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Deprecated: Please use `tags` instead.
func (o ConnectorOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The URL of the partners AS2 endpoint.
func (o ConnectorOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type ConnectorArrayOutput struct{ *pulumi.OutputState }

func (ConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connector)(nil)).Elem()
}

func (o ConnectorArrayOutput) ToConnectorArrayOutput() ConnectorArrayOutput {
	return o
}

func (o ConnectorArrayOutput) ToConnectorArrayOutputWithContext(ctx context.Context) ConnectorArrayOutput {
	return o
}

func (o ConnectorArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Connector] {
	return pulumix.Output[[]*Connector]{
		OutputState: o.OutputState,
	}
}

func (o ConnectorArrayOutput) Index(i pulumi.IntInput) ConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Connector {
		return vs[0].([]*Connector)[vs[1].(int)]
	}).(ConnectorOutput)
}

type ConnectorMapOutput struct{ *pulumi.OutputState }

func (ConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connector)(nil)).Elem()
}

func (o ConnectorMapOutput) ToConnectorMapOutput() ConnectorMapOutput {
	return o
}

func (o ConnectorMapOutput) ToConnectorMapOutputWithContext(ctx context.Context) ConnectorMapOutput {
	return o
}

func (o ConnectorMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Connector] {
	return pulumix.Output[map[string]*Connector]{
		OutputState: o.OutputState,
	}
}

func (o ConnectorMapOutput) MapIndex(k pulumi.StringInput) ConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Connector {
		return vs[0].(map[string]*Connector)[vs[1].(string)]
	}).(ConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorInput)(nil)).Elem(), &Connector{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorArrayInput)(nil)).Elem(), ConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorMapInput)(nil)).Elem(), ConnectorMap{})
	pulumi.RegisterOutputType(ConnectorOutput{})
	pulumi.RegisterOutputType(ConnectorArrayOutput{})
	pulumi.RegisterOutputType(ConnectorMapOutput{})
}
