package net.citizensnpcs.api.gui;

import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

/**
 * The concrete page instance representing a single page in a stack of inventory menu GUIs. Injected variables will be
 * available after {@link #initialise(MenuContext)} is called.
 *
 * @see InventoryMenu
 */
public abstract class InventoryMenuPage {
    public InventoryType getInventoryType() {
        return null;
    }

    public abstract void initialise(MenuContext ctx);

    public void onClick(InventoryMenuSlot slot, InventoryClickEvent event) {
    }

    public void onClose(HumanEntity player) {
    }
}
