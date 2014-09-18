/*
 * BridJ - Dynamic and blazing-fast native interop for Java.
 * http://bridj.googlecode.com/
 *
 * Copyright (c) 2010-2013, Olivier Chafik (http://ochafik.com/)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of Olivier Chafik nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY OLIVIER CHAFIK AND CONTRIBUTORS ``AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE REGENTS AND CONTRIBUTORS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.bridj.cpp.com;

import org.bridj.CRuntime;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Runtime;

/**
 * This file was autogenerated by <a
 * href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a
 * href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few
 * opensource projects.</a>.<br>
 * For help, please visit <a
 * href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a
 * href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Runtime(CRuntime.class)
public class SAFEARRAY extends StructObject {
    /// C type : USHORT

    @Field(0)
    public short cDims() {
        return this.io.getShortField(this, 0);
    }
    /// C type : USHORT

    @Field(0)
    public SAFEARRAY cDims(short cDims) {
        this.io.setShortField(this, 0, cDims);
        return this;
    }
    /// C type : USHORT

    public final short cDims_$eq(short cDims) {
        cDims(cDims);
        return cDims;
    }
    /// C type : USHORT

    @Field(1)
    public short fFeatures() {
        return this.io.getShortField(this, 1);
    }
    /// C type : USHORT

    @Field(1)
    public SAFEARRAY fFeatures(short fFeatures) {
        this.io.setShortField(this, 1, fFeatures);
        return this;
    }
    /// C type : USHORT

    public final short fFeatures_$eq(short fFeatures) {
        fFeatures(fFeatures);
        return fFeatures;
    }
    /// C type : ULONG

    @Field(2)
    public int cbElements() {
        return this.io.getIntField(this, 2);
    }
    /// C type : ULONG

    @Field(2)
    public SAFEARRAY cbElements(int cbElements) {
        this.io.setIntField(this, 2, cbElements);
        return this;
    }
    /// C type : ULONG

    public final int cbElements_$eq(int cbElements) {
        cbElements(cbElements);
        return cbElements;
    }
    /// C type : ULONG

    @Field(3)
    public int cLocks() {
        return this.io.getIntField(this, 3);
    }
    /// C type : ULONG

    @Field(3)
    public SAFEARRAY cLocks(int cLocks) {
        this.io.setIntField(this, 3, cLocks);
        return this;
    }
    /// C type : ULONG

    public final int cLocks_$eq(int cLocks) {
        cLocks(cLocks);
        return cLocks;
    }
    /// C type : PVOID

    @Field(4)
    public Pointer<?> pvData() {
        return this.io.getPointerField(this, 4);
    }
    /// C type : PVOID

    @Field(4)
    public SAFEARRAY pvData(Pointer<?> pvData) {
        this.io.setPointerField(this, 4, pvData);
        return this;
    }
    /// C type : PVOID

    public final Pointer<?> pvData_$eq(Pointer<?> pvData) {
        pvData(pvData);
        return pvData;
    }
    /// C type : SAFEARRAYBOUND[1]

    @Array({1})
    @Field(5)
    public Pointer<SAFEARRAYBOUND> rgsabound() {
        return this.io.getPointerField(this, 5);
    }
}
