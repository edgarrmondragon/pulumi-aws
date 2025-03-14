// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amplify;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.amplify.AppArgs;
import com.pulumi.aws.amplify.inputs.AppState;
import com.pulumi.aws.amplify.outputs.AppAutoBranchCreationConfig;
import com.pulumi.aws.amplify.outputs.AppCustomRule;
import com.pulumi.aws.amplify.outputs.AppProductionBranch;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Amplify App resource, a fullstack serverless app hosted on the [AWS Amplify Console](https://docs.aws.amazon.com/amplify/latest/userguide/welcome.html).
 * 
 * &gt; **Note:** When you create/update an Amplify App from the provider, you may end up with the error &#34;BadRequestException: You should at least provide one valid token&#34; because of authentication issues. See the section &#34;Repository with Tokens&#34; below.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.amplify.App;
 * import com.pulumi.aws.amplify.AppArgs;
 * import com.pulumi.aws.amplify.inputs.AppCustomRuleArgs;
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
 *         var example = new App(&#34;example&#34;, AppArgs.builder()        
 *             .buildSpec(&#34;&#34;&#34;
 *   version: 0.1
 *   frontend:
 *     phases:
 *       preBuild:
 *         commands:
 *           - yarn install
 *       build:
 *         commands:
 *           - yarn run build
 *     artifacts:
 *       baseDirectory: build
 *       files:
 *         - &#39;**{@literal /}*&#39;
 *     cache:
 *       paths:
 *         - node_modules/**{@literal /}*
 * 
 *             &#34;&#34;&#34;)
 *             .customRules(AppCustomRuleArgs.builder()
 *                 .source(&#34;/&lt;*&gt;&#34;)
 *                 .status(&#34;404&#34;)
 *                 .target(&#34;/index.html&#34;)
 *                 .build())
 *             .environmentVariables(Map.of(&#34;ENV&#34;, &#34;test&#34;))
 *             .repository(&#34;https://github.com/example/app&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Repository with Tokens
 * 
 * If you create a new Amplify App with the `repository` argument, you also need to set `oauth_token` or `access_token` for authentication. For GitHub, get a [personal access token](https://help.github.com/en/github/authenticating-to-github/creating-a-personal-access-token-for-the-command-line) and set `access_token` as follows:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.amplify.App;
 * import com.pulumi.aws.amplify.AppArgs;
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
 *         var example = new App(&#34;example&#34;, AppArgs.builder()        
 *             .accessToken(&#34;...&#34;)
 *             .repository(&#34;https://github.com/example/app&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * You can omit `access_token` if you import an existing Amplify App created by the Amplify Console (using OAuth for authentication).
 * ### Auto Branch Creation
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.amplify.App;
 * import com.pulumi.aws.amplify.AppArgs;
 * import com.pulumi.aws.amplify.inputs.AppAutoBranchCreationConfigArgs;
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
 *         var example = new App(&#34;example&#34;, AppArgs.builder()        
 *             .autoBranchCreationConfig(AppAutoBranchCreationConfigArgs.builder()
 *                 .enableAutoBuild(true)
 *                 .build())
 *             .autoBranchCreationPatterns(            
 *                 &#34;*&#34;,
 *                 &#34;*{@literal /}**&#34;)
 *             .enableAutoBranchCreation(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Rewrites and Redirects
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.amplify.App;
 * import com.pulumi.aws.amplify.AppArgs;
 * import com.pulumi.aws.amplify.inputs.AppCustomRuleArgs;
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
 *         var example = new App(&#34;example&#34;, AppArgs.builder()        
 *             .customRules(            
 *                 AppCustomRuleArgs.builder()
 *                     .source(&#34;/api/&lt;*&gt;&#34;)
 *                     .status(&#34;200&#34;)
 *                     .target(&#34;https://api.example.com/api/&lt;*&gt;&#34;)
 *                     .build(),
 *                 AppCustomRuleArgs.builder()
 *                     .source(&#34;&lt;/^[^.]+$|\\.(?!(css|gif|ico|jpg|js|png|txt|svg|woff|ttf|map|json)$)([^.]+$)/&gt;&#34;)
 *                     .status(&#34;200&#34;)
 *                     .target(&#34;/index.html&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Custom Image
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.amplify.App;
 * import com.pulumi.aws.amplify.AppArgs;
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
 *         var example = new App(&#34;example&#34;, AppArgs.builder()        
 *             .environmentVariables(Map.of(&#34;_CUSTOM_IMAGE&#34;, &#34;node:16&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Amplify App using Amplify App ID (appId). For example:
 * 
 * ```sh
 *  $ pulumi import aws:amplify/app:App example d2ypk4k47z8u6
 * ```
 *  App ID can be obtained from App ARN (e.g., `arn:aws:amplify:us-east-1:12345678:apps/d2ypk4k47z8u6`).
 * 
 */
@ResourceType(type="aws:amplify/app:App")
public class App extends com.pulumi.resources.CustomResource {
    /**
     * Personal access token for a third-party source control system for an Amplify app. The personal access token is used to create a webhook and a read-only deploy key. The token is not stored.
     * 
     */
    @Export(name="accessToken", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accessToken;

    /**
     * @return Personal access token for a third-party source control system for an Amplify app. The personal access token is used to create a webhook and a read-only deploy key. The token is not stored.
     * 
     */
    public Output<Optional<String>> accessToken() {
        return Codegen.optional(this.accessToken);
    }
    /**
     * ARN of the Amplify app.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the Amplify app.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Automated branch creation configuration for an Amplify app. An `auto_branch_creation_config` block is documented below.
     * 
     */
    @Export(name="autoBranchCreationConfig", refs={AppAutoBranchCreationConfig.class}, tree="[0]")
    private Output<AppAutoBranchCreationConfig> autoBranchCreationConfig;

    /**
     * @return Automated branch creation configuration for an Amplify app. An `auto_branch_creation_config` block is documented below.
     * 
     */
    public Output<AppAutoBranchCreationConfig> autoBranchCreationConfig() {
        return this.autoBranchCreationConfig;
    }
    /**
     * Automated branch creation glob patterns for an Amplify app.
     * 
     */
    @Export(name="autoBranchCreationPatterns", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> autoBranchCreationPatterns;

    /**
     * @return Automated branch creation glob patterns for an Amplify app.
     * 
     */
    public Output<Optional<List<String>>> autoBranchCreationPatterns() {
        return Codegen.optional(this.autoBranchCreationPatterns);
    }
    /**
     * Credentials for basic authorization for an Amplify app.
     * 
     */
    @Export(name="basicAuthCredentials", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> basicAuthCredentials;

    /**
     * @return Credentials for basic authorization for an Amplify app.
     * 
     */
    public Output<Optional<String>> basicAuthCredentials() {
        return Codegen.optional(this.basicAuthCredentials);
    }
    /**
     * The [build specification](https://docs.aws.amazon.com/amplify/latest/userguide/build-settings.html) (build spec) for an Amplify app.
     * 
     */
    @Export(name="buildSpec", refs={String.class}, tree="[0]")
    private Output<String> buildSpec;

    /**
     * @return The [build specification](https://docs.aws.amazon.com/amplify/latest/userguide/build-settings.html) (build spec) for an Amplify app.
     * 
     */
    public Output<String> buildSpec() {
        return this.buildSpec;
    }
    /**
     * Custom rewrite and redirect rules for an Amplify app. A `custom_rule` block is documented below.
     * 
     */
    @Export(name="customRules", refs={List.class,AppCustomRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AppCustomRule>> customRules;

    /**
     * @return Custom rewrite and redirect rules for an Amplify app. A `custom_rule` block is documented below.
     * 
     */
    public Output<Optional<List<AppCustomRule>>> customRules() {
        return Codegen.optional(this.customRules);
    }
    /**
     * Default domain for the Amplify app.
     * 
     */
    @Export(name="defaultDomain", refs={String.class}, tree="[0]")
    private Output<String> defaultDomain;

    /**
     * @return Default domain for the Amplify app.
     * 
     */
    public Output<String> defaultDomain() {
        return this.defaultDomain;
    }
    /**
     * Description for an Amplify app.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description for an Amplify app.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Enables automated branch creation for an Amplify app.
     * 
     */
    @Export(name="enableAutoBranchCreation", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableAutoBranchCreation;

    /**
     * @return Enables automated branch creation for an Amplify app.
     * 
     */
    public Output<Optional<Boolean>> enableAutoBranchCreation() {
        return Codegen.optional(this.enableAutoBranchCreation);
    }
    /**
     * Enables basic authorization for an Amplify app. This will apply to all branches that are part of this app.
     * 
     */
    @Export(name="enableBasicAuth", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableBasicAuth;

    /**
     * @return Enables basic authorization for an Amplify app. This will apply to all branches that are part of this app.
     * 
     */
    public Output<Optional<Boolean>> enableBasicAuth() {
        return Codegen.optional(this.enableBasicAuth);
    }
    /**
     * Enables auto-building of branches for the Amplify App.
     * 
     */
    @Export(name="enableBranchAutoBuild", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableBranchAutoBuild;

    /**
     * @return Enables auto-building of branches for the Amplify App.
     * 
     */
    public Output<Optional<Boolean>> enableBranchAutoBuild() {
        return Codegen.optional(this.enableBranchAutoBuild);
    }
    /**
     * Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository.
     * 
     */
    @Export(name="enableBranchAutoDeletion", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableBranchAutoDeletion;

    /**
     * @return Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository.
     * 
     */
    public Output<Optional<Boolean>> enableBranchAutoDeletion() {
        return Codegen.optional(this.enableBranchAutoDeletion);
    }
    /**
     * Environment variables map for an Amplify app.
     * 
     */
    @Export(name="environmentVariables", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> environmentVariables;

    /**
     * @return Environment variables map for an Amplify app.
     * 
     */
    public Output<Optional<Map<String,String>>> environmentVariables() {
        return Codegen.optional(this.environmentVariables);
    }
    /**
     * AWS Identity and Access Management (IAM) service role for an Amplify app.
     * 
     */
    @Export(name="iamServiceRoleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> iamServiceRoleArn;

    /**
     * @return AWS Identity and Access Management (IAM) service role for an Amplify app.
     * 
     */
    public Output<Optional<String>> iamServiceRoleArn() {
        return Codegen.optional(this.iamServiceRoleArn);
    }
    /**
     * Name for an Amplify app.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name for an Amplify app.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * OAuth token for a third-party source control system for an Amplify app. The OAuth token is used to create a webhook and a read-only deploy key. The OAuth token is not stored.
     * 
     */
    @Export(name="oauthToken", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthToken;

    /**
     * @return OAuth token for a third-party source control system for an Amplify app. The OAuth token is used to create a webhook and a read-only deploy key. The OAuth token is not stored.
     * 
     */
    public Output<Optional<String>> oauthToken() {
        return Codegen.optional(this.oauthToken);
    }
    /**
     * Platform or framework for an Amplify app. Valid values: `WEB`, `WEB_COMPUTE`. Default value: `WEB`.
     * 
     */
    @Export(name="platform", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> platform;

    /**
     * @return Platform or framework for an Amplify app. Valid values: `WEB`, `WEB_COMPUTE`. Default value: `WEB`.
     * 
     */
    public Output<Optional<String>> platform() {
        return Codegen.optional(this.platform);
    }
    /**
     * Describes the information about a production branch for an Amplify app. A `production_branch` block is documented below.
     * 
     */
    @Export(name="productionBranches", refs={List.class,AppProductionBranch.class}, tree="[0,1]")
    private Output<List<AppProductionBranch>> productionBranches;

    /**
     * @return Describes the information about a production branch for an Amplify app. A `production_branch` block is documented below.
     * 
     */
    public Output<List<AppProductionBranch>> productionBranches() {
        return this.productionBranches;
    }
    /**
     * Repository for an Amplify app.
     * 
     */
    @Export(name="repository", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> repository;

    /**
     * @return Repository for an Amplify app.
     * 
     */
    public Output<Optional<String>> repository() {
        return Codegen.optional(this.repository);
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public App(String name) {
        this(name, AppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public App(String name, @Nullable AppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public App(String name, @Nullable AppArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:amplify/app:App", name, args == null ? AppArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private App(String name, Output<String> id, @Nullable AppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:amplify/app:App", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "accessToken",
                "basicAuthCredentials",
                "oauthToken",
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
    public static App get(String name, Output<String> id, @Nullable AppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new App(name, id, state, options);
    }
}
