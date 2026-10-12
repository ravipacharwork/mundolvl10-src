/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager$RecentTaskInfo
 *  android.app.ActivityManager$RunningTaskInfo
 *  android.content.ComponentName
 *  android.content.Intent
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package top.bienvenido.date_24323;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import top.bienvenido.date_24323.s0;

public final class q0
implements s0 {
    public final IBinder \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;

    public q0(IBinder iBinder) {
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = iBinder;
    }

    public final IBinder asBinder() {
        return this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Intent \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, Intent intent, int n10, boolean bl) {
        Parcel parcel = Parcel.obtain();
        IBinder iBinder2 = iBinder;
        iBinder = Parcel.obtain();
        parcel.writeInterfaceToken("MundoWindowManagerService");
        parcel.writeStrongBinder(iBinder2);
        int n11 = 0;
        if (intent != null) {
            parcel.writeInt(1);
            intent.writeToParcel(parcel, n11);
        } else {
            parcel.writeInt(0);
        }
        IBinder iBinder3 = iBinder;
        IBinder iBinder4 = iBinder3;
        IBinder iBinder5 = iBinder3;
        parcel.writeInt(n10);
        parcel.writeInt(bl ? 1 : 0);
        ((q0)object).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(1, parcel, (Parcel)iBinder, 0);
        try {
            iBinder4.readException();
            Object object = Intent.CREATOR;
            if (iBinder5.readInt() != 0) {
                object = object.createFromParcel((Parcel)iBinder);
                return (Intent)object;
            }
            object = null;
            return (Intent)object;
        }
        finally {
            iBinder.recycle();
            parcel.recycle();
        }
    }

    @Override
    public final Intent[] \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, Intent[] intentArray, int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoWindowManagerService");
            parcel.writeStrongBinder(iBinder);
            parcel.writeTypedArray((Parcelable[])intentArray, 0);
            parcel.writeInt(n10);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(2, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        Intent[] intentArray2 = (Intent[])parcel2.createTypedArray(Intent.CREATOR);
        parcel2.recycle();
        parcel.recycle();
        return intentArray2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Intent intent, String string) {
        Parcel parcel;
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel2.writeInterfaceToken("MundoWindowManagerService");
            int n10 = 0;
            if (intent != null) {
                parcel2.writeInt(1);
                intent.writeToParcel(parcel2, n10);
            } else {
                parcel2.writeInt(0);
            }
            parcel = parcel2;
            parcel2.writeString(string);
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
    public final Intent \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(long l10, Intent intent) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoWindowManagerService");
        parcel.writeLong(l10);
        int n10 = 0;
        if (intent != null) {
            parcel.writeInt(1);
            intent.writeToParcel(parcel, n10);
        } else {
            parcel.writeInt(0);
        }
        Parcel parcel3 = parcel2;
        Parcel parcel4 = parcel3;
        Parcel parcel5 = parcel3;
        ((q0)object).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(4, parcel, parcel2, 0);
        try {
            parcel4.readException();
            Object object = Intent.CREATOR;
            if (parcel5.readInt() != 0) {
                object = object.createFromParcel(parcel2);
                return (Intent)object;
            }
            object = null;
            return (Intent)object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, IBinder iBinder2) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoWindowManagerService");
            parcel.writeStrongBinder(iBinder);
            parcel.writeStrongBinder(iBinder2);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(5, parcel, null, 1);
        }
        catch (Throwable throwable) {
            parcel.recycle();
            throw throwable;
        }
        parcel.recycle();
    }

    @Override
    public final void \u4f60\u5988\u5728\u4e07\u4eba\u5e7f\u573a\u5356\u903c\u4f60\u5e9f\u7269\u7239\u4e0d\u4ec5\u4e0d\u963b\u6b62\u53cd\u800c\u8ddf\u4f60\u5988\u4e00\u8d77\u8ddf\u5929\u4e0b\u4eba\u6c11\u666e\u5929\u540c\u5e86\u4f60\u6bcf\u665a\u8349\u4f60\u5988\u751f\u9f99\u6d3b\u864e\u4f60\u5988\u75bc\u7684\u5472\u7259\u54a7\u5634\u4f60\u5988\u903c\u4e0a\u7684\u9634\u9f7f\u90fd\u6ee1\u8db3\u4e0d\u4e86\u4f60\u8fd9\u6742\u79cd\u7684\u72c2\u91ce\u6027\u9700\u6c42\u554a\u8349\u4f60\u5988(String string, String string2) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoWindowManagerService");
            parcel.writeString(string);
            parcel.writeString(string2);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(7, parcel, null, 1);
        }
        catch (Throwable throwable) {
            parcel.recycle();
            throw throwable;
        }
        parcel.recycle();
    }

    @Override
    public final void \u4f60\u4e0d\u77e5\u9053\u4f60\u5988\u5f20\u4e2a\u5927\u5634\u5288\u4e2a\u5c0f\u817f\u4e0b\u9762\u8fd8\u6d41\u7740\u54b8\u76d0\u6c34\u5417\u5f1f\u5f1f(IBinder iBinder) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoWindowManagerService");
            parcel.writeStrongBinder(iBinder);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(8, parcel, null, 1);
        }
        catch (Throwable throwable) {
            parcel.recycle();
            throw throwable;
        }
        parcel.recycle();
    }

    @Override
    public final List \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(long l10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoWindowManagerService");
            parcel.writeLong(l10);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(9, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        ArrayList arrayList = parcel2.createTypedArrayList(ActivityManager.RunningTaskInfo.CREATOR);
        parcel2.recycle();
        parcel.recycle();
        return arrayList;
    }

    @Override
    public final List \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(long l10, int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoWindowManagerService");
            parcel.writeLong(l10);
            parcel.writeInt(n10);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(10, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        ArrayList arrayList = parcel2.createTypedArrayList(ActivityManager.RecentTaskInfo.CREATOR);
        parcel2.recycle();
        parcel.recycle();
        return arrayList;
    }

    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, String string, String string2, String string3, int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoWindowManagerService");
            parcel.writeStrongBinder(iBinder);
            parcel.writeString(string);
            parcel.writeString(string2);
            parcel.writeString(string3);
            parcel.writeInt(n10);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(11, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        parcel2.recycle();
        parcel.recycle();
    }

    @Override
    public final ComponentName \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoWindowManagerService");
        parcel.writeStrongBinder(iBinder);
        ((q0)object).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(12, parcel, parcel2, 0);
        try {
            parcel2.readException();
            Object object = ComponentName.CREATOR;
            object = parcel2.readInt() != 0 ? object.createFromParcel(parcel2) : null;
            return (ComponentName)object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    @Override
    public final String \u867d\u7136\u4e0d\u662f\u540c\u4e00\u65f6\u95f4\u4f46\u662f\u662f\u540c\u4e00\u4e2a\u4f60\u5988\u4f60\u7239\u6211\u518d\u6b21\u6311\u6218\u4e00\u628a\u5403\u9634\u7b2c(IBinder iBinder) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoWindowManagerService");
            parcel.writeStrongBinder(iBinder);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(13, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        String string = parcel2.readString();
        parcel2.recycle();
        parcel.recycle();
        return string;
    }

    @Override
    public final boolean \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(String string, String string2) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoWindowManagerService");
            parcel.writeString(string);
            parcel.writeString(string2);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(14, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        boolean bl = parcel2.readInt() != 0;
        parcel2.recycle();
        parcel.recycle();
        return bl;
    }

    @Override
    public final void \u4f60\u5988\u4eca\u665a\u53bb\u5077\u7535\u7ebf\u6746\u5b50\u4f60\u7238\u53bb\u627e\u7535\u7bb1\u4e4b\u540e\u7ed3\u5408\u75af\u72c2\u7206\u7535\u8ba9\u540e\u5728\u62ff\u7535\u7ebf\u6746\u5b50ziwei\u5b8c\u4e8b\u8fd8\u8981\u53bb\u52a0\u6cb9\u7ad9\u5728\u81ea\u5df1piyan\u548c\u903c\u91cc\u704c\u6cb9\u62ff\u7740\u6253\u706b\u673a\u72c2\u64a9\u81ea\u5df1\u628a\u81ea\u5df1\u53d8\u6210\u5185\u71c3\u673a(String string, String string2) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoWindowManagerService");
            parcel.writeString(string);
            parcel.writeString(string2);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(15, parcel, null, 1);
        }
        catch (Throwable throwable) {
            parcel.recycle();
            throw throwable;
        }
        parcel.recycle();
    }

    @Override
    public final boolean \u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403(IBinder iBinder) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoWindowManagerService");
            parcel.writeStrongBinder(iBinder);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(16, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        boolean bl = parcel2.readInt() != 0;
        parcel2.recycle();
        parcel.recycle();
        return bl;
    }

    @Override
    public final void \u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988(String string) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoWindowManagerService");
            parcel.writeString(string);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(17, parcel, null, 1);
        }
        catch (Throwable throwable) {
            parcel.recycle();
            throw throwable;
        }
        parcel.recycle();
    }

    @Override
    public final String \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoWindowManagerService");
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(18, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        String string = parcel2.readString();
        parcel2.recycle();
        parcel.recycle();
        return string;
    }

    @Override
    public final boolean \u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoWindowManagerService");
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(19, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        boolean bl = parcel2.readInt() != 0;
        parcel2.recycle();
        parcel.recycle();
        return bl;
    }

    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(String string) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoWindowManagerService");
            parcel.writeString(string);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(20, parcel, null, 1);
        }
        catch (Throwable throwable) {
            parcel.recycle();
            throw throwable;
        }
        parcel.recycle();
    }
}

