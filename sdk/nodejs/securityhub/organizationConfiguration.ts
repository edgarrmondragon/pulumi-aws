// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages the Security Hub Organization Configuration.
 *
 * > **NOTE:** This resource requires an `aws.securityhub.OrganizationAdminAccount` to be configured (not necessarily with TODO). More information about managing Security Hub in an organization can be found in the [Managing administrator and member accounts](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-accounts.html) documentation
 *
 * > **NOTE:** This is an advanced TODO resource. TODO will automatically assume management of the Security Hub Organization Configuration without import and perform no actions on removal from the TODO configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleOrganization = new aws.organizations.Organization("exampleOrganization", {
 *     awsServiceAccessPrincipals: ["securityhub.amazonaws.com"],
 *     featureSet: "ALL",
 * });
 * const exampleOrganizationAdminAccount = new aws.securityhub.OrganizationAdminAccount("exampleOrganizationAdminAccount", {adminAccountId: "123456789012"}, {
 *     dependsOn: [exampleOrganization],
 * });
 * const exampleOrganizationConfiguration = new aws.securityhub.OrganizationConfiguration("exampleOrganizationConfiguration", {autoEnable: true});
 * ```
 *
 * ## Import
 *
 * In TODO v1.5.0 and later, use an `import` block to import an existing Security Hub enabled account using the AWS account ID. For exampleterraform import {
 *
 *  to = aws_securityhub_organization_configuration.example
 *
 *  id = "123456789012" } Using `TODO import`, import an existing Security Hub enabled account using the AWS account ID. For exampleconsole % TODO import aws_securityhub_organization_configuration.example 123456789012
 */
export class OrganizationConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing OrganizationConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OrganizationConfigurationState, opts?: pulumi.CustomResourceOptions): OrganizationConfiguration {
        return new OrganizationConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:securityhub/organizationConfiguration:OrganizationConfiguration';

    /**
     * Returns true if the given object is an instance of OrganizationConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OrganizationConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OrganizationConfiguration.__pulumiType;
    }

    /**
     * Whether to automatically enable Security Hub for new accounts in the organization.
     */
    public readonly autoEnable!: pulumi.Output<boolean>;
    /**
     * Whether to automatically enable Security Hub default standards for new member accounts in the organization. By default, this parameter is equal to `DEFAULT`, and new member accounts are automatically enabled with default Security Hub standards. To opt out of enabling default standards for new member accounts, set this parameter equal to `NONE`.
     */
    public readonly autoEnableStandards!: pulumi.Output<string>;

    /**
     * Create a OrganizationConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OrganizationConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OrganizationConfigurationArgs | OrganizationConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OrganizationConfigurationState | undefined;
            resourceInputs["autoEnable"] = state ? state.autoEnable : undefined;
            resourceInputs["autoEnableStandards"] = state ? state.autoEnableStandards : undefined;
        } else {
            const args = argsOrState as OrganizationConfigurationArgs | undefined;
            if ((!args || args.autoEnable === undefined) && !opts.urn) {
                throw new Error("Missing required property 'autoEnable'");
            }
            resourceInputs["autoEnable"] = args ? args.autoEnable : undefined;
            resourceInputs["autoEnableStandards"] = args ? args.autoEnableStandards : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OrganizationConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OrganizationConfiguration resources.
 */
export interface OrganizationConfigurationState {
    /**
     * Whether to automatically enable Security Hub for new accounts in the organization.
     */
    autoEnable?: pulumi.Input<boolean>;
    /**
     * Whether to automatically enable Security Hub default standards for new member accounts in the organization. By default, this parameter is equal to `DEFAULT`, and new member accounts are automatically enabled with default Security Hub standards. To opt out of enabling default standards for new member accounts, set this parameter equal to `NONE`.
     */
    autoEnableStandards?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OrganizationConfiguration resource.
 */
export interface OrganizationConfigurationArgs {
    /**
     * Whether to automatically enable Security Hub for new accounts in the organization.
     */
    autoEnable: pulumi.Input<boolean>;
    /**
     * Whether to automatically enable Security Hub default standards for new member accounts in the organization. By default, this parameter is equal to `DEFAULT`, and new member accounts are automatically enabled with default Security Hub standards. To opt out of enabling default standards for new member accounts, set this parameter equal to `NONE`.
     */
    autoEnableStandards?: pulumi.Input<string>;
}
