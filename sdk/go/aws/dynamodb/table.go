// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynamodb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a DynamoDB table resource.
//
// > **Note:** It is recommended to use [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) for `readCapacity` and/or `writeCapacity` if there's `autoscaling policy` attached to the table.
//
// > **Note:** When using dynamodb.TableReplica with this resource, use `lifecycle` `ignoreChanges` for `replica`, _e.g._, `lifecycle { ignoreChanges = [replica] }`.
//
// ## DynamoDB Table attributes
//
// Only define attributes on the table object that are going to be used as:
//
// * Table hash key or range key
// * LSI or GSI hash key or range key
//
// The DynamoDB API expects attribute structure (name and type) to be passed along when creating or updating GSI/LSIs or creating the initial table. In these cases it expects the Hash / Range keys to be provided. Because these get re-used in numerous places (i.e the table's range key could be a part of one or more GSIs), they are stored on the table object to prevent duplication and increase consistency. If you add attributes here that are not used in these scenarios it can cause an infinite loop in planning.
//
// ## Example Usage
// ### Basic Example
//
// The following dynamodb table description models the table and GSI shown in the [AWS SDK example documentation](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.html)
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/dynamodb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dynamodb.NewTable(ctx, "basic-dynamodb-table", &dynamodb.TableArgs{
//				Attributes: dynamodb.TableAttributeArray{
//					&dynamodb.TableAttributeArgs{
//						Name: pulumi.String("UserId"),
//						Type: pulumi.String("S"),
//					},
//					&dynamodb.TableAttributeArgs{
//						Name: pulumi.String("GameTitle"),
//						Type: pulumi.String("S"),
//					},
//					&dynamodb.TableAttributeArgs{
//						Name: pulumi.String("TopScore"),
//						Type: pulumi.String("N"),
//					},
//				},
//				BillingMode: pulumi.String("PROVISIONED"),
//				GlobalSecondaryIndexes: dynamodb.TableGlobalSecondaryIndexArray{
//					&dynamodb.TableGlobalSecondaryIndexArgs{
//						HashKey: pulumi.String("GameTitle"),
//						Name:    pulumi.String("GameTitleIndex"),
//						NonKeyAttributes: pulumi.StringArray{
//							pulumi.String("UserId"),
//						},
//						ProjectionType: pulumi.String("INCLUDE"),
//						RangeKey:       pulumi.String("TopScore"),
//						ReadCapacity:   pulumi.Int(10),
//						WriteCapacity:  pulumi.Int(10),
//					},
//				},
//				HashKey:      pulumi.String("UserId"),
//				RangeKey:     pulumi.String("GameTitle"),
//				ReadCapacity: pulumi.Int(20),
//				Tags: pulumi.StringMap{
//					"Environment": pulumi.String("production"),
//					"Name":        pulumi.String("dynamodb-table-1"),
//				},
//				Ttl: &dynamodb.TableTtlArgs{
//					AttributeName: pulumi.String("TimeToExist"),
//					Enabled:       pulumi.Bool(false),
//				},
//				WriteCapacity: pulumi.Int(20),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Global Tables
//
// This resource implements support for [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) via `replica` configuration blocks. For working with [DynamoDB Global Tables V1 (version 2017.11.29)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V1.html), see the `dynamodb.GlobalTable` resource.
//
// > **Note:** dynamodb.TableReplica is an alternate way of configuring Global Tables. Do not use `replica` configuration blocks of `dynamodb.Table` together with aws_dynamodb_table_replica.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/dynamodb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dynamodb.NewTable(ctx, "example", &dynamodb.TableArgs{
//				Attributes: dynamodb.TableAttributeArray{
//					&dynamodb.TableAttributeArgs{
//						Name: pulumi.String("TestTableHashKey"),
//						Type: pulumi.String("S"),
//					},
//				},
//				BillingMode: pulumi.String("PAY_PER_REQUEST"),
//				HashKey:     pulumi.String("TestTableHashKey"),
//				Replicas: dynamodb.TableReplicaTypeArray{
//					&dynamodb.TableReplicaTypeArgs{
//						RegionName: pulumi.String("us-east-2"),
//					},
//					&dynamodb.TableReplicaTypeArgs{
//						RegionName: pulumi.String("us-west-2"),
//					},
//				},
//				StreamEnabled:  pulumi.Bool(true),
//				StreamViewType: pulumi.String("NEW_AND_OLD_IMAGES"),
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
// Using `pulumi import`, import DynamoDB tables using the `name`. For example:
//
// ```sh
//
//	$ pulumi import aws:dynamodb/table:Table basic-dynamodb-table GameScores
//
// ```
type Table struct {
	pulumi.CustomResourceState

	// ARN of the table
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Set of nested attribute definitions. Only required for `hashKey` and `rangeKey` attributes. See below.
	Attributes TableAttributeArrayOutput `pulumi:"attributes"`
	// Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
	BillingMode pulumi.StringPtrOutput `pulumi:"billingMode"`
	// Enables deletion protection for table. Defaults to `false`.
	DeletionProtectionEnabled pulumi.BoolPtrOutput `pulumi:"deletionProtectionEnabled"`
	// Describe a GSI for the table; subject to the normal limits on the number of GSIs, projected attributes, etc. See below.
	GlobalSecondaryIndexes TableGlobalSecondaryIndexArrayOutput `pulumi:"globalSecondaryIndexes"`
	// Attribute to use as the hash (partition) key. Must also be defined as an `attribute`. See below.
	HashKey pulumi.StringOutput `pulumi:"hashKey"`
	// Describe an LSI on the table; these can only be allocated _at creation_ so you cannot change this definition after you have created the resource. See below.
	LocalSecondaryIndexes TableLocalSecondaryIndexArrayOutput `pulumi:"localSecondaryIndexes"`
	// Unique within a region name of the table.
	//
	// Optional arguments:
	Name pulumi.StringOutput `pulumi:"name"`
	// Enable point-in-time recovery options. See below.
	PointInTimeRecovery TablePointInTimeRecoveryOutput `pulumi:"pointInTimeRecovery"`
	// Attribute to use as the range (sort) key. Must also be defined as an `attribute`, see below.
	RangeKey pulumi.StringPtrOutput `pulumi:"rangeKey"`
	// Number of read units for this table. If the `billingMode` is `PROVISIONED`, this field is required.
	ReadCapacity pulumi.IntOutput `pulumi:"readCapacity"`
	// Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. See below.
	Replicas TableReplicaTypeArrayOutput `pulumi:"replicas"`
	// Time of the point-in-time recovery point to restore.
	RestoreDateTime pulumi.StringPtrOutput `pulumi:"restoreDateTime"`
	// Name of the table to restore. Must match the name of an existing table.
	RestoreSourceName pulumi.StringPtrOutput `pulumi:"restoreSourceName"`
	// If set, restores table to the most recent point-in-time recovery point.
	RestoreToLatestTime pulumi.BoolPtrOutput `pulumi:"restoreToLatestTime"`
	// Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS-owned Customer Master Key if this argument isn't specified. See below.
	ServerSideEncryption TableServerSideEncryptionOutput `pulumi:"serverSideEncryption"`
	// ARN of the Table Stream. Only available when `streamEnabled = true`
	StreamArn pulumi.StringOutput `pulumi:"streamArn"`
	// Whether Streams are enabled.
	StreamEnabled pulumi.BoolPtrOutput `pulumi:"streamEnabled"`
	// Timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not a unique identifier for the stream on its own. However, the combination of AWS customer ID, table name and this field is guaranteed to be unique. It can be used for creating CloudWatch Alarms. Only available when `streamEnabled = true`.
	StreamLabel pulumi.StringOutput `pulumi:"streamLabel"`
	// When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
	StreamViewType pulumi.StringOutput `pulumi:"streamViewType"`
	// Storage class of the table.
	// Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`.
	// Default value is `STANDARD`.
	TableClass pulumi.StringPtrOutput `pulumi:"tableClass"`
	// A map of tags to populate on the created table. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Configuration block for TTL. See below.
	Ttl TableTtlOutput `pulumi:"ttl"`
	// Number of write units for this table. If the `billingMode` is `PROVISIONED`, this field is required.
	WriteCapacity pulumi.IntOutput `pulumi:"writeCapacity"`
}

// NewTable registers a new resource with the given unique name, arguments, and options.
func NewTable(ctx *pulumi.Context,
	name string, args *TableArgs, opts ...pulumi.ResourceOption) (*Table, error) {
	if args == nil {
		args = &TableArgs{}
	}

	secrets := pulumi.AdditionalSecretOutputs([]string{
		"tagsAll",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Table
	err := ctx.RegisterResource("aws:dynamodb/table:Table", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTable gets an existing Table resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTable(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TableState, opts ...pulumi.ResourceOption) (*Table, error) {
	var resource Table
	err := ctx.ReadResource("aws:dynamodb/table:Table", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Table resources.
type tableState struct {
	// ARN of the table
	Arn *string `pulumi:"arn"`
	// Set of nested attribute definitions. Only required for `hashKey` and `rangeKey` attributes. See below.
	Attributes []TableAttribute `pulumi:"attributes"`
	// Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
	BillingMode *string `pulumi:"billingMode"`
	// Enables deletion protection for table. Defaults to `false`.
	DeletionProtectionEnabled *bool `pulumi:"deletionProtectionEnabled"`
	// Describe a GSI for the table; subject to the normal limits on the number of GSIs, projected attributes, etc. See below.
	GlobalSecondaryIndexes []TableGlobalSecondaryIndex `pulumi:"globalSecondaryIndexes"`
	// Attribute to use as the hash (partition) key. Must also be defined as an `attribute`. See below.
	HashKey *string `pulumi:"hashKey"`
	// Describe an LSI on the table; these can only be allocated _at creation_ so you cannot change this definition after you have created the resource. See below.
	LocalSecondaryIndexes []TableLocalSecondaryIndex `pulumi:"localSecondaryIndexes"`
	// Unique within a region name of the table.
	//
	// Optional arguments:
	Name *string `pulumi:"name"`
	// Enable point-in-time recovery options. See below.
	PointInTimeRecovery *TablePointInTimeRecovery `pulumi:"pointInTimeRecovery"`
	// Attribute to use as the range (sort) key. Must also be defined as an `attribute`, see below.
	RangeKey *string `pulumi:"rangeKey"`
	// Number of read units for this table. If the `billingMode` is `PROVISIONED`, this field is required.
	ReadCapacity *int `pulumi:"readCapacity"`
	// Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. See below.
	Replicas []TableReplicaType `pulumi:"replicas"`
	// Time of the point-in-time recovery point to restore.
	RestoreDateTime *string `pulumi:"restoreDateTime"`
	// Name of the table to restore. Must match the name of an existing table.
	RestoreSourceName *string `pulumi:"restoreSourceName"`
	// If set, restores table to the most recent point-in-time recovery point.
	RestoreToLatestTime *bool `pulumi:"restoreToLatestTime"`
	// Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS-owned Customer Master Key if this argument isn't specified. See below.
	ServerSideEncryption *TableServerSideEncryption `pulumi:"serverSideEncryption"`
	// ARN of the Table Stream. Only available when `streamEnabled = true`
	StreamArn *string `pulumi:"streamArn"`
	// Whether Streams are enabled.
	StreamEnabled *bool `pulumi:"streamEnabled"`
	// Timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not a unique identifier for the stream on its own. However, the combination of AWS customer ID, table name and this field is guaranteed to be unique. It can be used for creating CloudWatch Alarms. Only available when `streamEnabled = true`.
	StreamLabel *string `pulumi:"streamLabel"`
	// When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
	StreamViewType *string `pulumi:"streamViewType"`
	// Storage class of the table.
	// Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`.
	// Default value is `STANDARD`.
	TableClass *string `pulumi:"tableClass"`
	// A map of tags to populate on the created table. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Configuration block for TTL. See below.
	Ttl *TableTtl `pulumi:"ttl"`
	// Number of write units for this table. If the `billingMode` is `PROVISIONED`, this field is required.
	WriteCapacity *int `pulumi:"writeCapacity"`
}

type TableState struct {
	// ARN of the table
	Arn pulumi.StringPtrInput
	// Set of nested attribute definitions. Only required for `hashKey` and `rangeKey` attributes. See below.
	Attributes TableAttributeArrayInput
	// Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
	BillingMode pulumi.StringPtrInput
	// Enables deletion protection for table. Defaults to `false`.
	DeletionProtectionEnabled pulumi.BoolPtrInput
	// Describe a GSI for the table; subject to the normal limits on the number of GSIs, projected attributes, etc. See below.
	GlobalSecondaryIndexes TableGlobalSecondaryIndexArrayInput
	// Attribute to use as the hash (partition) key. Must also be defined as an `attribute`. See below.
	HashKey pulumi.StringPtrInput
	// Describe an LSI on the table; these can only be allocated _at creation_ so you cannot change this definition after you have created the resource. See below.
	LocalSecondaryIndexes TableLocalSecondaryIndexArrayInput
	// Unique within a region name of the table.
	//
	// Optional arguments:
	Name pulumi.StringPtrInput
	// Enable point-in-time recovery options. See below.
	PointInTimeRecovery TablePointInTimeRecoveryPtrInput
	// Attribute to use as the range (sort) key. Must also be defined as an `attribute`, see below.
	RangeKey pulumi.StringPtrInput
	// Number of read units for this table. If the `billingMode` is `PROVISIONED`, this field is required.
	ReadCapacity pulumi.IntPtrInput
	// Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. See below.
	Replicas TableReplicaTypeArrayInput
	// Time of the point-in-time recovery point to restore.
	RestoreDateTime pulumi.StringPtrInput
	// Name of the table to restore. Must match the name of an existing table.
	RestoreSourceName pulumi.StringPtrInput
	// If set, restores table to the most recent point-in-time recovery point.
	RestoreToLatestTime pulumi.BoolPtrInput
	// Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS-owned Customer Master Key if this argument isn't specified. See below.
	ServerSideEncryption TableServerSideEncryptionPtrInput
	// ARN of the Table Stream. Only available when `streamEnabled = true`
	StreamArn pulumi.StringPtrInput
	// Whether Streams are enabled.
	StreamEnabled pulumi.BoolPtrInput
	// Timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not a unique identifier for the stream on its own. However, the combination of AWS customer ID, table name and this field is guaranteed to be unique. It can be used for creating CloudWatch Alarms. Only available when `streamEnabled = true`.
	StreamLabel pulumi.StringPtrInput
	// When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
	StreamViewType pulumi.StringPtrInput
	// Storage class of the table.
	// Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`.
	// Default value is `STANDARD`.
	TableClass pulumi.StringPtrInput
	// A map of tags to populate on the created table. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// Configuration block for TTL. See below.
	Ttl TableTtlPtrInput
	// Number of write units for this table. If the `billingMode` is `PROVISIONED`, this field is required.
	WriteCapacity pulumi.IntPtrInput
}

func (TableState) ElementType() reflect.Type {
	return reflect.TypeOf((*tableState)(nil)).Elem()
}

type tableArgs struct {
	// Set of nested attribute definitions. Only required for `hashKey` and `rangeKey` attributes. See below.
	Attributes []TableAttribute `pulumi:"attributes"`
	// Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
	BillingMode *string `pulumi:"billingMode"`
	// Enables deletion protection for table. Defaults to `false`.
	DeletionProtectionEnabled *bool `pulumi:"deletionProtectionEnabled"`
	// Describe a GSI for the table; subject to the normal limits on the number of GSIs, projected attributes, etc. See below.
	GlobalSecondaryIndexes []TableGlobalSecondaryIndex `pulumi:"globalSecondaryIndexes"`
	// Attribute to use as the hash (partition) key. Must also be defined as an `attribute`. See below.
	HashKey *string `pulumi:"hashKey"`
	// Describe an LSI on the table; these can only be allocated _at creation_ so you cannot change this definition after you have created the resource. See below.
	LocalSecondaryIndexes []TableLocalSecondaryIndex `pulumi:"localSecondaryIndexes"`
	// Unique within a region name of the table.
	//
	// Optional arguments:
	Name *string `pulumi:"name"`
	// Enable point-in-time recovery options. See below.
	PointInTimeRecovery *TablePointInTimeRecovery `pulumi:"pointInTimeRecovery"`
	// Attribute to use as the range (sort) key. Must also be defined as an `attribute`, see below.
	RangeKey *string `pulumi:"rangeKey"`
	// Number of read units for this table. If the `billingMode` is `PROVISIONED`, this field is required.
	ReadCapacity *int `pulumi:"readCapacity"`
	// Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. See below.
	Replicas []TableReplicaType `pulumi:"replicas"`
	// Time of the point-in-time recovery point to restore.
	RestoreDateTime *string `pulumi:"restoreDateTime"`
	// Name of the table to restore. Must match the name of an existing table.
	RestoreSourceName *string `pulumi:"restoreSourceName"`
	// If set, restores table to the most recent point-in-time recovery point.
	RestoreToLatestTime *bool `pulumi:"restoreToLatestTime"`
	// Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS-owned Customer Master Key if this argument isn't specified. See below.
	ServerSideEncryption *TableServerSideEncryption `pulumi:"serverSideEncryption"`
	// Whether Streams are enabled.
	StreamEnabled *bool `pulumi:"streamEnabled"`
	// When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
	StreamViewType *string `pulumi:"streamViewType"`
	// Storage class of the table.
	// Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`.
	// Default value is `STANDARD`.
	TableClass *string `pulumi:"tableClass"`
	// A map of tags to populate on the created table. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Configuration block for TTL. See below.
	Ttl *TableTtl `pulumi:"ttl"`
	// Number of write units for this table. If the `billingMode` is `PROVISIONED`, this field is required.
	WriteCapacity *int `pulumi:"writeCapacity"`
}

// The set of arguments for constructing a Table resource.
type TableArgs struct {
	// Set of nested attribute definitions. Only required for `hashKey` and `rangeKey` attributes. See below.
	Attributes TableAttributeArrayInput
	// Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
	BillingMode pulumi.StringPtrInput
	// Enables deletion protection for table. Defaults to `false`.
	DeletionProtectionEnabled pulumi.BoolPtrInput
	// Describe a GSI for the table; subject to the normal limits on the number of GSIs, projected attributes, etc. See below.
	GlobalSecondaryIndexes TableGlobalSecondaryIndexArrayInput
	// Attribute to use as the hash (partition) key. Must also be defined as an `attribute`. See below.
	HashKey pulumi.StringPtrInput
	// Describe an LSI on the table; these can only be allocated _at creation_ so you cannot change this definition after you have created the resource. See below.
	LocalSecondaryIndexes TableLocalSecondaryIndexArrayInput
	// Unique within a region name of the table.
	//
	// Optional arguments:
	Name pulumi.StringPtrInput
	// Enable point-in-time recovery options. See below.
	PointInTimeRecovery TablePointInTimeRecoveryPtrInput
	// Attribute to use as the range (sort) key. Must also be defined as an `attribute`, see below.
	RangeKey pulumi.StringPtrInput
	// Number of read units for this table. If the `billingMode` is `PROVISIONED`, this field is required.
	ReadCapacity pulumi.IntPtrInput
	// Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. See below.
	Replicas TableReplicaTypeArrayInput
	// Time of the point-in-time recovery point to restore.
	RestoreDateTime pulumi.StringPtrInput
	// Name of the table to restore. Must match the name of an existing table.
	RestoreSourceName pulumi.StringPtrInput
	// If set, restores table to the most recent point-in-time recovery point.
	RestoreToLatestTime pulumi.BoolPtrInput
	// Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS-owned Customer Master Key if this argument isn't specified. See below.
	ServerSideEncryption TableServerSideEncryptionPtrInput
	// Whether Streams are enabled.
	StreamEnabled pulumi.BoolPtrInput
	// When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
	StreamViewType pulumi.StringPtrInput
	// Storage class of the table.
	// Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`.
	// Default value is `STANDARD`.
	TableClass pulumi.StringPtrInput
	// A map of tags to populate on the created table. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Configuration block for TTL. See below.
	Ttl TableTtlPtrInput
	// Number of write units for this table. If the `billingMode` is `PROVISIONED`, this field is required.
	WriteCapacity pulumi.IntPtrInput
}

func (TableArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tableArgs)(nil)).Elem()
}

type TableInput interface {
	pulumi.Input

	ToTableOutput() TableOutput
	ToTableOutputWithContext(ctx context.Context) TableOutput
}

func (*Table) ElementType() reflect.Type {
	return reflect.TypeOf((**Table)(nil)).Elem()
}

func (i *Table) ToTableOutput() TableOutput {
	return i.ToTableOutputWithContext(context.Background())
}

func (i *Table) ToTableOutputWithContext(ctx context.Context) TableOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableOutput)
}

func (i *Table) ToOutput(ctx context.Context) pulumix.Output[*Table] {
	return pulumix.Output[*Table]{
		OutputState: i.ToTableOutputWithContext(ctx).OutputState,
	}
}

// TableArrayInput is an input type that accepts TableArray and TableArrayOutput values.
// You can construct a concrete instance of `TableArrayInput` via:
//
//	TableArray{ TableArgs{...} }
type TableArrayInput interface {
	pulumi.Input

	ToTableArrayOutput() TableArrayOutput
	ToTableArrayOutputWithContext(context.Context) TableArrayOutput
}

type TableArray []TableInput

func (TableArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Table)(nil)).Elem()
}

func (i TableArray) ToTableArrayOutput() TableArrayOutput {
	return i.ToTableArrayOutputWithContext(context.Background())
}

func (i TableArray) ToTableArrayOutputWithContext(ctx context.Context) TableArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableArrayOutput)
}

