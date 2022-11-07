package org.example;

import org.micromanager.MenuPlugin;
import org.micromanager.Studio;
import org.scijava.command.Command;
import org.scijava.plugin.Plugin;

import javax.swing.*;

@Plugin(type = Command.class, menuPath = "Example plugin")
public class MicroManagerPlugin  implements MenuPlugin {

    Studio studio;

    public String getSubMenu() {
        return "";
    }

    /**
     * This is the method that gets called when a user clicks on your plugin.
     */
    public void onPluginSelected() {
        studio.getAlertManager()
                .postCustomAlert("This is an example alert",
                        new JLabel("This doesn't do much, but you could use more interactive GUI elements.")
                );
    }

    /**
     * @param studio A reference to the Micro-Manager GUI
     */
    public void setContext(Studio studio) {
        // This is your chance to store a reference to the Micro-manager GUI
        this.studio = studio;
    }

    public String getName() {
        return "Example plugin";
    }

    public String getHelpText() {
        return "This plugin doesn't really do anything.";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getCopyright() {
        return "No rights reserved";
    }
}
