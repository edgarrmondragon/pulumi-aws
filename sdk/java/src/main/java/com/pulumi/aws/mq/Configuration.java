// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mq;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.mq.ConfigurationArgs;
import com.pulumi.aws.mq.inputs.ConfigurationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an MQ Configuration Resource.
 * 
 * For more information on Amazon MQ, see [Amazon MQ documentation](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/welcome.html).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.mq.Configuration;
 * import com.pulumi.aws.mq.ConfigurationArgs;
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
 *         var example = new Configuration(&#34;example&#34;, ConfigurationArgs.builder()        
 *             .data(&#34;&#34;&#34;
 * &lt;?xml version=&#34;1.0&#34; encoding=&#34;UTF-8&#34; standalone=&#34;yes&#34;?&gt;
 * &lt;broker xmlns=&#34;http://activemq.apache.org/schema/core&#34;&gt;
 *   &lt;plugins&gt;
 *     &lt;forcePersistencyModeBrokerPlugin persistenceFlag=&#34;true&#34;/&gt;
 *     &lt;statisticsBrokerPlugin/&gt;
 *     &lt;timeStampingBrokerPlugin ttlCeiling=&#34;86400000&#34; zeroExpirationOverride=&#34;86400000&#34;/&gt;
 *   &lt;/plugins&gt;
 * &lt;/broker&gt;
 * 
 *             &#34;&#34;&#34;)
 *             .description(&#34;Example Configuration&#34;)
 *             .engineType(&#34;ActiveMQ&#34;)
 *             .engineVersion(&#34;5.15.0&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import MQ Configurations using the configuration ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:mq/configuration:Configuration example c-0187d1eb-88c8-475a-9b79-16ef5a10c94f
 * ```
 * 
 */
@ResourceType(type="aws:mq/configuration:Configuration")
public class Configuration extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the configuration.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the configuration.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Authentication strategy associated with the configuration. Valid values are `simple` and `ldap`. `ldap` is not supported for `engine_type` `RabbitMQ`.
     * 
     */
    @Export(name="authenticationStrategy", refs={String.class}, tree="[0]")
    private Output<String> authenticationStrategy;

    /**
     * @return Authentication strategy associated with the configuration. Valid values are `simple` and `ldap`. `ldap` is not supported for `engine_type` `RabbitMQ`.
     * 
     */
    public Output<String> authenticationStrategy() {
        return this.authenticationStrategy;
    }
    /**
     * Broker configuration in XML format. See [official docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/amazon-mq-broker-configuration-parameters.html) for supported parameters and format of the XML.
     * 
     */
    @Export(name="data", refs={String.class}, tree="[0]")
    private Output<String> data;

    /**
     * @return Broker configuration in XML format. See [official docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/amazon-mq-broker-configuration-parameters.html) for supported parameters and format of the XML.
     * 
     */
    public Output<String> data() {
        return this.data;
    }
    /**
     * Description of the configuration.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the configuration.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Type of broker engine. Valid values are `ActiveMQ` and `RabbitMQ`.
     * 
     */
    @Export(name="engineType", refs={String.class}, tree="[0]")
    private Output<String> engineType;

    /**
     * @return Type of broker engine. Valid values are `ActiveMQ` and `RabbitMQ`.
     * 
     */
    public Output<String> engineType() {
        return this.engineType;
    }
    /**
     * Version of the broker engine.
     * 
     */
    @Export(name="engineVersion", refs={String.class}, tree="[0]")
    private Output<String> engineVersion;

    /**
     * @return Version of the broker engine.
     * 
     */
    public Output<String> engineVersion() {
        return this.engineVersion;
    }
    /**
     * Latest revision of the configuration.
     * 
     */
    @Export(name="latestRevision", refs={Integer.class}, tree="[0]")
    private Output<Integer> latestRevision;

    /**
     * @return Latest revision of the configuration.
     * 
     */
    public Output<Integer> latestRevision() {
        return this.latestRevision;
    }
    /**
     * Name of the configuration.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the configuration.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public Configuration(String name) {
        this(name, ConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Configuration(String name, ConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Configuration(String name, ConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:mq/configuration:Configuration", name, args == null ? ConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Configuration(String name, Output<String> id, @Nullable ConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:mq/configuration:Configuration", name, state, makeResourceOptions(options, id));
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
    public static Configuration get(String name, Output<String> id, @Nullable ConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Configuration(name, id, state, options);
    }
}
