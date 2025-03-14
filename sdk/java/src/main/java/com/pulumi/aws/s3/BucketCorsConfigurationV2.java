// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.s3.BucketCorsConfigurationV2Args;
import com.pulumi.aws.s3.inputs.BucketCorsConfigurationV2State;
import com.pulumi.aws.s3.outputs.BucketCorsConfigurationV2CorsRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an S3 bucket CORS configuration resource. For more information about CORS, go to [Enabling Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/userguide/cors.html) in the Amazon S3 User Guide.
 * 
 * &gt; **NOTE:** S3 Buckets only support a single CORS configuration. Declaring multiple `aws.s3.BucketCorsConfigurationV2` resources to the same S3 Bucket will cause a perpetual difference in configuration.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketCorsConfigurationV2;
 * import com.pulumi.aws.s3.BucketCorsConfigurationV2Args;
 * import com.pulumi.aws.s3.inputs.BucketCorsConfigurationV2CorsRuleArgs;
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
 *         var exampleBucketV2 = new BucketV2(&#34;exampleBucketV2&#34;);
 * 
 *         var exampleBucketCorsConfigurationV2 = new BucketCorsConfigurationV2(&#34;exampleBucketCorsConfigurationV2&#34;, BucketCorsConfigurationV2Args.builder()        
 *             .bucket(exampleBucketV2.id())
 *             .corsRules(            
 *                 BucketCorsConfigurationV2CorsRuleArgs.builder()
 *                     .allowedHeaders(&#34;*&#34;)
 *                     .allowedMethods(                    
 *                         &#34;PUT&#34;,
 *                         &#34;POST&#34;)
 *                     .allowedOrigins(&#34;https://s3-website-test.domain.example&#34;)
 *                     .exposeHeaders(&#34;ETag&#34;)
 *                     .maxAgeSeconds(3000)
 *                     .build(),
 *                 BucketCorsConfigurationV2CorsRuleArgs.builder()
 *                     .allowedMethods(&#34;GET&#34;)
 *                     .allowedOrigins(&#34;*&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * If the owner (account ID) of the source bucket is the same account used to configure the AWS Provider, import using the `bucket`:
 * 
 * If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):
 * 
 * __Using `pulumi import` to import__ S3 bucket CORS configuration using the `bucket` or using the `bucket` and `expected_bucket_owner` separated by a comma (`,`). For example:
 * 
 * If the owner (account ID) of the source bucket is the same account used to configure the AWS Provider, import using the `bucket`:
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketCorsConfigurationV2:BucketCorsConfigurationV2 example bucket-name
 * ```
 *  If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketCorsConfigurationV2:BucketCorsConfigurationV2 example bucket-name,123456789012
 * ```
 * 
 */
@ResourceType(type="aws:s3/bucketCorsConfigurationV2:BucketCorsConfigurationV2")
public class BucketCorsConfigurationV2 extends com.pulumi.resources.CustomResource {
    /**
     * Name of the bucket.
     * 
     */
    @Export(name="bucket", refs={String.class}, tree="[0]")
    private Output<String> bucket;

    /**
     * @return Name of the bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
     * 
     */
    @Export(name="corsRules", refs={List.class,BucketCorsConfigurationV2CorsRule.class}, tree="[0,1]")
    private Output<List<BucketCorsConfigurationV2CorsRule>> corsRules;

    /**
     * @return Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
     * 
     */
    public Output<List<BucketCorsConfigurationV2CorsRule>> corsRules() {
        return this.corsRules;
    }
    /**
     * Account ID of the expected bucket owner.
     * 
     */
    @Export(name="expectedBucketOwner", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expectedBucketOwner;

    /**
     * @return Account ID of the expected bucket owner.
     * 
     */
    public Output<Optional<String>> expectedBucketOwner() {
        return Codegen.optional(this.expectedBucketOwner);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketCorsConfigurationV2(String name) {
        this(name, BucketCorsConfigurationV2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketCorsConfigurationV2(String name, BucketCorsConfigurationV2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketCorsConfigurationV2(String name, BucketCorsConfigurationV2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketCorsConfigurationV2:BucketCorsConfigurationV2", name, args == null ? BucketCorsConfigurationV2Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketCorsConfigurationV2(String name, Output<String> id, @Nullable BucketCorsConfigurationV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketCorsConfigurationV2:BucketCorsConfigurationV2", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static BucketCorsConfigurationV2 get(String name, Output<String> id, @Nullable BucketCorsConfigurationV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketCorsConfigurationV2(name, id, state, options);
    }
}
