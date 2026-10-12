/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.ProviderInfo
 *  android.content.pm.ResolveInfo
 *  android.content.pm.ServiceInfo
 *  android.os.IBinder
 *  android.os.Parcel
 */
package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import top.bienvenido.date_24323.o0;
import top.bienvenido.date_24323.p0;

public final class m0
implements p0 {
    public final IBinder \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;

    public m0(IBinder iBinder) {
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = iBinder;
    }

    public final IBinder asBinder() {
        return this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
    }

    @Override
    public final boolean \u8001\u5b50\u53ef\u662f\u51fa\u4e86\u540d\u7684\u4e2d\u56fd\u597d\u820c\u5934\u5f53\u5e74\u8001\u5b50\u4e00\u820c\u5934\u8214\u4f60\u5988\u7684\u4fe9\u5976\u5b50\u8214\u5b8c\u5976\u5b50\u518d\u8214\u9634\u8482\u628a\u4f60\u5988\u8c03\u6559\u50cf\u6761\u6bcd\u72d7\u4e00\u6837\u7684\u4e56\u4f60\u5988\u8fd8\u81ea\u613f\u8ba9\u8001\u5b50\u6bcf\u5929\u808f\u54e5\u7684\u9e21\u5df4\u808f\u7684\u8ba9\u4f60\u5988\u6bcf\u5929\u90fd\u8ddf\u6d3b\u5728\u5929\u5802\u4e00\u6837(String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeString(string);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(1, parcel, parcel2, 0);
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
    public final boolean \u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403(String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeString(string);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(2, parcel, parcel2, 0);
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
    public final PackageInfo \u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988(String string, int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoPackageManagerService");
        parcel.writeString(string);
        parcel.writeInt(n10);
        ((m0)object).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(3, parcel, parcel2, 0);
        try {
            parcel2.readException();
            Object object = PackageInfo.CREATOR;
            object = parcel2.readInt() != 0 ? object.createFromParcel(parcel2) : null;
            return (PackageInfo)object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    @Override
    public final ApplicationInfo \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(String string, int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoPackageManagerService");
        parcel.writeString(string);
        parcel.writeInt(n10);
        ((m0)object).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(4, parcel, parcel2, 0);
        try {
            parcel2.readException();
            Object object = ApplicationInfo.CREATOR;
            object = parcel2.readInt() != 0 ? object.createFromParcel(parcel2) : null;
            return (ApplicationInfo)object;
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
    public final ActivityInfo \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(ComponentName componentName) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoPackageManagerService");
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
        ((m0)object).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(5, parcel, parcel2, 0);
        try {
            parcel4.readException();
            Object object = ActivityInfo.CREATOR;
            if (parcel5.readInt() != 0) {
                object = object.createFromParcel(parcel2);
                return (ActivityInfo)object;
            }
            object = null;
            return (ActivityInfo)object;
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
    public final ActivityInfo \u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403(ComponentName componentName) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoPackageManagerService");
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
        ((m0)object).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(6, parcel, parcel2, 0);
        try {
            parcel4.readException();
            Object object = ActivityInfo.CREATOR;
            if (parcel5.readInt() != 0) {
                object = object.createFromParcel(parcel2);
                return (ActivityInfo)object;
            }
            object = null;
            return (ActivityInfo)object;
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
    public final ServiceInfo \u4f60\u5988\u4eca\u665a\u53bb\u5077\u7535\u7ebf\u6746\u5b50\u4f60\u7238\u53bb\u627e\u7535\u7bb1\u4e4b\u540e\u7ed3\u5408\u75af\u72c2\u7206\u7535\u8ba9\u540e\u5728\u62ff\u7535\u7ebf\u6746\u5b50ziwei\u5b8c\u4e8b\u8fd8\u8981\u53bb\u52a0\u6cb9\u7ad9\u5728\u81ea\u5df1piyan\u548c\u903c\u91cc\u704c\u6cb9\u62ff\u7740\u6253\u706b\u673a\u72c2\u64a9\u81ea\u5df1\u628a\u81ea\u5df1\u53d8\u6210\u5185\u71c3\u673a(ComponentName componentName) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoPackageManagerService");
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
        ((m0)object).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(7, parcel, parcel2, 0);
        try {
            parcel4.readException();
            Object object = ServiceInfo.CREATOR;
            if (parcel5.readInt() != 0) {
                object = object.createFromParcel(parcel2);
                return (ServiceInfo)object;
            }
            object = null;
            return (ServiceInfo)object;
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
    public final ProviderInfo \u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988(ComponentName componentName) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoPackageManagerService");
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
        ((m0)object).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(8, parcel, parcel2, 0);
        try {
            parcel4.readException();
            Object object = ProviderInfo.CREATOR;
            if (parcel5.readInt() != 0) {
                object = object.createFromParcel(parcel2);
                return (ProviderInfo)object;
            }
            object = null;
            return (ProviderInfo)object;
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
    public final List \u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988(Intent intent, String string, int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoPackageManagerService");
        int n11 = 0;
        if (intent != null) {
            parcel.writeInt(1);
            intent.writeToParcel(parcel, n11);
        } else {
            parcel.writeInt(0);
        }
        Parcel parcel3 = parcel2;
        Parcel parcel4 = parcel3;
        Parcel parcel5 = parcel3;
        parcel.writeString(string);
        parcel.writeInt(n10);
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(9, parcel, parcel2, 0);
        try {
            parcel4.readException();
            return parcel5.createTypedArrayList(ResolveInfo.CREATOR);
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
    public final List \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Intent intent, String string, int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoPackageManagerService");
        int n11 = 0;
        if (intent != null) {
            parcel.writeInt(1);
            intent.writeToParcel(parcel, n11);
        } else {
            parcel.writeInt(0);
        }
        Parcel parcel3 = parcel2;
        Parcel parcel4 = parcel3;
        Parcel parcel5 = parcel3;
        parcel.writeString(string);
        parcel.writeInt(n10);
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(10, parcel, parcel2, 0);
        try {
            parcel4.readException();
            return parcel5.createTypedArrayList(ResolveInfo.CREATOR);
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
    public final ResolveInfo \u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403(Intent intent, String string, int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoPackageManagerService");
        int n11 = 0;
        if (intent != null) {
            parcel.writeInt(1);
            intent.writeToParcel(parcel, n11);
        } else {
            parcel.writeInt(0);
        }
        Parcel parcel3 = parcel2;
        Parcel parcel4 = parcel3;
        Parcel parcel5 = parcel3;
        parcel.writeString(string);
        parcel.writeInt(n10);
        ((m0)object).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(11, parcel, parcel2, 0);
        try {
            parcel4.readException();
            Object object = ResolveInfo.CREATOR;
            if (parcel5.readInt() != 0) {
                object = object.createFromParcel(parcel2);
                return (ResolveInfo)object;
            }
            object = null;
            return (ResolveInfo)object;
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
    public final ResolveInfo \u4f60\u5988\u4eca\u665a\u53bb\u5077\u7535\u7ebf\u6746\u5b50\u4f60\u7238\u53bb\u627e\u7535\u7bb1\u4e4b\u540e\u7ed3\u5408\u75af\u72c2\u7206\u7535\u8ba9\u540e\u5728\u62ff\u7535\u7ebf\u6746\u5b50ziwei\u5b8c\u4e8b\u8fd8\u8981\u53bb\u52a0\u6cb9\u7ad9\u5728\u81ea\u5df1piyan\u548c\u903c\u91cc\u704c\u6cb9\u62ff\u7740\u6253\u706b\u673a\u72c2\u64a9\u81ea\u5df1\u628a\u81ea\u5df1\u53d8\u6210\u5185\u71c3\u673a(Intent intent, String string, int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoPackageManagerService");
        int n11 = 0;
        if (intent != null) {
            parcel.writeInt(1);
            intent.writeToParcel(parcel, n11);
        } else {
            parcel.writeInt(0);
        }
        Parcel parcel3 = parcel2;
        Parcel parcel4 = parcel3;
        Parcel parcel5 = parcel3;
        parcel.writeString(string);
        parcel.writeInt(n10);
        ((m0)object).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(12, parcel, parcel2, 0);
        try {
            parcel4.readException();
            Object object = ResolveInfo.CREATOR;
            if (parcel5.readInt() != 0) {
                object = object.createFromParcel(parcel2);
                return (ResolveInfo)object;
            }
            object = null;
            return (ResolveInfo)object;
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
    public final List \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(Intent intent, String string, int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoPackageManagerService");
        int n11 = 0;
        if (intent != null) {
            parcel.writeInt(1);
            intent.writeToParcel(parcel, n11);
        } else {
            parcel.writeInt(0);
        }
        Parcel parcel3 = parcel2;
        Parcel parcel4 = parcel3;
        Parcel parcel5 = parcel3;
        parcel.writeString(string);
        parcel.writeInt(n10);
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(13, parcel, parcel2, 0);
        try {
            parcel4.readException();
            return parcel5.createTypedArrayList(ResolveInfo.CREATOR);
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
    public final List \u4f60\u4e0d\u77e5\u9053\u4f60\u5988\u5f20\u4e2a\u5927\u5634\u5288\u4e2a\u5c0f\u817f\u4e0b\u9762\u8fd8\u6d41\u7740\u54b8\u76d0\u6c34\u5417\u5f1f\u5f1f(Intent intent, String string, int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoPackageManagerService");
        int n11 = 0;
        if (intent != null) {
            parcel.writeInt(1);
            intent.writeToParcel(parcel, n11);
        } else {
            parcel.writeInt(0);
        }
        Parcel parcel3 = parcel2;
        Parcel parcel4 = parcel3;
        Parcel parcel5 = parcel3;
        parcel.writeString(string);
        parcel.writeInt(n10);
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(14, parcel, parcel2, 0);
        try {
            parcel4.readException();
            return parcel5.createTypedArrayList(ResolveInfo.CREATOR);
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    @Override
    public final ProviderInfo \u867d\u7136\u4e0d\u662f\u540c\u4e00\u65f6\u95f4\u4f46\u662f\u662f\u540c\u4e00\u4e2a\u4f60\u5988\u4f60\u7239\u6211\u518d\u6b21\u6311\u6218\u4e00\u628a\u5403\u9634\u7b2c(String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoPackageManagerService");
        parcel.writeString(string);
        ((m0)object).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(17, parcel, parcel2, 0);
        try {
            parcel2.readException();
            Object object = ProviderInfo.CREATOR;
            object = parcel2.readInt() != 0 ? object.createFromParcel(parcel2) : null;
            return (ProviderInfo)object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    @Override
    public final String \u6211\u5728\u64cd\u4f60\u5988\u7684\u540c\u65f6\u7ed9\u4f60\u5988\u7684\u4e0b\u4f53\u753b\u4e86\u4e00\u5e45\u6e05\u660e\u4e0a\u6cb3\u56fe\u8fd9\u4f7f\u5f97\u4f60\u5988\u7684\u5356\u903c\u4e8b\u4e1a\u5728\u6587\u5b66\u754c\u4e5f\u6709\u4e86\u4e00\u5b9a\u7684\u540d\u6c14\u4f60\u5a4a\u5b50\u5988\u8ba9\u81ea\u5df1\u7684\u903c\u6cbe\u4e0a\u4e86\u6587\u5b66\u7684\u6c14\u606f\u4ee5\u540e\u5ad6\u5ba2\u64cd\u4f60\u5988\u65f6\u8fd8\u80fd\u589e\u957f\u6587\u5316(String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeString(string);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(19, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        String string2 = parcel2.readString();
        parcel2.recycle();
        parcel.recycle();
        return string2;
    }

    @Override
    public final void \u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b(String string) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeString(string);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(20, parcel, null, 1);
        }
        catch (Throwable throwable) {
            parcel.recycle();
            throw throwable;
        }
        parcel.recycle();
    }

    @Override
    public final int \u8bf4\u8bdd\u4e0d\u8fc7\u8111\u5b50\u76f4\u63a5\u4ece\u60a8\u5c41\u773c\u91cc\u5d29\u51fa\u6765(String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeString(string);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(21, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        int n10 = parcel2.readInt();
        parcel2.recycle();
        parcel.recycle();
        return n10;
    }

    @Override
    public final String[] \u4f60\u5988\u5728\u4e07\u4eba\u5e7f\u573a\u5356\u903c\u4f60\u5e9f\u7269\u7239\u4e0d\u4ec5\u4e0d\u963b\u6b62\u53cd\u800c\u8ddf\u4f60\u5988\u4e00\u8d77\u8ddf\u5929\u4e0b\u4eba\u6c11\u666e\u5929\u540c\u5e86\u4f60\u6bcf\u665a\u8349\u4f60\u5988\u751f\u9f99\u6d3b\u864e\u4f60\u5988\u75bc\u7684\u5472\u7259\u54a7\u5634\u4f60\u5988\u903c\u4e0a\u7684\u9634\u9f7f\u90fd\u6ee1\u8db3\u4e0d\u4e86\u4f60\u8fd9\u6742\u79cd\u7684\u72c2\u91ce\u6027\u9700\u6c42\u554a\u8349\u4f60\u5988(int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeInt(n10);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(22, parcel, parcel2, 0);
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

    @Override
    public final String \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeInt(n10);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(23, parcel, parcel2, 0);
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
    public final String[] \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(int[] nArray) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeIntArray(nArray);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(24, parcel, parcel2, 0);
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

    @Override
    public final int \u4f60\u4e0d\u77e5\u9053\u4f60\u5988\u5f20\u4e2a\u5927\u5634\u5288\u4e2a\u5c0f\u817f\u4e0b\u9762\u8fd8\u6d41\u7740\u54b8\u76d0\u6c34\u5417\u5f1f\u5f1f(String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeString(string);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(25, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        int n10 = parcel2.readInt();
        parcel2.recycle();
        parcel.recycle();
        return n10;
    }

    @Override
    public final int \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(String string, int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeString(string);
            parcel.writeInt(n10);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(26, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        int n11 = parcel2.readInt();
        parcel2.recycle();
        parcel.recycle();
        return n11;
    }

    @Override
    public final void \u867d\u7136\u4e0d\u662f\u540c\u4e00\u65f6\u95f4\u4f46\u662f\u662f\u540c\u4e00\u4e2a\u4f60\u5988\u4f60\u7239\u6211\u518d\u6b21\u6311\u6218\u4e00\u628a\u5403\u9634\u7b2c(String string, String string2) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeString(string);
            parcel.writeString(string2);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(27, parcel, null, 1);
        }
        catch (Throwable throwable) {
            parcel.recycle();
            throw throwable;
        }
        parcel.recycle();
    }

    @Override
    public final void \u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988(String string, String string2) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeString(string);
            parcel.writeString(string2);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(28, parcel, null, 1);
        }
        catch (Throwable throwable) {
            parcel.recycle();
            throw throwable;
        }
        parcel.recycle();
    }

    @Override
    public final String[] \u4f60\u5988\u5728\u4e07\u4eba\u5e7f\u573a\u5356\u903c\u4f60\u5e9f\u7269\u7239\u4e0d\u4ec5\u4e0d\u963b\u6b62\u53cd\u800c\u8ddf\u4f60\u5988\u4e00\u8d77\u8ddf\u5929\u4e0b\u4eba\u6c11\u666e\u5929\u540c\u5e86\u4f60\u6bcf\u665a\u8349\u4f60\u5988\u751f\u9f99\u6d3b\u864e\u4f60\u5988\u75bc\u7684\u5472\u7259\u54a7\u5634\u4f60\u5988\u903c\u4e0a\u7684\u9634\u9f7f\u90fd\u6ee1\u8db3\u4e0d\u4e86\u4f60\u8fd9\u6742\u79cd\u7684\u72c2\u91ce\u6027\u9700\u6c42\u554a\u8349\u4f60\u5988(String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeString(string);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(29, parcel, parcel2, 0);
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

    @Override
    public final void \u4f60\u5988\u5728\u4e07\u4eba\u5e7f\u573a\u5356\u903c\u4f60\u5e9f\u7269\u7239\u4e0d\u4ec5\u4e0d\u963b\u6b62\u53cd\u800c\u8ddf\u4f60\u5988\u4e00\u8d77\u8ddf\u5929\u4e0b\u4eba\u6c11\u666e\u5929\u540c\u5e86\u4f60\u6bcf\u665a\u8349\u4f60\u5988\u751f\u9f99\u6d3b\u864e\u4f60\u5988\u75bc\u7684\u5472\u7259\u54a7\u5634\u4f60\u5988\u903c\u4e0a\u7684\u9634\u9f7f\u90fd\u6ee1\u8db3\u4e0d\u4e86\u4f60\u8fd9\u6742\u79cd\u7684\u72c2\u91ce\u6027\u9700\u6c42\u554a\u8349\u4f60\u5988() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(30, parcel, parcel2, 0);
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
    public final boolean \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeString(string);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(31, parcel, parcel2, 0);
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
    public final void \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(int n10) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeInt(n10);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(33, parcel, null, 1);
        }
        catch (Throwable throwable) {
            parcel.recycle();
            throw throwable;
        }
        parcel.recycle();
    }

    @Override
    public final boolean \u4f60\u5988\u4eca\u665a\u53bb\u5077\u7535\u7ebf\u6746\u5b50\u4f60\u7238\u53bb\u627e\u7535\u7bb1\u4e4b\u540e\u7ed3\u5408\u75af\u72c2\u7206\u7535\u8ba9\u540e\u5728\u62ff\u7535\u7ebf\u6746\u5b50ziwei\u5b8c\u4e8b\u8fd8\u8981\u53bb\u52a0\u6cb9\u7ad9\u5728\u81ea\u5df1piyan\u548c\u903c\u91cc\u704c\u6cb9\u62ff\u7740\u6253\u706b\u673a\u72c2\u64a9\u81ea\u5df1\u628a\u81ea\u5df1\u53d8\u6210\u5185\u71c3\u673a(String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeString(string);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(34, parcel, parcel2, 0);
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
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(List list) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            o0.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(parcel, list, 0);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(35, parcel, parcel2, 0);
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(ComponentName componentName, int n10) {
        Parcel parcel;
        Parcel parcel2;
        Parcel parcel3;
        Parcel parcel4 = Parcel.obtain();
        Parcel parcel5 = Parcel.obtain();
        try {
            parcel4.writeInterfaceToken("MundoPackageManagerService");
            int n11 = 0;
            if (componentName != null) {
                parcel4.writeInt(1);
                componentName.writeToParcel(parcel4, n11);
            } else {
                parcel4.writeInt(0);
            }
            parcel3 = parcel4;
            Parcel parcel6 = parcel5;
            parcel2 = parcel6;
            parcel = parcel6;
            parcel4.writeInt(n10);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(36, parcel4, parcel5, 0);
        }
        catch (Throwable throwable) {
            parcel5.recycle();
            parcel4.recycle();
            throw throwable;
        }
        {
            parcel2.readException();
        }
        parcel.recycle();
        parcel3.recycle();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(ComponentName componentName) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoPackageManagerService");
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
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(37, parcel, parcel2, 0);
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
    public final ArrayList \u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988(int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeInt(n10);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(15, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        ArrayList arrayList = parcel2.createTypedArrayList(PackageInfo.CREATOR);
        parcel2.recycle();
        parcel.recycle();
        return arrayList;
    }

    @Override
    public final ArrayList \u4f60\u5988\u4eca\u665a\u53bb\u5077\u7535\u7ebf\u6746\u5b50\u4f60\u7238\u53bb\u627e\u7535\u7bb1\u4e4b\u540e\u7ed3\u5408\u75af\u72c2\u7206\u7535\u8ba9\u540e\u5728\u62ff\u7535\u7ebf\u6746\u5b50ziwei\u5b8c\u4e8b\u8fd8\u8981\u53bb\u52a0\u6cb9\u7ad9\u5728\u81ea\u5df1piyan\u548c\u903c\u91cc\u704c\u6cb9\u62ff\u7740\u6253\u706b\u673a\u72c2\u64a9\u81ea\u5df1\u628a\u81ea\u5df1\u53d8\u6210\u5185\u71c3\u673a(int n10) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeInt(n10);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(16, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        ArrayList arrayList = parcel2.createTypedArrayList(ApplicationInfo.CREATOR);
        parcel2.recycle();
        parcel.recycle();
        return arrayList;
    }

    @Override
    public final ArrayList \u8001\u5b50\u5b9e\u5728\u770b\u4e0d\u8fc7\u4f60\u5988\u7684\u8111\u6b8b\u72d7\u903c\u6837\u5b50\u76f4\u63a5\u628a\u4f60\u5988\u75285\u6bdb\u94b1\u5356\u5230\u57c3\u585e\u4fc4\u6bd4\u4e9a\u56fd\u5bb6\u5927\u5993\u9662\u8bf7\u90a3\u4e9b\u975e\u6d32\u90e8\u843d\u5c0f\u55bd\u5570\u6765\u4eab\u53d7\u4f60\u5988\u903c\u7684\u9ed1\u9634\u903c(String string, String string2) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            parcel.writeString(string);
            parcel.writeString(string2);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(18, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        ArrayList arrayList = parcel2.createTypedArrayList(ProviderInfo.CREATOR);
        parcel2.recycle();
        parcel.recycle();
        return arrayList;
    }

    @Override
    public final ArrayList \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoPackageManagerService");
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(32, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        ArrayList arrayList = parcel2.createStringArrayList();
        parcel2.recycle();
        parcel.recycle();
        return arrayList;
    }
}

