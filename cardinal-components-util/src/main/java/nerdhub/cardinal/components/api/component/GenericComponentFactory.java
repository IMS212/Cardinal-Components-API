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
package nerdhub.cardinal.components.api.component;

import nerdhub.cardinal.components.api.ComponentRegistry;
import nerdhub.cardinal.components.api.ComponentType;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.ApiStatus;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Applied to a method to declare it as a static component factory for a third-party consumer.
 *
 * <p>The annotated method's arguments must follow the specifications set by the third-party.
 * The return type must be either {@link Component} or a subclass.
 *
 * <p>When invoked, the factory can return either a {@link Component} of the right type, or {@code null}.
 * If the factory method returns {@code null}, the initialized provider will not support that type of component
 * (cf. {@link ComponentProvider#hasComponent(ComponentType)}).
 * @since 2.4.0
 */
@ApiStatus.Experimental
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface GenericComponentFactory {
    /**
     * The id of the {@link ComponentType} which this factory makes components for.
     *
     * <p> The returned string must be a valid {@link Identifier}.
     * A {@link ComponentType} with the same id must be registered during mod initialization
     * using {@link ComponentRegistry#registerIfAbsent(Identifier, Class)}.
     *
     * @return a string representing the id of a component type
     */
    String value();

    /**
     * Defines the target generic type id. The factory method will be called
     * when the result of one of the {@link ComponentContainerMetafactory} methods is invoked.
     *
     * <p> The returned array must not be empty, and all its elements must represent valid {@link Identifier}s.
     *
     * @return one or more generic type ids.
     */
    String[] targets();
}