func (i TableArray) ToOutput(ctx context.Context) pulumix.Output[[]*Table] {
	return pulumix.Output[[]*Table]{
		OutputState: i.ToTableArrayOutputWithContext(ctx).OutputState,
	}
}

// TableMapInput is an input type that accepts TableMap and TableMapOutput values.
// You can construct a concrete instance of `TableMapInput` via:
//
//	TableMap{ "key": TableArgs{...} }
type TableMapInput interface {
	pulumi.Input

	ToTableMapOutput() TableMapOutput
	ToTableMapOutputWithContext(context.Context) TableMapOutput
}

type TableMap map[string]TableInput

func (TableMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Table)(nil)).Elem()
}

func (i TableMap) ToTableMapOutput() TableMapOutput {
	return i.ToTableMapOutputWithContext(context.Background())
}

func (i TableMap) ToTableMapOutputWithContext(ctx context.Context) TableMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableMapOutput)
}

func (i TableMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Table] {
	return pulumix.Output[map[string]*Table]{
		OutputState: i.ToTableMapOutputWithContext(ctx).OutputState,
	}
}

type TableOutput struct{ *pulumi.OutputState }

func (TableOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Table)(nil)).Elem()
}

func (o TableOutput) ToTableOutput() TableOutput {
	return o
}

