package fr.aimcvent.jda.api.event;

import fr.aimcvent.jda.api.JDAService;
import fr.aimcvent.kernel.api.event.Event;

public record JDAOnEnableEvent(JDAService service) implements Event { }
