/*
 * Copyright (c) 2009,2010 Serhiy Kulyk
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     2. Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *
 * SQL CODE ASSISTANT PLUG-IN FOR INTELLIJ IDEA IS PROVIDED BY SERHIY KULYK
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL SERHIY KULYK BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.deepsky.view.query_pane.converters;

import com.deepsky.utils.StringUtils;
import com.deepsky.view.query_pane.ConversionException;
import com.deepsky.view.query_pane.ValueConvertor;
import oracle.sql.CLOB;
import org.jetbrains.annotations.NotNull;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

public class CLOB_Convertor implements ValueConvertor<CLOB> {
    public long size(CLOB blob) throws SQLException {
        return blob.length();
    }

    public String valueToString(CLOB blob) throws SQLException {
        if (blob == null || blob.isEmptyLob() || blob.length() == 0) {
            return "";
        } else {
            InputStream r = blob.getAsciiStream();
            ByteArrayOutputStream writer = new ByteArrayOutputStream();
            byte[] buff = new byte[1000];
            int size = 0;
            try {
                while ((size = r.read(buff)) > 0) {
                    writer.write(buff, 0, size);
                }
                r.close();

                // Converts the buffer's contents into a string decoding bytes using the
                // platform's default character set.
                return writer.toString();
            } catch (IOException e) {
                throw new SQLException(e.getMessage());
            }
        }
    }

    public CLOB stringToValue(String stringPresentation) throws ConversionException {
        throw new ConversionException("Not supported");
    }


    public void saveValueTo(CLOB clob, @NotNull File file) throws IOException {
        try {
            if (clob != null && !clob.isEmptyLob() && clob.length() > 0) {
                InputStream r = null;
                try {
                    r = clob.asciiStreamValue();
                    StringUtils.stream2file(r, file);
                } finally {
                    if (r != null)
                        try {
                            r.close();
                        } catch (IOException ignored) {
                        }
                }
            } else {
                StringUtils.string2file("", file);
            }
        } catch (SQLException e) {
            throw new IOException("Could not save CLOB in the file", e);
        }
    }

}
