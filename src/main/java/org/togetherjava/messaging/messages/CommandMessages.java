package org.togetherjava.messaging.messages;

import org.togetherjava.messaging.BotMessage.MessageCategory;
import org.togetherjava.messaging.ComplexMessage;
import org.togetherjava.messaging.SimpleMessage;

public final class CommandMessages {

  private CommandMessages() {
    throw new AssertionError("No instantiation");
  }


  public static SimpleMessage commandNotFound(String path) {
    return SimpleMessage.error("Command '" + path + "' not found");
  }

  public static ComplexMessage commandError(String error) {
    return new ComplexMessage(MessageCategory.ERROR)
        .editMessage(it -> it.setContent("Error executing command:"))
        .editEmbed(it -> it.setDescription(error));
  }
}
