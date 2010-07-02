/*
 * This file is part of libbluray
 * Copyright (C) 2010  William Hahne
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library. If not, see
 * <http://www.gnu.org/licenses/>.
 */

package org.dvb.ui;

import java.awt.Color;
import java.awt.Graphics;

public abstract class DVBGraphics extends Graphics {
    protected DVBGraphics()
    {
    }

    public abstract int[] getAvailableCompositeRules();

    public DVBColor getBestColorMatch(Color c)
    {
        throw new Error("Not implemented");
    }

    public abstract Color getColor();

    public abstract DVBAlphaComposite getDVBComposite();

    public int getType()
    {
        throw new Error("Not implemented");
    }

    public abstract void setColor(Color c);

    public abstract void setDVBComposite(DVBAlphaComposite comp)
            throws UnsupportedDrawingOperationException;

    public String toString()
    {
        return getClass().getName() + "[font=" + getFont() + ",color="
                + getColor() + "]";
    }
}
