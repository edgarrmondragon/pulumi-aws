// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.opensearch.ServerlessCollectionArgs;
import com.pulumi.aws.opensearch.inputs.ServerlessCollectionState;
import com.pulumi.aws.opensearch.outputs.ServerlessCollectionTimeouts;
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
 * Resource for managing an AWS OpenSearch Serverless Collection.
 * 
 * &gt; **NOTE:** An `aws.opensearch.ServerlessCollection` cannot be created without having an applicable encryption security policy. Use the `depends_on` meta-argument to define this dependency.
 * 
 * &gt; **NOTE:** An `aws.opensearch.ServerlessCollection` is not accessible without configuring an applicable network security policy. Data cannot be accessed without configuring an applicable data access policy.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.opensearch.ServerlessSecurityPolicy;
 * import com.pulumi.aws.opensearch.ServerlessSecurityPolicyArgs;
 * import com.pulumi.aws.opensearch.ServerlessCollection;
 * import com.pulumi.aws.opensearch.ServerlessCollectionArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var exampleServerlessSecurityPolicy = new ServerlessSecurityPolicy(&#34;exampleServerlessSecurityPolicy&#34;, ServerlessSecurityPolicyArgs.builder()        
 *             .type(&#34;encryption&#34;)
 *             .policy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Rules&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;Resource&#34;, jsonArray(&#34;collection/example&#34;)),
 *                         jsonProperty(&#34;ResourceType&#34;, &#34;collection&#34;)
 *                     ))),
 *                     jsonProperty(&#34;AWSOwnedKey&#34;, true)
 *                 )))
 *             .build());
 * 
 *         var exampleServerlessCollection = new ServerlessCollection(&#34;exampleServerlessCollection&#34;, ServerlessCollectionArgs.Empty, CustomResourceOptions.builder()
 *             .dependsOn(exampleServerlessSecurityPolicy)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import OpenSearchServerless Collection using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:opensearch/serverlessCollection:ServerlessCollection example example
 * ```
 * 
 */
@ResourceType(type="aws:opensearch/serverlessCollection:ServerlessCollection")
public class ServerlessCollection extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the collection.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the collection.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch Serverless collection.
     * 
     */
    @Export(name="collectionEndpoint", refs={String.class}, tree="[0]")
    private Output<String> collectionEndpoint;

    /**
     * @return Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch Serverless collection.
     * 
     */
    public Output<String> collectionEndpoint() {
        return this.collectionEndpoint;
    }
    /**
     * Collection-specific endpoint used to access OpenSearch Dashboards.
     * 
     */
    @Export(name="dashboardEndpoint", refs={String.class}, tree="[0]")
    private Output<String> dashboardEndpoint;

    /**
     * @return Collection-specific endpoint used to access OpenSearch Dashboards.
     * 
     */
    public Output<String> dashboardEndpoint() {
        return this.dashboardEndpoint;
    }
    /**
     * Description of the collection.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the collection.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ARN of the Amazon Web Services KMS key used to encrypt the collection.
     * 
     */
    @Export(name="kmsKeyArn", refs={String.class}, tree="[0]")
    private Output<String> kmsKeyArn;

    /**
     * @return The ARN of the Amazon Web Services KMS key used to encrypt the collection.
     * 
     */
    public Output<String> kmsKeyArn() {
        return this.kmsKeyArn;
    }
    /**
     * Name of the collection.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the collection.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of tags to assign to the collection. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the collection. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    @Export(name="timeouts", refs={ServerlessCollectionTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ ServerlessCollectionTimeouts> timeouts;

    public Output<Optional<ServerlessCollectionTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }
    /**
     * Type of collection. One of `SEARCH`, `TIMESERIES`, or `VECTORSEARCH`. Defaults to `TIMESERIES`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of collection. One of `SEARCH`, `TIMESERIES`, or `VECTORSEARCH`. Defaults to `TIMESERIES`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerlessCollection(String name) {
        this(name, ServerlessCollectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerlessCollection(String name, @Nullable ServerlessCollectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerlessCollection(String name, @Nullable ServerlessCollectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opensearch/serverlessCollection:ServerlessCollection", name, args == null ? ServerlessCollectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerlessCollection(String name, Output<String> id, @Nullable ServerlessCollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opensearch/serverlessCollection:ServerlessCollection", name, state, makeResourceOptions(options, id));
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
    public static ServerlessCollection get(String name, Output<String> id, @Nullable ServerlessCollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerlessCollection(name, id, state, options);
    }
}
