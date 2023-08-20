package fr.aimcvent.jda.api;

import fr.aimcvent.jda.api.command.Commands;
import fr.aimcvent.jda.api.interaction.Interactions;
import fr.aimcvent.jda.api.listener.Listeners;
import fr.aimcvent.kernel.api.configuration.WithConfiguration;
import fr.aimcvent.kernel.api.service.Service;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.sharding.ShardManager;
import org.jetbrains.annotations.Nullable;

public interface JDAService extends Service, WithConfiguration {
    @Nullable
    ShardManager shard();

    @Nullable
    JDA jda();

    Listeners listeners();

    Commands commands();

    Interactions interactions();
}
