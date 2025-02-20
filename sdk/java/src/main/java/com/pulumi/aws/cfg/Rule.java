// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cfg.RuleArgs;
import com.pulumi.aws.cfg.inputs.RuleState;
import com.pulumi.aws.cfg.outputs.RuleScope;
import com.pulumi.aws.cfg.outputs.RuleSource;
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
 * Provides an AWS Config Rule.
 * 
 * &gt; **Note:** Config Rule requires an existing Configuration Recorder to be present. Use of `depends_on` is recommended (as shown below) to avoid race conditions.
 * 
 * ## Example Usage
 * ### AWS Managed Rules
 * 
 * AWS managed rules can be used by setting the source owner to `AWS` and the source identifier to the name of the managed rule. More information about AWS managed rules can be found in the [AWS Config Developer Guide](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html).
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.cfg.Recorder;
 * import com.pulumi.aws.cfg.RecorderArgs;
 * import com.pulumi.aws.cfg.Rule;
 * import com.pulumi.aws.cfg.RuleArgs;
 * import com.pulumi.aws.cfg.inputs.RuleSourceArgs;
 * import com.pulumi.aws.iam.RolePolicy;
 * import com.pulumi.aws.iam.RolePolicyArgs;
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
 *         final var assumeRole = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;config.amazonaws.com&#34;)
 *                     .build())
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .build())
 *             .build());
 * 
 *         var role = new Role(&#34;role&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(assumeRole.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var foo = new Recorder(&#34;foo&#34;, RecorderArgs.builder()        
 *             .roleArn(role.arn())
 *             .build());
 * 
 *         var rule = new Rule(&#34;rule&#34;, RuleArgs.builder()        
 *             .source(RuleSourceArgs.builder()
 *                 .owner(&#34;AWS&#34;)
 *                 .sourceIdentifier(&#34;S3_BUCKET_VERSIONING_ENABLED&#34;)
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(foo)
 *                 .build());
 * 
 *         final var policyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .actions(&#34;config:Put*&#34;)
 *                 .resources(&#34;*&#34;)
 *                 .build())
 *             .build());
 * 
 *         var rolePolicy = new RolePolicy(&#34;rolePolicy&#34;, RolePolicyArgs.builder()        
 *             .role(role.id())
 *             .policy(policyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Custom Rules
 * 
 * Custom rules can be used by setting the source owner to `CUSTOM_LAMBDA` and the source identifier to the Amazon Resource Name (ARN) of the Lambda Function. The AWS Config service must have permissions to invoke the Lambda Function, e.g., via the `aws.lambda.Permission` resource. More information about custom rules can be found in the [AWS Config Developer Guide](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html).
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cfg.Recorder;
 * import com.pulumi.aws.lambda.Function;
 * import com.pulumi.aws.lambda.Permission;
 * import com.pulumi.aws.lambda.PermissionArgs;
 * import com.pulumi.aws.cfg.Rule;
 * import com.pulumi.aws.cfg.RuleArgs;
 * import com.pulumi.aws.cfg.inputs.RuleSourceArgs;
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
 *         var exampleRecorder = new Recorder(&#34;exampleRecorder&#34;);
 * 
 *         var exampleFunction = new Function(&#34;exampleFunction&#34;);
 * 
 *         var examplePermission = new Permission(&#34;examplePermission&#34;, PermissionArgs.builder()        
 *             .action(&#34;lambda:InvokeFunction&#34;)
 *             .function(exampleFunction.arn())
 *             .principal(&#34;config.amazonaws.com&#34;)
 *             .build());
 * 
 *         var exampleRule = new Rule(&#34;exampleRule&#34;, RuleArgs.builder()        
 *             .source(RuleSourceArgs.builder()
 *                 .owner(&#34;CUSTOM_LAMBDA&#34;)
 *                 .sourceIdentifier(exampleFunction.arn())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(                
 *                     exampleRecorder,
 *                     examplePermission)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Custom Policies
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cfg.Rule;
 * import com.pulumi.aws.cfg.RuleArgs;
 * import com.pulumi.aws.cfg.inputs.RuleSourceArgs;
 * import com.pulumi.aws.cfg.inputs.RuleSourceCustomPolicyDetailsArgs;
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
 *         var example = new Rule(&#34;example&#34;, RuleArgs.builder()        
 *             .source(RuleSourceArgs.builder()
 *                 .owner(&#34;CUSTOM_POLICY&#34;)
 *                 .sourceDetails(RuleSourceSourceDetailArgs.builder()
 *                     .messageType(&#34;ConfigurationItemChangeNotification&#34;)
 *                     .build())
 *                 .customPolicyDetails(RuleSourceCustomPolicyDetailsArgs.builder()
 *                     .policyRuntime(&#34;guard-2.x.x&#34;)
 *                     .policyText(&#34;&#34;&#34;
 * 	  rule tableisactive when
 * 		  resourceType == &#34;AWS::DynamoDB::Table&#34; {
 * 		  configuration.tableStatus == [&#39;ACTIVE&#39;]
 * 	  }
 * 	  
 * 	  rule checkcompliance when
 * 		  resourceType == &#34;AWS::DynamoDB::Table&#34;
 * 		  tableisactive {
 * 			  supplementaryConfiguration.ContinuousBackupsDescription.pointInTimeRecoveryDescription.pointInTimeRecoveryStatus == &#34;ENABLED&#34;
 * 	  }
 *                     &#34;&#34;&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Config Rule using the name. For example:
 * 
 * ```sh
 *  $ pulumi import aws:cfg/rule:Rule foo example
 * ```
 * 
 */
@ResourceType(type="aws:cfg/rule:Rule")
public class Rule extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the config rule
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the config rule
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Description of the rule
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the rule
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A string in JSON format that is passed to the AWS Config rule Lambda function.
     * 
     */
    @Export(name="inputParameters", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> inputParameters;

    /**
     * @return A string in JSON format that is passed to the AWS Config rule Lambda function.
     * 
     */
    public Output<Optional<String>> inputParameters() {
        return Codegen.optional(this.inputParameters);
    }
    /**
     * The maximum frequency with which AWS Config runs evaluations for a rule.
     * 
     */
    @Export(name="maximumExecutionFrequency", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> maximumExecutionFrequency;

    /**
     * @return The maximum frequency with which AWS Config runs evaluations for a rule.
     * 
     */
    public Output<Optional<String>> maximumExecutionFrequency() {
        return Codegen.optional(this.maximumExecutionFrequency);
    }
    /**
     * The name of the rule
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the rule
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the config rule
     * 
     */
    @Export(name="ruleId", refs={String.class}, tree="[0]")
    private Output<String> ruleId;

    /**
     * @return The ID of the config rule
     * 
     */
    public Output<String> ruleId() {
        return this.ruleId;
    }
    /**
     * Scope defines which resources can trigger an evaluation for the rule. See Source Below.
     * 
     */
    @Export(name="scope", refs={RuleScope.class}, tree="[0]")
    private Output</* @Nullable */ RuleScope> scope;

    /**
     * @return Scope defines which resources can trigger an evaluation for the rule. See Source Below.
     * 
     */
    public Output<Optional<RuleScope>> scope() {
        return Codegen.optional(this.scope);
    }
    /**
     * Source specifies the rule owner, the rule identifier, and the notifications that cause the function to evaluate your AWS resources. See Scope Below.
     * 
     */
    @Export(name="source", refs={RuleSource.class}, tree="[0]")
    private Output<RuleSource> source;

    /**
     * @return Source specifies the rule owner, the rule identifier, and the notifications that cause the function to evaluate your AWS resources. See Scope Below.
     * 
     */
    public Output<RuleSource> source() {
        return this.source;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Rule(String name) {
        this(name, RuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Rule(String name, RuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Rule(String name, RuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/rule:Rule", name, args == null ? RuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Rule(String name, Output<String> id, @Nullable RuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/rule:Rule", name, state, makeResourceOptions(options, id));
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
    public static Rule get(String name, Output<String> id, @Nullable RuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Rule(name, id, state, options);
    }
}
