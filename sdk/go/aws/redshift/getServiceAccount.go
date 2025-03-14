// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package redshift

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Use this data source to get the Account ID of the [AWS Redshift Service Account](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
// in a given region for the purpose of allowing Redshift to store audit data in S3.
//
// > **Note:** AWS documentation [states that](https://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-bucket-permissions) a [service principal name](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#principal-services) should be used instead of an AWS account ID in any relevant IAM policy.
// The `redshift.getServiceAccount` data source has been deprecated and will be removed in a future version.
func GetServiceAccount(ctx *pulumi.Context, args *GetServiceAccountArgs, opts ...pulumi.InvokeOption) (*GetServiceAccountResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServiceAccountResult
	err := ctx.Invoke("aws:redshift/getServiceAccount:getServiceAccount", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceAccount.
type GetServiceAccountArgs struct {
	// Name of the region whose AWS Redshift account ID is desired.
	// Defaults to the region from the AWS provider configuration.
	Region *string `pulumi:"region"`
}

// A collection of values returned by getServiceAccount.
type GetServiceAccountResult struct {
	// ARN of the AWS Redshift service account in the selected region.
	Arn string `pulumi:"arn"`
	// The provider-assigned unique ID for this managed resource.
	Id     string  `pulumi:"id"`
	Region *string `pulumi:"region"`
}

func GetServiceAccountOutput(ctx *pulumi.Context, args GetServiceAccountOutputArgs, opts ...pulumi.InvokeOption) GetServiceAccountResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServiceAccountResult, error) {
			args := v.(GetServiceAccountArgs)
			r, err := GetServiceAccount(ctx, &args, opts...)
			var s GetServiceAccountResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetServiceAccountResultOutput)
}

// A collection of arguments for invoking getServiceAccount.
type GetServiceAccountOutputArgs struct {
	// Name of the region whose AWS Redshift account ID is desired.
	// Defaults to the region from the AWS provider configuration.
	Region pulumi.StringPtrInput `pulumi:"region"`
}

func (GetServiceAccountOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceAccountArgs)(nil)).Elem()
}

// A collection of values returned by getServiceAccount.
type GetServiceAccountResultOutput struct{ *pulumi.OutputState }

func (GetServiceAccountResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceAccountResult)(nil)).Elem()
}

func (o GetServiceAccountResultOutput) ToGetServiceAccountResultOutput() GetServiceAccountResultOutput {
	return o
}

func (o GetServiceAccountResultOutput) ToGetServiceAccountResultOutputWithContext(ctx context.Context) GetServiceAccountResultOutput {
	return o
}

func (o GetServiceAccountResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetServiceAccountResult] {
	return pulumix.Output[GetServiceAccountResult]{
		OutputState: o.OutputState,
	}
}

// ARN of the AWS Redshift service account in the selected region.
func (o GetServiceAccountResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceAccountResult) string { return v.Arn }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetServiceAccountResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceAccountResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetServiceAccountResultOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServiceAccountResult) *string { return v.Region }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServiceAccountResultOutput{})
}
