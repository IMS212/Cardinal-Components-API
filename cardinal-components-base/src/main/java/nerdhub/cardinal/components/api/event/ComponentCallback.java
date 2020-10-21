/*
 * Cardinal-Components-API
 * Copyright (C) 2019-2020 OnyxStudios
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE
 * OR OTHER DEALINGS IN THE SOFTWARE.
 */
package nerdhub.cardinal.components.api.event;

import nerdhub.cardinal.components.api.component.Component;
import nerdhub.cardinal.components.api.component.ComponentContainer;
import nerdhub.cardinal.components.api.component.ComponentProvider;
import net.fabricmc.fabric.api.event.Event;
import org.jetbrains.annotations.ApiStatus;

import java.util.function.Function;

/**
 * The base callback interface for receiving component initialization events.
 *
 * <p> Specialized versions of this callback are available for every default {@link ComponentProvider}
 * implementation in their respective module.
 *
 * @see nerdhub.cardinal.components.api.ComponentType#attach(Event, Function)
 * @see "EntityComponentCallback"
 * @see "ItemComponentCallback"
 */
@Deprecated
@ApiStatus.ScheduledForRemoval(inVersion = "3.0.0")
@FunctionalInterface
public interface ComponentCallback<T, C extends Component> {
    void initComponents(T object, ComponentContainer<C> components);
}
