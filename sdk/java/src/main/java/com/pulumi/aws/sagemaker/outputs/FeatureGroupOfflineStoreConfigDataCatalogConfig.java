// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeatureGroupOfflineStoreConfigDataCatalogConfig {
    /**
     * @return The name of the Glue table catalog.
     * 
     */
    private @Nullable String catalog;
    /**
     * @return The name of the Glue table database.
     * 
     */
    private @Nullable String database;
    /**
     * @return The name of the Glue table.
     * 
     */
    private @Nullable String tableName;

    private FeatureGroupOfflineStoreConfigDataCatalogConfig() {}
    /**
     * @return The name of the Glue table catalog.
     * 
     */
    public Optional<String> catalog() {
        return Optional.ofNullable(this.catalog);
    }
    /**
     * @return The name of the Glue table database.
     * 
     */
    public Optional<String> database() {
        return Optional.ofNullable(this.database);
    }
    /**
     * @return The name of the Glue table.
     * 
     */
    public Optional<String> tableName() {
        return Optional.ofNullable(this.tableName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupOfflineStoreConfigDataCatalogConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String catalog;
        private @Nullable String database;
        private @Nullable String tableName;
        public Builder() {}
        public Builder(FeatureGroupOfflineStoreConfigDataCatalogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalog = defaults.catalog;
    	      this.database = defaults.database;
    	      this.tableName = defaults.tableName;
        }

        @CustomType.Setter
        public Builder catalog(@Nullable String catalog) {
            this.catalog = catalog;
            return this;
        }
        @CustomType.Setter
        public Builder database(@Nullable String database) {
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder tableName(@Nullable String tableName) {
            this.tableName = tableName;
            return this;
        }
        public FeatureGroupOfflineStoreConfigDataCatalogConfig build() {
            final var o = new FeatureGroupOfflineStoreConfigDataCatalogConfig();
            o.catalog = catalog;
            o.database = database;
            o.tableName = tableName;
            return o;
        }
    }
}