func (o TableOutput) ToTableOutputWithContext(ctx context.Context) TableOutput {
	return o
}

func (o TableOutput) ToOutput(ctx context.Context) pulumix.Output[*Table] {
	return pulumix.Output[*Table]{
		OutputState: o.OutputState,
	}
}

// ARN of the table
func (o TableOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Set of nested attribute definitions. Only required for `hashKey` and `rangeKey` attributes. See below.
func (o TableOutput) Attributes() TableAttributeArrayOutput {
	return o.ApplyT(func(v *Table) TableAttributeArrayOutput { return v.Attributes }).(TableAttributeArrayOutput)
}

// Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
func (o TableOutput) BillingMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Table) pulumi.StringPtrOutput { return v.BillingMode }).(pulumi.StringPtrOutput)
}

// Enables deletion protection for table. Defaults to `false`.
func (o TableOutput) DeletionProtectionEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Table) pulumi.BoolPtrOutput { return v.DeletionProtectionEnabled }).(pulumi.BoolPtrOutput)
}

// Describe a GSI for the table; subject to the normal limits on the number of GSIs, projected attributes, etc. See below.
func (o TableOutput) GlobalSecondaryIndexes() TableGlobalSecondaryIndexArrayOutput {
	return o.ApplyT(func(v *Table) TableGlobalSecondaryIndexArrayOutput { return v.GlobalSecondaryIndexes }).(TableGlobalSecondaryIndexArrayOutput)
}

