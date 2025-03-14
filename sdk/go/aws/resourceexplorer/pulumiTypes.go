// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package resourceexplorer

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

var _ = internal.GetEnvOrDefault

type IndexTimeouts struct {
	Create *string `pulumi:"create"`
	Delete *string `pulumi:"delete"`
	Update *string `pulumi:"update"`
}

// IndexTimeoutsInput is an input type that accepts IndexTimeoutsArgs and IndexTimeoutsOutput values.
// You can construct a concrete instance of `IndexTimeoutsInput` via:
//
//	IndexTimeoutsArgs{...}
type IndexTimeoutsInput interface {
	pulumi.Input

	ToIndexTimeoutsOutput() IndexTimeoutsOutput
	ToIndexTimeoutsOutputWithContext(context.Context) IndexTimeoutsOutput
}

type IndexTimeoutsArgs struct {
	Create pulumi.StringPtrInput `pulumi:"create"`
	Delete pulumi.StringPtrInput `pulumi:"delete"`
	Update pulumi.StringPtrInput `pulumi:"update"`
}

func (IndexTimeoutsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*IndexTimeouts)(nil)).Elem()
}

func (i IndexTimeoutsArgs) ToIndexTimeoutsOutput() IndexTimeoutsOutput {
	return i.ToIndexTimeoutsOutputWithContext(context.Background())
}

func (i IndexTimeoutsArgs) ToIndexTimeoutsOutputWithContext(ctx context.Context) IndexTimeoutsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IndexTimeoutsOutput)
}

func (i IndexTimeoutsArgs) ToOutput(ctx context.Context) pulumix.Output[IndexTimeouts] {
	return pulumix.Output[IndexTimeouts]{
		OutputState: i.ToIndexTimeoutsOutputWithContext(ctx).OutputState,
	}
}

func (i IndexTimeoutsArgs) ToIndexTimeoutsPtrOutput() IndexTimeoutsPtrOutput {
	return i.ToIndexTimeoutsPtrOutputWithContext(context.Background())
}

func (i IndexTimeoutsArgs) ToIndexTimeoutsPtrOutputWithContext(ctx context.Context) IndexTimeoutsPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IndexTimeoutsOutput).ToIndexTimeoutsPtrOutputWithContext(ctx)
}

// IndexTimeoutsPtrInput is an input type that accepts IndexTimeoutsArgs, IndexTimeoutsPtr and IndexTimeoutsPtrOutput values.
// You can construct a concrete instance of `IndexTimeoutsPtrInput` via:
//
//	        IndexTimeoutsArgs{...}
//
//	or:
//
//	        nil
type IndexTimeoutsPtrInput interface {
	pulumi.Input

	ToIndexTimeoutsPtrOutput() IndexTimeoutsPtrOutput
	ToIndexTimeoutsPtrOutputWithContext(context.Context) IndexTimeoutsPtrOutput
}

type indexTimeoutsPtrType IndexTimeoutsArgs

func IndexTimeoutsPtr(v *IndexTimeoutsArgs) IndexTimeoutsPtrInput {
	return (*indexTimeoutsPtrType)(v)
}

func (*indexTimeoutsPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**IndexTimeouts)(nil)).Elem()
}

func (i *indexTimeoutsPtrType) ToIndexTimeoutsPtrOutput() IndexTimeoutsPtrOutput {
	return i.ToIndexTimeoutsPtrOutputWithContext(context.Background())
}

func (i *indexTimeoutsPtrType) ToIndexTimeoutsPtrOutputWithContext(ctx context.Context) IndexTimeoutsPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IndexTimeoutsPtrOutput)
}

func (i *indexTimeoutsPtrType) ToOutput(ctx context.Context) pulumix.Output[*IndexTimeouts] {
	return pulumix.Output[*IndexTimeouts]{
		OutputState: i.ToIndexTimeoutsPtrOutputWithContext(ctx).OutputState,
	}
}

