// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.scheduler.inputs;

import com.pulumi.aws.scheduler.inputs.ScheduleFlexibleTimeWindowArgs;
import com.pulumi.aws.scheduler.inputs.ScheduleTargetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduleState extends com.pulumi.resources.ResourceArgs {

    public static final ScheduleState Empty = new ScheduleState();

    /**
     * ARN of the target of this schedule, such as a SQS queue or ECS cluster. For universal targets, this is a [Service ARN specific to the target service](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-targets-universal.html#supported-universal-targets).
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN of the target of this schedule, such as a SQS queue or ECS cluster. For universal targets, this is a [Service ARN specific to the target service](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-targets-universal.html#supported-universal-targets).
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Brief description of the schedule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Brief description of the schedule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The date, in UTC, before which the schedule can invoke its target. Depending on the schedule&#39;s recurrence expression, invocations might stop on, or before, the end date you specify. EventBridge Scheduler ignores the end date for one-time schedules. Example: `2030-01-01T01:00:00Z`.
     * 
     */
    @Import(name="endDate")
    private @Nullable Output<String> endDate;

    /**
     * @return The date, in UTC, before which the schedule can invoke its target. Depending on the schedule&#39;s recurrence expression, invocations might stop on, or before, the end date you specify. EventBridge Scheduler ignores the end date for one-time schedules. Example: `2030-01-01T01:00:00Z`.
     * 
     */
    public Optional<Output<String>> endDate() {
        return Optional.ofNullable(this.endDate);
    }

    /**
     * Configures a time window during which EventBridge Scheduler invokes the schedule. Detailed below.
     * 
     */
    @Import(name="flexibleTimeWindow")
    private @Nullable Output<ScheduleFlexibleTimeWindowArgs> flexibleTimeWindow;

    /**
     * @return Configures a time window during which EventBridge Scheduler invokes the schedule. Detailed below.
     * 
     */
    public Optional<Output<ScheduleFlexibleTimeWindowArgs>> flexibleTimeWindow() {
        return Optional.ofNullable(this.flexibleTimeWindow);
    }

    /**
     * Name of the schedule group to associate with this schedule. When omitted, the `default` schedule group is used.
     * 
     */
    @Import(name="groupName")
    private @Nullable Output<String> groupName;

    /**
     * @return Name of the schedule group to associate with this schedule. When omitted, the `default` schedule group is used.
     * 
     */
    public Optional<Output<String>> groupName() {
        return Optional.ofNullable(this.groupName);
    }

    /**
     * ARN for the customer managed KMS key that EventBridge Scheduler will use to encrypt and decrypt your data.
     * 
     */
    @Import(name="kmsKeyArn")
    private @Nullable Output<String> kmsKeyArn;

    /**
     * @return ARN for the customer managed KMS key that EventBridge Scheduler will use to encrypt and decrypt your data.
     * 
     */
    public Optional<Output<String>> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }

    /**
     * Name of the schedule. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the schedule. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * Defines when the schedule runs. Read more in [Schedule types on EventBridge Scheduler](https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html).
     * 
     */
    @Import(name="scheduleExpression")
    private @Nullable Output<String> scheduleExpression;

    /**
     * @return Defines when the schedule runs. Read more in [Schedule types on EventBridge Scheduler](https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html).
     * 
     */
    public Optional<Output<String>> scheduleExpression() {
        return Optional.ofNullable(this.scheduleExpression);
    }

    /**
     * Timezone in which the scheduling expression is evaluated. Defaults to `UTC`. Example: `Australia/Sydney`.
     * 
     */
    @Import(name="scheduleExpressionTimezone")
    private @Nullable Output<String> scheduleExpressionTimezone;

    /**
     * @return Timezone in which the scheduling expression is evaluated. Defaults to `UTC`. Example: `Australia/Sydney`.
     * 
     */
    public Optional<Output<String>> scheduleExpressionTimezone() {
        return Optional.ofNullable(this.scheduleExpressionTimezone);
    }

    /**
     * The date, in UTC, after which the schedule can begin invoking its target. Depending on the schedule&#39;s recurrence expression, invocations might occur on, or after, the start date you specify. EventBridge Scheduler ignores the start date for one-time schedules. Example: `2030-01-01T01:00:00Z`.
     * 
     */
    @Import(name="startDate")
    private @Nullable Output<String> startDate;

    /**
     * @return The date, in UTC, after which the schedule can begin invoking its target. Depending on the schedule&#39;s recurrence expression, invocations might occur on, or after, the start date you specify. EventBridge Scheduler ignores the start date for one-time schedules. Example: `2030-01-01T01:00:00Z`.
     * 
     */
    public Optional<Output<String>> startDate() {
        return Optional.ofNullable(this.startDate);
    }

    /**
     * Specifies whether the schedule is enabled or disabled. One of: `ENABLED` (default), `DISABLED`.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Specifies whether the schedule is enabled or disabled. One of: `ENABLED` (default), `DISABLED`.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Configures the target of the schedule. Detailed below.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="target")
    private @Nullable Output<ScheduleTargetArgs> target;

    /**
     * @return Configures the target of the schedule. Detailed below.
     * 
     * The following arguments are optional:
     * 
     */
    public Optional<Output<ScheduleTargetArgs>> target() {
        return Optional.ofNullable(this.target);
    }

    private ScheduleState() {}

    private ScheduleState(ScheduleState $) {
        this.arn = $.arn;
        this.description = $.description;
        this.endDate = $.endDate;
        this.flexibleTimeWindow = $.flexibleTimeWindow;
        this.groupName = $.groupName;
        this.kmsKeyArn = $.kmsKeyArn;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.scheduleExpression = $.scheduleExpression;
        this.scheduleExpressionTimezone = $.scheduleExpressionTimezone;
        this.startDate = $.startDate;
        this.state = $.state;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleState $;

        public Builder() {
            $ = new ScheduleState();
        }

        public Builder(ScheduleState defaults) {
            $ = new ScheduleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN of the target of this schedule, such as a SQS queue or ECS cluster. For universal targets, this is a [Service ARN specific to the target service](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-targets-universal.html#supported-universal-targets).
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN of the target of this schedule, such as a SQS queue or ECS cluster. For universal targets, this is a [Service ARN specific to the target service](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-targets-universal.html#supported-universal-targets).
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param description Brief description of the schedule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Brief description of the schedule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param endDate The date, in UTC, before which the schedule can invoke its target. Depending on the schedule&#39;s recurrence expression, invocations might stop on, or before, the end date you specify. EventBridge Scheduler ignores the end date for one-time schedules. Example: `2030-01-01T01:00:00Z`.
         * 
         * @return builder
         * 
         */
        public Builder endDate(@Nullable Output<String> endDate) {
            $.endDate = endDate;
            return this;
        }

        /**
         * @param endDate The date, in UTC, before which the schedule can invoke its target. Depending on the schedule&#39;s recurrence expression, invocations might stop on, or before, the end date you specify. EventBridge Scheduler ignores the end date for one-time schedules. Example: `2030-01-01T01:00:00Z`.
         * 
         * @return builder
         * 
         */
        public Builder endDate(String endDate) {
            return endDate(Output.of(endDate));
        }

        /**
         * @param flexibleTimeWindow Configures a time window during which EventBridge Scheduler invokes the schedule. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder flexibleTimeWindow(@Nullable Output<ScheduleFlexibleTimeWindowArgs> flexibleTimeWindow) {
            $.flexibleTimeWindow = flexibleTimeWindow;
            return this;
        }

        /**
         * @param flexibleTimeWindow Configures a time window during which EventBridge Scheduler invokes the schedule. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder flexibleTimeWindow(ScheduleFlexibleTimeWindowArgs flexibleTimeWindow) {
            return flexibleTimeWindow(Output.of(flexibleTimeWindow));
        }

        /**
         * @param groupName Name of the schedule group to associate with this schedule. When omitted, the `default` schedule group is used.
         * 
         * @return builder
         * 
         */
        public Builder groupName(@Nullable Output<String> groupName) {
            $.groupName = groupName;
            return this;
        }

        /**
         * @param groupName Name of the schedule group to associate with this schedule. When omitted, the `default` schedule group is used.
         * 
         * @return builder
         * 
         */
        public Builder groupName(String groupName) {
            return groupName(Output.of(groupName));
        }

        /**
         * @param kmsKeyArn ARN for the customer managed KMS key that EventBridge Scheduler will use to encrypt and decrypt your data.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            $.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * @param kmsKeyArn ARN for the customer managed KMS key that EventBridge Scheduler will use to encrypt and decrypt your data.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyArn(String kmsKeyArn) {
            return kmsKeyArn(Output.of(kmsKeyArn));
        }

        /**
         * @param name Name of the schedule. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the schedule. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namePrefix Creates a unique name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix Creates a unique name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        /**
         * @param scheduleExpression Defines when the schedule runs. Read more in [Schedule types on EventBridge Scheduler](https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html).
         * 
         * @return builder
         * 
         */
        public Builder scheduleExpression(@Nullable Output<String> scheduleExpression) {
            $.scheduleExpression = scheduleExpression;
            return this;
        }

        /**
         * @param scheduleExpression Defines when the schedule runs. Read more in [Schedule types on EventBridge Scheduler](https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html).
         * 
         * @return builder
         * 
         */
        public Builder scheduleExpression(String scheduleExpression) {
            return scheduleExpression(Output.of(scheduleExpression));
        }

        /**
         * @param scheduleExpressionTimezone Timezone in which the scheduling expression is evaluated. Defaults to `UTC`. Example: `Australia/Sydney`.
         * 
         * @return builder
         * 
         */
        public Builder scheduleExpressionTimezone(@Nullable Output<String> scheduleExpressionTimezone) {
            $.scheduleExpressionTimezone = scheduleExpressionTimezone;
            return this;
        }

        /**
         * @param scheduleExpressionTimezone Timezone in which the scheduling expression is evaluated. Defaults to `UTC`. Example: `Australia/Sydney`.
         * 
         * @return builder
         * 
         */
        public Builder scheduleExpressionTimezone(String scheduleExpressionTimezone) {
            return scheduleExpressionTimezone(Output.of(scheduleExpressionTimezone));
        }

        /**
         * @param startDate The date, in UTC, after which the schedule can begin invoking its target. Depending on the schedule&#39;s recurrence expression, invocations might occur on, or after, the start date you specify. EventBridge Scheduler ignores the start date for one-time schedules. Example: `2030-01-01T01:00:00Z`.
         * 
         * @return builder
         * 
         */
        public Builder startDate(@Nullable Output<String> startDate) {
            $.startDate = startDate;
            return this;
        }

        /**
         * @param startDate The date, in UTC, after which the schedule can begin invoking its target. Depending on the schedule&#39;s recurrence expression, invocations might occur on, or after, the start date you specify. EventBridge Scheduler ignores the start date for one-time schedules. Example: `2030-01-01T01:00:00Z`.
         * 
         * @return builder
         * 
         */
        public Builder startDate(String startDate) {
            return startDate(Output.of(startDate));
        }

        /**
         * @param state Specifies whether the schedule is enabled or disabled. One of: `ENABLED` (default), `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Specifies whether the schedule is enabled or disabled. One of: `ENABLED` (default), `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param target Configures the target of the schedule. Detailed below.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<ScheduleTargetArgs> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target Configures the target of the schedule. Detailed below.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder target(ScheduleTargetArgs target) {
            return target(Output.of(target));
        }

        public ScheduleState build() {
            return $;
        }
    }

}
