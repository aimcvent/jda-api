package fr.aimcvent.jda.api.interaction;

import java.util.List;

public interface Interactions {
    List<ButtonInteraction> buttons();

    ButtonInteraction buttonOf(String id);

    void register(ButtonInteraction interaction);
}