type IndexTimeoutsOutput struct{ *pulumi.OutputState }

func (IndexTimeoutsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*IndexTimeouts)(nil)).Elem()
}

func (o IndexTimeoutsOutput) ToIndexTimeoutsOutput() IndexTimeoutsOutput {
	return o
}

func (o IndexTimeoutsOutput) ToIndexTimeoutsOutputWithContext(ctx context.Context) IndexTimeoutsOutput {
	return o
}

func (o IndexTimeoutsOutput) ToIndexTimeoutsPtrOutput() IndexTimeoutsPtrOutput {
	return o.ToIndexTimeoutsPtrOutputWithContext(context.Background())
}

func (o IndexTimeoutsOutput) ToIndexTimeoutsPtrOutputWithContext(ctx context.Context) IndexTimeoutsPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v IndexTimeouts) *IndexTimeouts {
		return &v
	}).(IndexTimeoutsPtrOutput)
}

func (o IndexTimeoutsOutput) ToOutput(ctx context.Context) pulumix.Output[IndexTimeouts] {
	return pulumix.Output[IndexTimeouts]{
		OutputState: o.OutputState,
	}
}

func (o IndexTimeoutsOutput) Create() pulumi.StringPtrOutput {
	return o.ApplyT(func(v IndexTimeouts) *string { return v.Create }).(pulumi.StringPtrOutput)
}

func (o IndexTimeoutsOutput) Delete() pulumi.StringPtrOutput {
	return o.ApplyT(func(v IndexTimeouts) *string { return v.Delete }).(pulumi.StringPtrOutput)
}

func (o IndexTimeoutsOutput) Update() pulumi.StringPtrOutput {
	return o.ApplyT(func(v IndexTimeouts) *string { return v.Update }).(pulumi.StringPtrOutput)
}

type IndexTimeoutsPtrOutput struct{ *pulumi.OutputState }

func (IndexTimeoutsPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IndexTimeouts)(nil)).Elem()
}

func (o IndexTimeoutsPtrOutput) ToIndexTimeoutsPtrOutput() IndexTimeoutsPtrOutput {
	return o
}

func (o IndexTimeoutsPtrOutput) ToIndexTimeoutsPtrOutputWithContext(ctx context.Context) IndexTimeoutsPtrOutput {
	return o
}

func (o IndexTimeoutsPtrOutput) ToOutput(ctx context.Context) pulumix.Output[*IndexTimeouts] {
	return pulumix.Output[*IndexTimeouts]{
		OutputState: o.OutputState,
	}
}

func (o IndexTimeoutsPtrOutput) Elem() IndexTimeoutsOutput {
	return o.ApplyT(func(v *IndexTimeouts) IndexTimeouts {
		if v != nil {
			return *v
		}
		var ret IndexTimeouts
		return ret
	}).(IndexTimeoutsOutput)
}

func (o IndexTimeoutsPtrOutput) Create() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IndexTimeouts) *string {
		if v == nil {
			return nil
		}
		return v.Create
	}).(pulumi.StringPtrOutput)
}

func (o IndexTimeoutsPtrOutput) Delete() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IndexTimeouts) *string {
		if v == nil {
			return nil
		}
		return v.Delete
	}).(pulumi.StringPtrOutput)
}

func (o IndexTimeoutsPtrOutput) Update() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IndexTimeouts) *string {
		if v == nil {
			return nil
		}
		return v.Update
	}).(pulumi.StringPtrOutput)
}

type ViewFilters struct {
	// The string that contains the search keywords, prefixes, and operators to control the results that can be returned by a search operation. For more details, see [Search query syntax](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html).
	FilterString string `pulumi:"filterString"`
}

// ViewFiltersInput is an input type that accepts ViewFiltersArgs and ViewFiltersOutput values.
// You can construct a concrete instance of `ViewFiltersInput` via:
//
//	ViewFiltersArgs{...}
type ViewFiltersInput interface {
	pulumi.Input

	ToViewFiltersOutput() ViewFiltersOutput
	ToViewFiltersOutputWithContext(context.Context) ViewFiltersOutput
}

