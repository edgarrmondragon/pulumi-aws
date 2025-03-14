// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.rds.GlobalClusterArgs;
import com.pulumi.aws.rds.inputs.GlobalClusterState;
import com.pulumi.aws.rds.outputs.GlobalClusterGlobalClusterMember;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an RDS Global Cluster, which is an Aurora global database spread across multiple regions. The global database contains a single primary cluster with read-write capability, and a read-only secondary cluster that receives data from the primary cluster through high-speed replication performed by the Aurora storage subsystem.
 * 
 * More information about Aurora global databases can be found in the [Aurora User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database-creating).
 * 
 * ## Example Usage
 * ### New MySQL Global Cluster
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.rds.GlobalCluster;
 * import com.pulumi.aws.rds.GlobalClusterArgs;
 * import com.pulumi.aws.rds.Cluster;
 * import com.pulumi.aws.rds.ClusterArgs;
 * import com.pulumi.aws.rds.ClusterInstance;
 * import com.pulumi.aws.rds.ClusterInstanceArgs;
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
 *         var example = new GlobalCluster(&#34;example&#34;, GlobalClusterArgs.builder()        
 *             .globalClusterIdentifier(&#34;global-test&#34;)
 *             .engine(&#34;aurora&#34;)
 *             .engineVersion(&#34;5.6.mysql_aurora.1.22.2&#34;)
 *             .databaseName(&#34;example_db&#34;)
 *             .build());
 * 
 *         var primaryCluster = new Cluster(&#34;primaryCluster&#34;, ClusterArgs.builder()        
 *             .engine(example.engine())
 *             .engineVersion(example.engineVersion())
 *             .clusterIdentifier(&#34;test-primary-cluster&#34;)
 *             .masterUsername(&#34;username&#34;)
 *             .masterPassword(&#34;somepass123&#34;)
 *             .databaseName(&#34;example_db&#34;)
 *             .globalClusterIdentifier(example.id())
 *             .dbSubnetGroupName(&#34;default&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(aws.primary())
 *                 .build());
 * 
 *         var primaryClusterInstance = new ClusterInstance(&#34;primaryClusterInstance&#34;, ClusterInstanceArgs.builder()        
 *             .engine(example.engine())
 *             .engineVersion(example.engineVersion())
 *             .identifier(&#34;test-primary-cluster-instance&#34;)
 *             .clusterIdentifier(primaryCluster.id())
 *             .instanceClass(&#34;db.r4.large&#34;)
 *             .dbSubnetGroupName(&#34;default&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(aws.primary())
 *                 .build());
 * 
 *         var secondaryCluster = new Cluster(&#34;secondaryCluster&#34;, ClusterArgs.builder()        
 *             .engine(example.engine())
 *             .engineVersion(example.engineVersion())
 *             .clusterIdentifier(&#34;test-secondary-cluster&#34;)
 *             .globalClusterIdentifier(example.id())
 *             .dbSubnetGroupName(&#34;default&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(aws.secondary())
 *                 .dependsOn(primaryClusterInstance)
 *                 .build());
 * 
 *         var secondaryClusterInstance = new ClusterInstance(&#34;secondaryClusterInstance&#34;, ClusterInstanceArgs.builder()        
 *             .engine(example.engine())
 *             .engineVersion(example.engineVersion())
 *             .identifier(&#34;test-secondary-cluster-instance&#34;)
 *             .clusterIdentifier(secondaryCluster.id())
 *             .instanceClass(&#34;db.r4.large&#34;)
 *             .dbSubnetGroupName(&#34;default&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(aws.secondary())
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### New PostgreSQL Global Cluster
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.Provider;
 * import com.pulumi.aws.ProviderArgs;
 * import com.pulumi.aws.rds.GlobalCluster;
 * import com.pulumi.aws.rds.GlobalClusterArgs;
 * import com.pulumi.aws.rds.Cluster;
 * import com.pulumi.aws.rds.ClusterArgs;
 * import com.pulumi.aws.rds.ClusterInstance;
 * import com.pulumi.aws.rds.ClusterInstanceArgs;
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
 *         var primary = new Provider(&#34;primary&#34;, ProviderArgs.builder()        
 *             .region(&#34;us-east-2&#34;)
 *             .build());
 * 
 *         var secondary = new Provider(&#34;secondary&#34;, ProviderArgs.builder()        
 *             .region(&#34;us-east-1&#34;)
 *             .build());
 * 
 *         var example = new GlobalCluster(&#34;example&#34;, GlobalClusterArgs.builder()        
 *             .globalClusterIdentifier(&#34;global-test&#34;)
 *             .engine(&#34;aurora-postgresql&#34;)
 *             .engineVersion(&#34;11.9&#34;)
 *             .databaseName(&#34;example_db&#34;)
 *             .build());
 * 
 *         var primaryCluster = new Cluster(&#34;primaryCluster&#34;, ClusterArgs.builder()        
 *             .engine(example.engine())
 *             .engineVersion(example.engineVersion())
 *             .clusterIdentifier(&#34;test-primary-cluster&#34;)
 *             .masterUsername(&#34;username&#34;)
 *             .masterPassword(&#34;somepass123&#34;)
 *             .databaseName(&#34;example_db&#34;)
 *             .globalClusterIdentifier(example.id())
 *             .dbSubnetGroupName(&#34;default&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(aws.primary())
 *                 .build());
 * 
 *         var primaryClusterInstance = new ClusterInstance(&#34;primaryClusterInstance&#34;, ClusterInstanceArgs.builder()        
 *             .engine(example.engine())
 *             .engineVersion(example.engineVersion())
 *             .identifier(&#34;test-primary-cluster-instance&#34;)
 *             .clusterIdentifier(primaryCluster.id())
 *             .instanceClass(&#34;db.r4.large&#34;)
 *             .dbSubnetGroupName(&#34;default&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(aws.primary())
 *                 .build());
 * 
 *         var secondaryCluster = new Cluster(&#34;secondaryCluster&#34;, ClusterArgs.builder()        
 *             .engine(example.engine())
 *             .engineVersion(example.engineVersion())
 *             .clusterIdentifier(&#34;test-secondary-cluster&#34;)
 *             .globalClusterIdentifier(example.id())
 *             .skipFinalSnapshot(true)
 *             .dbSubnetGroupName(&#34;default&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(aws.secondary())
 *                 .dependsOn(primaryClusterInstance)
 *                 .build());
 * 
 *         var secondaryClusterInstance = new ClusterInstance(&#34;secondaryClusterInstance&#34;, ClusterInstanceArgs.builder()        
 *             .engine(example.engine())
 *             .engineVersion(example.engineVersion())
 *             .identifier(&#34;test-secondary-cluster-instance&#34;)
 *             .clusterIdentifier(secondaryCluster.id())
 *             .instanceClass(&#34;db.r4.large&#34;)
 *             .dbSubnetGroupName(&#34;default&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(aws.secondary())
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### New Global Cluster From Existing DB Cluster
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.rds.Cluster;
 * import com.pulumi.aws.rds.GlobalCluster;
 * import com.pulumi.aws.rds.GlobalClusterArgs;
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
 *         var exampleCluster = new Cluster(&#34;exampleCluster&#34;);
 * 
 *         var exampleGlobalCluster = new GlobalCluster(&#34;exampleGlobalCluster&#34;, GlobalClusterArgs.builder()        
 *             .forceDestroy(true)
 *             .globalClusterIdentifier(&#34;example&#34;)
 *             .sourceDbClusterIdentifier(exampleCluster.arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Upgrading Engine Versions
 * 
 * When you upgrade the version of an `aws.rds.GlobalCluster`, the provider will attempt to in-place upgrade the engine versions of all associated clusters. Since the `aws.rds.Cluster` resource is being updated through the `aws.rds.GlobalCluster`, you are likely to get an error (`Provider produced inconsistent final plan`). To avoid this, use the `lifecycle` `ignore_changes` meta argument as shown below on the `aws.rds.Cluster`.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.rds.GlobalCluster;
 * import com.pulumi.aws.rds.GlobalClusterArgs;
 * import com.pulumi.aws.rds.Cluster;
 * import com.pulumi.aws.rds.ClusterArgs;
 * import com.pulumi.aws.rds.ClusterInstance;
 * import com.pulumi.aws.rds.ClusterInstanceArgs;
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
 *         var example = new GlobalCluster(&#34;example&#34;, GlobalClusterArgs.builder()        
 *             .globalClusterIdentifier(&#34;kyivkharkiv&#34;)
 *             .engine(&#34;aurora-mysql&#34;)
 *             .engineVersion(&#34;5.7.mysql_aurora.2.07.5&#34;)
 *             .build());
 * 
 *         var primaryCluster = new Cluster(&#34;primaryCluster&#34;, ClusterArgs.builder()        
 *             .allowMajorVersionUpgrade(true)
 *             .applyImmediately(true)
 *             .clusterIdentifier(&#34;odessadnipro&#34;)
 *             .databaseName(&#34;totoro&#34;)
 *             .engine(example.engine())
 *             .engineVersion(example.engineVersion())
 *             .globalClusterIdentifier(example.id())
 *             .masterPassword(&#34;satsukimae&#34;)
 *             .masterUsername(&#34;maesatsuki&#34;)
 *             .skipFinalSnapshot(true)
 *             .build());
 * 
 *         var primaryClusterInstance = new ClusterInstance(&#34;primaryClusterInstance&#34;, ClusterInstanceArgs.builder()        
 *             .applyImmediately(true)
 *             .clusterIdentifier(primaryCluster.id())
 *             .engine(primaryCluster.engine())
 *             .engineVersion(primaryCluster.engineVersion())
 *             .identifier(&#34;donetsklviv&#34;)
 *             .instanceClass(&#34;db.r4.large&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_rds_global_cluster` using the RDS Global Cluster identifier. For example:
 * 
 * ```sh
 *  $ pulumi import aws:rds/globalCluster:GlobalCluster example example
 * ```
 *  Certain resource arguments, like `force_destroy`, only exist within this provider. If the argument is set in the the provider configuration on an imported resource, This provider will show a difference on the first plan after import to update the state value. This change is safe to apply immediately so the state matches the desired configuration.
 * 
 * Certain resource arguments, like `source_db_cluster_identifier`, do not have an API method for reading the information after creation. If the argument is set in the TODO configuration on an imported resource, TODO will always show a difference. To workaround this behavior, either omit the argument from the TODO configuration or use `ignore_changes` to hide the difference. For example:
 * 
 */
@ResourceType(type="aws:rds/globalCluster:GlobalCluster")
public class GlobalCluster extends com.pulumi.resources.CustomResource {
    /**
     * RDS Global Cluster Amazon Resource Name (ARN)
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return RDS Global Cluster Amazon Resource Name (ARN)
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Name for an automatically created database on cluster creation.
     * 
     */
    @Export(name="databaseName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> databaseName;

    /**
     * @return Name for an automatically created database on cluster creation.
     * 
     */
    public Output<Optional<String>> databaseName() {
        return Codegen.optional(this.databaseName);
    }
    /**
     * If the Global Cluster should have deletion protection enabled. The database can&#39;t be deleted when this value is set to `true`. The default is `false`.
     * 
     */
    @Export(name="deletionProtection", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deletionProtection;

    /**
     * @return If the Global Cluster should have deletion protection enabled. The database can&#39;t be deleted when this value is set to `true`. The default is `false`.
     * 
     */
    public Output<Optional<Boolean>> deletionProtection() {
        return Codegen.optional(this.deletionProtection);
    }
    /**
     * Name of the database engine to be used for this DB cluster. The provider will only perform drift detection if a configuration value is provided. Valid values: `aurora`, `aurora-mysql`, `aurora-postgresql`. Defaults to `aurora`. Conflicts with `source_db_cluster_identifier`.
     * 
     */
    @Export(name="engine", refs={String.class}, tree="[0]")
    private Output<String> engine;

    /**
     * @return Name of the database engine to be used for this DB cluster. The provider will only perform drift detection if a configuration value is provided. Valid values: `aurora`, `aurora-mysql`, `aurora-postgresql`. Defaults to `aurora`. Conflicts with `source_db_cluster_identifier`.
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }
    /**
     * Engine version of the Aurora global database. The `engine`, `engine_version`, and `instance_class` (on the `aws.rds.ClusterInstance`) must together support global databases. See [Using Amazon Aurora global databases](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html) for more information. By upgrading the engine version, the provider will upgrade cluster members. **NOTE:** To avoid an `inconsistent final plan` error while upgrading, use the `lifecycle` `ignore_changes` for `engine_version` meta argument on the associated `aws.rds.Cluster` resource as shown above in Upgrading Engine Versions example.
     * 
     */
    @Export(name="engineVersion", refs={String.class}, tree="[0]")
    private Output<String> engineVersion;

    /**
     * @return Engine version of the Aurora global database. The `engine`, `engine_version`, and `instance_class` (on the `aws.rds.ClusterInstance`) must together support global databases. See [Using Amazon Aurora global databases](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html) for more information. By upgrading the engine version, the provider will upgrade cluster members. **NOTE:** To avoid an `inconsistent final plan` error while upgrading, use the `lifecycle` `ignore_changes` for `engine_version` meta argument on the associated `aws.rds.Cluster` resource as shown above in Upgrading Engine Versions example.
     * 
     */
    public Output<String> engineVersion() {
        return this.engineVersion;
    }
    @Export(name="engineVersionActual", refs={String.class}, tree="[0]")
    private Output<String> engineVersionActual;

    public Output<String> engineVersionActual() {
        return this.engineVersionActual;
    }
    /**
     * Enable to remove DB Cluster members from Global Cluster on destroy. Required with `source_db_cluster_identifier`.
     * 
     */
    @Export(name="forceDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Enable to remove DB Cluster members from Global Cluster on destroy. Required with `source_db_cluster_identifier`.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * Global cluster identifier.
     * 
     */
    @Export(name="globalClusterIdentifier", refs={String.class}, tree="[0]")
    private Output<String> globalClusterIdentifier;

    /**
     * @return Global cluster identifier.
     * 
     */
    public Output<String> globalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }
    /**
     * Set of objects containing Global Cluster members.
     * 
     */
    @Export(name="globalClusterMembers", refs={List.class,GlobalClusterGlobalClusterMember.class}, tree="[0,1]")
    private Output<List<GlobalClusterGlobalClusterMember>> globalClusterMembers;

    /**
     * @return Set of objects containing Global Cluster members.
     * 
     */
    public Output<List<GlobalClusterGlobalClusterMember>> globalClusterMembers() {
        return this.globalClusterMembers;
    }
    /**
     * AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed
     * 
     */
    @Export(name="globalClusterResourceId", refs={String.class}, tree="[0]")
    private Output<String> globalClusterResourceId;

    /**
     * @return AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed
     * 
     */
    public Output<String> globalClusterResourceId() {
        return this.globalClusterResourceId;
    }
    /**
     * Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
     * 
     */
    @Export(name="sourceDbClusterIdentifier", refs={String.class}, tree="[0]")
    private Output<String> sourceDbClusterIdentifier;

    /**
     * @return Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
     * 
     */
    public Output<String> sourceDbClusterIdentifier() {
        return this.sourceDbClusterIdentifier;
    }
    /**
     * Specifies whether the DB cluster is encrypted. The default is `false` unless `source_db_cluster_identifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Export(name="storageEncrypted", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> storageEncrypted;

    /**
     * @return Specifies whether the DB cluster is encrypted. The default is `false` unless `source_db_cluster_identifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
     * 
     */
    public Output<Boolean> storageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalCluster(String name) {
        this(name, GlobalClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalCluster(String name, GlobalClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalCluster(String name, GlobalClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/globalCluster:GlobalCluster", name, args == null ? GlobalClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GlobalCluster(String name, Output<String> id, @Nullable GlobalClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/globalCluster:GlobalCluster", name, state, makeResourceOptions(options, id));
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
    public static GlobalCluster get(String name, Output<String> id, @Nullable GlobalClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GlobalCluster(name, id, state, options);
    }
}
