/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Process
 */
package top.bienvenido.date_24323;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import top.bienvenido.date_24323.b3;
import top.bienvenido.date_24323.m3;
import top.bienvenido.date_24323.n6;
import top.bienvenido.date_24323.q4;
import top.bienvenido.date_24323.r5;
import top.bienvenido.date_24323.s5;
import top.bienvenido.date_24323.u5;
import top.bienvenido.date_24323.w3;

public final class b1
extends Binder {
    public static final b1 \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
    public static final Bundle \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;

    static {
        b1 b12;
        b1 b13 = b12;
        \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = new b1();
        Bundle bundle = new Bundle();
        Binder binder = n6.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
        bundle.putBinder(binder.getInterfaceDescriptor(), (IBinder)binder);
        binder = r5.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
        bundle.putBinder(binder.getInterfaceDescriptor(), (IBinder)binder);
        binder = w3.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
        bundle.putBinder(binder.getInterfaceDescriptor(), (IBinder)binder);
        binder = q4.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
        bundle.putBinder(binder.getInterfaceDescriptor(), (IBinder)binder);
        binder = m3.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
        bundle.putBinder(binder.getInterfaceDescriptor(), (IBinder)binder);
        bundle.putBinder("https://www.62v.net/jnative/binder", (IBinder)b13);
        bundle.putInt(Integer.TYPE.getName(), Process.myPid());
        \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403 = bundle;
    }

    public final String getInterfaceDescriptor() {
        return "https://www.62v.net/jnative/binder";
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final boolean onTransact(int var1_4, Parcel var2_6, Parcel var3_7, int var4_8) {
        block14: {
            block13: {
                if (var1_4 != 7001) break block14;
                v0 = var2_6 /* !! */ .readLong();
                var0_1 = (int)((v0 & -4294967296L) >>> 32);
                var1_5 = u5.\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988;
                ** synchronized (var1_5)
lbl-1000:
                // 1 sources

                {
                    v1 = var1_5.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((int)(v0 & 0xFFFFFFFFL));
                }
                var2_6 /* !! */  = (s5)v1;
                var4_8 = -1;
                if (var2_6 /* !! */  == null) ** GOTO lbl31
                var0_2 = (s5)var1_5.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(var0_1);
                if (var0_2 == null) ** GOTO lbl31
                try {
                    block15: {
                        if (var0_2.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.hashCode() != var2_6 /* !! */ .\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.hashCode()) break block15;
                        v2 = b3.\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988;
lbl21:
                        // 2 sources

                        while (true) {
                            var4_8 = v2;
                            ** GOTO lbl31
                            break;
                        }
                    }
                    var4_8 = var2_6 /* !! */ .\u4f60\u4e0d\u77e5\u9053\u4f60\u5988\u5f20\u4e2a\u5927\u5634\u5288\u4e2a\u5c0f\u817f\u4e0b\u9762\u8fd8\u6d41\u7740\u54b8\u76d0\u6c34\u5417\u5f1f\u5f1f;
                }
                catch (Exception v3) {}
                if (var4_8 == var0_2.\u4f60\u4e0d\u77e5\u9053\u4f60\u5988\u5f20\u4e2a\u5927\u5634\u5288\u4e2a\u5c0f\u817f\u4e0b\u9762\u8fd8\u6d41\u7740\u54b8\u76d0\u6c34\u5417\u5f1f\u5f1f) {
                    v2 = b3.\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988;
                    ** continue;
                }
lbl31:
                // 5 sources

                var3_7.writeInt(var4_8);
                break block13;
                {
                    catch (Throwable var0_3) {
                        throw var0_3;
                    }
                }
            }
            return true;
        }
        return super.onTransact(var1_4, var2_6 /* !! */ , var3_7, var4_8);
    }
}

