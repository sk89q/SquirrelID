/*
 * SquirrelID, a UUID library for Minecraft
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) SquirrelID team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.squirrelid.cache;

import com.google.common.collect.ImmutableMap;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.UUID;

/**
 * An abstract implementation.
 */
abstract class AbstractUUIDCache implements UUIDCache {

    @Override
    public void put(UUID uuid, String name) throws CacheException {
        putAll(ImmutableMap.<UUID, String>builder().put(uuid, name).build());
    }

    @Nullable
    @Override
    public String getIfPresent(UUID uuid) throws CacheException {
        return getAllPresent(Arrays.asList(uuid)).get(uuid);
    }

}
