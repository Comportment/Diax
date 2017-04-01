package io.bfnt.comportment.diax.lib.command;

import io.bfnt.comportment.diax.commands.Embed;
import io.bfnt.comportment.diax.commands.Help;
import io.bfnt.comportment.diax.commands.administrative.Ban;
import io.bfnt.comportment.diax.commands.administrative.Kick;
import io.bfnt.comportment.diax.commands.administrative.Softban;

import java.util.TreeSet;

/**
 * Created by Comporment on 30/03/2017 at 12:06
 * Dev'ving like a sir since 1998. | https://github.com/Comportment
 */
public class Commands
{

    /**
     * Registers the {@link DiaxCommand}s to be able to be used when the {@link CommandHandler} is searching.
     *
     * @since Azote
     */
    private TreeSet<DiaxCommand> commands = new TreeSet<DiaxCommand>()
    {
        {
            add(new Help());
            add(new Embed());
            add(new Ban());
            add(new Kick());
            add(new Softban());
        }
    };

    /**
     * A method to get all of the registered commands.
     *
     * @return All of the commands registered {@link #commands}
     * @since Azote
     */
    public TreeSet<DiaxCommand> getCommands()
    {
        return commands;
    }
}