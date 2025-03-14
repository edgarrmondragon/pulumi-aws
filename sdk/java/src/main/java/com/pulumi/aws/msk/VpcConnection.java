// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.msk.VpcConnectionArgs;
import com.pulumi.aws.msk.inputs.VpcConnectionState;
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
 * Resource for managing an AWS Managed Streaming for Kafka VPC Connection.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.msk.VpcConnection;
 * import com.pulumi.aws.msk.VpcConnectionArgs;
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
 *         var test = new VpcConnection(&#34;test&#34;, VpcConnectionArgs.builder()        
 *             .authentication(&#34;SASL_IAM&#34;)
 *             .targetClusterArn(&#34;aws_msk_cluster.arn&#34;)
 *             .vpcId(aws_vpc.test().id())
 *             .clientSubnets(aws_subnet.test().stream().map(element -&gt; element.id()).collect(toList()))
 *             .securityGroups(aws_security_group.test().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * In TODO v1.5.0 and later, use an `import` block to import MSK configurations using the configuration ARN. For exampleterraform import {
 * 
 *  to = aws_msk_vpc_connection.example
 * 
 *  id = &#34;arn:aws:kafka:eu-west-2:123456789012:vpc-connection/123456789012/example/38173259-79cd-4ee8-87f3-682ea6023f48-2&#34; } Using `TODO import`, import MSK configurations using the configuration ARN. For exampleconsole % TODO import aws_msk_vpc_connection.example arn:aws:kafka:eu-west-2:123456789012:vpc-connection/123456789012/example/38173259-79cd-4ee8-87f3-682ea6023f48-2
 * 
 */
@ResourceType(type="aws:msk/vpcConnection:VpcConnection")
public class VpcConnection extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the VPC connection.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the VPC connection.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The authentication type for the client VPC connection. Specify one of these auth type strings: SASL_IAM, SASL_SCRAM, or TLS.
     * 
     */
    @Export(name="authentication", refs={String.class}, tree="[0]")
    private Output<String> authentication;

    /**
     * @return The authentication type for the client VPC connection. Specify one of these auth type strings: SASL_IAM, SASL_SCRAM, or TLS.
     * 
     */
    public Output<String> authentication() {
        return this.authentication;
    }
    /**
     * The list of subnets in the client VPC to connect to.
     * 
     */
    @Export(name="clientSubnets", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> clientSubnets;

    /**
     * @return The list of subnets in the client VPC to connect to.
     * 
     */
    public Output<List<String>> clientSubnets() {
        return this.clientSubnets;
    }
    /**
     * The security groups to attach to the ENIs for the broker nodes.
     * 
     */
    @Export(name="securityGroups", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> securityGroups;

    /**
     * @return The security groups to attach to the ENIs for the broker nodes.
     * 
     */
    public Output<List<String>> securityGroups() {
        return this.securityGroups;
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
     * The Amazon Resource Name (ARN) of the cluster.
     * 
     */
    @Export(name="targetClusterArn", refs={String.class}, tree="[0]")
    private Output<String> targetClusterArn;

    /**
     * @return The Amazon Resource Name (ARN) of the cluster.
     * 
     */
    public Output<String> targetClusterArn() {
        return this.targetClusterArn;
    }
    /**
     * The VPC ID of the remote client.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The VPC ID of the remote client.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcConnection(String name) {
        this(name, VpcConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcConnection(String name, VpcConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcConnection(String name, VpcConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:msk/vpcConnection:VpcConnection", name, args == null ? VpcConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcConnection(String name, Output<String> id, @Nullable VpcConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:msk/vpcConnection:VpcConnection", name, state, makeResourceOptions(options, id));
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
    public static VpcConnection get(String name, Output<String> id, @Nullable VpcConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcConnection(name, id, state, options);
    }
}
