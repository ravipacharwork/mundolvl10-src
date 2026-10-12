/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.IBinder
 *  android.os.Parcel
 */
package top.bienvenido.date_24323;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import top.bienvenido.date_24323.u;

public final class s
implements u {
    public final IBinder \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;

    public s(IBinder iBinder) {
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = iBinder;
    }

    public final IBinder asBinder() {
        return this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
    }

    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(String string, String string2, String string3, boolean bl, String string4) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoAppThread");
            parcel.writeString(string);
            parcel.writeString(string2);
            parcel.writeString(string3);
            parcel.writeInt(bl ? 1 : 0);
            parcel.writeString(string4);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(1, parcel, null, 1);
        }
        catch (Throwable throwable) {
            parcel.recycle();
            throw throwable;
        }
        parcel.recycle();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, Intent intent) {
        Parcel parcel;
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel2.writeInterfaceToken("MundoAppThread");
            parcel2.writeStrongBinder(iBinder);
            int n10 = 0;
            if (intent != null) {
                parcel2.writeInt(1);
                intent.writeToParcel(parcel2, n10);
            } else {
                parcel2.writeInt(0);
            }
            parcel = parcel2;
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(2, parcel2, null, 1);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            throw throwable;
        }
        parcel.recycle();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(IBinder iBinder, Intent intent) {
        Parcel parcel;
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel2.writeInterfaceToken("MundoAppThread");
            parcel2.writeStrongBinder(iBinder);
            int n10 = 0;
            if (intent != null) {
                parcel2.writeInt(1);
                intent.writeToParcel(parcel2, n10);
            } else {
                parcel2.writeInt(0);
            }
            parcel = parcel2;
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(3, parcel2, null, 1);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            throw throwable;
        }
        parcel.recycle();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(String string, Intent intent, IBinder iBinder, int n10) {
        Parcel parcel;
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel2.writeInterfaceToken("MundoAppThread");
            parcel2.writeStrongBinder(iBinder);
            parcel2.writeString(string);
            parcel2.writeInt(n10);
            int n11 = 0;
            if (intent != null) {
                parcel2.writeInt(1);
                intent.writeToParcel(parcel2, n11);
            } else {
                parcel2.writeInt(0);
            }
            parcel = parcel2;
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(4, parcel2, null, 1);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            throw throwable;
        }
        parcel.recycle();
    }

    @Override
    public final void \u4f60\u5988\u5728\u4e07\u4eba\u5e7f\u573a\u5356\u903c\u4f60\u5e9f\u7269\u7239\u4e0d\u4ec5\u4e0d\u963b\u6b62\u53cd\u800c\u8ddf\u4f60\u5988\u4e00\u8d77\u8ddf\u5929\u4e0b\u4eba\u6c11\u666e\u5929\u540c\u5e86\u4f60\u6bcf\u665a\u8349\u4f60\u5988\u751f\u9f99\u6d3b\u864e\u4f60\u5988\u75bc\u7684\u5472\u7259\u54a7\u5634\u4f60\u5988\u903c\u4e0a\u7684\u9634\u9f7f\u90fd\u6ee1\u8db3\u4e0d\u4e86\u4f60\u8fd9\u6742\u79cd\u7684\u72c2\u91ce\u6027\u9700\u6c42\u554a\u8349\u4f60\u5988(IBinder iBinder) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoAppThread");
            parcel.writeStrongBinder(iBinder);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(5, parcel, null, 1);
        }
        catch (Throwable throwable) {
            parcel.recycle();
            throw throwable;
        }
        parcel.recycle();
    }

    @Override
    public final void \u4f60\u4e0d\u77e5\u9053\u4f60\u5988\u5f20\u4e2a\u5927\u5634\u5288\u4e2a\u5c0f\u817f\u4e0b\u9762\u8fd8\u6d41\u7740\u54b8\u76d0\u6c34\u5417\u5f1f\u5f1f() {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoAppThread");
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(6, parcel, null, 1);
        }
        catch (Throwable throwable) {
            parcel.recycle();
            throw throwable;
        }
        parcel.recycle();
    }

    @Override
    public final IBinder \u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6(String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoAppThread");
            parcel.writeString(string);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(7, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        IBinder iBinder = parcel2.readStrongBinder();
        parcel2.recycle();
        parcel.recycle();
        return iBinder;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Intent intent, IBinder iBinder, String string) {
        Parcel parcel;
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel2.writeInterfaceToken("MundoAppThread");
            parcel2.writeStrongBinder(iBinder);
            parcel2.writeString(string);
            int n10 = 0;
            if (intent != null) {
                parcel2.writeInt(1);
                intent.writeToParcel(parcel2, n10);
            } else {
                parcel2.writeInt(0);
            }
            parcel = parcel2;
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(8, parcel2, null, 1);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            throw throwable;
        }
        parcel.recycle();
    }

    @Override
    public final void \u5b59\u7acb\u519b\u7981\u64ad\u4f60\u5988\u4e0b\u4f53\u4e43\u662f\u6b63\u4e49\u4e4b\u4e3e\u6b64\u4e3e\u5f15\u5f97\u65e0\u6570\u7231\u56fd\u4eba\u58eb\u51b2\u8fdb\u4f60\u5988\u4e0b\u4f53\u4e00\u987f\u6253\u7838\u4ece\u6b64\u4f60\u5988\u5356\u903c\u4e5f\u6ca1\u7528\u597d\u53e3\u7891\u4e86(String string) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoAppThread");
            parcel.writeString(string);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(9, parcel, null, 1);
        }
        catch (Throwable throwable) {
            parcel.recycle();
            throw throwable;
        }
        parcel.recycle();
    }
}