type ViewFiltersArgs struct {
	// The string that contains the search keywords, prefixes, and operators to control the results that can be returned by a search operation. For more details, see [Search query syntax](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html).
	FilterString pulumi.StringInput `pulumi:"filterString"`
}

func (ViewFiltersArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ViewFilters)(nil)).Elem()
}

func (i ViewFiltersArgs) ToViewFiltersOutput() ViewFiltersOutput {
	return i.ToViewFiltersOutputWithContext(context.Background())
}

func (i ViewFiltersArgs) ToViewFiltersOutputWithContext(ctx context.Context) ViewFiltersOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ViewFiltersOutput)
}

func (i ViewFiltersArgs) ToOutput(ctx context.Context) pulumix.Output[ViewFilters] {
	return pulumix.Output[ViewFilters]{
		OutputState: i.ToViewFiltersOutputWithContext(ctx).OutputState,
	}
}

func (i ViewFiltersArgs) ToViewFiltersPtrOutput() ViewFiltersPtrOutput {
	return i.ToViewFiltersPtrOutputWithContext(context.Background())
}

func (i ViewFiltersArgs) ToViewFiltersPtrOutputWithContext(ctx context.Context) ViewFiltersPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ViewFiltersOutput).ToViewFiltersPtrOutputWithContext(ctx)
}

// ViewFiltersPtrInput is an input type that accepts ViewFiltersArgs, ViewFiltersPtr and ViewFiltersPtrOutput values.
// You can construct a concrete instance of `ViewFiltersPtrInput` via:
//
//	        ViewFiltersArgs{...}
//
//	or:
//
//	        nil
type ViewFiltersPtrInput interface {
	pulumi.Input

	ToViewFiltersPtrOutput() ViewFiltersPtrOutput
	ToViewFiltersPtrOutputWithContext(context.Context) ViewFiltersPtrOutput
}

type viewFiltersPtrType ViewFiltersArgs

func ViewFiltersPtr(v *ViewFiltersArgs) ViewFiltersPtrInput {
	return (*viewFiltersPtrType)(v)
}

func (*viewFiltersPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ViewFilters)(nil)).Elem()
}

func (i *viewFiltersPtrType) ToViewFiltersPtrOutput() ViewFiltersPtrOutput {
	return i.ToViewFiltersPtrOutputWithContext(context.Background())
}

func (i *viewFiltersPtrType) ToViewFiltersPtrOutputWithContext(ctx context.Context) ViewFiltersPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ViewFiltersPtrOutput)
}

func (i *viewFiltersPtrType) ToOutput(ctx context.Context) pulumix.Output[*ViewFilters] {
	return pulumix.Output[*ViewFilters]{
		OutputState: i.ToViewFiltersPtrOutputWithContext(ctx).OutputState,
	}
}

type ViewFiltersOutput struct{ *pulumi.OutputState }

func (ViewFiltersOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ViewFilters)(nil)).Elem()
}

func (o ViewFiltersOutput) ToViewFiltersOutput() ViewFiltersOutput {
	return o
}

func (o ViewFiltersOutput) ToViewFiltersOutputWithContext(ctx context.Context) ViewFiltersOutput {
	return o
}

func (o ViewFiltersOutput) ToViewFiltersPtrOutput() ViewFiltersPtrOutput {
	return o.ToViewFiltersPtrOutputWithContext(context.Background())
}

func (o ViewFiltersOutput) ToViewFiltersPtrOutputWithContext(ctx context.Context) ViewFiltersPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v ViewFilters) *ViewFilters {
		return &v
	}).(ViewFiltersPtrOutput)
}

