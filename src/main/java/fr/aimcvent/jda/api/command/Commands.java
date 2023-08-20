package fr.aimcvent.jda.api.command;

import java.util.List;

public interface Commands {
    List<Command> all();

    Command of(String name);

    void register(Command command);
}
