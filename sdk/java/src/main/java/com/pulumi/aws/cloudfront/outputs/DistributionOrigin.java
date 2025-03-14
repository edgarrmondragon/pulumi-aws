// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.DistributionOriginCustomHeader;
import com.pulumi.aws.cloudfront.outputs.DistributionOriginCustomOriginConfig;
import com.pulumi.aws.cloudfront.outputs.DistributionOriginOriginShield;
import com.pulumi.aws.cloudfront.outputs.DistributionOriginS3OriginConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DistributionOrigin {
    /**
     * @return Number of times that CloudFront attempts to connect to the origin. Must be between 1-3. Defaults to 3.
     * 
     */
    private @Nullable Integer connectionAttempts;
    /**
     * @return Number of seconds that CloudFront waits when trying to establish a connection to the origin. Must be between 1-10. Defaults to 10.
     * 
     */
    private @Nullable Integer connectionTimeout;
    /**
     * @return One or more sub-resources with `name` and `value` parameters that specify header data that will be sent to the origin (multiples allowed).
     * 
     */
    private @Nullable List<DistributionOriginCustomHeader> customHeaders;
    /**
     * @return The CloudFront custom origin configuration information. If an S3 origin is required, use `origin_access_control_id` or `s3_origin_config` instead.
     * 
     */
    private @Nullable DistributionOriginCustomOriginConfig customOriginConfig;
    /**
     * @return DNS domain name of either the S3 bucket, or web site of your custom origin.
     * 
     */
    private String domainName;
    /**
     * @return Unique identifier of a [CloudFront origin access control][8] for this origin.
     * 
     */
    private @Nullable String originAccessControlId;
    /**
     * @return Unique identifier for the origin.
     * 
     */
    private String originId;
    /**
     * @return Optional element that causes CloudFront to request your content from a directory in your Amazon S3 bucket or your custom origin.
     * 
     */
    private @Nullable String originPath;
    /**
     * @return The CloudFront Origin Shield configuration information. Using Origin Shield can help reduce the load on your origin. For more information, see [Using Origin Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html) in the Amazon CloudFront Developer Guide.
     * 
     */
    private @Nullable DistributionOriginOriginShield originShield;
    /**
     * @return The CloudFront S3 origin configuration information. If a custom origin is required, use `custom_origin_config` instead.
     * 
     */
    private @Nullable DistributionOriginS3OriginConfig s3OriginConfig;

    private DistributionOrigin() {}
    /**
     * @return Number of times that CloudFront attempts to connect to the origin. Must be between 1-3. Defaults to 3.
     * 
     */
    public Optional<Integer> connectionAttempts() {
        return Optional.ofNullable(this.connectionAttempts);
    }
    /**
     * @return Number of seconds that CloudFront waits when trying to establish a connection to the origin. Must be between 1-10. Defaults to 10.
     * 
     */
    public Optional<Integer> connectionTimeout() {
        return Optional.ofNullable(this.connectionTimeout);
    }
    /**
     * @return One or more sub-resources with `name` and `value` parameters that specify header data that will be sent to the origin (multiples allowed).
     * 
     */
    public List<DistributionOriginCustomHeader> customHeaders() {
        return this.customHeaders == null ? List.of() : this.customHeaders;
    }
    /**
     * @return The CloudFront custom origin configuration information. If an S3 origin is required, use `origin_access_control_id` or `s3_origin_config` instead.
     * 
     */
    public Optional<DistributionOriginCustomOriginConfig> customOriginConfig() {
        return Optional.ofNullable(this.customOriginConfig);
    }
    /**
     * @return DNS domain name of either the S3 bucket, or web site of your custom origin.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return Unique identifier of a [CloudFront origin access control][8] for this origin.
     * 
     */
    public Optional<String> originAccessControlId() {
        return Optional.ofNullable(this.originAccessControlId);
    }
    /**
     * @return Unique identifier for the origin.
     * 
     */
    public String originId() {
        return this.originId;
    }
    /**
     * @return Optional element that causes CloudFront to request your content from a directory in your Amazon S3 bucket or your custom origin.
     * 
     */
    public Optional<String> originPath() {
        return Optional.ofNullable(this.originPath);
    }
    /**
     * @return The CloudFront Origin Shield configuration information. Using Origin Shield can help reduce the load on your origin. For more information, see [Using Origin Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html) in the Amazon CloudFront Developer Guide.
     * 
     */
    public Optional<DistributionOriginOriginShield> originShield() {
        return Optional.ofNullable(this.originShield);
    }
    /**
     * @return The CloudFront S3 origin configuration information. If a custom origin is required, use `custom_origin_config` instead.
     * 
     */
    public Optional<DistributionOriginS3OriginConfig> s3OriginConfig() {
        return Optional.ofNullable(this.s3OriginConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOrigin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer connectionAttempts;
        private @Nullable Integer connectionTimeout;
        private @Nullable List<DistributionOriginCustomHeader> customHeaders;
        private @Nullable DistributionOriginCustomOriginConfig customOriginConfig;
        private String domainName;
        private @Nullable String originAccessControlId;
        private String originId;
        private @Nullable String originPath;
        private @Nullable DistributionOriginOriginShield originShield;
        private @Nullable DistributionOriginS3OriginConfig s3OriginConfig;
        public Builder() {}
        public Builder(DistributionOrigin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionAttempts = defaults.connectionAttempts;
    	      this.connectionTimeout = defaults.connectionTimeout;
    	      this.customHeaders = defaults.customHeaders;
    	      this.customOriginConfig = defaults.customOriginConfig;
    	      this.domainName = defaults.domainName;
    	      this.originAccessControlId = defaults.originAccessControlId;
    	      this.originId = defaults.originId;
    	      this.originPath = defaults.originPath;
    	      this.originShield = defaults.originShield;
    	      this.s3OriginConfig = defaults.s3OriginConfig;
        }

        @CustomType.Setter
        public Builder connectionAttempts(@Nullable Integer connectionAttempts) {
            this.connectionAttempts = connectionAttempts;
            return this;
        }
        @CustomType.Setter
        public Builder connectionTimeout(@Nullable Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder customHeaders(@Nullable List<DistributionOriginCustomHeader> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }
        public Builder customHeaders(DistributionOriginCustomHeader... customHeaders) {
            return customHeaders(List.of(customHeaders));
        }
        @CustomType.Setter
        public Builder customOriginConfig(@Nullable DistributionOriginCustomOriginConfig customOriginConfig) {
            this.customOriginConfig = customOriginConfig;
            return this;
        }
        @CustomType.Setter
        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        @CustomType.Setter
        public Builder originAccessControlId(@Nullable String originAccessControlId) {
            this.originAccessControlId = originAccessControlId;
            return this;
        }
        @CustomType.Setter
        public Builder originId(String originId) {
            this.originId = Objects.requireNonNull(originId);
            return this;
        }
        @CustomType.Setter
        public Builder originPath(@Nullable String originPath) {
            this.originPath = originPath;
            return this;
        }
        @CustomType.Setter
        public Builder originShield(@Nullable DistributionOriginOriginShield originShield) {
            this.originShield = originShield;
            return this;
        }
        @CustomType.Setter
        public Builder s3OriginConfig(@Nullable DistributionOriginS3OriginConfig s3OriginConfig) {
            this.s3OriginConfig = s3OriginConfig;
            return this;
        }
        public DistributionOrigin build() {
            final var o = new DistributionOrigin();
            o.connectionAttempts = connectionAttempts;
            o.connectionTimeout = connectionTimeout;
            o.customHeaders = customHeaders;
            o.customOriginConfig = customOriginConfig;
            o.domainName = domainName;
            o.originAccessControlId = originAccessControlId;
            o.originId = originId;
            o.originPath = originPath;
            o.originShield = originShield;
            o.s3OriginConfig = s3OriginConfig;
            return o;
        }
    }
}