func (o ViewFiltersOutput) ToOutput(ctx context.Context) pulumix.Output[ViewFilters] {
	return pulumix.Output[ViewFilters]{
		OutputState: o.OutputState,
	}
}

// The string that contains the search keywords, prefixes, and operators to control the results that can be returned by a search operation. For more details, see [Search query syntax](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html).
func (o ViewFiltersOutput) FilterString() pulumi.StringOutput {
	return o.ApplyT(func(v ViewFilters) string { return v.FilterString }).(pulumi.StringOutput)
}

type ViewFiltersPtrOutput struct{ *pulumi.OutputState }

func (ViewFiltersPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ViewFilters)(nil)).Elem()
}

func (o ViewFiltersPtrOutput) ToViewFiltersPtrOutput() ViewFiltersPtrOutput {
	return o
}

func (o ViewFiltersPtrOutput) ToViewFiltersPtrOutputWithContext(ctx context.Context) ViewFiltersPtrOutput {
	return o
}

func (o ViewFiltersPtrOutput) ToOutput(ctx context.Context) pulumix.Output[*ViewFilters] {
	return pulumix.Output[*ViewFilters]{
		OutputState: o.OutputState,
	}
}

func (o ViewFiltersPtrOutput) Elem() ViewFiltersOutput {
	return o.ApplyT(func(v *ViewFilters) ViewFilters {
		if v != nil {
			return *v
		}
		var ret ViewFilters
		return ret
	}).(ViewFiltersOutput)
}

// The string that contains the search keywords, prefixes, and operators to control the results that can be returned by a search operation. For more details, see [Search query syntax](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html).
func (o ViewFiltersPtrOutput) FilterString() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ViewFilters) *string {
		if v == nil {
			return nil
		}
		return &v.FilterString
	}).(pulumi.StringPtrOutput)
}

type ViewIncludedProperty struct {
	// The name of the property that is included in this view. Valid values: `tags`.
	Name string `pulumi:"name"`
}

// ViewIncludedPropertyInput is an input type that accepts ViewIncludedPropertyArgs and ViewIncludedPropertyOutput values.
// You can construct a concrete instance of `ViewIncludedPropertyInput` via:
//
//	ViewIncludedPropertyArgs{...}
type ViewIncludedPropertyInput interface {
	pulumi.Input

	ToViewIncludedPropertyOutput() ViewIncludedPropertyOutput
	ToViewIncludedPropertyOutputWithContext(context.Context) ViewIncludedPropertyOutput
}

type ViewIncludedPropertyArgs struct {
	// The name of the property that is included in this view. Valid values: `tags`.
	Name pulumi.StringInput `pulumi:"name"`
}

func (ViewIncludedPropertyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ViewIncludedProperty)(nil)).Elem()
}

func (i ViewIncludedPropertyArgs) ToViewIncludedPropertyOutput() ViewIncludedPropertyOutput {
	return i.ToViewIncludedPropertyOutputWithContext(context.Background())
}

func (i ViewIncludedPropertyArgs) ToViewIncludedPropertyOutputWithContext(ctx context.Context) ViewIncludedPropertyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ViewIncludedPropertyOutput)
}

func (i ViewIncludedPropertyArgs) ToOutput(ctx context.Context) pulumix.Output[ViewIncludedProperty] {
	return pulumix.Output[ViewIncludedProperty]{
		OutputState: i.ToViewIncludedPropertyOutputWithContext(ctx).OutputState,
	}
}

// ViewIncludedPropertyArrayInput is an input type that accepts ViewIncludedPropertyArray and ViewIncludedPropertyArrayOutput values.
// You can construct a concrete instance of `ViewIncludedPropertyArrayInput` via:
//
//	ViewIncludedPropertyArray{ ViewIncludedPropertyArgs{...} }
type ViewIncludedPropertyArrayInput interface {
	pulumi.Input

	ToViewIncludedPropertyArrayOutput() ViewIncludedPropertyArrayOutput
	ToViewIncludedPropertyArrayOutputWithContext(context.Context) ViewIncludedPropertyArrayOutput
}

