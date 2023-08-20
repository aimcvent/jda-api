package fr.aimcvent.jda.api.listener;

import net.dv8tion.jda.api.events.GenericEvent;

public interface Listeners {
    Listeners register(Listener<? extends GenericEvent> listener);

    void call(GenericEvent event);
}
