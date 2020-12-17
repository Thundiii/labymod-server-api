package net.labymod.serverapi.bukkit.event;

import java.util.UUID;

/** Is fired when a custom payload message is received from the client. */
public class BukkitReceivePayloadEvent extends BukkitLabyModEvent {

  private final UUID uniqueId;
  private final String identifier;
  private final byte[] payload;

  public BukkitReceivePayloadEvent(UUID uniqueId, String identifier, byte[] payload) {
    this.uniqueId = uniqueId;
    this.identifier = identifier;
    this.payload = payload;
  }

  /**
   * Retrieves the unique identifier of the client player.
   *
   * @return The unique identifier of the client player.
   */
  public UUID getUniqueId() {
    return uniqueId;
  }

  /**
   * Retrieves the channel identifier to which the payload was sent.
   *
   * @return The channel identifier to which the payload was sent.
   */
  public String getIdentifier() {
    return identifier;
  }

  /**
   * Retrieves the sent payload.
   *
   * @return The sent payload.
   */
  public byte[] getPayload() {
    return payload;
  }
}
