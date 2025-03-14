// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appflow.FlowArgs;
import com.pulumi.aws.appflow.inputs.FlowState;
import com.pulumi.aws.appflow.outputs.FlowDestinationFlowConfig;
import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfig;
import com.pulumi.aws.appflow.outputs.FlowTask;
import com.pulumi.aws.appflow.outputs.FlowTriggerConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an AppFlow flow resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.s3.BucketPolicy;
 * import com.pulumi.aws.s3.BucketPolicyArgs;
 * import com.pulumi.aws.s3.BucketObjectv2;
 * import com.pulumi.aws.s3.BucketObjectv2Args;
 * import com.pulumi.aws.appflow.Flow;
 * import com.pulumi.aws.appflow.FlowArgs;
 * import com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigArgs;
 * import com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs;
 * import com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesS3Args;
 * import com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigArgs;
 * import com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs;
 * import com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3Args;
 * import com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs;
 * import com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigPrefixConfigArgs;
 * import com.pulumi.aws.appflow.inputs.FlowTaskArgs;
 * import com.pulumi.aws.appflow.inputs.FlowTriggerConfigArgs;
 * import com.pulumi.asset.FileAsset;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleSourceBucketV2 = new BucketV2(&#34;exampleSourceBucketV2&#34;);
 * 
 *         final var exampleSourcePolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .sid(&#34;AllowAppFlowSourceActions&#34;)
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;appflow.amazonaws.com&#34;)
 *                     .build())
 *                 .actions(                
 *                     &#34;s3:ListBucket&#34;,
 *                     &#34;s3:GetObject&#34;)
 *                 .resources(                
 *                     &#34;arn:aws:s3:::example_source&#34;,
 *                     &#34;arn:aws:s3:::example_source/*&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleSourceBucketPolicy = new BucketPolicy(&#34;exampleSourceBucketPolicy&#34;, BucketPolicyArgs.builder()        
 *             .bucket(exampleSourceBucketV2.id())
 *             .policy(exampleSourcePolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var exampleBucketObjectv2 = new BucketObjectv2(&#34;exampleBucketObjectv2&#34;, BucketObjectv2Args.builder()        
 *             .bucket(exampleSourceBucketV2.id())
 *             .key(&#34;example_source.csv&#34;)
 *             .source(new FileAsset(&#34;example_source.csv&#34;))
 *             .build());
 * 
 *         var exampleDestinationBucketV2 = new BucketV2(&#34;exampleDestinationBucketV2&#34;);
 * 
 *         final var exampleDestinationPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .sid(&#34;AllowAppFlowDestinationActions&#34;)
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;appflow.amazonaws.com&#34;)
 *                     .build())
 *                 .actions(                
 *                     &#34;s3:PutObject&#34;,
 *                     &#34;s3:AbortMultipartUpload&#34;,
 *                     &#34;s3:ListMultipartUploadParts&#34;,
 *                     &#34;s3:ListBucketMultipartUploads&#34;,
 *                     &#34;s3:GetBucketAcl&#34;,
 *                     &#34;s3:PutObjectAcl&#34;)
 *                 .resources(                
 *                     &#34;arn:aws:s3:::example_destination&#34;,
 *                     &#34;arn:aws:s3:::example_destination/*&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleDestinationBucketPolicy = new BucketPolicy(&#34;exampleDestinationBucketPolicy&#34;, BucketPolicyArgs.builder()        
 *             .bucket(exampleDestinationBucketV2.id())
 *             .policy(exampleDestinationPolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var exampleFlow = new Flow(&#34;exampleFlow&#34;, FlowArgs.builder()        
 *             .sourceFlowConfig(FlowSourceFlowConfigArgs.builder()
 *                 .connectorType(&#34;S3&#34;)
 *                 .sourceConnectorProperties(FlowSourceFlowConfigSourceConnectorPropertiesArgs.builder()
 *                     .s3(FlowSourceFlowConfigSourceConnectorPropertiesS3Args.builder()
 *                         .bucketName(exampleSourceBucketPolicy.bucket())
 *                         .bucketPrefix(&#34;example&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .destinationFlowConfigs(FlowDestinationFlowConfigArgs.builder()
 *                 .connectorType(&#34;S3&#34;)
 *                 .destinationConnectorProperties(FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.builder()
 *                     .s3(FlowDestinationFlowConfigDestinationConnectorPropertiesS3Args.builder()
 *                         .bucketName(exampleDestinationBucketPolicy.bucket())
 *                         .s3OutputFormatConfig(FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs.builder()
 *                             .prefixConfig(FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigPrefixConfigArgs.builder()
 *                                 .prefixType(&#34;PATH&#34;)
 *                                 .build())
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .tasks(FlowTaskArgs.builder()
 *                 .sourceFields(&#34;exampleField&#34;)
 *                 .destinationField(&#34;exampleField&#34;)
 *                 .taskType(&#34;Map&#34;)
 *                 .connectorOperators(FlowTaskConnectorOperatorArgs.builder()
 *                     .s3(&#34;NO_OP&#34;)
 *                     .build())
 *                 .build())
 *             .triggerConfig(FlowTriggerConfigArgs.builder()
 *                 .triggerType(&#34;OnDemand&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import AppFlow flows using the `arn`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:appflow/flow:Flow example arn:aws:appflow:us-west-2:123456789012:flow/example-flow
 * ```
 * 
 */
@ResourceType(type="aws:appflow/flow:Flow")
public class Flow extends com.pulumi.resources.CustomResource {
    /**
     * Flow&#39;s ARN.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Flow&#39;s ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Description of the flow you want to create.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the flow you want to create.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
     * 
     */
    @Export(name="destinationFlowConfigs", refs={List.class,FlowDestinationFlowConfig.class}, tree="[0,1]")
    private Output<List<FlowDestinationFlowConfig>> destinationFlowConfigs;

    /**
     * @return A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
     * 
     */
    public Output<List<FlowDestinationFlowConfig>> destinationFlowConfigs() {
        return this.destinationFlowConfigs;
    }
    /**
     * ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don&#39;t provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     * 
     */
    @Export(name="kmsArn", refs={String.class}, tree="[0]")
    private Output<String> kmsArn;

    /**
     * @return ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don&#39;t provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     * 
     */
    public Output<String> kmsArn() {
        return this.kmsArn;
    }
    /**
     * Name of the flow.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the flow.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
     * 
     */
    @Export(name="sourceFlowConfig", refs={FlowSourceFlowConfig.class}, tree="[0]")
    private Output<FlowSourceFlowConfig> sourceFlowConfig;

    /**
     * @return The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
     * 
     */
    public Output<FlowSourceFlowConfig> sourceFlowConfig() {
        return this.sourceFlowConfig;
    }
    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * A Task that Amazon AppFlow performs while transferring the data in the flow run.
     * 
     */
    @Export(name="tasks", refs={List.class,FlowTask.class}, tree="[0,1]")
    private Output<List<FlowTask>> tasks;

    /**
     * @return A Task that Amazon AppFlow performs while transferring the data in the flow run.
     * 
     */
    public Output<List<FlowTask>> tasks() {
        return this.tasks;
    }
    /**
     * A Trigger that determine how and when the flow runs.
     * 
     */
    @Export(name="triggerConfig", refs={FlowTriggerConfig.class}, tree="[0]")
    private Output<FlowTriggerConfig> triggerConfig;

    /**
     * @return A Trigger that determine how and when the flow runs.
     * 
     */
    public Output<FlowTriggerConfig> triggerConfig() {
        return this.triggerConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Flow(String name) {
        this(name, FlowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Flow(String name, FlowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Flow(String name, FlowArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appflow/flow:Flow", name, args == null ? FlowArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Flow(String name, Output<String> id, @Nullable FlowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appflow/flow:Flow", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "tagsAll"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Flow get(String name, Output<String> id, @Nullable FlowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Flow(name, id, state, options);
    }
}
