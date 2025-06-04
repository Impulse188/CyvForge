package net.cyvforge.keybinding;

import net.cyvforge.command.mpk.CommandSetlb;
import net.cyvforge.util.defaults.CyvKeybinding;
import org.lwjgl.input.Keyboard;

public class KeybindingSetlb extends CyvKeybinding {
    public KeybindingSetlb() {
        super("key.setlb.desc", Keyboard.KEY_L);
    }

    @Override
    public void onTickEnd(boolean isPressed) {
        if (isPressed) {
            CommandSetlb.run({"Target"});
        }
    }
}