// Attribute to use as the hash (partition) key. Must also be defined as an `attribute`. See below.
func (o TableOutput) HashKey() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.HashKey }).(pulumi.StringOutput)
}

// Describe an LSI on the table; these can only be allocated _at creation_ so you cannot change this definition after you have created the resource. See below.
func (o TableOutput) LocalSecondaryIndexes() TableLocalSecondaryIndexArrayOutput {
	return o.ApplyT(func(v *Table) TableLocalSecondaryIndexArrayOutput { return v.LocalSecondaryIndexes }).(TableLocalSecondaryIndexArrayOutput)
}

// Unique within a region name of the table.
//
// Optional arguments:
func (o TableOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Enable point-in-time recovery options. See below.
func (o TableOutput) PointInTimeRecovery() TablePointInTimeRecoveryOutput {
	return o.ApplyT(func(v *Table) TablePointInTimeRecoveryOutput { return v.PointInTimeRecovery }).(TablePointInTimeRecoveryOutput)
}

// Attribute to use as the range (sort) key. Must also be defined as an `attribute`, see below.
func (o TableOutput) RangeKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Table) pulumi.StringPtrOutput { return v.RangeKey }).(pulumi.StringPtrOutput)
}

// Number of read units for this table. If the `billingMode` is `PROVISIONED`, this field is required.
func (o TableOutput) ReadCapacity() pulumi.IntOutput {
	return o.ApplyT(func(v *Table) pulumi.IntOutput { return v.ReadCapacity }).(pulumi.IntOutput)
}

// Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. See below.
func (o TableOutput) Replicas() TableReplicaTypeArrayOutput {
	return o.ApplyT(func(v *Table) TableReplicaTypeArrayOutput { return v.Replicas }).(TableReplicaTypeArrayOutput)
}

// Time of the point-in-time recovery point to restore.
func (o TableOutput) RestoreDateTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Table) pulumi.StringPtrOutput { return v.RestoreDateTime }).(pulumi.StringPtrOutput)
}

// Name of the table to restore. Must match the name of an existing table.
func (o TableOutput) RestoreSourceName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Table) pulumi.StringPtrOutput { return v.RestoreSourceName }).(pulumi.StringPtrOutput)
}

// If set, restores table to the most recent point-in-time recovery point.
func (o TableOutput) RestoreToLatestTime() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Table) pulumi.BoolPtrOutput { return v.RestoreToLatestTime }).(pulumi.BoolPtrOutput)
}

// Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS-owned Customer Master Key if this argument isn't specified. See below.
func (o TableOutput) ServerSideEncryption() TableServerSideEncryptionOutput {
	return o.ApplyT(func(v *Table) TableServerSideEncryptionOutput { return v.ServerSideEncryption }).(TableServerSideEncryptionOutput)
}

// ARN of the Table Stream. Only available when `streamEnabled = true`
func (o TableOutput) StreamArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.StreamArn }).(pulumi.StringOutput)
}