type ViewIncludedPropertyArray []ViewIncludedPropertyInput

func (ViewIncludedPropertyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ViewIncludedProperty)(nil)).Elem()
}

func (i ViewIncludedPropertyArray) ToViewIncludedPropertyArrayOutput() ViewIncludedPropertyArrayOutput {
	return i.ToViewIncludedPropertyArrayOutputWithContext(context.Background())
}

func (i ViewIncludedPropertyArray) ToViewIncludedPropertyArrayOutputWithContext(ctx context.Context) ViewIncludedPropertyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ViewIncludedPropertyArrayOutput)
}

func (i ViewIncludedPropertyArray) ToOutput(ctx context.Context) pulumix.Output[[]ViewIncludedProperty] {
	return pulumix.Output[[]ViewIncludedProperty]{
		OutputState: i.ToViewIncludedPropertyArrayOutputWithContext(ctx).OutputState,
	}
}

type ViewIncludedPropertyOutput struct{ *pulumi.OutputState }

func (ViewIncludedPropertyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ViewIncludedProperty)(nil)).Elem()
}

func (o ViewIncludedPropertyOutput) ToViewIncludedPropertyOutput() ViewIncludedPropertyOutput {
	return o
}

func (o ViewIncludedPropertyOutput) ToViewIncludedPropertyOutputWithContext(ctx context.Context) ViewIncludedPropertyOutput {
	return o
}

func (o ViewIncludedPropertyOutput) ToOutput(ctx context.Context) pulumix.Output[ViewIncludedProperty] {
	return pulumix.Output[ViewIncludedProperty]{
		OutputState: o.OutputState,
	}
}

// The name of the property that is included in this view. Valid values: `tags`.
func (o ViewIncludedPropertyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v ViewIncludedProperty) string { return v.Name }).(pulumi.StringOutput)
}

type ViewIncludedPropertyArrayOutput struct{ *pulumi.OutputState }

func (ViewIncludedPropertyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ViewIncludedProperty)(nil)).Elem()
}

func (o ViewIncludedPropertyArrayOutput) ToViewIncludedPropertyArrayOutput() ViewIncludedPropertyArrayOutput {
	return o
}

func (o ViewIncludedPropertyArrayOutput) ToViewIncludedPropertyArrayOutputWithContext(ctx context.Context) ViewIncludedPropertyArrayOutput {
	return o
}

func (o ViewIncludedPropertyArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]ViewIncludedProperty] {
	return pulumix.Output[[]ViewIncludedProperty]{
		OutputState: o.OutputState,
	}
}

func (o ViewIncludedPropertyArrayOutput) Index(i pulumi.IntInput) ViewIncludedPropertyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ViewIncludedProperty {
		return vs[0].([]ViewIncludedProperty)[vs[1].(int)]
	}).(ViewIncludedPropertyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IndexTimeoutsInput)(nil)).Elem(), IndexTimeoutsArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*IndexTimeoutsPtrInput)(nil)).Elem(), IndexTimeoutsArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ViewFiltersInput)(nil)).Elem(), ViewFiltersArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ViewFiltersPtrInput)(nil)).Elem(), ViewFiltersArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ViewIncludedPropertyInput)(nil)).Elem(), ViewIncludedPropertyArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ViewIncludedPropertyArrayInput)(nil)).Elem(), ViewIncludedPropertyArray{})
	pulumi.RegisterOutputType(IndexTimeoutsOutput{})
	pulumi.RegisterOutputType(IndexTimeoutsPtrOutput{})
	pulumi.RegisterOutputType(ViewFiltersOutput{})
	pulumi.RegisterOutputType(ViewFiltersPtrOutput{})
	pulumi.RegisterOutputType(ViewIncludedPropertyOutput{})
	pulumi.RegisterOutputType(ViewIncludedPropertyArrayOutput{})
}
