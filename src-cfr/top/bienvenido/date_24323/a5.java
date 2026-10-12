/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityThread$ApplicationThread
 *  android.app.Application
 *  android.app.LoadedApk
 *  android.content.BroadcastReceiver
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.IIntentReceiver
 *  android.content.IIntentReceiver$Stub
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.IBinder
 */
package top.bienvenido.date_24323;

import android.app.ActivityThread;
import android.app.Application;
import android.app.LoadedApk;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IIntentReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import top.bienvenido.date_24323.b3;
import top.bienvenido.date_24323.ca;
import top.bienvenido.date_24323.f4;
import top.bienvenido.date_24323.h6;
import top.bienvenido.date_24323.i;
import top.bienvenido.date_24323.p2;
import top.bienvenido.date_24323.r2;
import top.bienvenido.date_24323.s2;
import top.bienvenido.date_24323.u2;
import top.bienvenido.date_24323.\u4f60\u771f\u662f\u5f31\u667a\u5f97\u6070\u5230\u597d\u5904\u6b63\u5982\u4f60\u9ed1\u4eba\u91ce\u7239\u64cd\u4f60\u5988\u7684\u65f6\u5019\u4f60\u5988\u9ad8\u6f6e\u53eb\u5f97\u97f3\u5f8b\u5341\u8db3;
import top.bienvenido.date_24323.\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1;

public abstract class a5 {
    public static final u2 \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
    public static final Object \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(IBinder iBinder, Intent intent) {
        block7: {
            try {
                // empty try
            }
            catch (Throwable throwable) {
                return;
            }
            if (!\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1.\u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b) break block7;
            h6.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.getClass();
            ActivityThread.ApplicationThread applicationThread = h6.\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988.getApplicationThread();
            IIntentReceiver iIntentReceiver = IIntentReceiver.Stub.asInterface((IBinder)iBinder);
            Intent intent2 = intent;
            int n10 = -1;
            String string = null;
            intent = Bundle.EMPTY;
            boolean bl = false;
            boolean bl2 = false;
            boolean bl3 = true;
            int n11 = b3.\u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403;
            applicationThread.scheduleRegisteredReceiver(iIntentReceiver, intent2, n10, string, (Bundle)intent, bl, bl2, bl3, n11, 20, -1, null);
            return;
        }
        IIntentReceiver iIntentReceiver = IIntentReceiver.Stub.asInterface((IBinder)iBinder);
        Intent intent3 = intent;
        int n12 = -1;
        String string = null;
        intent = Bundle.EMPTY;
        boolean bl = false;
        boolean bl4 = false;
        int n13 = b3.\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988;
        iIntentReceiver.performReceive(intent3, n12, string, (Bundle)intent, bl, bl4, n13);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(LoadedApk loadedApk, Intent intent, String string) {
        BroadcastReceiver broadcastReceiver;
        Context context;
        Object object;
        block6: {
            try {
                h6.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.getClass();
            }
            catch (Throwable throwable) {
                return;
            }
            u2 u22 = h6.\u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6;
            LoadedApk loadedApk2 = loadedApk;
            object = h6.\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988.getInstrumentation();
            Context context2 = new Object[2];
            context = context2;
            context2[0] = Boolean.FALSE;
            context2[1] = object;
            Application application = (Application)u22.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Object)loadedApk2, (Object[])context);
            Intent intent2 = intent;
            object = loadedApk.getClassLoader();
            intent2.setExtrasClassLoader((ClassLoader)object);
            context = application.getBaseContext();
            if (!\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1.\u4f60\u4e0d\u77e5\u9053\u4f60\u5988\u5f20\u4e2a\u5927\u5634\u5288\u4e2a\u5c0f\u817f\u4e0b\u9762\u8fd8\u6d41\u7740\u54b8\u76d0\u6c34\u5417\u5f1f\u5f1f) break block6;
            broadcastReceiver = loadedApk.getAppFactory().instantiateReceiver((ClassLoader)object, string, intent);
        }
        Constructor<?> constructor = ((ClassLoader)object).loadClass(string).getDeclaredConstructor(i.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403);
        constructor.setAccessible(true);
        broadcastReceiver = (BroadcastReceiver)constructor.newInstance(i.\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988);
        loadedApk = broadcastReceiver;
        \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Object)loadedApk, \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403);
        loadedApk.onReceive(context, intent);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(Intent intent, String string) {
        try {
            if (!f4.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070) {
                return;
            }
            if (intent.getComponent() == null) {
                intent.setComponent(new ComponentName(f4.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403, string));
            }
        }
        catch (Exception exception) {
            return;
        }
        {
            h6.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.getClass();
        }
        {
            h6.\u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403.post(() -> a5.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((LoadedApk)h6.\u7237\u534a\u591c\u6316\u5f00\u4f60\u5988\u7684\u68fa\u6750\u62ff\u51fa\u624b\u673a\u626b\u63cf\u4e8c\u7ef4\u7801\u626b\u4f60\u5988\u8eab\u4e0a\u7684\u5c38\u6591\u6210\u529f\u89e3\u9501\u4e00\u8f86\u5171\u4eab\u5355\u8f66\u8bc1\u660e\u4f60\u5988\u5728\u9634\u95f4\u4e5f\u8fd8\u662f\u4e07\u4eba\u9a91.invoke(), intent, string));
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                var0 = BroadcastReceiver.class.getDeclaredField("mPendingResult");
                var0.setAccessible(true);
                if ((var0.getModifiers() & 8) != 0) break block13;
                if (!var0.getType().isPrimitive()) ** GOTO lbl13
            }
            var1_2 = v0;
            v0 = new r2((Field)var0);
            break block14;
lbl13:
            // 1 sources

            var0_1 = ca.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.objectFieldOffset((Field)var0);
            var2_3 = v1;
            try {
                v1 = new s2(var0_1);
                var1_2 = var2_3;
            }
            catch (Exception v2) {
                var1_2 = u2.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
            }
        }
        a5.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = var1_2;
        var0 = ca.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.allocateInstance(BroadcastReceiver.PendingResult.class);
        var1_2 = "mInitialStickyHint";
        var2_3 = Boolean.TRUE;
        try {
            new p2((String)var1_2).\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(var0, var2_3);
        }
        catch (Exception v3) {
            var0 = null;
        }
        a5.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403 = var0;
    }

    public static void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, Intent intent) {
        \u4f60\u771f\u662f\u5f31\u667a\u5f97\u6070\u5230\u597d\u5904\u6b63\u5982\u4f60\u9ed1\u4eba\u91ce\u7239\u64cd\u4f60\u5988\u7684\u65f6\u5019\u4f60\u5988\u9ad8\u6f6e\u53eb\u5f97\u97f3\u5f8b\u5341\u8db3.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.execute(() -> a5.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(iBinder, intent));
    }

    public static void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Intent intent, String string) {
        \u4f60\u771f\u662f\u5f31\u667a\u5f97\u6070\u5230\u597d\u5904\u6b63\u5982\u4f60\u9ed1\u4eba\u91ce\u7239\u64cd\u4f60\u5988\u7684\u65f6\u5019\u4f60\u5988\u9ad8\u6f6e\u53eb\u5f97\u97f3\u5f8b\u5341\u8db3.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.execute(() -> a5.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(intent, string));
    }
}

