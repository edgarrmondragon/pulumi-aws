// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iam.GroupPolicyArgs;
import com.pulumi.aws.iam.inputs.GroupPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an IAM policy attached to a group.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.Group;
 * import com.pulumi.aws.iam.GroupArgs;
 * import com.pulumi.aws.iam.GroupPolicy;
 * import com.pulumi.aws.iam.GroupPolicyArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var myDevelopers = new Group(&#34;myDevelopers&#34;, GroupArgs.builder()        
 *             .path(&#34;/users/&#34;)
 *             .build());
 * 
 *         var myDeveloperPolicy = new GroupPolicy(&#34;myDeveloperPolicy&#34;, GroupPolicyArgs.builder()        
 *             .group(myDevelopers.name())
 *             .policy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Version&#34;, &#34;2012-10-17&#34;),
 *                     jsonProperty(&#34;Statement&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;Action&#34;, jsonArray(&#34;ec2:Describe*&#34;)),
 *                         jsonProperty(&#34;Effect&#34;, &#34;Allow&#34;),
 *                         jsonProperty(&#34;Resource&#34;, &#34;*&#34;)
 *                     )))
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import IAM Group Policies using the `group_name:group_policy_name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:iam/groupPolicy:GroupPolicy mypolicy group_of_mypolicy_name:mypolicy_name
 * ```
 * 
 */
@ResourceType(type="aws:iam/groupPolicy:GroupPolicy")
public class GroupPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The IAM group to attach to the policy.
     * 
     */
    @Export(name="group", refs={String.class}, tree="[0]")
    private Output<String> group;

    /**
     * @return The IAM group to attach to the policy.
     * 
     */
    public Output<String> group() {
        return this.group;
    }
    /**
     * The name of the policy. If omitted, the provider will
     * assign a random, unique name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the policy. If omitted, the provider will
     * assign a random, unique name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    public Output<Optional<String>> namePrefix() {
        return Codegen.optional(this.namePrefix);
    }
    /**
     * The policy document. This is a JSON formatted string.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return The policy document. This is a JSON formatted string.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GroupPolicy(String name) {
        this(name, GroupPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GroupPolicy(String name, GroupPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GroupPolicy(String name, GroupPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/groupPolicy:GroupPolicy", name, args == null ? GroupPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GroupPolicy(String name, Output<String> id, @Nullable GroupPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/groupPolicy:GroupPolicy", name, state, makeResourceOptions(options, id));
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
    public static GroupPolicy get(String name, Output<String> id, @Nullable GroupPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GroupPolicy(name, id, state, options);
    }
}
