/*
 *  MusicTag Copyright (C)2003,2004
 *
 *  This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser
 *  General Public  License as published by the Free Software Foundation; either version 2.1 of the License,
 *  or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 *  the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License along with this library; if not,
 *  you can get a copy from http://www.opensource.org/licenses/lgpl-license.php or write to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */
package jaudiotagger.tag.id3.framebody;

import org.jaudiotagger.tag.InvalidTagException;
import org.jaudiotagger.tag.id3.ID3v24Frames;

import java.nio.ByteBuffer;

/**
 * Original artist(s)/performer(s) Text information frame.
 * <p>The 'Original artist(s)/performer(s)' frame is intended for the performer(s) of the original recording, if for
 * example the music in the file should be a cover of a previously released song. The performers are separated with
 * the "/" character.
 *
 * <p>For more details, please refer to the ID3 specifications:
 * <ul>
 * <li><a href="http://www.id3.org/id3v2.3.0.txt">ID3 v2.3.0 Spec</a>
 * </ul>
 *
 * @author : Paul Taylor
 * @author : Eric Farng
 * @version $Id$
 */
public class FrameBodyTOPE extends AbstractFrameBodyTextInfo implements ID3v23FrameBody, ID3v24FrameBody
{
    /**
     * Creates a new FrameBodyTOPE datatype.
     */
    public FrameBodyTOPE()
    {
    }

    public FrameBodyTOPE(FrameBodyTOPE body)
    {
        super(body);
    }

    /**
     * Creates a new FrameBodyTOPE datatype.
     *
     * @param textEncoding
     * @param text
     */
    public FrameBodyTOPE(byte textEncoding, String text)
    {
        super(textEncoding, text);
    }

    /**
     * Creates a new FrameBodyTOPE datatype.
     *
     * @param byteBuffer
     * @param frameSize
     * @throws InvalidTagException
     */
    public FrameBodyTOPE(ByteBuffer byteBuffer, int frameSize) throws InvalidTagException
    {
        super(byteBuffer, frameSize);
    }

    /**
     * The ID3v2 frame identifier
     *
     * @return the ID3v2 frame identifier  for this frame type
     */
    public String getIdentifier()
    {
        return ID3v24Frames.FRAME_ID_ORIGARTIST;
    }
}
