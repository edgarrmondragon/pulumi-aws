// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.connect.BotAssociationArgs;
import com.pulumi.aws.connect.inputs.BotAssociationState;
import com.pulumi.aws.connect.outputs.BotAssociationLexBot;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Allows the specified Amazon Connect instance to access the specified Amazon Lex (V1) bot. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html) and [Add an Amazon Lex bot](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-lex.html).
 * 
 * &gt; **NOTE:** This resource only currently supports Amazon Lex (V1) Associations.
 * 
 * ## Example Usage
 * ### Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.BotAssociation;
 * import com.pulumi.aws.connect.BotAssociationArgs;
 * import com.pulumi.aws.connect.inputs.BotAssociationLexBotArgs;
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
 *         var example = new BotAssociation(&#34;example&#34;, BotAssociationArgs.builder()        
 *             .instanceId(aws_connect_instance.example().id())
 *             .lexBot(BotAssociationLexBotArgs.builder()
 *                 .lexRegion(&#34;us-west-2&#34;)
 *                 .name(&#34;Test&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Including a sample Lex bot
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetRegionArgs;
 * import com.pulumi.aws.lex.Intent;
 * import com.pulumi.aws.lex.IntentArgs;
 * import com.pulumi.aws.lex.inputs.IntentFulfillmentActivityArgs;
 * import com.pulumi.aws.lex.Bot;
 * import com.pulumi.aws.lex.BotArgs;
 * import com.pulumi.aws.lex.inputs.BotAbortStatementArgs;
 * import com.pulumi.aws.lex.inputs.BotClarificationPromptArgs;
 * import com.pulumi.aws.lex.inputs.BotIntentArgs;
 * import com.pulumi.aws.connect.BotAssociation;
 * import com.pulumi.aws.connect.BotAssociationArgs;
 * import com.pulumi.aws.connect.inputs.BotAssociationLexBotArgs;
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
 *         final var current = AwsFunctions.getRegion();
 * 
 *         var exampleIntent = new Intent(&#34;exampleIntent&#34;, IntentArgs.builder()        
 *             .createVersion(true)
 *             .name(&#34;connect_lex_intent&#34;)
 *             .fulfillmentActivity(IntentFulfillmentActivityArgs.builder()
 *                 .type(&#34;ReturnIntent&#34;)
 *                 .build())
 *             .sampleUtterances(&#34;I would like to pick up flowers.&#34;)
 *             .build());
 * 
 *         var exampleBot = new Bot(&#34;exampleBot&#34;, BotArgs.builder()        
 *             .abortStatement(BotAbortStatementArgs.builder()
 *                 .messages(BotAbortStatementMessageArgs.builder()
 *                     .content(&#34;Sorry, I am not able to assist at this time.&#34;)
 *                     .contentType(&#34;PlainText&#34;)
 *                     .build())
 *                 .build())
 *             .clarificationPrompt(BotClarificationPromptArgs.builder()
 *                 .maxAttempts(2)
 *                 .messages(BotClarificationPromptMessageArgs.builder()
 *                     .content(&#34;I didn&#39;t understand you, what would you like to do?&#34;)
 *                     .contentType(&#34;PlainText&#34;)
 *                     .build())
 *                 .build())
 *             .intents(BotIntentArgs.builder()
 *                 .intentName(exampleIntent.name())
 *                 .intentVersion(&#34;1&#34;)
 *                 .build())
 *             .childDirected(false)
 *             .name(&#34;connect_lex_bot&#34;)
 *             .processBehavior(&#34;BUILD&#34;)
 *             .build());
 * 
 *         var exampleBotAssociation = new BotAssociation(&#34;exampleBotAssociation&#34;, BotAssociationArgs.builder()        
 *             .instanceId(aws_connect_instance.example().id())
 *             .lexBot(BotAssociationLexBotArgs.builder()
 *                 .lexRegion(current.applyValue(getRegionResult -&gt; getRegionResult.name()))
 *                 .name(exampleBot.name())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * In TODO v1.5.0 and later, use an `import` block to import `aws_connect_bot_association` using the Amazon Connect instance ID, Lex (V1) bot name, and Lex (V1) bot region separated by colons (`:`). For exampleterraform import {
 * 
 *  to = aws_connect_bot_association.example
 * 
 *  id = &#34;aaaaaaaa-bbbb-cccc-dddd-111111111111:Example:us-west-2&#34; } Using `TODO import`, import `aws_connect_bot_association` using the Amazon Connect instance ID, Lex (V1) bot name, and Lex (V1) bot region separated by colons (`:`). For exampleconsole % TODO import aws_connect_bot_association.example aaaaaaaa-bbbb-cccc-dddd-111111111111:Example:us-west-2
 * 
 */
@ResourceType(type="aws:connect/botAssociation:BotAssociation")
public class BotAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * Configuration information of an Amazon Lex (V1) bot. Detailed below.
     * 
     */
    @Export(name="lexBot", refs={BotAssociationLexBot.class}, tree="[0]")
    private Output<BotAssociationLexBot> lexBot;

    /**
     * @return Configuration information of an Amazon Lex (V1) bot. Detailed below.
     * 
     */
    public Output<BotAssociationLexBot> lexBot() {
        return this.lexBot;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BotAssociation(String name) {
        this(name, BotAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BotAssociation(String name, BotAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BotAssociation(String name, BotAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/botAssociation:BotAssociation", name, args == null ? BotAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BotAssociation(String name, Output<String> id, @Nullable BotAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/botAssociation:BotAssociation", name, state, makeResourceOptions(options, id));
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
    public static BotAssociation get(String name, Output<String> id, @Nullable BotAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BotAssociation(name, id, state, options);
    }
}
