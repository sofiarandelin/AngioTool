/**
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation
 * (http://www.gnu.org/licenses/gpl.txt ). This program is
 * distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public
 * License for more details.
 *
 * @author <a href="mailto:zudairee@mail.nih.gov">
 * Enrique Zudaire</a>, Radiation Oncology Branch, NCI, NIH
 * May, 2011
 * angiotool.nci.nih.gov
 *
 */

package Lacunarity;

public class Box {
    int xStart;
    int yStart;

    int xBorder;
    int yBorder;

    int firstRawPixelCount;
    int firstColumnPixelCount;

    int pixelCount;

    public Box (){
        pixelCount = Integer.MIN_VALUE;
    }
}