// Whether Streams are enabled.
func (o TableOutput) StreamEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Table) pulumi.BoolPtrOutput { return v.StreamEnabled }).(pulumi.BoolPtrOutput)
}

// Timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not a unique identifier for the stream on its own. However, the combination of AWS customer ID, table name and this field is guaranteed to be unique. It can be used for creating CloudWatch Alarms. Only available when `streamEnabled = true`.
func (o TableOutput) StreamLabel() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.StreamLabel }).(pulumi.StringOutput)
}

// When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
func (o TableOutput) StreamViewType() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.StreamViewType }).(pulumi.StringOutput)
}

// Storage class of the table.
// Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`.
// Default value is `STANDARD`.
func (o TableOutput) TableClass() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Table) pulumi.StringPtrOutput { return v.TableClass }).(pulumi.StringPtrOutput)
}

// A map of tags to populate on the created table. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o TableOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Table) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o TableOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Table) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Configuration block for TTL. See below.
func (o TableOutput) Ttl() TableTtlOutput {
	return o.ApplyT(func(v *Table) TableTtlOutput { return v.Ttl }).(TableTtlOutput)
}

// Number of write units for this table. If the `billingMode` is `PROVISIONED`, this field is required.
func (o TableOutput) WriteCapacity() pulumi.IntOutput {
	return o.ApplyT(func(v *Table) pulumi.IntOutput { return v.WriteCapacity }).(pulumi.IntOutput)
}

