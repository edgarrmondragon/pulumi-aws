// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudwatch.LogDestinationArgs;
import com.pulumi.aws.cloudwatch.inputs.LogDestinationState;
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
 * Provides a CloudWatch Logs destination resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudwatch.LogDestination;
 * import com.pulumi.aws.cloudwatch.LogDestinationArgs;
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
 *         var testDestination = new LogDestination(&#34;testDestination&#34;, LogDestinationArgs.builder()        
 *             .roleArn(aws_iam_role.iam_for_cloudwatch().arn())
 *             .targetArn(aws_kinesis_stream.kinesis_for_cloudwatch().arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import CloudWatch Logs destinations using the `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/logDestination:LogDestination test_destination test_destination
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/logDestination:LogDestination")
public class LogDestination extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) specifying the log destination.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) specifying the log destination.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A name for the log destination.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A name for the log destination.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to put data into the target.
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output<String> roleArn;

    /**
     * @return The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to put data into the target.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The ARN of the target Amazon Kinesis stream resource for the destination.
     * 
     */
    @Export(name="targetArn", refs={String.class}, tree="[0]")
    private Output<String> targetArn;

    /**
     * @return The ARN of the target Amazon Kinesis stream resource for the destination.
     * 
     */
    public Output<String> targetArn() {
        return this.targetArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogDestination(String name) {
        this(name, LogDestinationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogDestination(String name, LogDestinationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogDestination(String name, LogDestinationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logDestination:LogDestination", name, args == null ? LogDestinationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogDestination(String name, Output<String> id, @Nullable LogDestinationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logDestination:LogDestination", name, state, makeResourceOptions(options, id));
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
    public static LogDestination get(String name, Output<String> id, @Nullable LogDestinationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogDestination(name, id, state, options);
    }
}
