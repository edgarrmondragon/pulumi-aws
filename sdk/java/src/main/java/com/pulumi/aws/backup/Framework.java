// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.backup.FrameworkArgs;
import com.pulumi.aws.backup.inputs.FrameworkState;
import com.pulumi.aws.backup.outputs.FrameworkControl;
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
 * Provides an AWS Backup Framework resource.
 * 
 * &gt; **Note:** For the Deployment Status of the Framework to be successful, please turn on resource tracking to enable AWS Config recording to track configuration changes of your backup resources. This can be done from the AWS Console.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.backup.Framework;
 * import com.pulumi.aws.backup.FrameworkArgs;
 * import com.pulumi.aws.backup.inputs.FrameworkControlArgs;
 * import com.pulumi.aws.backup.inputs.FrameworkControlScopeArgs;
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
 *         var example = new Framework(&#34;example&#34;, FrameworkArgs.builder()        
 *             .controls(            
 *                 FrameworkControlArgs.builder()
 *                     .inputParameters(FrameworkControlInputParameterArgs.builder()
 *                         .name(&#34;requiredRetentionDays&#34;)
 *                         .value(&#34;35&#34;)
 *                         .build())
 *                     .name(&#34;BACKUP_RECOVERY_POINT_MINIMUM_RETENTION_CHECK&#34;)
 *                     .build(),
 *                 FrameworkControlArgs.builder()
 *                     .inputParameters(                    
 *                         FrameworkControlInputParameterArgs.builder()
 *                             .name(&#34;requiredFrequencyUnit&#34;)
 *                             .value(&#34;hours&#34;)
 *                             .build(),
 *                         FrameworkControlInputParameterArgs.builder()
 *                             .name(&#34;requiredRetentionDays&#34;)
 *                             .value(&#34;35&#34;)
 *                             .build(),
 *                         FrameworkControlInputParameterArgs.builder()
 *                             .name(&#34;requiredFrequencyValue&#34;)
 *                             .value(&#34;1&#34;)
 *                             .build())
 *                     .name(&#34;BACKUP_PLAN_MIN_FREQUENCY_AND_MIN_RETENTION_CHECK&#34;)
 *                     .build(),
 *                 FrameworkControlArgs.builder()
 *                     .name(&#34;BACKUP_RECOVERY_POINT_ENCRYPTED&#34;)
 *                     .build(),
 *                 FrameworkControlArgs.builder()
 *                     .name(&#34;BACKUP_RESOURCES_PROTECTED_BY_BACKUP_PLAN&#34;)
 *                     .scope(FrameworkControlScopeArgs.builder()
 *                         .complianceResourceTypes(&#34;EBS&#34;)
 *                         .build())
 *                     .build(),
 *                 FrameworkControlArgs.builder()
 *                     .name(&#34;BACKUP_RECOVERY_POINT_MANUAL_DELETION_DISABLED&#34;)
 *                     .build(),
 *                 FrameworkControlArgs.builder()
 *                     .inputParameters(                    
 *                         FrameworkControlInputParameterArgs.builder()
 *                             .name(&#34;maxRetentionDays&#34;)
 *                             .value(&#34;100&#34;)
 *                             .build(),
 *                         FrameworkControlInputParameterArgs.builder()
 *                             .name(&#34;minRetentionDays&#34;)
 *                             .value(&#34;1&#34;)
 *                             .build())
 *                     .name(&#34;BACKUP_RESOURCES_PROTECTED_BY_BACKUP_VAULT_LOCK&#34;)
 *                     .scope(FrameworkControlScopeArgs.builder()
 *                         .complianceResourceTypes(&#34;EBS&#34;)
 *                         .build())
 *                     .build(),
 *                 FrameworkControlArgs.builder()
 *                     .inputParameters(                    
 *                         FrameworkControlInputParameterArgs.builder()
 *                             .name(&#34;recoveryPointAgeUnit&#34;)
 *                             .value(&#34;days&#34;)
 *                             .build(),
 *                         FrameworkControlInputParameterArgs.builder()
 *                             .name(&#34;recoveryPointAgeValue&#34;)
 *                             .value(&#34;1&#34;)
 *                             .build())
 *                     .name(&#34;BACKUP_LAST_RECOVERY_POINT_CREATED&#34;)
 *                     .scope(FrameworkControlScopeArgs.builder()
 *                         .complianceResourceTypes(&#34;EBS&#34;)
 *                         .build())
 *                     .build())
 *             .description(&#34;this is an example framework&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;Example Framework&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Backup Framework using the `id` which corresponds to the name of the Backup Framework. For example:
 * 
 * ```sh
 *  $ pulumi import aws:backup/framework:Framework test &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="aws:backup/framework:Framework")
public class Framework extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the backup framework.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the backup framework.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * One or more control blocks that make up the framework. Each control in the list has a name, input parameters, and scope. Detailed below.
     * 
     */
    @Export(name="controls", refs={List.class,FrameworkControl.class}, tree="[0,1]")
    private Output<List<FrameworkControl>> controls;

    /**
     * @return One or more control blocks that make up the framework. Each control in the list has a name, input parameters, and scope. Detailed below.
     * 
     */
    public Output<List<FrameworkControl>> controls() {
        return this.controls;
    }
    /**
     * The date and time that a framework is created, in Unix format and Coordinated Universal Time (UTC).
     * 
     */
    @Export(name="creationTime", refs={String.class}, tree="[0]")
    private Output<String> creationTime;

    /**
     * @return The date and time that a framework is created, in Unix format and Coordinated Universal Time (UTC).
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * The deployment status of a framework. The statuses are: `CREATE_IN_PROGRESS` | `UPDATE_IN_PROGRESS` | `DELETE_IN_PROGRESS` | `COMPLETED` | `FAILED`.
     * 
     */
    @Export(name="deploymentStatus", refs={String.class}, tree="[0]")
    private Output<String> deploymentStatus;

    /**
     * @return The deployment status of a framework. The statuses are: `CREATE_IN_PROGRESS` | `UPDATE_IN_PROGRESS` | `DELETE_IN_PROGRESS` | `COMPLETED` | `FAILED`.
     * 
     */
    public Output<String> deploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * The description of the framework with a maximum of 1,024 characters
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the framework with a maximum of 1,024 characters
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The unique name of the framework. The name must be between 1 and 256 characters, starting with a letter, and consisting of letters, numbers, and underscores.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The unique name of the framework. The name must be between 1 and 256 characters, starting with a letter, and consisting of letters, numbers, and underscores.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A framework consists of one or more controls. Each control governs a resource, such as backup plans, backup selections, backup vaults, or recovery points. You can also turn AWS Config recording on or off for each resource. For more information refer to the [AWS documentation for Framework Status](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_DescribeFramework.html#Backup-DescribeFramework-response-FrameworkStatus)
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return A framework consists of one or more controls. Each control governs a resource, such as backup plans, backup selections, backup vaults, or recovery points. You can also turn AWS Config recording on or off for each resource. For more information refer to the [AWS documentation for Framework Status](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_DescribeFramework.html#Backup-DescribeFramework-response-FrameworkStatus)
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Metadata that you can assign to help organize the frameworks you create. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Metadata that you can assign to help organize the frameworks you create. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Framework(String name) {
        this(name, FrameworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Framework(String name, FrameworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Framework(String name, FrameworkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/framework:Framework", name, args == null ? FrameworkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Framework(String name, Output<String> id, @Nullable FrameworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/framework:Framework", name, state, makeResourceOptions(options, id));
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
    public static Framework get(String name, Output<String> id, @Nullable FrameworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Framework(name, id, state, options);
    }
}
