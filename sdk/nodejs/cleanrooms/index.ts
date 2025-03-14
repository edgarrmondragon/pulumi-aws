// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { CollaborationArgs, CollaborationState } from "./collaboration";
export type Collaboration = import("./collaboration").Collaboration;
export const Collaboration: typeof import("./collaboration").Collaboration = null as any;
utilities.lazyLoad(exports, ["Collaboration"], () => require("./collaboration"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:cleanrooms/collaboration:Collaboration":
                return new Collaboration(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "cleanrooms/collaboration", _module)
