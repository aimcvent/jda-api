package fr.aimcvent.jda.api.interaction;

import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;

public interface ButtonInteraction {
    String id();

    void execute(ButtonInteractionEvent event);
}
