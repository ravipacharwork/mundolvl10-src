/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.Intent
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.CancellationSignal
 *  android.os.IBinder
 *  android.os.ParcelFileDescriptor
 *  android.os.Process
 */
package top.bienvenido.date_24323;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import top.bienvenido.date_24323.b3;
import top.bienvenido.date_24323.f4;
import top.bienvenido.date_24323.h6;
import top.bienvenido.date_24323.i4;
import top.bienvenido.date_24323.n;
import top.bienvenido.date_24323.r8;
import top.bienvenido.mundo.manifest.MundoService$Companion$STUB;

public abstract class v5
extends ContentProvider {
    public final boolean onCreate() {
        return true;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String string) {
        v5 v52 = r8.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(uri);
        if (v52 != null) {
            try {
                return ((ContentProvider)v52.getSecond()).openFile((Uri)v52.getFirst(), string);
            }
            catch (Exception exception) {
                return null;
            }
        }
        return null;
    }

    public final String[] getStreamTypes(Uri uri, String string) {
        v5 v52 = r8.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(uri);
        if (v52 != null) {
            try {
                return ((ContentProvider)v52.getSecond()).getStreamTypes((Uri)v52.getFirst(), string);
            }
            catch (Exception exception) {
                return null;
            }
        }
        return null;
    }

    public final boolean refresh(Uri uri, Bundle bundle, CancellationSignal cancellationSignal) {
        if (uri == null) {
            return false;
        }
        v5 v52 = r8.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(uri);
        if (v52 != null) {
            try {
                return ((ContentProvider)v52.getSecond()).refresh((Uri)v52.getFirst(), bundle, cancellationSignal);
            }
            catch (Exception exception) {
                return false;
            }
        }
        return false;
    }

    public final Cursor query(Uri uri, String[] stringArray, String string, String[] stringArray2, String string2) {
        v5 v52 = r8.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(uri);
        if (v52 != null) {
            try {
                return ((ContentProvider)v52.getSecond()).query((Uri)v52.getFirst(), stringArray, string, stringArray2, string2);
            }
            catch (Exception exception) {
                return null;
            }
        }
        return null;
    }

    public final String getType(Uri uri) {
        v5 v52 = r8.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(uri);
        if (v52 != null) {
            try {
                return ((ContentProvider)v52.getSecond()).getType((Uri)v52.getFirst());
            }
            catch (Exception exception) {
                return null;
            }
        }
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        v5 v52 = r8.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(uri);
        if (v52 != null) {
            try {
                return ((ContentProvider)v52.getSecond()).insert((Uri)v52.getFirst(), contentValues);
            }
            catch (Exception exception) {
                return null;
            }
        }
        return null;
    }

    public final int delete(Uri uri, String string, String[] stringArray) {
        v5 v52 = r8.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(uri);
        if (v52 != null) {
            try {
                return ((ContentProvider)v52.getSecond()).delete((Uri)v52.getFirst(), string, stringArray);
            }
            catch (Exception exception) {
                return 0;
            }
        }
        return 0;
    }

    public final int update(Uri uri, ContentValues contentValues, String string, String[] stringArray) {
        v5 v52 = r8.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(uri);
        if (v52 != null) {
            try {
                return ((ContentProvider)v52.getSecond()).update((Uri)v52.getFirst(), contentValues, string, stringArray);
            }
            catch (Exception exception) {
                return 0;
            }
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Bundle call(String string, String string2, Bundle bundle) {
        Object object;
        block15: {
            Intent intent;
            block16: {
                Bundle bundle2;
                Bundle bundle3;
                try {
                    if (f4.\u4f60\u5988\u5728\u4e07\u4eba\u5e7f\u573a\u5356\u903c\u4f60\u5e9f\u7269\u7239\u4e0d\u4ec5\u4e0d\u963b\u6b62\u53cd\u800c\u8ddf\u4f60\u5988\u4e00\u8d77\u8ddf\u5929\u4e0b\u4eba\u6c11\u666e\u5929\u540c\u5e86\u4f60\u6bcf\u665a\u8349\u4f60\u5988\u751f\u9f99\u6d3b\u864e\u4f60\u5988\u75bc\u7684\u5472\u7259\u54a7\u5634\u4f60\u5988\u903c\u4e0a\u7684\u9634\u9f7f\u90fd\u6ee1\u8db3\u4e0d\u4e86\u4f60\u8fd9\u6742\u79cd\u7684\u72c2\u91ce\u6027\u9700\u6c42\u554a\u8349\u4f60\u5988 != 0) break block15;
                    f4.\u4f60\u5988\u5728\u4e07\u4eba\u5e7f\u573a\u5356\u903c\u4f60\u5e9f\u7269\u7239\u4e0d\u4ec5\u4e0d\u963b\u6b62\u53cd\u800c\u8ddf\u4f60\u5988\u4e00\u8d77\u8ddf\u5929\u4e0b\u4eba\u6c11\u666e\u5929\u540c\u5e86\u4f60\u6bcf\u665a\u8349\u4f60\u5988\u751f\u9f99\u6d3b\u864e\u4f60\u5988\u75bc\u7684\u5472\u7259\u54a7\u5634\u4f60\u5988\u903c\u4e0a\u7684\u9634\u9f7f\u90fd\u6ee1\u8db3\u4e0d\u4e86\u4f60\u8fd9\u6742\u79cd\u7684\u72c2\u91ce\u6027\u9700\u6c42\u554a\u8349\u4f60\u5988 = Integer.parseInt(string);
                    if (bundle == null) break block16;
                    Bundle bundle4 = bundle;
                    bundle3 = bundle4;
                    bundle2 = bundle4;
                }
                catch (Exception exception) {}
                // empty try
                // empty try
                // empty try
                // empty try
                // empty try
                i4.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(bundle3);
                n.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = bundle2.getBoolean("mundo_base_bundle", false);
            }
            object = b3.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
            string = intent;
            intent = new Intent((Context)object, MundoService$Companion$STUB.class);
            object.startService((Intent)string);
        }
        object = h6.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
        // MONITORENTER : object
        h6.\u8bf4\u8bdd\u4e0d\u8fc7\u8111\u5b50\u76f4\u63a5\u4ece\u60a8\u5c41\u773c\u91cc\u5d29\u51fa\u6765.invoke();
        // empty try
        Bundle bundle5 = new Bundle();
        bundle5.putBinder("user_handler", (IBinder)object);
        bundle5.putBoolean(object.getInterfaceDescriptor(), f4.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070);
        bundle5.putInt("user_pid", Process.myPid());
        return bundle5;
    }
}

