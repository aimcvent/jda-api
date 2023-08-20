package fr.aimcvent.jda.api.listener;

import net.dv8tion.jda.api.events.GenericEvent;

public interface Listener<T extends GenericEvent> {
    Class<T> type();
    void on(T event);
}
