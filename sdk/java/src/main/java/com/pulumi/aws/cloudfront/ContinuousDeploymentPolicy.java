// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudfront.ContinuousDeploymentPolicyArgs;
import com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyState;
import com.pulumi.aws.cloudfront.outputs.ContinuousDeploymentPolicyStagingDistributionDnsNames;
import com.pulumi.aws.cloudfront.outputs.ContinuousDeploymentPolicyTrafficConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS CloudFront Continuous Deployment Policy.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudfront.Distribution;
 * import com.pulumi.aws.cloudfront.DistributionArgs;
 * import com.pulumi.aws.cloudfront.ContinuousDeploymentPolicy;
 * import com.pulumi.aws.cloudfront.ContinuousDeploymentPolicyArgs;
 * import com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyStagingDistributionDnsNamesArgs;
 * import com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigArgs;
 * import com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigSingleWeightConfigArgs;
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
 *         var staging = new Distribution(&#34;staging&#34;, DistributionArgs.builder()        
 *             .enabled(true)
 *             .staging(true)
 *             .build());
 * 
 *         var example = new ContinuousDeploymentPolicy(&#34;example&#34;, ContinuousDeploymentPolicyArgs.builder()        
 *             .enabled(true)
 *             .stagingDistributionDnsNames(ContinuousDeploymentPolicyStagingDistributionDnsNamesArgs.builder()
 *                 .items(staging.domainName())
 *                 .quantity(1)
 *                 .build())
 *             .trafficConfig(ContinuousDeploymentPolicyTrafficConfigArgs.builder()
 *                 .type(&#34;SingleWeight&#34;)
 *                 .singleWeightConfig(ContinuousDeploymentPolicyTrafficConfigSingleWeightConfigArgs.builder()
 *                     .weight(&#34;0.01&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var production = new Distribution(&#34;production&#34;, DistributionArgs.builder()        
 *             .enabled(true)
 *             .continuousDeploymentPolicyId(example.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Single Weight Config with Session Stickiness
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudfront.ContinuousDeploymentPolicy;
 * import com.pulumi.aws.cloudfront.ContinuousDeploymentPolicyArgs;
 * import com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyStagingDistributionDnsNamesArgs;
 * import com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigArgs;
 * import com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigSingleWeightConfigArgs;
 * import com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigSingleWeightConfigSessionStickinessConfigArgs;
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
 *         var example = new ContinuousDeploymentPolicy(&#34;example&#34;, ContinuousDeploymentPolicyArgs.builder()        
 *             .enabled(true)
 *             .stagingDistributionDnsNames(ContinuousDeploymentPolicyStagingDistributionDnsNamesArgs.builder()
 *                 .items(aws_cloudfront_distribution.staging().domain_name())
 *                 .quantity(1)
 *                 .build())
 *             .trafficConfig(ContinuousDeploymentPolicyTrafficConfigArgs.builder()
 *                 .type(&#34;SingleWeight&#34;)
 *                 .singleWeightConfig(ContinuousDeploymentPolicyTrafficConfigSingleWeightConfigArgs.builder()
 *                     .weight(&#34;0.01&#34;)
 *                     .sessionStickinessConfig(ContinuousDeploymentPolicyTrafficConfigSingleWeightConfigSessionStickinessConfigArgs.builder()
 *                         .idleTtl(300)
 *                         .maximumTtl(600)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Single Header Config
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudfront.ContinuousDeploymentPolicy;
 * import com.pulumi.aws.cloudfront.ContinuousDeploymentPolicyArgs;
 * import com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyStagingDistributionDnsNamesArgs;
 * import com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigArgs;
 * import com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigSingleHeaderConfigArgs;
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
 *         var example = new ContinuousDeploymentPolicy(&#34;example&#34;, ContinuousDeploymentPolicyArgs.builder()        
 *             .enabled(true)
 *             .stagingDistributionDnsNames(ContinuousDeploymentPolicyStagingDistributionDnsNamesArgs.builder()
 *                 .items(aws_cloudfront_distribution.staging().domain_name())
 *                 .quantity(1)
 *                 .build())
 *             .trafficConfig(ContinuousDeploymentPolicyTrafficConfigArgs.builder()
 *                 .type(&#34;SingleHeader&#34;)
 *                 .singleHeaderConfig(ContinuousDeploymentPolicyTrafficConfigSingleHeaderConfigArgs.builder()
 *                     .header(&#34;aws-cf-cd-example&#34;)
 *                     .value(&#34;example&#34;)
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
 * In TODO v1.5.0 and later, use an `import` block to import CloudFront Continuous Deployment Policy using the `id`. For exampleterraform import {
 * 
 *  to = aws_cloudfront_continuous_deployment_policy.example
 * 
 *  id = &#34;abcd-1234&#34; } Using `TODO import`, import CloudFront Continuous Deployment Policy using the `id`. For exampleconsole % TODO import aws_cloudfront_continuous_deployment_policy.example abcd-1234
 * 
 */
@ResourceType(type="aws:cloudfront/continuousDeploymentPolicy:ContinuousDeploymentPolicy")
public class ContinuousDeploymentPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Whether this continuous deployment policy is enabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Whether this continuous deployment policy is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Current version of the continuous distribution policy.
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return Current version of the continuous distribution policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Date and time the continuous deployment policy was last modified.
     * 
     */
    @Export(name="lastModifiedTime", refs={String.class}, tree="[0]")
    private Output<String> lastModifiedTime;

    /**
     * @return Date and time the continuous deployment policy was last modified.
     * 
     */
    public Output<String> lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * CloudFront domain name of the staging distribution. See `staging_distribution_dns_names`.
     * 
     */
    @Export(name="stagingDistributionDnsNames", refs={ContinuousDeploymentPolicyStagingDistributionDnsNames.class}, tree="[0]")
    private Output</* @Nullable */ ContinuousDeploymentPolicyStagingDistributionDnsNames> stagingDistributionDnsNames;

    /**
     * @return CloudFront domain name of the staging distribution. See `staging_distribution_dns_names`.
     * 
     */
    public Output<Optional<ContinuousDeploymentPolicyStagingDistributionDnsNames>> stagingDistributionDnsNames() {
        return Codegen.optional(this.stagingDistributionDnsNames);
    }
    /**
     * Parameters for routing production traffic from primary to staging distributions. See `traffic_config`.
     * 
     */
    @Export(name="trafficConfig", refs={ContinuousDeploymentPolicyTrafficConfig.class}, tree="[0]")
    private Output</* @Nullable */ ContinuousDeploymentPolicyTrafficConfig> trafficConfig;

    /**
     * @return Parameters for routing production traffic from primary to staging distributions. See `traffic_config`.
     * 
     */
    public Output<Optional<ContinuousDeploymentPolicyTrafficConfig>> trafficConfig() {
        return Codegen.optional(this.trafficConfig);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContinuousDeploymentPolicy(String name) {
        this(name, ContinuousDeploymentPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContinuousDeploymentPolicy(String name, ContinuousDeploymentPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContinuousDeploymentPolicy(String name, ContinuousDeploymentPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudfront/continuousDeploymentPolicy:ContinuousDeploymentPolicy", name, args == null ? ContinuousDeploymentPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContinuousDeploymentPolicy(String name, Output<String> id, @Nullable ContinuousDeploymentPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudfront/continuousDeploymentPolicy:ContinuousDeploymentPolicy", name, state, makeResourceOptions(options, id));
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
    public static ContinuousDeploymentPolicy get(String name, Output<String> id, @Nullable ContinuousDeploymentPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ContinuousDeploymentPolicy(name, id, state, options);
    }
}
