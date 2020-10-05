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
package nerdhub.cardinal.components.api.util.sided;

import dev.onyxstudios.cca.api.v3.component.ComponentProvider;
import nerdhub.cardinal.components.api.util.provider.EmptyComponentProvider;
import net.minecraft.util.math.Direction;

import javax.annotation.Nullable;

/**
 * A sided component provider that is always empty.
 */
public final class EmptySidedProviderCompound implements SidedProviderCompound {

    public static SidedProviderCompound instance() {
        return EMPTY_SIDED_PROVIDER;
    }

    /**
     * {@inheritDoc}
     * @return a {@link ComponentProvider} that is always empty
     * @see EmptyComponentProvider
     */
    @Override
    public ComponentProvider getComponents(@Nullable Direction side) {
        return EmptyComponentProvider.instance();
    }

    private static final SidedProviderCompound EMPTY_SIDED_PROVIDER = new EmptySidedProviderCompound();
    private EmptySidedProviderCompound() { }
}

