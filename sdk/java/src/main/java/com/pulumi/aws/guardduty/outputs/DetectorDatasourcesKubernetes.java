// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty.outputs;

import com.pulumi.aws.guardduty.outputs.DetectorDatasourcesKubernetesAuditLogs;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class DetectorDatasourcesKubernetes {
    /**
     * @return Configures Kubernetes audit logs as a data source for [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html).
     * See Kubernetes Audit Logs below for more details.
     * 
     */
    private DetectorDatasourcesKubernetesAuditLogs auditLogs;

    private DetectorDatasourcesKubernetes() {}
    /**
     * @return Configures Kubernetes audit logs as a data source for [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html).
     * See Kubernetes Audit Logs below for more details.
     * 
     */
    public DetectorDatasourcesKubernetesAuditLogs auditLogs() {
        return this.auditLogs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorDatasourcesKubernetes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private DetectorDatasourcesKubernetesAuditLogs auditLogs;
        public Builder() {}
        public Builder(DetectorDatasourcesKubernetes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogs = defaults.auditLogs;
        }

        @CustomType.Setter
        public Builder auditLogs(DetectorDatasourcesKubernetesAuditLogs auditLogs) {
            this.auditLogs = Objects.requireNonNull(auditLogs);
            return this;
        }
        public DetectorDatasourcesKubernetes build() {
            final var o = new DetectorDatasourcesKubernetes();
            o.auditLogs = auditLogs;
            return o;
        }
    }
}