type TableArrayOutput struct{ *pulumi.OutputState }

func (TableArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Table)(nil)).Elem()
}

func (o TableArrayOutput) ToTableArrayOutput() TableArrayOutput {
	return o
}

func (o TableArrayOutput) ToTableArrayOutputWithContext(ctx context.Context) TableArrayOutput {
	return o
}

func (o TableArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Table] {
	return pulumix.Output[[]*Table]{
		OutputState: o.OutputState,
	}
}

func (o TableArrayOutput) Index(i pulumi.IntInput) TableOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Table {
		return vs[0].([]*Table)[vs[1].(int)]
	}).(TableOutput)
}

type TableMapOutput struct{ *pulumi.OutputState }

func (TableMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Table)(nil)).Elem()
}

func (o TableMapOutput) ToTableMapOutput() TableMapOutput {
	return o
}

func (o TableMapOutput) ToTableMapOutputWithContext(ctx context.Context) TableMapOutput {
	return o
}

func (o TableMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Table] {
	return pulumix.Output[map[string]*Table]{
		OutputState: o.OutputState,
	}
}

func (o TableMapOutput) MapIndex(k pulumi.StringInput) TableOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Table {
		return vs[0].(map[string]*Table)[vs[1].(string)]
	}).(TableOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TableInput)(nil)).Elem(), &Table{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableArrayInput)(nil)).Elem(), TableArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableMapInput)(nil)).Elem(), TableMap{})
	pulumi.RegisterOutputType(TableOutput{})
	pulumi.RegisterOutputType(TableArrayOutput{})
	pulumi.RegisterOutputType(TableMapOutput{})
}
