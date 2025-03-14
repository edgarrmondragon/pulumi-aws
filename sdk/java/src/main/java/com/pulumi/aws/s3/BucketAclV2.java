// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.s3.BucketAclV2Args;
import com.pulumi.aws.s3.inputs.BucketAclV2State;
import com.pulumi.aws.s3.outputs.BucketAclV2AccessControlPolicy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an S3 bucket ACL resource.
 * 
 * &gt; **Note:** destroy does not delete the S3 Bucket ACL but does remove the resource from state.
 * 
 * ## Example Usage
 * ### With `private` ACL
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketOwnershipControls;
 * import com.pulumi.aws.s3.BucketOwnershipControlsArgs;
 * import com.pulumi.aws.s3.inputs.BucketOwnershipControlsRuleArgs;
 * import com.pulumi.aws.s3.BucketAclV2;
 * import com.pulumi.aws.s3.BucketAclV2Args;
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
 *         var exampleBucketV2 = new BucketV2(&#34;exampleBucketV2&#34;);
 * 
 *         var exampleBucketOwnershipControls = new BucketOwnershipControls(&#34;exampleBucketOwnershipControls&#34;, BucketOwnershipControlsArgs.builder()        
 *             .bucket(exampleBucketV2.id())
 *             .rule(BucketOwnershipControlsRuleArgs.builder()
 *                 .objectOwnership(&#34;BucketOwnerPreferred&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleBucketAclV2 = new BucketAclV2(&#34;exampleBucketAclV2&#34;, BucketAclV2Args.builder()        
 *             .bucket(exampleBucketV2.id())
 *             .acl(&#34;private&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleBucketOwnershipControls)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### With `public-read` ACL
 * 
 * &gt; This example explicitly disables the default S3 bucket security settings. This
 * should be done with caution, as all bucket objects become publicly exposed.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketOwnershipControls;
 * import com.pulumi.aws.s3.BucketOwnershipControlsArgs;
 * import com.pulumi.aws.s3.inputs.BucketOwnershipControlsRuleArgs;
 * import com.pulumi.aws.s3.BucketPublicAccessBlock;
 * import com.pulumi.aws.s3.BucketPublicAccessBlockArgs;
 * import com.pulumi.aws.s3.BucketAclV2;
 * import com.pulumi.aws.s3.BucketAclV2Args;
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
 *         var exampleBucketV2 = new BucketV2(&#34;exampleBucketV2&#34;);
 * 
 *         var exampleBucketOwnershipControls = new BucketOwnershipControls(&#34;exampleBucketOwnershipControls&#34;, BucketOwnershipControlsArgs.builder()        
 *             .bucket(exampleBucketV2.id())
 *             .rule(BucketOwnershipControlsRuleArgs.builder()
 *                 .objectOwnership(&#34;BucketOwnerPreferred&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleBucketPublicAccessBlock = new BucketPublicAccessBlock(&#34;exampleBucketPublicAccessBlock&#34;, BucketPublicAccessBlockArgs.builder()        
 *             .bucket(exampleBucketV2.id())
 *             .blockPublicAcls(false)
 *             .blockPublicPolicy(false)
 *             .ignorePublicAcls(false)
 *             .restrictPublicBuckets(false)
 *             .build());
 * 
 *         var exampleBucketAclV2 = new BucketAclV2(&#34;exampleBucketAclV2&#34;, BucketAclV2Args.builder()        
 *             .bucket(exampleBucketV2.id())
 *             .acl(&#34;public-read&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(                
 *                     exampleBucketOwnershipControls,
 *                     exampleBucketPublicAccessBlock)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### With Grants
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.S3Functions;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketOwnershipControls;
 * import com.pulumi.aws.s3.BucketOwnershipControlsArgs;
 * import com.pulumi.aws.s3.inputs.BucketOwnershipControlsRuleArgs;
 * import com.pulumi.aws.s3.BucketAclV2;
 * import com.pulumi.aws.s3.BucketAclV2Args;
 * import com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyArgs;
 * import com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyOwnerArgs;
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
 *         final var current = S3Functions.getCanonicalUserId();
 * 
 *         var exampleBucketV2 = new BucketV2(&#34;exampleBucketV2&#34;);
 * 
 *         var exampleBucketOwnershipControls = new BucketOwnershipControls(&#34;exampleBucketOwnershipControls&#34;, BucketOwnershipControlsArgs.builder()        
 *             .bucket(exampleBucketV2.id())
 *             .rule(BucketOwnershipControlsRuleArgs.builder()
 *                 .objectOwnership(&#34;BucketOwnerPreferred&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleBucketAclV2 = new BucketAclV2(&#34;exampleBucketAclV2&#34;, BucketAclV2Args.builder()        
 *             .bucket(exampleBucketV2.id())
 *             .accessControlPolicy(BucketAclV2AccessControlPolicyArgs.builder()
 *                 .grants(                
 *                     BucketAclV2AccessControlPolicyGrantArgs.builder()
 *                         .grantee(BucketAclV2AccessControlPolicyGrantGranteeArgs.builder()
 *                             .id(current.applyValue(getCanonicalUserIdResult -&gt; getCanonicalUserIdResult.id()))
 *                             .type(&#34;CanonicalUser&#34;)
 *                             .build())
 *                         .permission(&#34;READ&#34;)
 *                         .build(),
 *                     BucketAclV2AccessControlPolicyGrantArgs.builder()
 *                         .grantee(BucketAclV2AccessControlPolicyGrantGranteeArgs.builder()
 *                             .type(&#34;Group&#34;)
 *                             .uri(&#34;http://acs.amazonaws.com/groups/s3/LogDelivery&#34;)
 *                             .build())
 *                         .permission(&#34;READ_ACP&#34;)
 *                         .build())
 *                 .owner(BucketAclV2AccessControlPolicyOwnerArgs.builder()
 *                     .id(current.applyValue(getCanonicalUserIdResult -&gt; getCanonicalUserIdResult.id()))
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleBucketOwnershipControls)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * If the owner (account ID) of the source bucket is the _same_ account used to configure the AWS Provider, and the source bucket is __not configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), import using the `bucket`:
 * 
 * If the owner (account ID) of the source bucket is the _same_ account used to configure the AWS Provider, and the source bucket is __configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), import using the `bucket` and `acl` separated by a comma (`,`):
 * 
 * If the owner (account ID) of the source bucket _differs_ from the account used to configure the AWS Provider, and the source bucket is __not configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), imported using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):
 * 
 * If the owner (account ID) of the source bucket _differs_ from the account used to configure the AWS Provider, and the source bucket is __configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), imported using the `bucket`, `expected_bucket_owner`, and `acl` separated by commas (`,`):
 * 
 * __Using `pulumi import` to import__ using `bucket`, `expected_bucket_owner`, and/or `acl`, depending on your situation. For example:
 * 
 * If the owner (account ID) of the source bucket is the _same_ account used to configure the AWS Provider, and the source bucket is __not configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), import using the `bucket`:
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name
 * ```
 *  If the owner (account ID) of the source bucket is the _same_ account used to configure the AWS Provider, and the source bucket is __configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), import using the `bucket` and `acl` separated by a comma (`,`):
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name,private
 * ```
 *  If the owner (account ID) of the source bucket _differs_ from the account used to configure the AWS Provider, and the source bucket is __not configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), imported using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name,123456789012
 * ```
 *  If the owner (account ID) of the source bucket _differs_ from the account used to configure the AWS Provider, and the source bucket is __configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), imported using the `bucket`, `expected_bucket_owner`, and `acl` separated by commas (`,`):
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name,123456789012,private
 * ```
 * 
 */
@ResourceType(type="aws:s3/bucketAclV2:BucketAclV2")
public class BucketAclV2 extends com.pulumi.resources.CustomResource {
    /**
     * Configuration block that sets the ACL permissions for an object per grantee. See below.
     * 
     */
    @Export(name="accessControlPolicy", refs={BucketAclV2AccessControlPolicy.class}, tree="[0]")
    private Output<BucketAclV2AccessControlPolicy> accessControlPolicy;

    /**
     * @return Configuration block that sets the ACL permissions for an object per grantee. See below.
     * 
     */
    public Output<BucketAclV2AccessControlPolicy> accessControlPolicy() {
        return this.accessControlPolicy;
    }
    /**
     * Canned ACL to apply to the bucket.
     * 
     */
    @Export(name="acl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> acl;

    /**
     * @return Canned ACL to apply to the bucket.
     * 
     */
    public Output<Optional<String>> acl() {
        return Codegen.optional(this.acl);
    }
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
    public BucketAclV2(String name) {
        this(name, BucketAclV2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketAclV2(String name, BucketAclV2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketAclV2(String name, BucketAclV2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketAclV2:BucketAclV2", name, args == null ? BucketAclV2Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketAclV2(String name, Output<String> id, @Nullable BucketAclV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketAclV2:BucketAclV2", name, state, makeResourceOptions(options, id));
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
    public static BucketAclV2 get(String name, Output<String> id, @Nullable BucketAclV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketAclV2(name, id, state, options);
    }
}
