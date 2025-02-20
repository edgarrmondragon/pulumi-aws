// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appsync.DataSourceArgs;
import com.pulumi.aws.appsync.inputs.DataSourceState;
import com.pulumi.aws.appsync.outputs.DataSourceDynamodbConfig;
import com.pulumi.aws.appsync.outputs.DataSourceElasticsearchConfig;
import com.pulumi.aws.appsync.outputs.DataSourceEventBridgeConfig;
import com.pulumi.aws.appsync.outputs.DataSourceHttpConfig;
import com.pulumi.aws.appsync.outputs.DataSourceLambdaConfig;
import com.pulumi.aws.appsync.outputs.DataSourceOpensearchserviceConfig;
import com.pulumi.aws.appsync.outputs.DataSourceRelationalDatabaseConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an AppSync Data Source.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.dynamodb.Table;
 * import com.pulumi.aws.dynamodb.TableArgs;
 * import com.pulumi.aws.dynamodb.inputs.TableAttributeArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.iam.RolePolicy;
 * import com.pulumi.aws.iam.RolePolicyArgs;
 * import com.pulumi.aws.appsync.GraphQLApi;
 * import com.pulumi.aws.appsync.GraphQLApiArgs;
 * import com.pulumi.aws.appsync.DataSource;
 * import com.pulumi.aws.appsync.DataSourceArgs;
 * import com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigArgs;
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
 *         var exampleTable = new Table(&#34;exampleTable&#34;, TableArgs.builder()        
 *             .readCapacity(1)
 *             .writeCapacity(1)
 *             .hashKey(&#34;UserId&#34;)
 *             .attributes(TableAttributeArgs.builder()
 *                 .name(&#34;UserId&#34;)
 *                 .type(&#34;S&#34;)
 *                 .build())
 *             .build());
 * 
 *         final var assumeRole = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;appsync.amazonaws.com&#34;)
 *                     .build())
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleRole = new Role(&#34;exampleRole&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(assumeRole.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         final var examplePolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .actions(&#34;dynamodb:*&#34;)
 *                 .resources(exampleTable.arn())
 *                 .build())
 *             .build());
 * 
 *         var exampleRolePolicy = new RolePolicy(&#34;exampleRolePolicy&#34;, RolePolicyArgs.builder()        
 *             .role(exampleRole.id())
 *             .policy(examplePolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult).applyValue(examplePolicyDocument -&gt; examplePolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json())))
 *             .build());
 * 
 *         var exampleGraphQLApi = new GraphQLApi(&#34;exampleGraphQLApi&#34;, GraphQLApiArgs.builder()        
 *             .authenticationType(&#34;API_KEY&#34;)
 *             .build());
 * 
 *         var exampleDataSource = new DataSource(&#34;exampleDataSource&#34;, DataSourceArgs.builder()        
 *             .apiId(exampleGraphQLApi.id())
 *             .name(&#34;my_appsync_example&#34;)
 *             .serviceRoleArn(exampleRole.arn())
 *             .type(&#34;AMAZON_DYNAMODB&#34;)
 *             .dynamodbConfig(DataSourceDynamodbConfigArgs.builder()
 *                 .tableName(exampleTable.name())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_appsync_datasource` using the `api_id`, a hyphen, and `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:appsync/dataSource:DataSource example abcdef123456-example
 * ```
 * 
 */
@ResourceType(type="aws:appsync/dataSource:DataSource")
public class DataSource extends com.pulumi.resources.CustomResource {
    /**
     * API ID for the GraphQL API for the data source.
     * 
     */
    @Export(name="apiId", refs={String.class}, tree="[0]")
    private Output<String> apiId;

    /**
     * @return API ID for the GraphQL API for the data source.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }
    /**
     * ARN
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Description of the data source.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the data source.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * DynamoDB settings. See DynamoDB Config
     * 
     */
    @Export(name="dynamodbConfig", refs={DataSourceDynamodbConfig.class}, tree="[0]")
    private Output</* @Nullable */ DataSourceDynamodbConfig> dynamodbConfig;

    /**
     * @return DynamoDB settings. See DynamoDB Config
     * 
     */
    public Output<Optional<DataSourceDynamodbConfig>> dynamodbConfig() {
        return Codegen.optional(this.dynamodbConfig);
    }
    /**
     * Amazon Elasticsearch settings. See ElasticSearch Config
     * 
     */
    @Export(name="elasticsearchConfig", refs={DataSourceElasticsearchConfig.class}, tree="[0]")
    private Output</* @Nullable */ DataSourceElasticsearchConfig> elasticsearchConfig;

    /**
     * @return Amazon Elasticsearch settings. See ElasticSearch Config
     * 
     */
    public Output<Optional<DataSourceElasticsearchConfig>> elasticsearchConfig() {
        return Codegen.optional(this.elasticsearchConfig);
    }
    /**
     * AWS EventBridge settings. See Event Bridge Config
     * 
     */
    @Export(name="eventBridgeConfig", refs={DataSourceEventBridgeConfig.class}, tree="[0]")
    private Output</* @Nullable */ DataSourceEventBridgeConfig> eventBridgeConfig;

    /**
     * @return AWS EventBridge settings. See Event Bridge Config
     * 
     */
    public Output<Optional<DataSourceEventBridgeConfig>> eventBridgeConfig() {
        return Codegen.optional(this.eventBridgeConfig);
    }
    /**
     * HTTP settings. See HTTP Config
     * 
     */
    @Export(name="httpConfig", refs={DataSourceHttpConfig.class}, tree="[0]")
    private Output</* @Nullable */ DataSourceHttpConfig> httpConfig;

    /**
     * @return HTTP settings. See HTTP Config
     * 
     */
    public Output<Optional<DataSourceHttpConfig>> httpConfig() {
        return Codegen.optional(this.httpConfig);
    }
    /**
     * AWS Lambda settings. See Lambda Config
     * 
     */
    @Export(name="lambdaConfig", refs={DataSourceLambdaConfig.class}, tree="[0]")
    private Output</* @Nullable */ DataSourceLambdaConfig> lambdaConfig;

    /**
     * @return AWS Lambda settings. See Lambda Config
     * 
     */
    public Output<Optional<DataSourceLambdaConfig>> lambdaConfig() {
        return Codegen.optional(this.lambdaConfig);
    }
    /**
     * User-supplied name for the data source.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return User-supplied name for the data source.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Amazon OpenSearch Service settings. See OpenSearch Service Config
     * 
     */
    @Export(name="opensearchserviceConfig", refs={DataSourceOpensearchserviceConfig.class}, tree="[0]")
    private Output</* @Nullable */ DataSourceOpensearchserviceConfig> opensearchserviceConfig;

    /**
     * @return Amazon OpenSearch Service settings. See OpenSearch Service Config
     * 
     */
    public Output<Optional<DataSourceOpensearchserviceConfig>> opensearchserviceConfig() {
        return Codegen.optional(this.opensearchserviceConfig);
    }
    /**
     * AWS RDS settings. See Relational Database Config
     * 
     */
    @Export(name="relationalDatabaseConfig", refs={DataSourceRelationalDatabaseConfig.class}, tree="[0]")
    private Output</* @Nullable */ DataSourceRelationalDatabaseConfig> relationalDatabaseConfig;

    /**
     * @return AWS RDS settings. See Relational Database Config
     * 
     */
    public Output<Optional<DataSourceRelationalDatabaseConfig>> relationalDatabaseConfig() {
        return Codegen.optional(this.relationalDatabaseConfig);
    }
    /**
     * IAM service role ARN for the data source.
     * 
     */
    @Export(name="serviceRoleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serviceRoleArn;

    /**
     * @return IAM service role ARN for the data source.
     * 
     */
    public Output<Optional<String>> serviceRoleArn() {
        return Codegen.optional(this.serviceRoleArn);
    }
    /**
     * Type of the Data Source. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`, `RELATIONAL_DATABASE`, `AMAZON_EVENTBRIDGE`, `AMAZON_OPENSEARCH_SERVICE`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of the Data Source. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`, `RELATIONAL_DATABASE`, `AMAZON_EVENTBRIDGE`, `AMAZON_OPENSEARCH_SERVICE`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataSource(String name) {
        this(name, DataSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataSource(String name, DataSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataSource(String name, DataSourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appsync/dataSource:DataSource", name, args == null ? DataSourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataSource(String name, Output<String> id, @Nullable DataSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appsync/dataSource:DataSource", name, state, makeResourceOptions(options, id));
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
    public static DataSource get(String name, Output<String> id, @Nullable DataSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataSource(name, id, state, options);
    }
}
