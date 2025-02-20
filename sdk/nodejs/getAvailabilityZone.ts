// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * `aws.getAvailabilityZone` provides details about a specific availability zone (AZ)
 * in the current region.
 *
 * This can be used both to validate an availability zone given in a variable
 * and to split the AZ name into its component parts of an AWS region and an
 * AZ identifier letter. The latter may be useful e.g., for implementing a
 * consistent subnet numbering scheme across several regions by mapping both
 * the region and the subnet letter to network numbers.
 *
 * This is different from the `aws.getAvailabilityZones` (plural) data source,
 * which provides a list of the available zones.
 */
export function getAvailabilityZone(args?: GetAvailabilityZoneArgs, opts?: pulumi.InvokeOptions): Promise<GetAvailabilityZoneResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:index/getAvailabilityZone:getAvailabilityZone", {
        "allAvailabilityZones": args.allAvailabilityZones,
        "filters": args.filters,
        "name": args.name,
        "state": args.state,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAvailabilityZone.
 */
export interface GetAvailabilityZoneArgs {
    /**
     * Set to `true` to include all Availability Zones and Local Zones regardless of your opt in status.
     */
    allAvailabilityZones?: boolean;
    /**
     * Configuration block(s) for filtering. Detailed below.
     */
    filters?: inputs.GetAvailabilityZoneFilter[];
    /**
     * Full name of the availability zone to select.
     */
    name?: string;
    /**
     * Specific availability zone state to require. May be any of `"available"`, `"information"` or `"impaired"`.
     */
    state?: string;
    /**
     * Zone ID of the availability zone to select.
     */
    zoneId?: string;
}

/**
 * A collection of values returned by getAvailabilityZone.
 */
export interface GetAvailabilityZoneResult {
    readonly allAvailabilityZones?: boolean;
    readonly filters?: outputs.GetAvailabilityZoneFilter[];
    /**
     * For Availability Zones, this is the same value as the Region name. For Local Zones, the name of the associated group, for example `us-west-2-lax-1`.
     */
    readonly groupName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * Part of the AZ name that appears after the region name, uniquely identifying the AZ within its region.
     * For Availability Zones this is usually a single letter, for example `a` for the `us-west-2a` zone.
     * For Local and Wavelength Zones this is a longer string, for example `wl1-sfo-wlz-1` for the `us-west-2-wl1-sfo-wlz-1` zone.
     */
    readonly nameSuffix: string;
    /**
     * The name of the location from which the address is advertised.
     */
    readonly networkBorderGroup: string;
    /**
     * For Availability Zones, this always has the value of `opt-in-not-required`. For Local Zones, this is the opt in status. The possible values are `opted-in` and `not-opted-in`.
     */
    readonly optInStatus: string;
    /**
     * ID of the zone that handles some of the Local Zone or Wavelength Zone control plane operations, such as API calls.
     */
    readonly parentZoneId: string;
    /**
     * Name of the zone that handles some of the Local Zone or Wavelength Zone control plane operations, such as API calls.
     */
    readonly parentZoneName: string;
    /**
     * Region where the selected availability zone resides. This is always the region selected on the provider, since this data source searches only within that region.
     */
    readonly region: string;
    readonly state: string;
    readonly zoneId: string;
    /**
     * Type of zone. Values are `availability-zone`, `local-zone`, and `wavelength-zone`.
     */
    readonly zoneType: string;
}
/**
 * `aws.getAvailabilityZone` provides details about a specific availability zone (AZ)
 * in the current region.
 *
 * This can be used both to validate an availability zone given in a variable
 * and to split the AZ name into its component parts of an AWS region and an
 * AZ identifier letter. The latter may be useful e.g., for implementing a
 * consistent subnet numbering scheme across several regions by mapping both
 * the region and the subnet letter to network numbers.
 *
 * This is different from the `aws.getAvailabilityZones` (plural) data source,
 * which provides a list of the available zones.
 */
export function getAvailabilityZoneOutput(args?: GetAvailabilityZoneOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAvailabilityZoneResult> {
    return pulumi.output(args).apply((a: any) => getAvailabilityZone(a, opts))
}

/**
 * A collection of arguments for invoking getAvailabilityZone.
 */
export interface GetAvailabilityZoneOutputArgs {
    /**
     * Set to `true` to include all Availability Zones and Local Zones regardless of your opt in status.
     */
    allAvailabilityZones?: pulumi.Input<boolean>;
    /**
     * Configuration block(s) for filtering. Detailed below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetAvailabilityZoneFilterArgs>[]>;
    /**
     * Full name of the availability zone to select.
     */
    name?: pulumi.Input<string>;
    /**
     * Specific availability zone state to require. May be any of `"available"`, `"information"` or `"impaired"`.
     */
    state?: pulumi.Input<string>;
    /**
     * Zone ID of the availability zone to select.
     */
    zoneId?: pulumi.Input<string>;
}
