package pl.allegro.tech.hermes.integrationtests.management;

import static org.awaitility.Awaitility.await;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import pl.allegro.tech.hermes.integrationtests.setup.HermesExtension;

public class HealthCheckTest {

  @RegisterExtension public static final HermesExtension hermes = new HermesExtension();

  @Test
  public void shouldManagementBeHealthy() {
    // given
    WebTestClient.ResponseSpec response = hermes.api().getManagementHealth();

    // when & then
    await().atMost(5, TimeUnit.SECONDS).untilAsserted(() -> response.expectStatus().isOk());
  }
}
