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
package org.bridj.cpp.mfc;

/// c:\program files\microsoft visual studio 8\vc\atlmfc\include\afxres.h
public interface StandardAfxCommands {

    public static final int ID_FILE_NEW = 0xE100,
            ID_FILE_OPEN = 0xE101,
            ID_FILE_CLOSE = 0xE102,
            ID_FILE_SAVE = 0xE103,
            ID_FILE_SAVE_AS = 0xE104,
            ID_FILE_PAGE_SETUP = 0xE105,
            ID_FILE_PRINT_SETUP = 0xE106,
            ID_FILE_PRINT = 0xE107,
            ID_FILE_PRINT_DIRECT = 0xE108,
            ID_FILE_PRINT_PREVIEW = 0xE109,
            ID_FILE_UPDATE = 0xE10A,
            ID_FILE_SAVE_COPY_AS = 0xE10B,
            ID_FILE_SEND_MAIL = 0xE10C,
            ID_FILE_NEW_FRAME = 0xE10D,
            ID_FILE_MRU_FIRST = 0xE110,
            ID_FILE_MRU_FILE1 = 0xE110, // range - 16 max
            ID_FILE_MRU_FILE2 = 0xE111,
            ID_FILE_MRU_FILE3 = 0xE112,
            ID_FILE_MRU_FILE4 = 0xE113,
            ID_FILE_MRU_FILE5 = 0xE114,
            ID_FILE_MRU_FILE6 = 0xE115,
            ID_FILE_MRU_FILE7 = 0xE116,
            ID_FILE_MRU_FILE8 = 0xE117,
            ID_FILE_MRU_FILE9 = 0xE118,
            ID_FILE_MRU_FILE10 = 0xE119,
            ID_FILE_MRU_FILE11 = 0xE11A,
            ID_FILE_MRU_FILE12 = 0xE11B,
            ID_FILE_MRU_FILE13 = 0xE11C,
            ID_FILE_MRU_FILE14 = 0xE11D,
            ID_FILE_MRU_FILE15 = 0xE11E,
            ID_FILE_MRU_FILE16 = 0xE11F,
            ID_FILE_MRU_LAST = 0xE11F,
            ID_EDIT_CLEAR = 0xE120,
            ID_EDIT_CLEAR_ALL = 0xE121,
            ID_EDIT_COPY = 0xE122,
            ID_EDIT_CUT = 0xE123,
            ID_EDIT_FIND = 0xE124,
            ID_EDIT_PASTE = 0xE125,
            ID_EDIT_PASTE_LINK = 0xE126,
            ID_EDIT_PASTE_SPECIAL = 0xE127,
            ID_EDIT_REPEAT = 0xE128,
            ID_EDIT_REPLACE = 0xE129,
            ID_EDIT_SELECT_ALL = 0xE12A,
            ID_EDIT_UNDO = 0xE12B,
            ID_EDIT_REDO = 0xE12C,
            ID_WINDOW_NEW = 0xE130,
            ID_WINDOW_ARRANGE = 0xE131,
            ID_WINDOW_CASCADE = 0xE132,
            ID_WINDOW_TILE_HORZ = 0xE133,
            ID_WINDOW_TILE_VERT = 0xE134,
            ID_WINDOW_SPLIT = 0xE135,
            AFX_IDM_WINDOW_FIRST = 0xE130,
            AFX_IDM_WINDOW_LAST = 0xE13F,
            AFX_IDM_FIRST_MDICHILD = 0xFF00, // window list starts here
            ID_APP_ABOUT = 0xE140,
            ID_APP_EXIT = 0xE141,
            ID_HELP_INDEX = 0xE142,
            ID_HELP_FINDER = 0xE143,
            ID_HELP_USING = 0xE144,
            ID_CONTEXT_HELP = 0xE145, // shift-F1
            ID_HELP = 0xE146, // first attempt for F1
            ID_DEFAULT_HELP = 0xE147, // last attempt
            ID_NEXT_PANE = 0xE150,
            ID_PREV_PANE = 0xE151,
            ID_FORMAT_FONT = 0xE160,
            ID_OLE_INSERT_NEW = 0xE200,
            ID_OLE_EDIT_LINKS = 0xE201,
            ID_OLE_EDIT_CONVERT = 0xE202,
            ID_OLE_EDIT_CHANGE_ICON = 0xE203,
            ID_OLE_EDIT_PROPERTIES = 0xE204,
            ID_OLE_VERB_FIRST = 0xE210, // range - 16 max
            ID_OLE_VERB_LAST = 0xE21F,
            AFX_ID_PREVIEW_CLOSE = 0xE300,
            AFX_ID_PREVIEW_NUMPAGE = 0xE301, // One/Two Page button
            AFX_ID_PREVIEW_NEXT = 0xE302,
            AFX_ID_PREVIEW_PREV = 0xE303,
            AFX_ID_PREVIEW_PRINT = 0xE304,
            AFX_ID_PREVIEW_ZOOMIN = 0xE305,
            AFX_ID_PREVIEW_ZOOMOUT = 0xE306,
            ID_VIEW_TOOLBAR = 0xE800,
            ID_VIEW_STATUS_BAR = 0xE801,
            ID_VIEW_REBAR = 0xE804,
            ID_VIEW_AUTOARRANGE = 0xE805,
            ID_VIEW_SMALLICON = 0xE810,
            ID_VIEW_LARGEICON = 0xE811,
            ID_VIEW_LIST = 0xE812,
            ID_VIEW_DETAILS = 0xE813,
            ID_VIEW_LINEUP = 0xE814,
            ID_VIEW_BYNAME = 0xE815,
            ID_RECORD_FIRST = 0xE900,
            ID_RECORD_LAST = 0xE901,
            ID_RECORD_NEXT = 0xE902,
            ID_RECORD_PREV = 0xE903,
            IDC_STATIC = (-1);     // all static controls
}