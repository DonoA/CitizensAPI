package net.citizensnpcs.api.npc;

import java.util.Collection;

import net.citizensnpcs.api.npc.character.Character;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

/**
 * Handles various NPC-related methods.
 */
public interface NPCRegistry extends Iterable<NPC> {

    /**
     * Creates an NPC with no attached character. This does not spawn the NPC.
     * 
     * @param type
     *            Entity type to assign to the NPC
     * @param name
     *            Name to give the NPC
     * @return Created NPC
     */
    public NPC createNPC(EntityType type, String name);

    /**
     * Creates an NPC with the given character. This does not spawn the NPC.
     * 
     * @param type
     *            Entity type to assign to the NPC
     * @param name
     *            Name to give the NPC
     * @param character
     *            Character to attach to an NPC
     * @return Created NPC with the given character
     */
    public NPC createNPC(EntityType type, String name, Character character);

    /**
     * Deregisters the {@link NPC} and removes all data about it from the data
     * store.
     * 
     * @param npc
     */
    public void deregister(NPC npc);

    /**
     * Deregisters all {@link NPC}s from this registry. {@link #deregister(NPC)}
     */
    public void deregisterAll();

    /**
     * Gets an NPC from the given LivingEntity.
     * 
     * @param entity
     *            Entity to get the NPC from
     * @return NPC from the given entity (must be spawned)
     */
    public NPC getNPC(Entity entity);

    /**
     * Gets an NPC with the given ID.
     * 
     * @param id
     *            ID of the NPC
     * @return NPC with the given ID (may or may not be spawned)
     */
    public NPC getNPC(int id);

    /**
     * Gets all NPCs with the given character.
     * 
     * @param character
     *            Character to search for
     * @return All NPCs with the given character
     */
    public Collection<NPC> getNPCs(Class<? extends Character> character);

    /**
     * Checks whether the given Bukkit entity is an NPC.
     * 
     * @param entity
     *            Entity to check
     * @return Whether the given entity is an NPC
     */
    public boolean isNPC(Entity entity);
}