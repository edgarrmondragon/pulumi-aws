// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.waf.inputs.GetIpsetArgs;
import com.pulumi.aws.waf.inputs.GetIpsetPlainArgs;
import com.pulumi.aws.waf.inputs.GetRateBasedRuleArgs;
import com.pulumi.aws.waf.inputs.GetRateBasedRulePlainArgs;
import com.pulumi.aws.waf.inputs.GetRuleArgs;
import com.pulumi.aws.waf.inputs.GetRulePlainArgs;
import com.pulumi.aws.waf.inputs.GetSubscribedRuleGroupArgs;
import com.pulumi.aws.waf.inputs.GetSubscribedRuleGroupPlainArgs;
import com.pulumi.aws.waf.inputs.GetWebAclArgs;
import com.pulumi.aws.waf.inputs.GetWebAclPlainArgs;
import com.pulumi.aws.waf.outputs.GetIpsetResult;
import com.pulumi.aws.waf.outputs.GetRateBasedRuleResult;
import com.pulumi.aws.waf.outputs.GetRuleResult;
import com.pulumi.aws.waf.outputs.GetSubscribedRuleGroupResult;
import com.pulumi.aws.waf.outputs.GetWebAclResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class WafFunctions {
    /**
     * `aws.waf.IpSet` Retrieves a WAF IP Set Resource Id.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetIpsetArgs;
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
     *         final var example = WafFunctions.getIpset(GetIpsetArgs.builder()
     *             .name(&#34;tfWAFIPSet&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetIpsetResult> getIpset(GetIpsetArgs args) {
        return getIpset(args, InvokeOptions.Empty);
    }
    /**
     * `aws.waf.IpSet` Retrieves a WAF IP Set Resource Id.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetIpsetArgs;
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
     *         final var example = WafFunctions.getIpset(GetIpsetArgs.builder()
     *             .name(&#34;tfWAFIPSet&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetIpsetResult> getIpsetPlain(GetIpsetPlainArgs args) {
        return getIpsetPlain(args, InvokeOptions.Empty);
    }
    /**
     * `aws.waf.IpSet` Retrieves a WAF IP Set Resource Id.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetIpsetArgs;
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
     *         final var example = WafFunctions.getIpset(GetIpsetArgs.builder()
     *             .name(&#34;tfWAFIPSet&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetIpsetResult> getIpset(GetIpsetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:waf/getIpset:getIpset", TypeShape.of(GetIpsetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.waf.IpSet` Retrieves a WAF IP Set Resource Id.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetIpsetArgs;
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
     *         final var example = WafFunctions.getIpset(GetIpsetArgs.builder()
     *             .name(&#34;tfWAFIPSet&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetIpsetResult> getIpsetPlain(GetIpsetPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:waf/getIpset:getIpset", TypeShape.of(GetIpsetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.waf.RateBasedRule` Retrieves a WAF Rate Based Rule Resource Id.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetRateBasedRuleArgs;
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
     *         final var example = WafFunctions.getRateBasedRule(GetRateBasedRuleArgs.builder()
     *             .name(&#34;tfWAFRateBasedRule&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetRateBasedRuleResult> getRateBasedRule(GetRateBasedRuleArgs args) {
        return getRateBasedRule(args, InvokeOptions.Empty);
    }
    /**
     * `aws.waf.RateBasedRule` Retrieves a WAF Rate Based Rule Resource Id.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetRateBasedRuleArgs;
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
     *         final var example = WafFunctions.getRateBasedRule(GetRateBasedRuleArgs.builder()
     *             .name(&#34;tfWAFRateBasedRule&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRateBasedRuleResult> getRateBasedRulePlain(GetRateBasedRulePlainArgs args) {
        return getRateBasedRulePlain(args, InvokeOptions.Empty);
    }
    /**
     * `aws.waf.RateBasedRule` Retrieves a WAF Rate Based Rule Resource Id.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetRateBasedRuleArgs;
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
     *         final var example = WafFunctions.getRateBasedRule(GetRateBasedRuleArgs.builder()
     *             .name(&#34;tfWAFRateBasedRule&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetRateBasedRuleResult> getRateBasedRule(GetRateBasedRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:waf/getRateBasedRule:getRateBasedRule", TypeShape.of(GetRateBasedRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.waf.RateBasedRule` Retrieves a WAF Rate Based Rule Resource Id.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetRateBasedRuleArgs;
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
     *         final var example = WafFunctions.getRateBasedRule(GetRateBasedRuleArgs.builder()
     *             .name(&#34;tfWAFRateBasedRule&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRateBasedRuleResult> getRateBasedRulePlain(GetRateBasedRulePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:waf/getRateBasedRule:getRateBasedRule", TypeShape.of(GetRateBasedRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.waf.Rule` Retrieves a WAF Rule Resource Id.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetRuleArgs;
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
     *         final var example = WafFunctions.getRule(GetRuleArgs.builder()
     *             .name(&#34;tfWAFRule&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetRuleResult> getRule(GetRuleArgs args) {
        return getRule(args, InvokeOptions.Empty);
    }
    /**
     * `aws.waf.Rule` Retrieves a WAF Rule Resource Id.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetRuleArgs;
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
     *         final var example = WafFunctions.getRule(GetRuleArgs.builder()
     *             .name(&#34;tfWAFRule&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRuleResult> getRulePlain(GetRulePlainArgs args) {
        return getRulePlain(args, InvokeOptions.Empty);
    }
    /**
     * `aws.waf.Rule` Retrieves a WAF Rule Resource Id.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetRuleArgs;
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
     *         final var example = WafFunctions.getRule(GetRuleArgs.builder()
     *             .name(&#34;tfWAFRule&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetRuleResult> getRule(GetRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:waf/getRule:getRule", TypeShape.of(GetRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.waf.Rule` Retrieves a WAF Rule Resource Id.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetRuleArgs;
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
     *         final var example = WafFunctions.getRule(GetRuleArgs.builder()
     *             .name(&#34;tfWAFRule&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRuleResult> getRulePlain(GetRulePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:waf/getRule:getRule", TypeShape.of(GetRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.waf.getSubscribedRuleGroup` retrieves information about a Managed WAF Rule Group from AWS Marketplace (needs to be subscribed to first).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetSubscribedRuleGroupArgs;
     * import com.pulumi.aws.waf.WebAcl;
     * import com.pulumi.aws.waf.WebAclArgs;
     * import com.pulumi.aws.waf.inputs.WebAclRuleArgs;
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
     *         final var byName = WafFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .name(&#34;F5 Bot Detection Signatures For AWS WAF&#34;)
     *             .build());
     * 
     *         final var byMetricName = WafFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .metricName(&#34;F5BotDetectionSignatures&#34;)
     *             .build());
     * 
     *         var acl = new WebAcl(&#34;acl&#34;, WebAclArgs.builder()        
     *             .rules(            
     *                 WebAclRuleArgs.builder()
     *                     .priority(1)
     *                     .ruleId(byName.applyValue(getSubscribedRuleGroupResult -&gt; getSubscribedRuleGroupResult.id()))
     *                     .type(&#34;GROUP&#34;)
     *                     .build(),
     *                 WebAclRuleArgs.builder()
     *                     .priority(2)
     *                     .ruleId(byMetricName.applyValue(getSubscribedRuleGroupResult -&gt; getSubscribedRuleGroupResult.id()))
     *                     .type(&#34;GROUP&#34;)
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSubscribedRuleGroupResult> getSubscribedRuleGroup() {
        return getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * `aws.waf.getSubscribedRuleGroup` retrieves information about a Managed WAF Rule Group from AWS Marketplace (needs to be subscribed to first).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetSubscribedRuleGroupArgs;
     * import com.pulumi.aws.waf.WebAcl;
     * import com.pulumi.aws.waf.WebAclArgs;
     * import com.pulumi.aws.waf.inputs.WebAclRuleArgs;
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
     *         final var byName = WafFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .name(&#34;F5 Bot Detection Signatures For AWS WAF&#34;)
     *             .build());
     * 
     *         final var byMetricName = WafFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .metricName(&#34;F5BotDetectionSignatures&#34;)
     *             .build());
     * 
     *         var acl = new WebAcl(&#34;acl&#34;, WebAclArgs.builder()        
     *             .rules(            
     *                 WebAclRuleArgs.builder()
     *                     .priority(1)
     *                     .ruleId(byName.applyValue(getSubscribedRuleGroupResult -&gt; getSubscribedRuleGroupResult.id()))
     *                     .type(&#34;GROUP&#34;)
     *                     .build(),
     *                 WebAclRuleArgs.builder()
     *                     .priority(2)
     *                     .ruleId(byMetricName.applyValue(getSubscribedRuleGroupResult -&gt; getSubscribedRuleGroupResult.id()))
     *                     .type(&#34;GROUP&#34;)
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSubscribedRuleGroupResult> getSubscribedRuleGroupPlain() {
        return getSubscribedRuleGroupPlain(GetSubscribedRuleGroupPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * `aws.waf.getSubscribedRuleGroup` retrieves information about a Managed WAF Rule Group from AWS Marketplace (needs to be subscribed to first).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetSubscribedRuleGroupArgs;
     * import com.pulumi.aws.waf.WebAcl;
     * import com.pulumi.aws.waf.WebAclArgs;
     * import com.pulumi.aws.waf.inputs.WebAclRuleArgs;
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
     *         final var byName = WafFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .name(&#34;F5 Bot Detection Signatures For AWS WAF&#34;)
     *             .build());
     * 
     *         final var byMetricName = WafFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .metricName(&#34;F5BotDetectionSignatures&#34;)
     *             .build());
     * 
     *         var acl = new WebAcl(&#34;acl&#34;, WebAclArgs.builder()        
     *             .rules(            
     *                 WebAclRuleArgs.builder()
     *                     .priority(1)
     *                     .ruleId(byName.applyValue(getSubscribedRuleGroupResult -&gt; getSubscribedRuleGroupResult.id()))
     *                     .type(&#34;GROUP&#34;)
     *                     .build(),
     *                 WebAclRuleArgs.builder()
     *                     .priority(2)
     *                     .ruleId(byMetricName.applyValue(getSubscribedRuleGroupResult -&gt; getSubscribedRuleGroupResult.id()))
     *                     .type(&#34;GROUP&#34;)
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSubscribedRuleGroupResult> getSubscribedRuleGroup(GetSubscribedRuleGroupArgs args) {
        return getSubscribedRuleGroup(args, InvokeOptions.Empty);
    }
    /**
     * `aws.waf.getSubscribedRuleGroup` retrieves information about a Managed WAF Rule Group from AWS Marketplace (needs to be subscribed to first).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetSubscribedRuleGroupArgs;
     * import com.pulumi.aws.waf.WebAcl;
     * import com.pulumi.aws.waf.WebAclArgs;
     * import com.pulumi.aws.waf.inputs.WebAclRuleArgs;
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
     *         final var byName = WafFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .name(&#34;F5 Bot Detection Signatures For AWS WAF&#34;)
     *             .build());
     * 
     *         final var byMetricName = WafFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .metricName(&#34;F5BotDetectionSignatures&#34;)
     *             .build());
     * 
     *         var acl = new WebAcl(&#34;acl&#34;, WebAclArgs.builder()        
     *             .rules(            
     *                 WebAclRuleArgs.builder()
     *                     .priority(1)
     *                     .ruleId(byName.applyValue(getSubscribedRuleGroupResult -&gt; getSubscribedRuleGroupResult.id()))
     *                     .type(&#34;GROUP&#34;)
     *                     .build(),
     *                 WebAclRuleArgs.builder()
     *                     .priority(2)
     *                     .ruleId(byMetricName.applyValue(getSubscribedRuleGroupResult -&gt; getSubscribedRuleGroupResult.id()))
     *                     .type(&#34;GROUP&#34;)
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSubscribedRuleGroupResult> getSubscribedRuleGroupPlain(GetSubscribedRuleGroupPlainArgs args) {
        return getSubscribedRuleGroupPlain(args, InvokeOptions.Empty);
    }
    /**
     * `aws.waf.getSubscribedRuleGroup` retrieves information about a Managed WAF Rule Group from AWS Marketplace (needs to be subscribed to first).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetSubscribedRuleGroupArgs;
     * import com.pulumi.aws.waf.WebAcl;
     * import com.pulumi.aws.waf.WebAclArgs;
     * import com.pulumi.aws.waf.inputs.WebAclRuleArgs;
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
     *         final var byName = WafFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .name(&#34;F5 Bot Detection Signatures For AWS WAF&#34;)
     *             .build());
     * 
     *         final var byMetricName = WafFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .metricName(&#34;F5BotDetectionSignatures&#34;)
     *             .build());
     * 
     *         var acl = new WebAcl(&#34;acl&#34;, WebAclArgs.builder()        
     *             .rules(            
     *                 WebAclRuleArgs.builder()
     *                     .priority(1)
     *                     .ruleId(byName.applyValue(getSubscribedRuleGroupResult -&gt; getSubscribedRuleGroupResult.id()))
     *                     .type(&#34;GROUP&#34;)
     *                     .build(),
     *                 WebAclRuleArgs.builder()
     *                     .priority(2)
     *                     .ruleId(byMetricName.applyValue(getSubscribedRuleGroupResult -&gt; getSubscribedRuleGroupResult.id()))
     *                     .type(&#34;GROUP&#34;)
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSubscribedRuleGroupResult> getSubscribedRuleGroup(GetSubscribedRuleGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:waf/getSubscribedRuleGroup:getSubscribedRuleGroup", TypeShape.of(GetSubscribedRuleGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.waf.getSubscribedRuleGroup` retrieves information about a Managed WAF Rule Group from AWS Marketplace (needs to be subscribed to first).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetSubscribedRuleGroupArgs;
     * import com.pulumi.aws.waf.WebAcl;
     * import com.pulumi.aws.waf.WebAclArgs;
     * import com.pulumi.aws.waf.inputs.WebAclRuleArgs;
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
     *         final var byName = WafFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .name(&#34;F5 Bot Detection Signatures For AWS WAF&#34;)
     *             .build());
     * 
     *         final var byMetricName = WafFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .metricName(&#34;F5BotDetectionSignatures&#34;)
     *             .build());
     * 
     *         var acl = new WebAcl(&#34;acl&#34;, WebAclArgs.builder()        
     *             .rules(            
     *                 WebAclRuleArgs.builder()
     *                     .priority(1)
     *                     .ruleId(byName.applyValue(getSubscribedRuleGroupResult -&gt; getSubscribedRuleGroupResult.id()))
     *                     .type(&#34;GROUP&#34;)
     *                     .build(),
     *                 WebAclRuleArgs.builder()
     *                     .priority(2)
     *                     .ruleId(byMetricName.applyValue(getSubscribedRuleGroupResult -&gt; getSubscribedRuleGroupResult.id()))
     *                     .type(&#34;GROUP&#34;)
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSubscribedRuleGroupResult> getSubscribedRuleGroupPlain(GetSubscribedRuleGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:waf/getSubscribedRuleGroup:getSubscribedRuleGroup", TypeShape.of(GetSubscribedRuleGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.waf.WebAcl` Retrieves a WAF Web ACL Resource Id.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetWebAclArgs;
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
     *         final var example = WafFunctions.getWebAcl(GetWebAclArgs.builder()
     *             .name(&#34;tfWAFWebACL&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetWebAclResult> getWebAcl(GetWebAclArgs args) {
        return getWebAcl(args, InvokeOptions.Empty);
    }
    /**
     * `aws.waf.WebAcl` Retrieves a WAF Web ACL Resource Id.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetWebAclArgs;
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
     *         final var example = WafFunctions.getWebAcl(GetWebAclArgs.builder()
     *             .name(&#34;tfWAFWebACL&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWebAclResult> getWebAclPlain(GetWebAclPlainArgs args) {
        return getWebAclPlain(args, InvokeOptions.Empty);
    }
    /**
     * `aws.waf.WebAcl` Retrieves a WAF Web ACL Resource Id.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetWebAclArgs;
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
     *         final var example = WafFunctions.getWebAcl(GetWebAclArgs.builder()
     *             .name(&#34;tfWAFWebACL&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetWebAclResult> getWebAcl(GetWebAclArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:waf/getWebAcl:getWebAcl", TypeShape.of(GetWebAclResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.waf.WebAcl` Retrieves a WAF Web ACL Resource Id.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.waf.WafFunctions;
     * import com.pulumi.aws.waf.inputs.GetWebAclArgs;
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
     *         final var example = WafFunctions.getWebAcl(GetWebAclArgs.builder()
     *             .name(&#34;tfWAFWebACL&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWebAclResult> getWebAclPlain(GetWebAclPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:waf/getWebAcl:getWebAcl", TypeShape.of(GetWebAclResult.class), args, Utilities.withVersion(options));
    }
}
