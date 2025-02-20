// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a Cognito User Pool Client resource.
 *
 * To manage a User Pool Client created by another service, such as when [configuring an OpenSearch Domain to use Cognito authentication](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html),
 * use the `aws.cognito.ManagedUserPoolClient` resource instead.
 *
 * ## Example Usage
 * ### Create a basic user pool client
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const pool = new aws.cognito.UserPool("pool", {});
 * const client = new aws.cognito.UserPoolClient("client", {userPoolId: pool.id});
 * ```
 * ### Create a user pool client with no SRP authentication
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const pool = new aws.cognito.UserPool("pool", {});
 * const client = new aws.cognito.UserPoolClient("client", {
 *     userPoolId: pool.id,
 *     generateSecret: true,
 *     explicitAuthFlows: ["ADMIN_NO_SRP_AUTH"],
 * });
 * ```
 * ### Create a user pool client with pinpoint analytics
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const testUserPool = new aws.cognito.UserPool("testUserPool", {});
 * const testApp = new aws.pinpoint.App("testApp", {});
 * const assumeRole = aws.iam.getPolicyDocument({
 *     statements: [{
 *         effect: "Allow",
 *         principals: [{
 *             type: "Service",
 *             identifiers: ["cognito-idp.amazonaws.com"],
 *         }],
 *         actions: ["sts:AssumeRole"],
 *     }],
 * });
 * const testRole = new aws.iam.Role("testRole", {assumeRolePolicy: assumeRole.then(assumeRole => assumeRole.json)});
 * const testUserPoolClient = new aws.cognito.UserPoolClient("testUserPoolClient", {
 *     userPoolId: testUserPool.id,
 *     analyticsConfiguration: {
 *         applicationId: testApp.applicationId,
 *         externalId: "some_id",
 *         roleArn: testRole.arn,
 *         userDataShared: true,
 *     },
 * });
 * const current = aws.getCallerIdentity({});
 * const testPolicyDocument = aws.iam.getPolicyDocumentOutput({
 *     statements: [{
 *         effect: "Allow",
 *         actions: [
 *             "mobiletargeting:UpdateEndpoint",
 *             "mobiletargeting:PutEvents",
 *         ],
 *         resources: [pulumi.all([current, testApp.applicationId]).apply(([current, applicationId]) => `arn:aws:mobiletargeting:*:${current.accountId}:apps/${applicationId}*`)],
 *     }],
 * });
 * const testRolePolicy = new aws.iam.RolePolicy("testRolePolicy", {
 *     role: testRole.id,
 *     policy: testPolicyDocument.apply(testPolicyDocument => testPolicyDocument.json),
 * });
 * ```
 * ### Create a user pool client with Cognito as the identity provider
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const pool = new aws.cognito.UserPool("pool", {});
 * const userpoolClient = new aws.cognito.UserPoolClient("userpoolClient", {
 *     userPoolId: pool.id,
 *     callbackUrls: ["https://example.com"],
 *     allowedOauthFlowsUserPoolClient: true,
 *     allowedOauthFlows: [
 *         "code",
 *         "implicit",
 *     ],
 *     allowedOauthScopes: [
 *         "email",
 *         "openid",
 *     ],
 *     supportedIdentityProviders: ["COGNITO"],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Cognito User Pool Clients using the `id` of the Cognito User Pool, and the `id` of the Cognito User Pool Client. For example:
 *
 * ```sh
 *  $ pulumi import aws:cognito/userPoolClient:UserPoolClient client us-west-2_abc123/3ho4ek12345678909nh3fmhpko
 * ```
 */
export class UserPoolClient extends pulumi.CustomResource {
    /**
     * Get an existing UserPoolClient resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserPoolClientState, opts?: pulumi.CustomResourceOptions): UserPoolClient {
        return new UserPoolClient(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cognito/userPoolClient:UserPoolClient';

    /**
     * Returns true if the given object is an instance of UserPoolClient.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UserPoolClient {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UserPoolClient.__pulumiType;
    }

    /**
     * Time limit, between 5 minutes and 1 day, after which the access token is no longer valid and cannot be used.
     * By default, the unit is hours.
     * The unit can be overridden by a value in `token_validity_units.access_token`.
     */
    public readonly accessTokenValidity!: pulumi.Output<number>;
    /**
     * List of allowed OAuth flows (code, implicit, client_credentials).
     */
    public readonly allowedOauthFlows!: pulumi.Output<string[]>;
    /**
     * Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
     */
    public readonly allowedOauthFlowsUserPoolClient!: pulumi.Output<boolean>;
    /**
     * List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
     */
    public readonly allowedOauthScopes!: pulumi.Output<string[]>;
    /**
     * Configuration block for Amazon Pinpoint analytics for collecting metrics for this user pool. Detailed below.
     */
    public readonly analyticsConfiguration!: pulumi.Output<outputs.cognito.UserPoolClientAnalyticsConfiguration | undefined>;
    /**
     * Amazon Cognito creates a session token for each API request in an authentication flow. AuthSessionValidity is the duration, in minutes, of that session token. Your user pool native user must respond to each authentication challenge before the session expires. Valid values between `3` and `15`. Default value is `3`.
     */
    public readonly authSessionValidity!: pulumi.Output<number>;
    /**
     * List of allowed callback URLs for the identity providers.
     */
    public readonly callbackUrls!: pulumi.Output<string[]>;
    /**
     * Client secret of the user pool client.
     */
    public /*out*/ readonly clientSecret!: pulumi.Output<string>;
    /**
     * Default redirect URI. Must be in the list of callback URLs.
     */
    public readonly defaultRedirectUri!: pulumi.Output<string>;
    /**
     * Activates the propagation of additional user context data.
     */
    public readonly enablePropagateAdditionalUserContextData!: pulumi.Output<boolean>;
    /**
     * Enables or disables token revocation.
     */
    public readonly enableTokenRevocation!: pulumi.Output<boolean>;
    /**
     * List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
     */
    public readonly explicitAuthFlows!: pulumi.Output<string[]>;
    /**
     * Should an application secret be generated.
     */
    public readonly generateSecret!: pulumi.Output<boolean | undefined>;
    /**
     * Time limit, between 5 minutes and 1 day, after which the ID token is no longer valid and cannot be used.
     * By default, the unit is hours.
     * The unit can be overridden by a value in `token_validity_units.id_token`.
     */
    public readonly idTokenValidity!: pulumi.Output<number>;
    /**
     * List of allowed logout URLs for the identity providers.
     */
    public readonly logoutUrls!: pulumi.Output<string[]>;
    /**
     * Name of the application client.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
     */
    public readonly preventUserExistenceErrors!: pulumi.Output<string>;
    /**
     * List of user pool attributes the application client can read from.
     */
    public readonly readAttributes!: pulumi.Output<string[]>;
    /**
     * Time limit, between 60 minutes and 10 years, after which the refresh token is no longer valid and cannot be used.
     * By default, the unit is days.
     * The unit can be overridden by a value in `token_validity_units.refresh_token`.
     */
    public readonly refreshTokenValidity!: pulumi.Output<number>;
    /**
     * List of provider names for the identity providers that are supported on this client. Uses the `providerName` attribute of `aws.cognito.IdentityProvider` resource(s), or the equivalent string(s).
     */
    public readonly supportedIdentityProviders!: pulumi.Output<string[]>;
    /**
     * Configuration block for units in which the validity times are represented in. Detailed below.
     */
    public readonly tokenValidityUnits!: pulumi.Output<outputs.cognito.UserPoolClientTokenValidityUnits | undefined>;
    /**
     * User pool the client belongs to.
     *
     * The following arguments are optional:
     */
    public readonly userPoolId!: pulumi.Output<string>;
    /**
     * List of user pool attributes the application client can write to.
     */
    public readonly writeAttributes!: pulumi.Output<string[]>;

    /**
     * Create a UserPoolClient resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserPoolClientArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserPoolClientArgs | UserPoolClientState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserPoolClientState | undefined;
            resourceInputs["accessTokenValidity"] = state ? state.accessTokenValidity : undefined;
            resourceInputs["allowedOauthFlows"] = state ? state.allowedOauthFlows : undefined;
            resourceInputs["allowedOauthFlowsUserPoolClient"] = state ? state.allowedOauthFlowsUserPoolClient : undefined;
            resourceInputs["allowedOauthScopes"] = state ? state.allowedOauthScopes : undefined;
            resourceInputs["analyticsConfiguration"] = state ? state.analyticsConfiguration : undefined;
            resourceInputs["authSessionValidity"] = state ? state.authSessionValidity : undefined;
            resourceInputs["callbackUrls"] = state ? state.callbackUrls : undefined;
            resourceInputs["clientSecret"] = state ? state.clientSecret : undefined;
            resourceInputs["defaultRedirectUri"] = state ? state.defaultRedirectUri : undefined;
            resourceInputs["enablePropagateAdditionalUserContextData"] = state ? state.enablePropagateAdditionalUserContextData : undefined;
            resourceInputs["enableTokenRevocation"] = state ? state.enableTokenRevocation : undefined;
            resourceInputs["explicitAuthFlows"] = state ? state.explicitAuthFlows : undefined;
            resourceInputs["generateSecret"] = state ? state.generateSecret : undefined;
            resourceInputs["idTokenValidity"] = state ? state.idTokenValidity : undefined;
            resourceInputs["logoutUrls"] = state ? state.logoutUrls : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["preventUserExistenceErrors"] = state ? state.preventUserExistenceErrors : undefined;
            resourceInputs["readAttributes"] = state ? state.readAttributes : undefined;
            resourceInputs["refreshTokenValidity"] = state ? state.refreshTokenValidity : undefined;
            resourceInputs["supportedIdentityProviders"] = state ? state.supportedIdentityProviders : undefined;
            resourceInputs["tokenValidityUnits"] = state ? state.tokenValidityUnits : undefined;
            resourceInputs["userPoolId"] = state ? state.userPoolId : undefined;
            resourceInputs["writeAttributes"] = state ? state.writeAttributes : undefined;
        } else {
            const args = argsOrState as UserPoolClientArgs | undefined;
            if ((!args || args.userPoolId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userPoolId'");
            }
            resourceInputs["accessTokenValidity"] = args ? args.accessTokenValidity : undefined;
            resourceInputs["allowedOauthFlows"] = args ? args.allowedOauthFlows : undefined;
            resourceInputs["allowedOauthFlowsUserPoolClient"] = args ? args.allowedOauthFlowsUserPoolClient : undefined;
            resourceInputs["allowedOauthScopes"] = args ? args.allowedOauthScopes : undefined;
            resourceInputs["analyticsConfiguration"] = args ? args.analyticsConfiguration : undefined;
            resourceInputs["authSessionValidity"] = args ? args.authSessionValidity : undefined;
            resourceInputs["callbackUrls"] = args ? args.callbackUrls : undefined;
            resourceInputs["defaultRedirectUri"] = args ? args.defaultRedirectUri : undefined;
            resourceInputs["enablePropagateAdditionalUserContextData"] = args ? args.enablePropagateAdditionalUserContextData : undefined;
            resourceInputs["enableTokenRevocation"] = args ? args.enableTokenRevocation : undefined;
            resourceInputs["explicitAuthFlows"] = args ? args.explicitAuthFlows : undefined;
            resourceInputs["generateSecret"] = args ? args.generateSecret : undefined;
            resourceInputs["idTokenValidity"] = args ? args.idTokenValidity : undefined;
            resourceInputs["logoutUrls"] = args ? args.logoutUrls : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["preventUserExistenceErrors"] = args ? args.preventUserExistenceErrors : undefined;
            resourceInputs["readAttributes"] = args ? args.readAttributes : undefined;
            resourceInputs["refreshTokenValidity"] = args ? args.refreshTokenValidity : undefined;
            resourceInputs["supportedIdentityProviders"] = args ? args.supportedIdentityProviders : undefined;
            resourceInputs["tokenValidityUnits"] = args ? args.tokenValidityUnits : undefined;
            resourceInputs["userPoolId"] = args ? args.userPoolId : undefined;
            resourceInputs["writeAttributes"] = args ? args.writeAttributes : undefined;
            resourceInputs["clientSecret"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["clientSecret"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(UserPoolClient.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UserPoolClient resources.
 */
export interface UserPoolClientState {
    /**
     * Time limit, between 5 minutes and 1 day, after which the access token is no longer valid and cannot be used.
     * By default, the unit is hours.
     * The unit can be overridden by a value in `token_validity_units.access_token`.
     */
    accessTokenValidity?: pulumi.Input<number>;
    /**
     * List of allowed OAuth flows (code, implicit, client_credentials).
     */
    allowedOauthFlows?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
     */
    allowedOauthFlowsUserPoolClient?: pulumi.Input<boolean>;
    /**
     * List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
     */
    allowedOauthScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Configuration block for Amazon Pinpoint analytics for collecting metrics for this user pool. Detailed below.
     */
    analyticsConfiguration?: pulumi.Input<inputs.cognito.UserPoolClientAnalyticsConfiguration>;
    /**
     * Amazon Cognito creates a session token for each API request in an authentication flow. AuthSessionValidity is the duration, in minutes, of that session token. Your user pool native user must respond to each authentication challenge before the session expires. Valid values between `3` and `15`. Default value is `3`.
     */
    authSessionValidity?: pulumi.Input<number>;
    /**
     * List of allowed callback URLs for the identity providers.
     */
    callbackUrls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Client secret of the user pool client.
     */
    clientSecret?: pulumi.Input<string>;
    /**
     * Default redirect URI. Must be in the list of callback URLs.
     */
    defaultRedirectUri?: pulumi.Input<string>;
    /**
     * Activates the propagation of additional user context data.
     */
    enablePropagateAdditionalUserContextData?: pulumi.Input<boolean>;
    /**
     * Enables or disables token revocation.
     */
    enableTokenRevocation?: pulumi.Input<boolean>;
    /**
     * List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
     */
    explicitAuthFlows?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Should an application secret be generated.
     */
    generateSecret?: pulumi.Input<boolean>;
    /**
     * Time limit, between 5 minutes and 1 day, after which the ID token is no longer valid and cannot be used.
     * By default, the unit is hours.
     * The unit can be overridden by a value in `token_validity_units.id_token`.
     */
    idTokenValidity?: pulumi.Input<number>;
    /**
     * List of allowed logout URLs for the identity providers.
     */
    logoutUrls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the application client.
     */
    name?: pulumi.Input<string>;
    /**
     * Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
     */
    preventUserExistenceErrors?: pulumi.Input<string>;
    /**
     * List of user pool attributes the application client can read from.
     */
    readAttributes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Time limit, between 60 minutes and 10 years, after which the refresh token is no longer valid and cannot be used.
     * By default, the unit is days.
     * The unit can be overridden by a value in `token_validity_units.refresh_token`.
     */
    refreshTokenValidity?: pulumi.Input<number>;
    /**
     * List of provider names for the identity providers that are supported on this client. Uses the `providerName` attribute of `aws.cognito.IdentityProvider` resource(s), or the equivalent string(s).
     */
    supportedIdentityProviders?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Configuration block for units in which the validity times are represented in. Detailed below.
     */
    tokenValidityUnits?: pulumi.Input<inputs.cognito.UserPoolClientTokenValidityUnits>;
    /**
     * User pool the client belongs to.
     *
     * The following arguments are optional:
     */
    userPoolId?: pulumi.Input<string>;
    /**
     * List of user pool attributes the application client can write to.
     */
    writeAttributes?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a UserPoolClient resource.
 */
export interface UserPoolClientArgs {
    /**
     * Time limit, between 5 minutes and 1 day, after which the access token is no longer valid and cannot be used.
     * By default, the unit is hours.
     * The unit can be overridden by a value in `token_validity_units.access_token`.
     */
    accessTokenValidity?: pulumi.Input<number>;
    /**
     * List of allowed OAuth flows (code, implicit, client_credentials).
     */
    allowedOauthFlows?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
     */
    allowedOauthFlowsUserPoolClient?: pulumi.Input<boolean>;
    /**
     * List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
     */
    allowedOauthScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Configuration block for Amazon Pinpoint analytics for collecting metrics for this user pool. Detailed below.
     */
    analyticsConfiguration?: pulumi.Input<inputs.cognito.UserPoolClientAnalyticsConfiguration>;
    /**
     * Amazon Cognito creates a session token for each API request in an authentication flow. AuthSessionValidity is the duration, in minutes, of that session token. Your user pool native user must respond to each authentication challenge before the session expires. Valid values between `3` and `15`. Default value is `3`.
     */
    authSessionValidity?: pulumi.Input<number>;
    /**
     * List of allowed callback URLs for the identity providers.
     */
    callbackUrls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Default redirect URI. Must be in the list of callback URLs.
     */
    defaultRedirectUri?: pulumi.Input<string>;
    /**
     * Activates the propagation of additional user context data.
     */
    enablePropagateAdditionalUserContextData?: pulumi.Input<boolean>;
    /**
     * Enables or disables token revocation.
     */
    enableTokenRevocation?: pulumi.Input<boolean>;
    /**
     * List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
     */
    explicitAuthFlows?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Should an application secret be generated.
     */
    generateSecret?: pulumi.Input<boolean>;
    /**
     * Time limit, between 5 minutes and 1 day, after which the ID token is no longer valid and cannot be used.
     * By default, the unit is hours.
     * The unit can be overridden by a value in `token_validity_units.id_token`.
     */
    idTokenValidity?: pulumi.Input<number>;
    /**
     * List of allowed logout URLs for the identity providers.
     */
    logoutUrls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the application client.
     */
    name?: pulumi.Input<string>;
    /**
     * Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
     */
    preventUserExistenceErrors?: pulumi.Input<string>;
    /**
     * List of user pool attributes the application client can read from.
     */
    readAttributes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Time limit, between 60 minutes and 10 years, after which the refresh token is no longer valid and cannot be used.
     * By default, the unit is days.
     * The unit can be overridden by a value in `token_validity_units.refresh_token`.
     */
    refreshTokenValidity?: pulumi.Input<number>;
    /**
     * List of provider names for the identity providers that are supported on this client. Uses the `providerName` attribute of `aws.cognito.IdentityProvider` resource(s), or the equivalent string(s).
     */
    supportedIdentityProviders?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Configuration block for units in which the validity times are represented in. Detailed below.
     */
    tokenValidityUnits?: pulumi.Input<inputs.cognito.UserPoolClientTokenValidityUnits>;
    /**
     * User pool the client belongs to.
     *
     * The following arguments are optional:
     */
    userPoolId: pulumi.Input<string>;
    /**
     * List of user pool attributes the application client can write to.
     */
    writeAttributes?: pulumi.Input<pulumi.Input<string>[]>;
}
