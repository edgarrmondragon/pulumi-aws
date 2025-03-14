// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReportPlanReportDeliveryChannelArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReportPlanReportDeliveryChannelArgs Empty = new ReportPlanReportDeliveryChannelArgs();

    /**
     * A list of the format of your reports: CSV, JSON, or both. If not specified, the default format is CSV.
     * 
     */
    @Import(name="formats")
    private @Nullable Output<List<String>> formats;

    /**
     * @return A list of the format of your reports: CSV, JSON, or both. If not specified, the default format is CSV.
     * 
     */
    public Optional<Output<List<String>>> formats() {
        return Optional.ofNullable(this.formats);
    }

    /**
     * The unique name of the S3 bucket that receives your reports.
     * 
     */
    @Import(name="s3BucketName", required=true)
    private Output<String> s3BucketName;

    /**
     * @return The unique name of the S3 bucket that receives your reports.
     * 
     */
    public Output<String> s3BucketName() {
        return this.s3BucketName;
    }

    /**
     * The prefix for where Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of the following path: s3://your-bucket-name/prefix/Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
     * 
     */
    @Import(name="s3KeyPrefix")
    private @Nullable Output<String> s3KeyPrefix;

    /**
     * @return The prefix for where Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of the following path: s3://your-bucket-name/prefix/Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
     * 
     */
    public Optional<Output<String>> s3KeyPrefix() {
        return Optional.ofNullable(this.s3KeyPrefix);
    }

    private ReportPlanReportDeliveryChannelArgs() {}

    private ReportPlanReportDeliveryChannelArgs(ReportPlanReportDeliveryChannelArgs $) {
        this.formats = $.formats;
        this.s3BucketName = $.s3BucketName;
        this.s3KeyPrefix = $.s3KeyPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportPlanReportDeliveryChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportPlanReportDeliveryChannelArgs $;

        public Builder() {
            $ = new ReportPlanReportDeliveryChannelArgs();
        }

        public Builder(ReportPlanReportDeliveryChannelArgs defaults) {
            $ = new ReportPlanReportDeliveryChannelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param formats A list of the format of your reports: CSV, JSON, or both. If not specified, the default format is CSV.
         * 
         * @return builder
         * 
         */
        public Builder formats(@Nullable Output<List<String>> formats) {
            $.formats = formats;
            return this;
        }

        /**
         * @param formats A list of the format of your reports: CSV, JSON, or both. If not specified, the default format is CSV.
         * 
         * @return builder
         * 
         */
        public Builder formats(List<String> formats) {
            return formats(Output.of(formats));
        }

        /**
         * @param formats A list of the format of your reports: CSV, JSON, or both. If not specified, the default format is CSV.
         * 
         * @return builder
         * 
         */
        public Builder formats(String... formats) {
            return formats(List.of(formats));
        }

        /**
         * @param s3BucketName The unique name of the S3 bucket that receives your reports.
         * 
         * @return builder
         * 
         */
        public Builder s3BucketName(Output<String> s3BucketName) {
            $.s3BucketName = s3BucketName;
            return this;
        }

        /**
         * @param s3BucketName The unique name of the S3 bucket that receives your reports.
         * 
         * @return builder
         * 
         */
        public Builder s3BucketName(String s3BucketName) {
            return s3BucketName(Output.of(s3BucketName));
        }

        /**
         * @param s3KeyPrefix The prefix for where Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of the following path: s3://your-bucket-name/prefix/Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
         * 
         * @return builder
         * 
         */
        public Builder s3KeyPrefix(@Nullable Output<String> s3KeyPrefix) {
            $.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        /**
         * @param s3KeyPrefix The prefix for where Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of the following path: s3://your-bucket-name/prefix/Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
         * 
         * @return builder
         * 
         */
        public Builder s3KeyPrefix(String s3KeyPrefix) {
            return s3KeyPrefix(Output.of(s3KeyPrefix));
        }

        public ReportPlanReportDeliveryChannelArgs build() {
            $.s3BucketName = Objects.requireNonNull($.s3BucketName, "expected parameter 's3BucketName' to be non-null");
            return $;
        }
    }

}
