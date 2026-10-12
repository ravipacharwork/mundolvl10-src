/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.ComponentName
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.pm.ProviderInfo
 *  android.os.IBinder
 *  android.os.Parcel
 */
package top.bienvenido.date_24323;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import top.bienvenido.date_24323.f0;

public final class c0
implements f0 {
    public final IBinder \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;

    public c0(IBinder iBinder) {
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = iBinder;
    }

    public final IBinder asBinder() {
        return this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
    }

    @Override
    public final IBinder \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(String string, String string2, ProviderInfo[] providerInfoArray, String[] stringArray, int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoActivityManagerService");
            parcel.writeString(string);
            parcel.writeString(string2);
            parcel.writeInt(providerInfoArray.length);
            parcel.writeInt(stringArray.length);
            parcel.writeInt(n10);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(1, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        IBinder iBinder = parcel2.readStrongBinder();
        Parcel parcel3 = parcel2;
        parcel2.readTypedArray((Object[])providerInfoArray, ProviderInfo.CREATOR);
        parcel3.readStringArray(stringArray);
        parcel3.recycle();
        parcel.recycle();
        return iBinder;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final ComponentName \u4f60\u5988\u4eca\u665a\u53bb\u5077\u7535\u7ebf\u6746\u5b50\u4f60\u7238\u53bb\u627e\u7535\u7bb1\u4e4b\u540e\u7ed3\u5408\u75af\u72c2\u7206\u7535\u8ba9\u540e\u5728\u62ff\u7535\u7ebf\u6746\u5b50ziwei\u5b8c\u4e8b\u8fd8\u8981\u53bb\u52a0\u6cb9\u7ad9\u5728\u81ea\u5df1piyan\u548c\u903c\u91cc\u704c\u6cb9\u62ff\u7740\u6253\u706b\u673a\u72c2\u64a9\u81ea\u5df1\u628a\u81ea\u5df1\u53d8\u6210\u5185\u71c3\u673a(Intent intent, String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoActivityManagerService");
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
        parcel.writeString(string);
        ((c0)object).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(2, parcel, parcel2, 0);
        try {
            parcel4.readException();
            Object object = ComponentName.CREATOR;
            if (parcel5.readInt() != 0) {
                object = object.createFromParcel(parcel2);
                return (ComponentName)object;
            }
            object = null;
            return (ComponentName)object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int \u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988(Intent intent, String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoActivityManagerService");
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
        parcel.writeString(string);
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(3, parcel, parcel2, 0);
        try {
            parcel4.readException();
            return parcel5.readInt();
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(ComponentName componentName, IBinder iBinder, int n10) {
        boolean bl;
        Parcel parcel;
        Parcel parcel2;
        Parcel parcel3 = Parcel.obtain();
        Parcel parcel4 = Parcel.obtain();
        try {
            parcel3.writeInterfaceToken("MundoActivityManagerService");
            int n11 = 0;
            if (componentName != null) {
                Parcel parcel5 = parcel3;
                parcel5.writeInt(1);
                componentName.writeToParcel(parcel5, n11);
            } else {
                parcel3.writeInt(0);
            }
            Parcel parcel6 = parcel4;
            parcel2 = parcel6;
            parcel = parcel6;
            parcel3.writeStrongBinder(iBinder);
            parcel3.writeInt(n10);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(4, parcel3, parcel4, 0);
        }
        catch (Throwable throwable) {
            parcel4.recycle();
            parcel3.recycle();
            throw throwable;
        }
        {
            parcel2.readException();
            bl = parcel.readInt() != 0;
        }
        parcel4.recycle();
        parcel3.recycle();
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(Intent intent, IBinder iBinder, String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoActivityManagerService");
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
        parcel.writeStrongBinder(iBinder);
        parcel.writeString(string);
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(5, parcel, parcel2, 0);
        try {
            parcel4.readException();
            return parcel5.readInt();
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    @Override
    public final boolean \u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988(IBinder iBinder) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoActivityManagerService");
            parcel.writeStrongBinder(iBinder);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(6, parcel, parcel2, 0);
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, Intent intent, IBinder iBinder2) {
        boolean bl;
        IBinder iBinder3;
        IBinder iBinder4;
        Parcel parcel = Parcel.obtain();
        IBinder iBinder5 = iBinder;
        iBinder = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoActivityManagerService");
            parcel.writeStrongBinder(iBinder5);
            int n10 = 0;
            if (intent != null) {
                Parcel parcel2 = parcel;
                parcel2.writeInt(1);
                intent.writeToParcel(parcel2, n10);
            } else {
                parcel.writeInt(0);
            }
            IBinder iBinder6 = iBinder;
            iBinder4 = iBinder6;
            iBinder3 = iBinder6;
            parcel.writeStrongBinder(iBinder2);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(7, parcel, (Parcel)iBinder, 0);
        }
        catch (Throwable throwable) {
            iBinder.recycle();
            parcel.recycle();
            throw throwable;
        }
        {
            iBinder4.readException();
            bl = iBinder3.readInt() != 0;
        }
        iBinder.recycle();
        parcel.recycle();
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final IBinder \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(ComponentName componentName, String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoActivityManagerService");
        int n10 = 0;
        if (componentName != null) {
            parcel.writeInt(1);
            componentName.writeToParcel(parcel, n10);
        } else {
            parcel.writeInt(0);
        }
        Parcel parcel3 = parcel2;
        Parcel parcel4 = parcel3;
        Parcel parcel5 = parcel3;
        parcel.writeString(string);
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(8, parcel, parcel2, 0);
        try {
            parcel4.readException();
            return parcel5.readStrongBinder();
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    @Override
    public final ArrayList \u4f60\u4e0d\u77e5\u9053\u4f60\u5988\u5f20\u4e2a\u5927\u5634\u5288\u4e2a\u5c0f\u817f\u4e0b\u9762\u8fd8\u6d41\u7740\u54b8\u76d0\u6c34\u5417\u5f1f\u5f1f(int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoActivityManagerService");
            parcel.writeInt(n10);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(9, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        ArrayList arrayList = parcel2.createTypedArrayList(ActivityManager.RunningAppProcessInfo.CREATOR);
        parcel2.recycle();
        parcel.recycle();
        return arrayList;
    }

    @Override
    public final String[] \u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403(int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoActivityManagerService");
            parcel.writeInt(n10);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(10, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        String[] stringArray = parcel2.createStringArray();
        parcel2.recycle();
        parcel.recycle();
        return stringArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(int n10, IBinder iBinder, IntentFilter intentFilter) {
        Parcel parcel;
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel2.writeInterfaceToken("MundoActivityManagerService");
            parcel2.writeInt(n10);
            parcel2.writeStrongBinder(iBinder);
            n10 = 0;
            if (intentFilter != null) {
                parcel2.writeInt(1);
                intentFilter.writeToParcel(parcel2, n10);
            } else {
                parcel2.writeInt(0);
            }
            parcel = parcel2;
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(11, parcel2, null, 1);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            throw throwable;
        }
        parcel.recycle();
    }

    @Override
    public final void \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(IBinder iBinder) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoActivityManagerService");
            parcel.writeStrongBinder(iBinder);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(12, parcel, null, 1);
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
    public final int \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(Intent intent, String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoActivityManagerService");
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
        parcel.writeString(string);
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(13, parcel, parcel2, 0);
        try {
            parcel4.readException();
            return parcel5.readInt();
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    @Override
    public final void \u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403(String string, String string2) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoActivityManagerService");
            parcel.writeString(string);
            parcel.writeString(string2);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(14, parcel, null, 1);
        }
        catch (Throwable throwable) {
            parcel.recycle();
            throw throwable;
        }
        parcel.recycle();
    }

    @Override
    public final boolean \u4f60\u4e0d\u77e5\u9053\u4f60\u5988\u5f20\u4e2a\u5927\u5634\u5288\u4e2a\u5c0f\u817f\u4e0b\u9762\u8fd8\u6d41\u7740\u54b8\u76d0\u6c34\u5417\u5f1f\u5f1f(String string, String string2) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoActivityManagerService");
            parcel.writeString(string);
            parcel.writeString(string2);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(15, parcel, parcel2, 0);
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
    public final void \u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403() {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoActivityManagerService");
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(16, parcel, null, 1);
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
    public final IBinder \u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403(Intent intent, String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoActivityManagerService");
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
        parcel.writeString(string);
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(17, parcel, parcel2, 0);
        try {
            parcel4.readException();
            return parcel5.readStrongBinder();
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    @Override
    public final void \u8001\u5b50\u5b9e\u5728\u770b\u4e0d\u8fc7\u4f60\u5988\u7684\u8111\u6b8b\u72d7\u903c\u6837\u5b50\u76f4\u63a5\u628a\u4f60\u5988\u75285\u6bdb\u94b1\u5356\u5230\u57c3\u585e\u4fc4\u6bd4\u4e9a\u56fd\u5bb6\u5927\u5993\u9662\u8bf7\u90a3\u4e9b\u975e\u6d32\u90e8\u843d\u5c0f\u55bd\u5570\u6765\u4eab\u53d7\u4f60\u5988\u903c\u7684\u9ed1\u9634\u903c(String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoActivityManagerService");
            parcel.writeString(string);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(18, parcel, parcel2, 0);
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
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(String string, String string2, String string3) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoActivityManagerService");
            parcel.writeString(string);
            parcel.writeString(string2);
            parcel.writeString(string3);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(19, parcel, parcel2, 0);
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
}

