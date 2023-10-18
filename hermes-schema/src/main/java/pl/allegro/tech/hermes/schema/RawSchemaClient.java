package pl.allegro.tech.hermes.schema;

import java.util.List;
import java.util.Optional;
import pl.allegro.tech.hermes.api.RawSchemaWithMetadata;
import pl.allegro.tech.hermes.api.TopicName;

public interface RawSchemaClient {

    Optional<RawSchemaWithMetadata> getRawSchemaWithMetadata(TopicName topic, SchemaVersion version);

    Optional<RawSchemaWithMetadata> getRawSchemaWithMetadata(TopicName topic, SchemaId schemaId);

    Optional<RawSchemaWithMetadata> getLatestRawSchemaWithMetadata(TopicName topic);

    List<SchemaVersion> getVersions(TopicName topic);
}
