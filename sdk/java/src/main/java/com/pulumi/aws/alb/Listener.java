// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.alb.ListenerArgs;
import com.pulumi.aws.alb.inputs.ListenerState;
import com.pulumi.aws.alb.outputs.ListenerDefaultAction;
import com.pulumi.core.Alias;
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
 * Provides a Load Balancer Listener resource.
 * 
 * &gt; **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
 * 
 * ## Example Usage
 * ### Forward Action
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.TargetGroup;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
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
 *         var frontEndLoadBalancer = new LoadBalancer(&#34;frontEndLoadBalancer&#34;);
 * 
 *         var frontEndTargetGroup = new TargetGroup(&#34;frontEndTargetGroup&#34;);
 * 
 *         var frontEndListener = new Listener(&#34;frontEndListener&#34;, ListenerArgs.builder()        
 *             .loadBalancerArn(frontEndLoadBalancer.arn())
 *             .port(&#34;443&#34;)
 *             .protocol(&#34;HTTPS&#34;)
 *             .sslPolicy(&#34;ELBSecurityPolicy-2016-08&#34;)
 *             .certificateArn(&#34;arn:aws:iam::187416307283:server-certificate/test_cert_rab3wuqwgja25ct3n4jdj2tzu4&#34;)
 *             .defaultActions(ListenerDefaultActionArgs.builder()
 *                 .type(&#34;forward&#34;)
 *                 .targetGroupArn(frontEndTargetGroup.arn())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * To a NLB:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
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
 *         var frontEnd = new Listener(&#34;frontEnd&#34;, ListenerArgs.builder()        
 *             .loadBalancerArn(aws_lb.front_end().arn())
 *             .port(&#34;443&#34;)
 *             .protocol(&#34;TLS&#34;)
 *             .certificateArn(&#34;arn:aws:iam::187416307283:server-certificate/test_cert_rab3wuqwgja25ct3n4jdj2tzu4&#34;)
 *             .alpnPolicy(&#34;HTTP2Preferred&#34;)
 *             .defaultActions(ListenerDefaultActionArgs.builder()
 *                 .type(&#34;forward&#34;)
 *                 .targetGroupArn(aws_lb_target_group.front_end().arn())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Redirect Action
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionRedirectArgs;
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
 *         var frontEndLoadBalancer = new LoadBalancer(&#34;frontEndLoadBalancer&#34;);
 * 
 *         var frontEndListener = new Listener(&#34;frontEndListener&#34;, ListenerArgs.builder()        
 *             .loadBalancerArn(frontEndLoadBalancer.arn())
 *             .port(&#34;80&#34;)
 *             .protocol(&#34;HTTP&#34;)
 *             .defaultActions(ListenerDefaultActionArgs.builder()
 *                 .type(&#34;redirect&#34;)
 *                 .redirect(ListenerDefaultActionRedirectArgs.builder()
 *                     .port(&#34;443&#34;)
 *                     .protocol(&#34;HTTPS&#34;)
 *                     .statusCode(&#34;HTTP_301&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Fixed-response Action
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionFixedResponseArgs;
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
 *         var frontEndLoadBalancer = new LoadBalancer(&#34;frontEndLoadBalancer&#34;);
 * 
 *         var frontEndListener = new Listener(&#34;frontEndListener&#34;, ListenerArgs.builder()        
 *             .loadBalancerArn(frontEndLoadBalancer.arn())
 *             .port(&#34;80&#34;)
 *             .protocol(&#34;HTTP&#34;)
 *             .defaultActions(ListenerDefaultActionArgs.builder()
 *                 .type(&#34;fixed-response&#34;)
 *                 .fixedResponse(ListenerDefaultActionFixedResponseArgs.builder()
 *                     .contentType(&#34;text/plain&#34;)
 *                     .messageBody(&#34;Fixed response content&#34;)
 *                     .statusCode(&#34;200&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Authenticate-cognito Action
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.TargetGroup;
 * import com.pulumi.aws.cognito.UserPool;
 * import com.pulumi.aws.cognito.UserPoolClient;
 * import com.pulumi.aws.cognito.UserPoolDomain;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionAuthenticateCognitoArgs;
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
 *         var frontEndLoadBalancer = new LoadBalancer(&#34;frontEndLoadBalancer&#34;);
 * 
 *         var frontEndTargetGroup = new TargetGroup(&#34;frontEndTargetGroup&#34;);
 * 
 *         var pool = new UserPool(&#34;pool&#34;);
 * 
 *         var client = new UserPoolClient(&#34;client&#34;);
 * 
 *         var domain = new UserPoolDomain(&#34;domain&#34;);
 * 
 *         var frontEndListener = new Listener(&#34;frontEndListener&#34;, ListenerArgs.builder()        
 *             .loadBalancerArn(frontEndLoadBalancer.arn())
 *             .port(&#34;80&#34;)
 *             .protocol(&#34;HTTP&#34;)
 *             .defaultActions(            
 *                 ListenerDefaultActionArgs.builder()
 *                     .type(&#34;authenticate-cognito&#34;)
 *                     .authenticateCognito(ListenerDefaultActionAuthenticateCognitoArgs.builder()
 *                         .userPoolArn(pool.arn())
 *                         .userPoolClientId(client.id())
 *                         .userPoolDomain(domain.domain())
 *                         .build())
 *                     .build(),
 *                 ListenerDefaultActionArgs.builder()
 *                     .type(&#34;forward&#34;)
 *                     .targetGroupArn(frontEndTargetGroup.arn())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Authenticate-OIDC Action
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.TargetGroup;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionAuthenticateOidcArgs;
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
 *         var frontEndLoadBalancer = new LoadBalancer(&#34;frontEndLoadBalancer&#34;);
 * 
 *         var frontEndTargetGroup = new TargetGroup(&#34;frontEndTargetGroup&#34;);
 * 
 *         var frontEndListener = new Listener(&#34;frontEndListener&#34;, ListenerArgs.builder()        
 *             .loadBalancerArn(frontEndLoadBalancer.arn())
 *             .port(&#34;80&#34;)
 *             .protocol(&#34;HTTP&#34;)
 *             .defaultActions(            
 *                 ListenerDefaultActionArgs.builder()
 *                     .type(&#34;authenticate-oidc&#34;)
 *                     .authenticateOidc(ListenerDefaultActionAuthenticateOidcArgs.builder()
 *                         .authorizationEndpoint(&#34;https://example.com/authorization_endpoint&#34;)
 *                         .clientId(&#34;client_id&#34;)
 *                         .clientSecret(&#34;client_secret&#34;)
 *                         .issuer(&#34;https://example.com&#34;)
 *                         .tokenEndpoint(&#34;https://example.com/token_endpoint&#34;)
 *                         .userInfoEndpoint(&#34;https://example.com/user_info_endpoint&#34;)
 *                         .build())
 *                     .build(),
 *                 ListenerDefaultActionArgs.builder()
 *                     .type(&#34;forward&#34;)
 *                     .targetGroupArn(frontEndTargetGroup.arn())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Gateway Load Balancer Listener
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.LoadBalancerArgs;
 * import com.pulumi.aws.lb.inputs.LoadBalancerSubnetMappingArgs;
 * import com.pulumi.aws.lb.TargetGroup;
 * import com.pulumi.aws.lb.TargetGroupArgs;
 * import com.pulumi.aws.lb.inputs.TargetGroupHealthCheckArgs;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
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
 *         var exampleLoadBalancer = new LoadBalancer(&#34;exampleLoadBalancer&#34;, LoadBalancerArgs.builder()        
 *             .loadBalancerType(&#34;gateway&#34;)
 *             .subnetMappings(LoadBalancerSubnetMappingArgs.builder()
 *                 .subnetId(aws_subnet.example().id())
 *                 .build())
 *             .build());
 * 
 *         var exampleTargetGroup = new TargetGroup(&#34;exampleTargetGroup&#34;, TargetGroupArgs.builder()        
 *             .port(6081)
 *             .protocol(&#34;GENEVE&#34;)
 *             .vpcId(aws_vpc.example().id())
 *             .healthCheck(TargetGroupHealthCheckArgs.builder()
 *                 .port(80)
 *                 .protocol(&#34;HTTP&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleListener = new Listener(&#34;exampleListener&#34;, ListenerArgs.builder()        
 *             .loadBalancerArn(exampleLoadBalancer.id())
 *             .defaultActions(ListenerDefaultActionArgs.builder()
 *                 .targetGroupArn(exampleTargetGroup.id())
 *                 .type(&#34;forward&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import listeners using their ARN. For example:
 * 
 * ```sh
 *  $ pulumi import aws:alb/listener:Listener front_end arn:aws:elasticloadbalancing:us-west-2:187416307283:listener/app/front-end-alb/8e4497da625e2d8a/9ab28ade35828f96
 * ```
 * 
 */
@ResourceType(type="aws:alb/listener:Listener")
public class Listener extends com.pulumi.resources.CustomResource {
    /**
     * Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
     * 
     */
    @Export(name="alpnPolicy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> alpnPolicy;

    /**
     * @return Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
     * 
     */
    public Output<Optional<String>> alpnPolicy() {
        return Codegen.optional(this.alpnPolicy);
    }
    /**
     * ARN of the target group.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the target group.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
     * 
     */
    @Export(name="certificateArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificateArn;

    /**
     * @return ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
     * 
     */
    public Output<Optional<String>> certificateArn() {
        return Codegen.optional(this.certificateArn);
    }
    /**
     * Configuration block for default actions. Detailed below.
     * 
     */
    @Export(name="defaultActions", refs={List.class,ListenerDefaultAction.class}, tree="[0,1]")
    private Output<List<ListenerDefaultAction>> defaultActions;

    /**
     * @return Configuration block for default actions. Detailed below.
     * 
     */
    public Output<List<ListenerDefaultAction>> defaultActions() {
        return this.defaultActions;
    }
    /**
     * ARN of the load balancer.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="loadBalancerArn", refs={String.class}, tree="[0]")
    private Output<String> loadBalancerArn;

    /**
     * @return ARN of the load balancer.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> loadBalancerArn() {
        return this.loadBalancerArn;
    }
    /**
     * Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> port;

    /**
     * @return Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
     * 
     */
    @Export(name="protocol", refs={String.class}, tree="[0]")
    private Output<String> protocol;

    /**
     * @return Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
     * 
     */
    @Export(name="sslPolicy", refs={String.class}, tree="[0]")
    private Output<String> sslPolicy;

    /**
     * @return Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
     * 
     */
    public Output<String> sslPolicy() {
        return this.sslPolicy;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     * &gt; **NOTE::** Please note that listeners that are attached to Application Load Balancers must use either `HTTP` or `HTTPS` protocols while listeners that are attached to Network Load Balancers must use the `TCP` protocol.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     * &gt; **NOTE::** Please note that listeners that are attached to Application Load Balancers must use either `HTTP` or `HTTPS` protocols while listeners that are attached to Network Load Balancers must use the `TCP` protocol.
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
    public Listener(String name) {
        this(name, ListenerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Listener(String name, ListenerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Listener(String name, ListenerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:alb/listener:Listener", name, args == null ? ListenerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Listener(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:alb/listener:Listener", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("aws:applicationloadbalancing/listener:Listener").build())
            ))
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
    public static Listener get(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Listener(name, id, state, options);
    }
}
